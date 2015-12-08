// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.download;

import android.net.Uri;
import android.os.Environment;
import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.http.HttpUrlConnectionFactory;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.common.base.Preconditions;
import com.google.common.io.Closer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;

public final class FileDownloadAction
    implements Callable
{
    public static interface ProgressListener
    {

        public abstract void onProgress(float f);
    }


    String accountName;
    private String authTokenType;
    WalletGoogleAuthUtil authUtil;
    HttpUrlConnectionFactory connectionFactory;
    private String fileName;
    private ProgressListener progressListener;
    private String uri;
    String userAgent;

    public FileDownloadAction()
    {
    }

    private Uri call()
        throws Exception
    {
        Object obj;
        Object obj2;
        File file;
        Preconditions.checkNotNull(fileName);
        Preconditions.checkNotNull(uri);
        Preconditions.checkNotNull(authTokenType);
        obj = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (!((File) (obj)).exists() && !((File) (obj)).mkdirs())
        {
            throw new IOException("unable to create download directory");
        }
        file = new File(((File) (obj)), fileName);
        String s = authUtil.getToken(accountName, authTokenType);
        obj2 = connectionFactory.get(new URL(uri));
        ((HttpURLConnection) (obj2)).setRequestMethod("GET");
        obj = String.valueOf(s);
        int i;
        if (((String) (obj)).length() != 0)
        {
            obj = "GoogleLogin auth=".concat(((String) (obj)));
        } else
        {
            obj = new String("GoogleLogin auth=");
        }
        ((HttpURLConnection) (obj2)).setRequestProperty("Authorization", ((String) (obj)));
        ((HttpURLConnection) (obj2)).setRequestProperty("User-Agent", userAgent);
        ((HttpURLConnection) (obj2)).connect();
        i = ((HttpURLConnection) (obj2)).getResponseCode();
        obj = obj2;
        if (i != 200)
        {
            if (i == 401)
            {
                authUtil.clearToken(s);
                obj = authUtil.getToken(accountName, authTokenType);
                obj2 = connectionFactory.get(new URL(uri));
                ((HttpURLConnection) (obj2)).setRequestMethod("GET");
                obj = String.valueOf(obj);
                if (((String) (obj)).length() != 0)
                {
                    obj = "GoogleLogin auth=".concat(((String) (obj)));
                } else
                {
                    obj = new String("GoogleLogin auth=");
                }
                ((HttpURLConnection) (obj2)).setRequestProperty("Authorization", ((String) (obj)));
                ((HttpURLConnection) (obj2)).setRequestProperty("User-Agent", userAgent);
                ((HttpURLConnection) (obj2)).connect();
                obj = obj2;
                if (((HttpURLConnection) (obj2)).getResponseCode() != 200)
                {
                    throw new RpcException(String.format("Unsuccessful response download: %d, %s", new Object[] {
                        Integer.valueOf(((HttpURLConnection) (obj2)).getResponseCode()), ((HttpURLConnection) (obj2)).getResponseMessage()
                    }));
                }
            } else
            {
                throw new RpcException(String.format("Unsuccessful response download: %d, %s", new Object[] {
                    Integer.valueOf(((HttpURLConnection) (obj2)).getResponseCode()), ((HttpURLConnection) (obj2)).getResponseMessage()
                }));
            }
        }
        obj2 = Closer.create();
        FileOutputStream fileoutputstream = (FileOutputStream)((Closer) (obj2)).register(new FileOutputStream(file));
        copy(((HttpURLConnection) (obj)).getInputStream(), fileoutputstream, ((HttpURLConnection) (obj)).getContentLength());
        ((Closer) (obj2)).close();
        return Uri.fromFile(file);
        Object obj1;
        obj1;
        throw ((Closer) (obj2)).rethrow(((Throwable) (obj1)));
        obj1;
        ((Closer) (obj2)).close();
        throw obj1;
    }

    private long copy(InputStream inputstream, OutputStream outputstream, int i)
        throws IOException
    {
        Preconditions.checkNotNull(inputstream);
        Preconditions.checkNotNull(outputstream);
        byte abyte0[] = new byte[4096];
        long l = 0L;
        do
        {
            int j = inputstream.read(abyte0);
            if (j != -1)
            {
                outputstream.write(abyte0, 0, j);
                updateProgress((float)j / (float)i);
                l += j;
            } else
            {
                return l;
            }
        } while (true);
    }

    private void updateProgress(float f)
    {
        if (progressListener != null)
        {
            progressListener.onProgress(f);
        }
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    public final FileDownloadAction setAuthTokenType(String s)
    {
        authTokenType = s;
        return this;
    }

    public final FileDownloadAction setFileName(String s)
    {
        fileName = s;
        return this;
    }

    public final FileDownloadAction setProgressListener(ProgressListener progresslistener)
    {
        progressListener = progresslistener;
        return this;
    }

    public final FileDownloadAction setUri(String s)
    {
        uri = s;
        return this;
    }
}

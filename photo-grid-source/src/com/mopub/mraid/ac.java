// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.AsyncTask;
import android.os.Environment;
import com.mopub.common.HttpClient;
import com.mopub.common.Preconditions;
import com.mopub.common.util.ResponseHeader;
import com.mopub.common.util.Streams;
import com.mopub.mobileads.factories.HttpClientFactory;
import com.mopub.network.HeaderUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

// Referenced classes of package com.mopub.mraid:
//            ae, ad

final class ac extends AsyncTask
{

    private final Context a;
    private final ad b;

    public ac(Context context, ad ad1)
    {
        a = context.getApplicationContext();
        b = ad1;
    }

    private Boolean a(String as[])
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        boolean flag = true;
        Object obj3;
        File file;
        Object obj4;
        String s;
        if (as.length <= 0)
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        Preconditions.checkNotNull(as[0]);
        file = new File(Environment.getExternalStorageDirectory(), "Pictures");
        file.mkdirs();
        obj3 = URI.create(as[0]);
        as = HttpClientFactory.create();
        obj4 = HttpClient.initializeHttpGet(((URI) (obj3)).toString());
        obj4 = as.execute(((org.apache.http.client.methods.HttpUriRequest) (obj4)));
        as = ((HttpResponse) (obj4)).getEntity().getContent();
        Exception exception;
        try
        {
            s = HeaderUtils.extractHeader(((HttpResponse) (obj4)), ResponseHeader.LOCATION);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Object obj2 = null;
            obj = as;
            as = obj2;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            continue; /* Loop/switch isn't completed */
        }
_L1:
        obj = obj3;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        obj = URI.create(s);
        obj3 = new File(file, a(((URI) (obj)), ((HttpResponse) (obj4))));
        obj = new FileOutputStream(((File) (obj3)));
        Streams.copyContent(as, ((java.io.OutputStream) (obj)));
        obj1 = new ae(((File) (obj3)).toString(), (byte)0);
        obj3 = new MediaScannerConnection(a, ((android.media.MediaScannerConnection.MediaScannerConnectionClient) (obj1)));
        ae.a(((ae) (obj1)), ((MediaScannerConnection) (obj3)));
        ((MediaScannerConnection) (obj3)).connect();
        Streams.closeStream(as);
        Streams.closeStream(((java.io.Closeable) (obj)));
        return Boolean.valueOf(true);
        as;
        as = null;
_L4:
        Streams.closeStream(((java.io.Closeable) (obj)));
        Streams.closeStream(as);
        return Boolean.valueOf(false);
        obj;
        as = null;
_L2:
        Streams.closeStream(as);
        Streams.closeStream(((java.io.Closeable) (obj1)));
        throw obj;
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        String as1[] = as;
        as = ((String []) (obj));
        obj = as1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(URI uri, HttpResponse httpresponse)
    {
        uri = uri.getPath();
        if (uri != null) goto _L2; else goto _L1
_L1:
        uri = null;
_L4:
        return uri;
_L2:
        String s;
        int i;
        int j;
        s = (new File(uri)).getName();
        httpresponse = httpresponse.getFirstHeader("Content-Type");
        uri = s;
        if (httpresponse == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        httpresponse = httpresponse.getValue().split(";");
        j = httpresponse.length;
        i = 0;
_L5:
        uri = s;
        if (i < j)
        {
label0:
            {
                uri = httpresponse[i];
                if (!uri.contains("image/"))
                {
                    break label0;
                }
                httpresponse = (new StringBuilder(".")).append(uri.split("/")[1]).toString();
                uri = s;
                if (!s.endsWith(httpresponse))
                {
                    return (new StringBuilder()).append(s).append(httpresponse).toString();
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Boolean)obj;
        if (obj != null && ((Boolean) (obj)).booleanValue())
        {
            b.onSuccess();
            return;
        } else
        {
            b.onFailure();
            return;
        }
    }
}

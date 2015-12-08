// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.squareup.okhttp.OkHttpClient;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.Locale;
import org.apache.http.util.EncodingUtils;

// Referenced classes of package org.apache.cordova:
//            PluginManager

public class CordovaResourceApi
{
    public static final class OpenForReadResult
    {

        public final AssetFileDescriptor assetFd;
        public final InputStream inputStream;
        public final long length;
        public final String mimeType;
        public final Uri uri;

        OpenForReadResult(Uri uri1, InputStream inputstream, String s, long l, AssetFileDescriptor assetfiledescriptor)
        {
            uri = uri1;
            inputStream = inputstream;
            mimeType = s;
            length = l;
            assetFd = assetfiledescriptor;
        }
    }


    private static final String LOCAL_FILE_PROJECTION[] = {
        "_data"
    };
    private static final String LOG_TAG = "CordovaResourceApi";
    public static final int URI_TYPE_ASSET = 1;
    public static final int URI_TYPE_CONTENT = 2;
    public static final int URI_TYPE_DATA = 4;
    public static final int URI_TYPE_FILE = 0;
    public static final int URI_TYPE_HTTP = 5;
    public static final int URI_TYPE_HTTPS = 6;
    public static final int URI_TYPE_RESOURCE = 3;
    public static final int URI_TYPE_UNKNOWN = -1;
    private static OkHttpClient httpClient = new OkHttpClient();
    static Thread jsThread;
    private final AssetManager assetManager;
    private final ContentResolver contentResolver;
    private final PluginManager pluginManager;
    private boolean threadCheckingEnabled;

    public CordovaResourceApi(Context context, PluginManager pluginmanager)
    {
        threadCheckingEnabled = true;
        contentResolver = context.getContentResolver();
        assetManager = context.getAssets();
        pluginManager = pluginmanager;
    }

    private void assertBackgroundThread()
    {
        if (threadCheckingEnabled)
        {
            Thread thread = Thread.currentThread();
            if (thread == Looper.getMainLooper().getThread())
            {
                throw new IllegalStateException("Do not perform IO operations on the UI thread. Use CordovaInterface.getThreadPool() instead.");
            }
            if (thread == jsThread)
            {
                throw new IllegalStateException("Tried to perform an IO operation on the WebCore thread. Use CordovaInterface.getThreadPool() instead.");
            }
        }
    }

    private static void assertNonRelative(Uri uri)
    {
        if (!uri.isAbsolute())
        {
            throw new IllegalArgumentException("Relative URIs are not supported.");
        } else
        {
            return;
        }
    }

    private String getDataUriMimeType(Uri uri)
    {
        uri = uri.getSchemeSpecificPart();
        int i = uri.indexOf(',');
        if (i != -1)
        {
            if ((uri = uri.substring(0, i).split(";")).length > 0)
            {
                return uri[0];
            }
        }
        return null;
    }

    private String getMimeTypeFromPath(String s)
    {
        int i = s.lastIndexOf('.');
        String s1 = s;
        if (i != -1)
        {
            s1 = s.substring(i + 1);
        }
        s = s1.toLowerCase(Locale.getDefault());
        if (s.equals("3ga"))
        {
            return "audio/3gpp";
        }
        if (s.equals("js"))
        {
            return "text/javascript";
        } else
        {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
        }
    }

    public static int getUriType(Uri uri)
    {
        assertNonRelative(uri);
        String s = uri.getScheme();
        if ("content".equals(s))
        {
            return 2;
        }
        if ("android.resource".equals(s))
        {
            return 3;
        }
        if ("file".equals(s))
        {
            return !uri.getPath().startsWith("/android_asset/") ? 0 : 1;
        }
        if ("data".equals(s))
        {
            return 4;
        }
        if ("http".equals(s))
        {
            return 5;
        }
        return !"https".equals(s) ? -1 : 6;
    }

    private OpenForReadResult readDataUri(Uri uri)
    {
        Object obj = uri.getSchemeSpecificPart();
        int j = ((String) (obj)).indexOf(',');
        if (j == -1)
        {
            return null;
        }
        String as[] = ((String) (obj)).substring(0, j).split(";");
        String s = null;
        boolean flag = false;
        if (as.length > 0)
        {
            s = as[0];
        }
        for (int i = 1; i < as.length; i++)
        {
            if ("base64".equalsIgnoreCase(as[i]))
            {
                flag = true;
            }
        }

        obj = ((String) (obj)).substring(j + 1);
        if (flag)
        {
            obj = Base64.decode(((String) (obj)), 0);
        } else
        {
            obj = EncodingUtils.getBytes(((String) (obj)), "UTF-8");
        }
        return new OpenForReadResult(uri, new ByteArrayInputStream(((byte []) (obj))), s, obj.length, null);
    }

    public void copyResource(Uri uri, Uri uri1)
        throws IOException
    {
        copyResource(openForRead(uri), openOutputStream(uri1));
    }

    public void copyResource(Uri uri, OutputStream outputstream)
        throws IOException
    {
        copyResource(openForRead(uri), outputstream);
    }

    public void copyResource(OpenForReadResult openforreadresult, OutputStream outputstream)
        throws IOException
    {
        assertBackgroundThread();
        Object obj = openforreadresult.inputStream;
        if (!(obj instanceof FileInputStream) || !(outputstream instanceof FileOutputStream)) goto _L2; else goto _L1
_L1:
        FileChannel filechannel;
        obj = ((FileInputStream)openforreadresult.inputStream).getChannel();
        filechannel = ((FileOutputStream)outputstream).getChannel();
        long l = 0L;
        long l1 = openforreadresult.length;
        if (openforreadresult.assetFd != null)
        {
            l = openforreadresult.assetFd.getStartOffset();
        }
        filechannel.transferFrom(((java.nio.channels.ReadableByteChannel) (obj)), l, l1);
_L4:
        openforreadresult.inputStream.close();
        if (outputstream != null)
        {
            outputstream.close();
        }
        return;
_L2:
        byte abyte0[] = new byte[8192];
_L5:
        int i = ((InputStream) (obj)).read(abyte0, 0, 8192);
        if (i <= 0) goto _L4; else goto _L3
_L3:
        outputstream.write(abyte0, 0, i);
          goto _L5
        Exception exception;
        exception;
        openforreadresult.inputStream.close();
        if (outputstream != null)
        {
            outputstream.close();
        }
        throw exception;
    }

    public HttpURLConnection createHttpConnection(Uri uri)
        throws IOException
    {
        assertBackgroundThread();
        return httpClient.open(new URL(uri.toString()));
    }

    public String getMimeType(Uri uri)
    {
        getUriType(uri);
        JVM INSTR tableswitch 0 6: default 48
    //                   0 50
    //                   1 50
    //                   2 59
    //                   3 59
    //                   4 68
    //                   5 74
    //                   6 74;
           goto _L1 _L2 _L2 _L3 _L3 _L4 _L5 _L5
_L1:
        return null;
_L2:
        return getMimeTypeFromPath(uri.getPath());
_L3:
        return contentResolver.getType(uri);
_L4:
        return getDataUriMimeType(uri);
_L5:
        uri = httpClient.open(new URL(uri.toString()));
        uri.setDoInput(false);
        uri.setRequestMethod("HEAD");
        uri = uri.getHeaderField("Content-Type");
        return uri;
        uri;
        if (true) goto _L1; else goto _L6
_L6:
    }

    public boolean isThreadCheckingEnabled()
    {
        return threadCheckingEnabled;
    }

    public File mapUriToFile(Uri uri)
    {
        assertBackgroundThread();
        getUriType(uri);
        JVM INSTR tableswitch 0 2: default 36
    //                   0 38
    //                   1 36
    //                   2 50;
           goto _L1 _L2 _L1 _L3
_L1:
        return null;
_L2:
        return new File(uri.getPath());
_L3:
        uri = contentResolver.query(uri, LOCAL_FILE_PROJECTION, null, null, null);
        if (uri == null) goto _L1; else goto _L4
_L4:
        int i = uri.getColumnIndex(LOCAL_FILE_PROJECTION[0]);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        Object obj;
        if (uri.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        uri.moveToFirst();
        obj = uri.getString(i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj = new File(((String) (obj)));
        uri.close();
        return ((File) (obj));
        uri.close();
        return null;
        Exception exception;
        exception;
        uri.close();
        throw exception;
    }

    public OpenForReadResult openForRead(Uri uri)
        throws IOException
    {
        return openForRead(uri, false);
    }

    public OpenForReadResult openForRead(Uri uri, boolean flag)
        throws IOException
    {
        if (!flag)
        {
            assertBackgroundThread();
        }
        getUriType(uri);
        JVM INSTR tableswitch 0 6: default 56
    //                   0 84
    //                   1 122
    //                   2 218
    //                   3 218
    //                   4 262
    //                   5 274
    //                   6 274;
           goto _L1 _L2 _L3 _L4 _L4 _L5 _L6 _L6
_L1:
        throw new FileNotFoundException((new StringBuilder()).append("URI not supported by CordovaResourceApi: ").append(uri).toString());
_L2:
        FileInputStream fileinputstream = new FileInputStream(uri.getPath());
        return new OpenForReadResult(uri, fileinputstream, getMimeTypeFromPath(uri.getPath()), fileinputstream.getChannel().size(), null);
_L3:
        AssetFileDescriptor assetfiledescriptor;
        String s2;
        long l;
        s2 = uri.getPath().substring(15);
        assetfiledescriptor = null;
        l = -1L;
        Object obj = assetManager.openFd(s2);
        assetfiledescriptor = ((AssetFileDescriptor) (obj));
        FileInputStream fileinputstream1 = ((AssetFileDescriptor) (obj)).createInputStream();
        assetfiledescriptor = ((AssetFileDescriptor) (obj));
        long l1 = ((AssetFileDescriptor) (obj)).getLength();
        l = l1;
        assetfiledescriptor = ((AssetFileDescriptor) (obj));
        obj = fileinputstream1;
_L7:
        return new OpenForReadResult(uri, ((InputStream) (obj)), getMimeTypeFromPath(s2), l, assetfiledescriptor);
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception = assetManager.open(s2);
          goto _L7
_L4:
        String s = contentResolver.getType(uri);
        AssetFileDescriptor assetfiledescriptor1 = contentResolver.openAssetFileDescriptor(uri, "r");
        return new OpenForReadResult(uri, assetfiledescriptor1.createInputStream(), s, assetfiledescriptor1.getLength(), assetfiledescriptor1);
_L5:
        OpenForReadResult openforreadresult = readDataUri(uri);
        if (openforreadresult != null)
        {
            return openforreadresult;
        }
          goto _L1
_L6:
        HttpURLConnection httpurlconnection = httpClient.open(new URL(uri.toString()));
        httpurlconnection.setDoInput(true);
        String s1 = httpurlconnection.getHeaderField("Content-Type");
        int i = httpurlconnection.getContentLength();
        return new OpenForReadResult(uri, httpurlconnection.getInputStream(), s1, i, null);
    }

    public OutputStream openOutputStream(Uri uri)
        throws IOException
    {
        return openOutputStream(uri, false);
    }

    public OutputStream openOutputStream(Uri uri, boolean flag)
        throws IOException
    {
        assertBackgroundThread();
        ContentResolver contentresolver;
        switch (getUriType(uri))
        {
        case 1: // '\001'
        default:
            throw new FileNotFoundException((new StringBuilder()).append("URI not supported by CordovaResourceApi: ").append(uri).toString());

        case 0: // '\0'
            uri = new File(uri.getPath());
            File file = uri.getParentFile();
            if (file != null)
            {
                file.mkdirs();
            }
            return new FileOutputStream(uri, flag);

        case 2: // '\002'
        case 3: // '\003'
            contentresolver = contentResolver;
            break;
        }
        String s;
        if (flag)
        {
            s = "wa";
        } else
        {
            s = "w";
        }
        return contentresolver.openAssetFileDescriptor(uri, s).createOutputStream();
    }

    public String remapPath(String s)
    {
        return remapUri(Uri.fromFile(new File(s))).getPath();
    }

    public Uri remapUri(Uri uri)
    {
        assertNonRelative(uri);
        Uri uri1 = pluginManager.remapUri(uri);
        if (uri1 != null)
        {
            return uri1;
        } else
        {
            return uri;
        }
    }

    public void setThreadCheckingEnabled(boolean flag)
    {
        threadCheckingEnabled = flag;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import com.admarvel.android.util.Logging;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import org.apache.http.util.ByteArrayBuffer;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView

class AdMarvelJavascriptCachedAdAsyncTask extends AsyncTask
{

    private final WeakReference adMarvelInternalWebViewReference;
    private final WeakReference contextReference;
    private final File storage;

    public AdMarvelJavascriptCachedAdAsyncTask(Context context, AdMarvelInternalWebView admarvelinternalwebview, File file)
    {
        contextReference = new WeakReference(context);
        storage = file;
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
    }

    private void DownloadFromUrl(String s, File file)
        throws IOException
    {
        long l;
        s = new URL(s);
        l = System.currentTimeMillis();
        Logging.log("download begining");
        Logging.log((new StringBuilder("download url:")).append(s).toString());
        Logging.log((new StringBuilder("downloaded file name:")).append(file.getName()).toString());
        s = s.openConnection();
        if (!isCancelled()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        BufferedInputStream bufferedinputstream = new BufferedInputStream(s.getInputStream());
        s = new ByteArrayBuffer(50);
        do
        {
            int i = bufferedinputstream.read();
            if (i == -1)
            {
                Logging.log(Environment.getExternalStorageState());
                if (!isCancelled())
                {
                    file.getParentFile().mkdirs();
                    if (!isCancelled())
                    {
                        file = new FileOutputStream(file);
                        file.write(s.toByteArray());
                        file.close();
                        Logging.log((new StringBuilder("download ready in")).append((System.currentTimeMillis() - l) / 1000L).append(" sec").toString());
                        return;
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
            s.append((byte)i);
        } while (!isCancelled());
        return;
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected transient Object doInBackground(Object aobj[])
    {
        Context context = (Context)contextReference.get();
        if (context != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s;
        String s1;
        int i;
        s = (String)aobj[0];
        s1 = (String)aobj[1];
        i = ((Integer)aobj[2]).intValue();
        Object obj;
        File file;
        aobj = (new URL(s)).getFile().split("\\?")[0];
        obj = new File(storage, (new StringBuilder("/data/com.admarvel.android.admarvelcachedads/cachedads")).append(((String) (aobj))).toString());
        file = new File(storage, (new StringBuilder("/data/com.admarvel.android.admarvelcachedads/cachedads")).append(((String) (aobj))).append(".tmp").toString());
        Logging.log((new StringBuilder("file: ")).append(((File) (obj)).getAbsolutePath()).toString());
        Logging.log((new StringBuilder("tmpfile: ")).append(file.getAbsolutePath()).toString());
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_381;
        }
        if (System.currentTimeMillis() - ((File) (obj)).lastModified() > (long)i)
        {
            ((File) (obj)).delete();
            if (file.exists())
            {
                file.delete();
            }
            DownloadFromUrl(s, file);
            file.renameTo(((File) (obj)));
        }
_L3:
        obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        aobj = (new StringBuilder("content://")).append(context.getPackageName()).append(".AdMarvelLocalFileContentProvider").append("/cachedads").append(((String) (aobj))).toString();
        ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(s1).append("(true,\"").append(s).append("\", \"").append(((String) (aobj))).append("\")").toString());
        return null;
        aobj;
        aobj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (aobj != null)
        {
            ((AdMarvelInternalWebView) (aobj)).loadUrl((new StringBuilder("javascript:")).append(s1).append("(false,\"").append(s).append("\", \"\")").toString());
            return null;
        }
        continue; /* Loop/switch isn't completed */
        if (file.exists())
        {
            file.delete();
        }
        DownloadFromUrl(s, file);
        file.renameTo(((File) (obj)));
          goto _L3
        aobj;
        aobj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (aobj != null)
        {
            ((AdMarvelInternalWebView) (aobj)).loadUrl((new StringBuilder("javascript:")).append(s1).append("(false,\"").append(s).append("\", \"\")").toString());
            return null;
        }
        continue; /* Loop/switch isn't completed */
        aobj;
        aobj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (aobj != null)
        {
            ((AdMarvelInternalWebView) (aobj)).loadUrl((new StringBuilder("javascript:")).append(s1).append("(false,\"").append(s).append("\", \"\")").toString());
            return null;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}

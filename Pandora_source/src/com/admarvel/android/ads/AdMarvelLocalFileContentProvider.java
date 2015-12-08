// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.admarvel.android.ads:
//            Version, AdMarvelView

public class AdMarvelLocalFileContentProvider extends ContentProvider
{
    private static class Buffer
    {

        public byte buffer[];
        public int bytes;

        private Buffer()
        {
            buffer = null;
            bytes = 0;
        }

        Buffer(Buffer buffer1)
        {
            this();
        }
    }


    public AdMarvelLocalFileContentProvider()
    {
    }

    public int delete(Uri uri, String s, String as[])
    {
        throw new UnsupportedOperationException("Not supported by this provider");
    }

    public String getType(Uri uri)
    {
        throw new UnsupportedOperationException("Not supported by this provider");
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException("Not supported by this provider");
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
        throws FileNotFoundException
    {
        boolean flag;
        flag = false;
        s = uri.getPath().replace((new StringBuilder("content://")).append(getContext().getPackageName()).append(".AdMarvelLocalFileContentProvider").toString(), "");
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s.equals("/mraid.js") && !s.equals("mraid.js")) goto _L4; else goto _L3
_L3:
        Object obj;
        int i;
        obj = (HttpURLConnection)(new URL("http://admarvel.s3.amazonaws.com/js/admarvel_mraid_v2_complete.js")).openConnection();
        ((HttpURLConnection) (obj)).setRequestMethod("GET");
        ((HttpURLConnection) (obj)).setDoOutput(false);
        ((HttpURLConnection) (obj)).setDoInput(true);
        ((HttpURLConnection) (obj)).setUseCaches(false);
        ((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        ((HttpURLConnection) (obj)).setRequestProperty("Content-Length", "0");
        ((HttpURLConnection) (obj)).setConnectTimeout(2000);
        ((HttpURLConnection) (obj)).setReadTimeout(10000);
        i = ((HttpURLConnection) (obj)).getResponseCode();
        int j = ((HttpURLConnection) (obj)).getContentLength();
        Logging.log((new StringBuilder("mraid Error Code: ")).append(i).toString());
        Logging.log((new StringBuilder("mraid Content Length: ")).append(j).toString());
        if (i != 200) goto _L4; else goto _L5
_L5:
        uri = (InputStream)((HttpURLConnection) (obj)).getContent();
        if ("gzip".equals(((HttpURLConnection) (obj)).getContentEncoding()) && Version.getAndroidSDKVersion() < 9)
        {
            uri = new GZIPInputStream(uri);
        }
        obj = new ArrayList();
        int k;
        k = 0;
        i = 8192;
_L18:
        if (i != '\uFFFF') goto _L7; else goto _L6
_L6:
        uri.close();
        if (k <= 0) goto _L9; else goto _L8
_L8:
        uri = new byte[k];
        i = 0;
        k = ((flag) ? 1 : 0);
_L14:
        if (i < ((List) (obj)).size()) goto _L11; else goto _L10
_L10:
        uri = new String(uri);
_L16:
        obj = getContext().openFileOutput("admarvel_mraid.js", 0);
        ((FileOutputStream) (obj)).write(uri.getBytes());
        ((FileOutputStream) (obj)).close();
_L15:
        return ParcelFileDescriptor.open(new File((new StringBuilder("/data/data/")).append(getContext().getPackageName()).append("/files").toString(), "admarvel_mraid.js"), 0x10000000);
_L7:
        byte abyte0[];
        int l;
        abyte0 = new byte[8192];
        l = uri.read(abyte0, 0, 8192);
        i = l;
        if (l <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        Buffer buffer1;
        buffer1 = new Buffer(null);
        buffer1.buffer = abyte0;
        buffer1.bytes = l;
        k += l;
        ((List) (obj)).add(buffer1);
        i = l;
        continue; /* Loop/switch isn't completed */
        uri;
        uri.printStackTrace();
_L4:
        uri = new File(new File(AdMarvelView.cachedDirectory), (new StringBuilder("/data/com.admarvel.android.admarvelcachedads")).append(s).toString());
        if (!uri.exists()) goto _L2; else goto _L12
_L12:
        Logging.log((new StringBuilder("AdMarvelLocalFileContentProvider::openFile: ")).append(uri.getAbsolutePath()).toString());
        uri = ParcelFileDescriptor.open(uri, 0x10000000);
        if (uri.getStatSize() > 0L) goto _L13; else goto _L2
_L2:
        return null;
_L11:
        Buffer buffer = (Buffer)((List) (obj)).get(i);
        System.arraycopy(buffer.buffer, 0, uri, k, buffer.bytes);
        k += buffer.bytes;
        i++;
          goto _L14
        uri;
        uri.printStackTrace();
          goto _L15
_L9:
        uri = "";
          goto _L16
_L13:
        return uri;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        throw new UnsupportedOperationException("Not supported by this provider");
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException("Not supported by this provider");
    }
}

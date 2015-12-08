// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.ETC1Util;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DView, Pulse3DCache, Log

abstract class FetchTask extends AsyncTask
{

    private Context mContext;
    private String mURL;

    public FetchTask(Context context)
    {
        mContext = null;
        mURL = null;
        mContext = context;
    }

    public abstract void callBack(Object obj);

    protected transient Object doInBackground(Object aobj[])
    {
        Object obj;
        Object obj2;
        boolean flag;
        mURL = (String)aobj[0];
        obj2 = null;
        obj = null;
        flag = false;
        if (!Pulse3DView.useCache) goto _L2; else goto _L1
_L1:
        Object obj1 = Pulse3DCache.getCachedAd(mContext, new URL(mURL));
        obj = obj1;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        obj2 = new FileInputStream(((File) (obj1)));
        flag = true;
_L36:
        byte abyte0[];
        abyte0 = null;
        obj = obj2;
        if (obj2 != null) goto _L5; else goto _L4
_L4:
        URLConnection urlconnection;
        urlconnection = (new URL(mURL)).openConnection();
        urlconnection.connect();
        abyte0 = urlconnection;
        obj = obj2;
        if (((HttpURLConnection)urlconnection).getResponseCode() != 200) goto _L5; else goto _L6
_L6:
        obj2 = urlconnection.getInputStream();
        abyte0 = urlconnection;
        obj = obj2;
        if (!Pulse3DView.useCache) goto _L5; else goto _L7
_L7:
        Object obj4 = Pulse3DCache.getEscapedCacheUrl(urlconnection.getURL());
        abyte0 = urlconnection;
        obj = obj2;
        if (!Pulse3DCache.createAmobeeCacheDir(mContext)) goto _L5; else goto _L8
_L8:
        obj4 = new File(Pulse3DCache.getAmobeeCacheDirPath(mContext), ((String) (obj4)));
        ((File) (obj4)).setLastModified(System.currentTimeMillis());
        abyte0 = urlconnection;
        obj1 = obj2;
          goto _L9
_L34:
        Object obj3 = null;
        obj = obj3;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        obj = obj3;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        obj = new FileOutputStream(((File) (obj4)));
        if (aobj[1] != java/lang/String) goto _L11; else goto _L10
_L10:
        aobj = new StringBuilder();
        obj1 = new BufferedReader(new InputStreamReader(((InputStream) (obj1))));
        if (obj == null) goto _L13; else goto _L12
_L12:
        abyte0 = ((BufferedReader) (obj1)).readLine();
        if (abyte0 == null) goto _L15; else goto _L14
_L14:
        ((StringBuilder) (aobj)).append(abyte0);
        ((StringBuilder) (aobj)).append(System.getProperty("line.separator"));
        ((OutputStream) (obj)).write(abyte0.getBytes());
        ((OutputStream) (obj)).write(System.getProperty("line.separator").getBytes());
          goto _L12
        aobj;
_L32:
        ((Exception) (aobj)).printStackTrace();
_L24:
        return null;
_L15:
        ((OutputStream) (obj)).flush();
        ((OutputStream) (obj)).close();
_L17:
        return ((StringBuilder) (aobj)).toString();
_L13:
        obj = ((BufferedReader) (obj1)).readLine();
        if (obj == null) goto _L17; else goto _L16
_L16:
        ((StringBuilder) (aobj)).append(((String) (obj)));
        ((StringBuilder) (aobj)).append(System.getProperty("line.separator"));
          goto _L13
_L11:
        if (aobj[1] != android/graphics/Bitmap)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!mURL.toLowerCase().endsWith(".pvr") && !mURL.toLowerCase().endsWith(".pkm"))
        {
            break MISSING_BLOCK_LABEL_505;
        }
        aobj = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
        if (obj == null) goto _L19; else goto _L18
_L18:
        int i = ((InputStream) (obj1)).read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_456;
        }
        ((ByteArrayOutputStream) (aobj)).write(abyte0, 0, i);
        ((OutputStream) (obj)).write(abyte0, 0, i);
          goto _L18
        ((OutputStream) (obj)).flush();
        ((OutputStream) (obj)).close();
_L21:
        return ETC1Util.createTexture(new ByteArrayInputStream(((ByteArrayOutputStream) (aobj)).toByteArray()));
_L19:
        i = ((InputStream) (obj1)).read(abyte0);
        if (i == -1) goto _L21; else goto _L20
_L20:
        ((ByteArrayOutputStream) (aobj)).write(abyte0, 0, i);
          goto _L19
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inScaled = false;
        obj1 = BitmapFactory.decodeStream(((InputStream) (obj1)), null, options);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_601;
        }
        aobj = ((Object []) (obj1));
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (abyte0.getHeaderField("Content-Type") == null || !abyte0.getHeaderField("Content-Type").toLowerCase().contains("png"))
        {
            break MISSING_BLOCK_LABEL_587;
        }
        ((Bitmap) (obj1)).compress(android.graphics.Bitmap.CompressFormat.PNG, 100, ((OutputStream) (obj)));
_L22:
        ((OutputStream) (obj)).flush();
        ((OutputStream) (obj)).close();
        return obj1;
        ((Bitmap) (obj1)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, ((OutputStream) (obj)));
          goto _L22
        Log.e("!!!!!!!", (new StringBuilder()).append("error downloading ").append(aobj[0]).toString());
        if (true) goto _L24; else goto _L23
_L23:
        if (aobj[1] != [B) goto _L24; else goto _L25
_L25:
        aobj = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
        if (obj == null) goto _L27; else goto _L26
_L26:
        i = ((InputStream) (obj1)).read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_696;
        }
        ((ByteArrayOutputStream) (aobj)).write(abyte0, 0, i);
        if (obj == null) goto _L26; else goto _L28
_L28:
        ((OutputStream) (obj)).write(abyte0, 0, i);
          goto _L26
        ((OutputStream) (obj)).flush();
        ((OutputStream) (obj)).close();
_L30:
        return ((ByteArrayOutputStream) (aobj)).toByteArray();
_L27:
        i = ((InputStream) (obj1)).read(abyte0);
        if (i == -1) goto _L30; else goto _L29
_L29:
        ((ByteArrayOutputStream) (aobj)).write(abyte0, 0, i);
          goto _L27
        aobj;
        if (true) goto _L32; else goto _L31
_L5:
        obj4 = obj1;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L2:
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L9:
        if (obj1 != null) goto _L34; else goto _L33
_L33:
        aobj = null;
_L31:
        return ((Object) (aobj));
        if (true) goto _L36; else goto _L35
_L35:
    }

    protected void onPostExecute(Object obj)
    {
        if (obj == null)
        {
            Log.e("FetchTask", (new StringBuilder()).append("null response, check internet connection (").append(mURL).append(")").toString());
        }
        callBack(obj);
    }

    public abstract void prepare(Object obj);
}

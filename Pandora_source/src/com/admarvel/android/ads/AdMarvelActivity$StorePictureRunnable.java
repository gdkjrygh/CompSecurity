// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.net.URL;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView, Utils

private static class mCallback
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    String imageUrl;
    String mCallback;

    public void run()
    {
        Object obj1;
        AdMarvelInternalWebView admarvelinternalwebview;
        String s;
        obj1 = null;
        admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelinternalwebview == null)
        {
            return;
        }
        s = (new StringBuilder(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString()))).append("/").toString();
        if (imageUrl == null) goto _L2; else goto _L1
_L1:
        if (!imageUrl.startsWith("/mnt/sdcard")) goto _L4; else goto _L3
_L3:
        if (!(new File(imageUrl)).exists()) goto _L6; else goto _L5
_L5:
        obj1 = BitmapFactory.decodeFile(imageUrl);
        Object obj = null;
_L8:
        Bitmap bitmap;
        bitmap = ((Bitmap) (obj1));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        bitmap = ((Bitmap) (obj1));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        bitmap = BitmapFactory.decodeStream(((java.io.InputStream) (obj)));
        obj = new File(s);
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        obj = (new StringBuilder(String.valueOf(s))).append(System.currentTimeMillis()).append(".jpg").toString();
        obj1 = new FileOutputStream(((String) (obj)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        bitmap.compress(android.graphics.unnable.imageUrl, 90, ((java.io.OutputStream) (obj1)));
        ((FileOutputStream) (obj1)).flush();
        ((FileOutputStream) (obj1)).close();
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(((String) (obj)))));
        admarvelinternalwebview.getContext().sendBroadcast(intent);
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
        return;
_L6:
        try
        {
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
            Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            return;
        }
        obj = null;
        continue; /* Loop/switch isn't completed */
_L4:
        if (imageUrl.startsWith("http:") || imageUrl.startsWith("https:"))
        {
            imageUrl = Utils.redirectURLCheck(imageUrl, admarvelinternalwebview.getContext());
            obj = (new URL(imageUrl)).openStream();
            continue; /* Loop/switch isn't completed */
        }
        if (imageUrl.startsWith("file:///android_asset/"))
        {
            int i = "file:///android_asset/".length();
            obj = imageUrl.substring(i);
            obj = admarvelinternalwebview.getContext().getAssets().open(((String) (obj)));
            continue; /* Loop/switch isn't completed */
        }
_L2:
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, String s, String s1)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        imageUrl = s;
        mCallback = s1;
    }
}

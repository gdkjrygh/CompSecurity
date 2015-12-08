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
//            AdMarvelWebView, AdMarvelInternalWebView, Utils

private static class mCallback
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private final WeakReference adMarvelWebViewReference;
    String imageUrl;
    String mCallback;

    public void run()
    {
        Object obj1;
        AdMarvelInternalWebView admarvelinternalwebview;
        AdMarvelWebView admarvelwebview;
        String s;
        obj1 = null;
        admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
        admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelinternalwebview == null || admarvelwebview == null)
        {
            return;
        }
        s = (new StringBuilder(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString()))).append("/").toString();
        if (!imageUrl.startsWith("/mnt/sdcard")) goto _L2; else goto _L1
_L1:
        if (!(new File(imageUrl)).exists()) goto _L4; else goto _L3
_L3:
        obj1 = BitmapFactory.decodeFile(imageUrl);
        Object obj = null;
_L6:
        Bitmap bitmap;
        bitmap = ((Bitmap) (obj1));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_116;
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
            break MISSING_BLOCK_LABEL_197;
        }
        bitmap.compress(android.graphics.unnable.imageUrl, 90, ((java.io.OutputStream) (obj1)));
        ((FileOutputStream) (obj1)).flush();
        ((FileOutputStream) (obj1)).close();
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(((String) (obj)))));
        admarvelwebview.getContext().sendBroadcast(intent);
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
        return;
_L4:
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
_L2:
        if (imageUrl.startsWith("http:") || imageUrl.startsWith("https:"))
        {
            imageUrl = Utils.redirectURLCheck(imageUrl, admarvelwebview.getContext());
            obj = (new URL(imageUrl)).openStream();
            continue; /* Loop/switch isn't completed */
        }
        if (imageUrl.startsWith("file:///android_asset/"))
        {
            int i = "file:///android_asset/".length();
            obj = imageUrl.substring(i);
            obj = admarvelwebview.getContext().getAssets().open(((String) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public (AdMarvelWebView admarvelwebview, AdMarvelInternalWebView admarvelinternalwebview, String s, String s1)
    {
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        imageUrl = s;
        mCallback = s1;
    }
}

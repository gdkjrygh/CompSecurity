// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.util;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.vungle.publisher.image.BitmapFactory;
import java.io.IOException;

public class ViewUtils
{

    BitmapFactory a;
    com.vungle.publisher.db.model.LoggedException.Factory b;

    public ViewUtils()
    {
    }

    public static String a(WebView webview)
    {
        return webview.getSettings().getUserAgentString();
    }

    public static void a(View view)
    {
        view.setOnTouchListener(new _cls1());
    }

    public static void a(ImageView imageview, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            imageview.setImageBitmap(bitmap);
        }
    }

    public static void b(View view)
    {
        view.setOnTouchListener(null);
    }

    public final Bitmap a(String s)
    {
        Bitmap bitmap;
        try
        {
            bitmap = a.getBitmap(s);
        }
        catch (IOException ioexception)
        {
            b.b("VungleAd", (new StringBuilder("error loading ")).append(s).toString(), ioexception);
            return null;
        }
        return bitmap;
    }

    /* member class not found */
    class _cls1 {}

}

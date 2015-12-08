// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            cx, cw, dc, dd, 
//            de

public class cm
{
    public static class a extends cm
    {

        public final int a()
        {
            return 6;
        }

        public boolean a(android.app.DownloadManager.Request request)
        {
            request.setShowRunningNotification(true);
            return true;
        }

        public final int b()
        {
            return 7;
        }

        public a()
        {
            super((byte)0);
        }
    }

    public static class b extends a
    {

        public WebChromeClient a(cw cw)
        {
            return new dc(cw);
        }

        public final cx a(cw cw, boolean flag)
        {
            return new dd(cw, flag);
        }

        public final Set a(Uri uri)
        {
            return uri.getQueryParameterNames();
        }

        public final boolean a(android.app.DownloadManager.Request request)
        {
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            return true;
        }

        public boolean a(Context context, WebSettings websettings)
        {
            if (context.getCacheDir() != null)
            {
                websettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
                websettings.setAppCacheMaxSize(0L);
                websettings.setAppCacheEnabled(true);
            }
            websettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
            websettings.setDatabaseEnabled(true);
            websettings.setDomStorageEnabled(true);
            websettings.setDisplayZoomControls(false);
            websettings.setBuiltInZoomControls(true);
            websettings.setSupportZoom(true);
            return true;
        }

        public final boolean a(View view)
        {
            view.setLayerType(0, null);
            return true;
        }

        public final boolean a(Window window)
        {
            window.setFlags(0x1000000, 0x1000000);
            return true;
        }

        public final boolean b(View view)
        {
            view.setLayerType(1, null);
            return true;
        }

        public b()
        {
        }
    }

    public static class c extends b
    {

        public final WebChromeClient a(cw cw)
        {
            return new de(cw);
        }

        public final String a(SslError sslerror)
        {
            return sslerror.getUrl();
        }

        public c()
        {
        }
    }

    public static class d extends f
    {

        public final Drawable a(Context context, Bitmap bitmap, boolean flag, float f1)
        {
            if (!flag || f1 <= 0.0F || f1 > 25F)
            {
                return new BitmapDrawable(context.getResources(), bitmap);
            }
            Object obj;
            try
            {
                Object obj2 = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                obj = Bitmap.createBitmap(((Bitmap) (obj2)));
                Object obj1 = RenderScript.create(context);
                ScriptIntrinsicBlur scriptintrinsicblur = ScriptIntrinsicBlur.create(((RenderScript) (obj1)), Element.U8_4(((RenderScript) (obj1))));
                obj2 = Allocation.createFromBitmap(((RenderScript) (obj1)), ((Bitmap) (obj2)));
                obj1 = Allocation.createFromBitmap(((RenderScript) (obj1)), ((Bitmap) (obj)));
                scriptintrinsicblur.setRadius(f1);
                scriptintrinsicblur.setInput(((Allocation) (obj2)));
                scriptintrinsicblur.forEach(((Allocation) (obj1)));
                ((Allocation) (obj1)).copyTo(((Bitmap) (obj)));
                obj = new BitmapDrawable(context.getResources(), ((Bitmap) (obj)));
            }
            catch (RuntimeException runtimeexception)
            {
                return new BitmapDrawable(context.getResources(), bitmap);
            }
            return ((Drawable) (obj));
        }

        public final String a(Context context)
        {
            return WebSettings.getDefaultUserAgent(context);
        }

        public final boolean a(Context context, WebSettings websettings)
        {
            super.a(context, websettings);
            websettings.setMediaPlaybackRequiresUserGesture(false);
            return true;
        }

        public d()
        {
        }
    }

    public static class e extends d
    {

        public final int c()
        {
            return 14;
        }

        public e()
        {
        }
    }

    public static class f extends c
    {

        public final void a(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
        {
            activity = activity.getWindow();
            if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
            {
                activity.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(ongloballayoutlistener);
            }
        }

        public final void a(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
        {
            viewtreeobserver.removeOnGlobalLayoutListener(ongloballayoutlistener);
        }

        public f()
        {
        }
    }

    public static final class g extends e
    {

        public g()
        {
        }
    }


    public cm()
    {
    }

    cm(byte byte0)
    {
        this();
    }

    public int a()
    {
        return 0;
    }

    public Drawable a(Context context, Bitmap bitmap, boolean flag, float f1)
    {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public WebChromeClient a(cw cw)
    {
        return null;
    }

    public cx a(cw cw, boolean flag)
    {
        return new cx(cw, flag);
    }

    public String a(Context context)
    {
        return "";
    }

    public String a(SslError sslerror)
    {
        return "";
    }

    public Set a(Uri uri)
    {
        if (uri.isOpaque())
        {
            return Collections.emptySet();
        }
        uri = uri.getEncodedQuery();
        if (uri == null)
        {
            return Collections.emptySet();
        }
        LinkedHashSet linkedhashset = new LinkedHashSet();
        int j = 0;
        do
        {
            int i;
            int k;
label0:
            {
                k = uri.indexOf('&', j);
                i = k;
                if (k == -1)
                {
                    i = uri.length();
                }
                int l = uri.indexOf('=', j);
                if (l <= i)
                {
                    k = l;
                    if (l != -1)
                    {
                        break label0;
                    }
                }
                k = i;
            }
            linkedhashset.add(Uri.decode(uri.substring(j, k)));
            i++;
            j = i;
            if (i >= uri.length())
            {
                return Collections.unmodifiableSet(linkedhashset);
            }
        } while (true);
    }

    public void a(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            a(activity.getDecorView().getViewTreeObserver(), ongloballayoutlistener);
        }
    }

    public void a(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        viewtreeobserver.removeGlobalOnLayoutListener(ongloballayoutlistener);
    }

    public boolean a(android.app.DownloadManager.Request request)
    {
        return false;
    }

    public boolean a(Context context, WebSettings websettings)
    {
        return false;
    }

    public boolean a(View view)
    {
        return false;
    }

    public boolean a(Window window)
    {
        return false;
    }

    public int b()
    {
        return 1;
    }

    public boolean b(View view)
    {
        return false;
    }

    public int c()
    {
        return 5;
    }
}

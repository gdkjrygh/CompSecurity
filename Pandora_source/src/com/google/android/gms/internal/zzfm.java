// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzge, zzgd, zzgj, zzgi, 
//            zzgk

public class zzfm
{
    static class a extends zzfm
    {

        public boolean zza(android.app.DownloadManager.Request request)
        {
            request.setShowRunningNotification(true);
            return true;
        }

        public int zzfe()
        {
            return 6;
        }

        public int zzff()
        {
            return 7;
        }

        a()
        {
        }
    }

    static class b extends a
    {

        public boolean zza(android.app.DownloadManager.Request request)
        {
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            return true;
        }

        public boolean zza(Context context, WebSettings websettings)
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

        public boolean zza(Window window)
        {
            window.setFlags(0x1000000, 0x1000000);
            return true;
        }

        public boolean zza(WebView webview)
        {
            webview.onPause();
            return true;
        }

        public zzge zzb(zzgd zzgd, boolean flag)
        {
            return new zzgj(zzgd, flag);
        }

        public boolean zzb(WebView webview)
        {
            webview.onResume();
            return true;
        }

        public WebChromeClient zze(zzgd zzgd)
        {
            return new zzgi(zzgd);
        }

        public Set zze(Uri uri)
        {
            return uri.getQueryParameterNames();
        }

        public boolean zzl(View view)
        {
            view.setLayerType(0, null);
            return true;
        }

        public boolean zzm(View view)
        {
            view.setLayerType(1, null);
            return true;
        }

        b()
        {
        }
    }

    static class c extends b
    {

        public WebChromeClient zze(zzgd zzgd)
        {
            return new zzgk(zzgd);
        }

        c()
        {
        }
    }

    static class d extends f
    {

        public String getDefaultUserAgent(Context context)
        {
            return WebSettings.getDefaultUserAgent(context);
        }

        public boolean zza(Context context, WebSettings websettings)
        {
            super.zza(context, websettings);
            websettings.setMediaPlaybackRequiresUserGesture(false);
            return true;
        }

        d()
        {
        }
    }

    static class e extends d
    {

        public int zzfg()
        {
            return 14;
        }

        public boolean zzk(View view)
        {
            return super.zzk(view) || view.getWindowId() != null;
        }

        e()
        {
        }
    }

    static class f extends c
    {

        public void zzb(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
        {
            activity = activity.getWindow();
            if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
            {
                activity.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(ongloballayoutlistener);
            }
        }

        f()
        {
        }
    }

    static class g extends e
    {

        public android.view.ViewGroup.LayoutParams zzfh()
        {
            return new android.view.ViewGroup.LayoutParams(-1, -1);
        }

        public boolean zzk(View view)
        {
            return view.isAttachedToWindow();
        }

        g()
        {
        }
    }


    private zzfm()
    {
    }


    public static zzfm zzB(int i)
    {
        if (i >= 19)
        {
            return new g();
        }
        if (i >= 18)
        {
            return new e();
        }
        if (i >= 17)
        {
            return new d();
        }
        if (i >= 16)
        {
            return new f();
        }
        if (i >= 14)
        {
            return new c();
        }
        if (i >= 11)
        {
            return new b();
        }
        if (i >= 9)
        {
            return new a();
        } else
        {
            return new zzfm();
        }
    }

    public String getDefaultUserAgent(Context context)
    {
        return "";
    }

    public boolean zza(android.app.DownloadManager.Request request)
    {
        return false;
    }

    public boolean zza(Context context, WebSettings websettings)
    {
        return false;
    }

    public boolean zza(Window window)
    {
        return false;
    }

    public boolean zza(WebView webview)
    {
        return false;
    }

    public zzge zzb(zzgd zzgd, boolean flag)
    {
        return new zzge(zzgd, flag);
    }

    public void zzb(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().removeGlobalOnLayoutListener(ongloballayoutlistener);
        }
    }

    public boolean zzb(WebView webview)
    {
        return false;
    }

    public WebChromeClient zze(zzgd zzgd)
    {
        return null;
    }

    public Set zze(Uri uri)
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

    public int zzfe()
    {
        return 0;
    }

    public int zzff()
    {
        return 1;
    }

    public int zzfg()
    {
        return 5;
    }

    public android.view.ViewGroup.LayoutParams zzfh()
    {
        return new android.view.ViewGroup.LayoutParams(-2, -2);
    }

    public boolean zzk(View view)
    {
        return view.getWindowToken() != null || view.getWindowVisibility() != 8;
    }

    public boolean zzl(View view)
    {
        return false;
    }

    public boolean zzm(View view)
    {
        return false;
    }
}

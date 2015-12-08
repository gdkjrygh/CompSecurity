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
//            zzid, zzic, zzig, zzih, 
//            zzii

public class zzhp
{
    static class zza extends zzhp
    {

        public boolean zza(android.app.DownloadManager.Request request)
        {
            request.setShowRunningNotification(true);
            return true;
        }

        public int zzex()
        {
            return 6;
        }

        public int zzey()
        {
            return 7;
        }

        zza()
        {
        }
    }

    static class zzb extends zza
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

        public WebChromeClient zzb(zzic zzic)
        {
            return new zzig(zzic);
        }

        public zzid zzb(zzic zzic, boolean flag)
        {
            return new zzih(zzic, flag);
        }

        public boolean zzb(WebView webview)
        {
            webview.onResume();
            return true;
        }

        public Set zze(Uri uri)
        {
            return uri.getQueryParameterNames();
        }

        public boolean zzj(View view)
        {
            view.setLayerType(0, null);
            return true;
        }

        public boolean zzk(View view)
        {
            view.setLayerType(1, null);
            return true;
        }

        zzb()
        {
        }
    }

    static class zzc extends zzb
    {

        public WebChromeClient zzb(zzic zzic)
        {
            return new zzii(zzic);
        }

        zzc()
        {
        }
    }

    static class zzd extends zzf
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

        zzd()
        {
        }
    }

    static class zze extends zzd
    {

        public int zzez()
        {
            return 14;
        }

        public boolean zzi(View view)
        {
            return super.zzi(view) || view.getWindowId() != null;
        }

        zze()
        {
        }
    }

    static class zzf extends zzc
    {

        public void zzb(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
        {
            activity = activity.getWindow();
            if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
            {
                activity.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(ongloballayoutlistener);
            }
        }

        zzf()
        {
        }
    }

    static class zzg extends zze
    {

        public boolean zzi(View view)
        {
            return view.isAttachedToWindow();
        }

        zzg()
        {
        }
    }


    private zzhp()
    {
    }


    public static zzhp zzz(int i)
    {
        if (i >= 19)
        {
            return new zzg();
        }
        if (i >= 18)
        {
            return new zze();
        }
        if (i >= 17)
        {
            return new zzd();
        }
        if (i >= 16)
        {
            return new zzf();
        }
        if (i >= 14)
        {
            return new zzc();
        }
        if (i >= 11)
        {
            return new zzb();
        }
        if (i >= 9)
        {
            return new zza();
        } else
        {
            return new zzhp();
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

    public WebChromeClient zzb(zzic zzic)
    {
        return null;
    }

    public zzid zzb(zzic zzic, boolean flag)
    {
        return new zzid(zzic, flag);
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

    public int zzex()
    {
        return 0;
    }

    public int zzey()
    {
        return 1;
    }

    public int zzez()
    {
        return 5;
    }

    public boolean zzi(View view)
    {
        return view.getWindowToken() != null || view.getWindowVisibility() != 8;
    }

    public boolean zzj(View view)
    {
        return false;
    }

    public boolean zzk(View view)
    {
        return false;
    }
}

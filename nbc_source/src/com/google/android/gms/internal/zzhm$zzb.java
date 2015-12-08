// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzhm, zzij, zzii, zzid, 
//            zzie

static class  extends 
{

    public boolean zza(android.app.anager.Request request)
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

    public zzie zzb(zzid zzid, boolean flag)
    {
        return new zzij(zzid, flag);
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

    public WebChromeClient zzf(zzid zzid)
    {
        return new zzii(zzid);
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

    ()
    {
    }
}

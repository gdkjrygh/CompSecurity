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
import java.io.File;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            qe, sl, zzjg, ry, 
//            zzja

public class qf extends qe
{

    public qf()
    {
    }

    public WebChromeClient a(ry ry)
    {
        return new sl(ry);
    }

    public final zzja a(ry ry, boolean flag)
    {
        return new zzjg(ry, flag);
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

    public final boolean a(Window window)
    {
        window.setFlags(0x1000000, 0x1000000);
        return true;
    }

    public final boolean b(View view)
    {
        view.setLayerType(0, null);
        return true;
    }

    public final boolean c(View view)
    {
        view.setLayerType(1, null);
        return true;
    }
}

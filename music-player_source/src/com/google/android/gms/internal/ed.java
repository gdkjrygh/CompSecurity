// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;
import java.io.File;

public final class ed
{

    public static void a(Context context, WebSettings websettings)
    {
        websettings.setAppCachePath((new File(context.getCacheDir(), "com.google.android.gms.ads.appcache")).getAbsolutePath());
        websettings.setAppCacheMaxSize(0L);
        websettings.setAppCacheEnabled(true);
        websettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        websettings.setDatabaseEnabled(true);
        websettings.setDomStorageEnabled(true);
        websettings.setDisplayZoomControls(false);
        websettings.setBuiltInZoomControls(true);
        websettings.setSupportZoom(true);
    }
}

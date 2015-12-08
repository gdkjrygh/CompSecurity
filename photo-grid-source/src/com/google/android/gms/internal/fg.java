// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            et, ej, eg

public final class fg extends et
{

    private final com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener a;

    public fg(com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
    {
        a = onappinstalladloadedlistener;
    }

    public final void a(eg eg)
    {
        a.onAppInstallAdLoaded(new ej(eg));
    }
}

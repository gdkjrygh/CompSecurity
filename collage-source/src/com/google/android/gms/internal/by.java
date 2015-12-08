// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bo, bn

public class by extends bt.a
{

    private final com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener a;

    public by(com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
    {
        a = onappinstalladloadedlistener;
    }

    public void a(bn bn)
    {
        a.onAppInstallAdLoaded(b(bn));
    }

    bo b(bn bn)
    {
        return new bo(bn);
    }
}

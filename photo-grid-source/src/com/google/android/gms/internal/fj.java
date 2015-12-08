// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            fc, er, eo

public final class fj extends fc
{

    private final com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener a;

    public fj(com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener oncustomtemplateadloadedlistener)
    {
        a = oncustomtemplateadloadedlistener;
    }

    public final void a(eo eo)
    {
        a.onCustomTemplateAdLoaded(new er(eo));
    }
}

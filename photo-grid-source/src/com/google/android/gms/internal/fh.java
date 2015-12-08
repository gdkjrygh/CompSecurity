// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ew, en, ek

public final class fh extends ew
{

    private final com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener a;

    public fh(com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener oncontentadloadedlistener)
    {
        a = oncontentadloadedlistener;
    }

    public final void a(ek ek)
    {
        a.onContentAdLoaded(new en(ek));
    }
}

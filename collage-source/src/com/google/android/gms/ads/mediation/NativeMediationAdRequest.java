// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAdOptions;

// Referenced classes of package com.google.android.gms.ads.mediation:
//            MediationAdRequest

public interface NativeMediationAdRequest
    extends MediationAdRequest
{

    public abstract NativeAdOptions getNativeAdOptions();

    public abstract boolean isAppInstallAdRequested();

    public abstract boolean isContentAdRequested();
}

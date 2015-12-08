// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.NativeAdMapper;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventListener

public interface CustomEventNativeListener
    extends CustomEventListener
{

    public abstract void onAdLoaded(NativeAdMapper nativeadmapper);
}

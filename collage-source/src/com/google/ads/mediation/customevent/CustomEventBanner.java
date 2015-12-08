// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.customevent;

import android.app.Activity;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;

// Referenced classes of package com.google.ads.mediation.customevent:
//            CustomEvent, CustomEventBannerListener

public interface CustomEventBanner
    extends CustomEvent
{

    public abstract void a(CustomEventBannerListener customeventbannerlistener, Activity activity, String s, String s1, AdSize adsize, MediationAdRequest mediationadrequest, Object obj);
}

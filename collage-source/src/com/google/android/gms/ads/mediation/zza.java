// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.ads.mediation:
//            MediationAdapter, zzb, NativeMediationAdRequest

public interface zza
    extends MediationAdapter
{

    public abstract void requestNativeAd(Context context, zzb zzb, Bundle bundle, NativeMediationAdRequest nativemediationadrequest, Bundle bundle1);
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.IInterface;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdRequestParcel

public interface zzp
    extends IInterface
{

    public abstract String getMediationAdapterClassName();

    public abstract boolean isLoading();

    public abstract void zzf(AdRequestParcel adrequestparcel);
}

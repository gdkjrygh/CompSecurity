// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            c

public final class RewardedVideoAdRequestParcel
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    public final int a;
    public final AdRequestParcel b;
    public final String c;

    public RewardedVideoAdRequestParcel(int i, AdRequestParcel adrequestparcel, String s)
    {
        a = i;
        b = adrequestparcel;
        c = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.ads.internal.reward.client.c.a(this, parcel, i);
    }

}

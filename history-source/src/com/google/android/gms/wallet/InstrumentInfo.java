// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            h

public final class InstrumentInfo
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    private final int CK;
    private String auX;
    private String auY;

    InstrumentInfo(int i, String s, String s1)
    {
        CK = i;
        auX = s;
        auY = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getInstrumentDetails()
    {
        return auY;
    }

    public String getInstrumentType()
    {
        return auX;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}

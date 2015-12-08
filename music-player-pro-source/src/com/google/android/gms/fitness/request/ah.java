// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.fitness.request:
//            ai

public class ah
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ai();
    private final int CK;
    private final String VF;

    ah(int i, String s)
    {
        CK = i;
        VF = s;
    }

    public ah(String s)
    {
        this(3, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDeviceAddress()
    {
        return VF;
    }

    int getVersionCode()
    {
        return CK;
    }

    public String toString()
    {
        return String.format("UnclaimBleDeviceRequest{%s}", new Object[] {
            VF
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ai.a(this, parcel, i);
    }

}

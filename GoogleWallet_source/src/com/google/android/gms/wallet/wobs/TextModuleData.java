// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            f

public final class TextModuleData
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    String aVY;
    private final int mVersionCode;
    String tU;

    TextModuleData()
    {
        mVersionCode = 1;
    }

    TextModuleData(int i, String s, String s1)
    {
        mVersionCode = i;
        aVY = s;
        tU = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}

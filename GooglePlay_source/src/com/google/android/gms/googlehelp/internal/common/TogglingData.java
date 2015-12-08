// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.googlehelp.internal.common:
//            TogglingDataCreator

public class TogglingData
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new TogglingDataCreator();
    String mCallingPackageName;
    String mPipFileName;
    String mPipTitle;
    final int mVersionCode;

    private TogglingData()
    {
        mVersionCode = 1;
    }

    TogglingData(int i, String s, String s1, String s2)
    {
        mVersionCode = i;
        mCallingPackageName = s;
        mPipFileName = s1;
        mPipTitle = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        TogglingDataCreator.writeToParcel$637bf5fe(this, parcel);
    }

}

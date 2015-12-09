// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.feedback:
//            LogOptionsCreator

public class LogOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new LogOptionsCreator();
    public boolean mIncludeRadioLogs;
    public String mLogFilter;
    public final int mVersionCode;

    LogOptions(int i, String s, boolean flag)
    {
        mVersionCode = i;
        mLogFilter = s;
        mIncludeRadioLogs = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LogOptionsCreator.writeToParcel$4f524a20(this, parcel);
    }

}

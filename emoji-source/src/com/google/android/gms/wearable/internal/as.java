// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            at

public class as
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new at();
    public final long amb;
    public final List amd;
    public final int statusCode;
    public final int versionCode;

    as(int i, int j, long l, List list)
    {
        versionCode = i;
        statusCode = j;
        amb = l;
        amd = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        at.a(this, parcel, i);
    }

}

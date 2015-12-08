// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            le

public class ld
    implements SafeParcelable
{

    public static final le CREATOR = new le();
    public final String WP;
    public final int WQ;
    final int mVersionCode;

    public ld(int i, String s, int j)
    {
        mVersionCode = i;
        WP = s;
        WQ = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        le.a(this, parcel, i);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            z

public final class y
    implements SafeParcelable
{

    public static final z CREATOR = new z();
    public final boolean mi;
    public final boolean ms;
    public final int versionCode;

    y(int i, boolean flag, boolean flag1)
    {
        versionCode = i;
        mi = flag;
        ms = flag1;
    }

    public y(boolean flag, boolean flag1)
    {
        versionCode = 1;
        mi = flag;
        ms = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        z.a(this, parcel, i);
    }

}

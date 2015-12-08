// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            y

public final class x
    implements SafeParcelable
{

    public static final y CREATOR = new y();
    public final boolean lX;
    public final boolean mh;
    public final int versionCode;

    x(int i, boolean flag, boolean flag1)
    {
        versionCode = i;
        lX = flag;
        mh = flag1;
    }

    public x(boolean flag, boolean flag1)
    {
        versionCode = 1;
        lX = flag;
        mh = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        y.a(this, parcel, i);
    }

}

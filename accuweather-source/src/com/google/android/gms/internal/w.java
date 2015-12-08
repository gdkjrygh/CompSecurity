// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            x

public final class w
    implements SafeParcelable
{

    public static final x CREATOR = new x();
    public final boolean kZ;
    public final boolean lb;
    public final int versionCode;

    w(int i, boolean flag, boolean flag1)
    {
        versionCode = i;
        kZ = flag;
        lb = flag1;
    }

    public w(boolean flag, boolean flag1)
    {
        versionCode = 1;
        kZ = flag;
        lb = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        x.a(this, parcel, i);
    }

}

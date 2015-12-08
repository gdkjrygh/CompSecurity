// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            w

public final class v
    implements SafeParcelable
{

    public static final w CREATOR = new w();
    public final boolean lb;
    public final boolean ld;
    public final int versionCode;

    v(int i, boolean flag, boolean flag1)
    {
        versionCode = i;
        lb = flag;
        ld = flag1;
    }

    public v(boolean flag, boolean flag1)
    {
        versionCode = 1;
        lb = flag;
        ld = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        w.a(this, parcel, i);
    }

}

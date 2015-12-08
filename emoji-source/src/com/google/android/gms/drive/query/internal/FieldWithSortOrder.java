// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            c

public class FieldWithSortOrder
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    final String JH;
    final boolean KO;
    final int xM;

    FieldWithSortOrder(int i, String s, boolean flag)
    {
        xM = i;
        JH = s;
        KO = flag;
    }

    public FieldWithSortOrder(String s, boolean flag)
    {
        this(1, s, flag);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}

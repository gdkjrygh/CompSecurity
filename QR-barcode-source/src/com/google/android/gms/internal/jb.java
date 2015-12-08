// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public class jb
    implements SafeParcelable
{

    public static final jc CREATOR = new jc();
    final int BR;
    public final String Mq;
    public final int Mr;

    public jb(int i, String s, int j)
    {
        BR = i;
        Mq = s;
        Mr = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jc.a(this, parcel, i);
    }

}

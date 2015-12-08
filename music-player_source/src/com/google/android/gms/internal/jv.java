// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            kn, jr, jt

public final class jv
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kn();
    String a;
    String b;
    jr c;
    jt d;
    jt e;
    private final int f;

    jv()
    {
        f = 1;
    }

    jv(int i, String s, String s1, jr jr, jt jt, jt jt1)
    {
        f = i;
        a = s;
        b = s1;
        c = jr;
        d = jt;
        e = jt1;
    }

    public final int a()
    {
        return f;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        kn.a(this, parcel, i);
    }

}

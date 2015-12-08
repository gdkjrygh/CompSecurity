// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            el

public final class db
    implements SafeParcelable
{

    public static final el a = new el();
    public final int b;
    public String c;
    public int d;
    public int e;
    public boolean f;

    public db()
    {
        this(1, "afma-sdk-a-v4323000.4323000.0", 0x41f6b8, 0x41f6b8, true);
    }

    db(int i, String s, int j, int k, boolean flag)
    {
        b = i;
        c = s;
        d = j;
        e = k;
        f = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        el.a(this, parcel);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            kh

public final class jj
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kh();
    String a;
    String b;
    ArrayList c;
    private final int d;

    jj()
    {
        d = 1;
        c = new ArrayList();
    }

    jj(int i, String s, String s1, ArrayList arraylist)
    {
        d = i;
        a = s;
        b = s1;
        c = arraylist;
    }

    public final int a()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        kh.a(this, parcel);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hu

public class zzkw
    implements SafeParcelable
{

    public static final hu CREATOR = new hu();
    final int a;
    public final String b;
    public final int c;

    public zzkw(int i, String s, int j)
    {
        a = i;
        b = s;
        c = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hu.a(this, parcel);
    }

}

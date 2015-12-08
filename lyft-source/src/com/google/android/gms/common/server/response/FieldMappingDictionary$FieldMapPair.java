// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server.response:
//            zzb

public class c
    implements SafeParcelable
{

    public static final zzb CREATOR = new zzb();
    final int a;
    final String b;
    final CREATOR c;

    public int describeContents()
    {
        zzb zzb1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        zzb.a(this, parcel, i);
    }


    (int i, String s,  )
    {
        a = i;
        b = s;
        c = ;
    }

    c(String s, c c1)
    {
        a = 1;
        b = s;
        c = c1;
    }
}

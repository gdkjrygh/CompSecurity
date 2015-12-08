// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            b, FACLConfig

public class FACLData
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    final int a;
    FACLConfig b;
    String c;
    boolean d;
    String e;

    FACLData(int i, FACLConfig faclconfig, String s, boolean flag, String s1)
    {
        a = i;
        b = faclconfig;
        c = s;
        d = flag;
        e = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.firstparty.shared.b.a(this, parcel, i);
    }

}

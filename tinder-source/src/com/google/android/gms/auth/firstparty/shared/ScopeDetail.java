// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            c, FACLData

public class ScopeDetail
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    final int a;
    String b;
    String c;
    String d;
    String e;
    String f;
    List g;
    public FACLData h;

    ScopeDetail(int i, String s, String s1, String s2, String s3, String s4, List list, 
            FACLData facldata)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        g = list;
        h = facldata;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.firstparty.shared.c.a(this, parcel, i);
    }

}

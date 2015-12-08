// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            d

public class TokenData
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    final int a;
    final String b;
    final Long c;
    final boolean d;
    final boolean e;
    final List f;

    TokenData(int i, String s, Long long1, boolean flag, boolean flag1, List list)
    {
        a = i;
        b = u.a(s);
        c = long1;
        d = flag;
        e = flag1;
        f = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof TokenData)
        {
            if (TextUtils.equals(b, ((TokenData) (obj = (TokenData)obj)).b) && t.a(c, ((TokenData) (obj)).c) && d == ((TokenData) (obj)).d && e == ((TokenData) (obj)).e && t.a(f, ((TokenData) (obj)).f))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, Boolean.valueOf(d), Boolean.valueOf(e), f
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.d.a(this, parcel);
    }

}

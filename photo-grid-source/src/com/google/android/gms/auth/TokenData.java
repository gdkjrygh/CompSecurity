// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.bj;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            h

public class TokenData
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    final int a;
    private final String b;
    private final Long c;
    private final boolean d;
    private final boolean e;
    private final List f;

    TokenData(int i, String s, Long long1, boolean flag, boolean flag1, List list)
    {
        a = i;
        b = bl.a(s);
        c = long1;
        d = flag;
        e = flag1;
        f = list;
    }

    public static TokenData a(Bundle bundle, String s)
    {
        bundle.setClassLoader(com/google/android/gms/auth/TokenData.getClassLoader());
        bundle = bundle.getBundle(s);
        if (bundle == null)
        {
            return null;
        } else
        {
            bundle.setClassLoader(com/google/android/gms/auth/TokenData.getClassLoader());
            return (TokenData)bundle.getParcelable("TokenData");
        }
    }

    public final String a()
    {
        return b;
    }

    public final Long b()
    {
        return c;
    }

    public final boolean c()
    {
        return d;
    }

    public final boolean d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public final List e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof TokenData)
        {
            if (TextUtils.equals(b, ((TokenData) (obj = (TokenData)obj)).b) && bj.a(c, ((TokenData) (obj)).c) && d == ((TokenData) (obj)).d && e == ((TokenData) (obj)).e && bj.a(f, ((TokenData) (obj)).f))
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
        h.a(this, parcel);
    }

}

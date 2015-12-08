// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.bj;
import com.google.android.gms.common.internal.bk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            f, PlusCommonExtras

public class PlusSession
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private final int a;
    private final String b;
    private final String c[];
    private final String d[];
    private final String e[];
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final PlusCommonExtras j;

    PlusSession(int k, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4, PlusCommonExtras pluscommonextras)
    {
        a = k;
        b = s;
        c = as;
        d = as1;
        e = as2;
        f = s1;
        g = s2;
        h = s3;
        i = s4;
        j = pluscommonextras;
    }

    public final int a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final String[] c()
    {
        return c;
    }

    public final String[] d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String[] e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusSession)
        {
            if (a == ((PlusSession) (obj = (PlusSession)obj)).a && bj.a(b, ((PlusSession) (obj)).b) && Arrays.equals(c, ((PlusSession) (obj)).c) && Arrays.equals(d, ((PlusSession) (obj)).d) && Arrays.equals(e, ((PlusSession) (obj)).e) && bj.a(f, ((PlusSession) (obj)).f) && bj.a(g, ((PlusSession) (obj)).g) && bj.a(h, ((PlusSession) (obj)).h) && bj.a(i, ((PlusSession) (obj)).i) && bj.a(j, ((PlusSession) (obj)).j))
            {
                return true;
            }
        }
        return false;
    }

    public final String f()
    {
        return f;
    }

    public final String g()
    {
        return g;
    }

    public final String h()
    {
        return h;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, c, d, e, f, g, h, i, j
        });
    }

    public final String i()
    {
        return i;
    }

    public final PlusCommonExtras j()
    {
        return j;
    }

    public String toString()
    {
        return bj.a(this).a("versionCode", Integer.valueOf(a)).a("accountName", b).a("requestedScopes", c).a("visibleActivities", d).a("requiredFeatures", e).a("packageNameForAuth", f).a("callingPackageName", g).a("applicationName", h).a("extra", j.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.gms.plus.internal.f.a(this, parcel, k);
    }

}

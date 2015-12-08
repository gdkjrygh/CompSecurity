// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            g, PlusCommonExtras

public class h
    implements SafeParcelable
{

    public static final g a = new g();
    private final int b;
    private final String c;
    private final String d[];
    private final String e[];
    private final String f[];
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final PlusCommonExtras k;

    h(int l, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4, PlusCommonExtras pluscommonextras)
    {
        b = l;
        c = s;
        d = as;
        e = as1;
        f = as2;
        g = s1;
        h = s2;
        i = s3;
        j = s4;
        k = pluscommonextras;
    }

    public final int a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String[] c()
    {
        return d;
    }

    public final String[] d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String[] e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof h)
        {
            if (b == ((h) (obj = (h)obj)).b && gq.a(c, ((h) (obj)).c) && Arrays.equals(d, ((h) (obj)).d) && Arrays.equals(e, ((h) (obj)).e) && Arrays.equals(f, ((h) (obj)).f) && gq.a(g, ((h) (obj)).g) && gq.a(h, ((h) (obj)).h) && gq.a(i, ((h) (obj)).i) && gq.a(j, ((h) (obj)).j) && gq.a(k, ((h) (obj)).k))
            {
                return true;
            }
        }
        return false;
    }

    public final String f()
    {
        return g;
    }

    public final String g()
    {
        return h;
    }

    public final String h()
    {
        return i;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), c, d, e, f, g, h, i, j, k
        });
    }

    public final String i()
    {
        return j;
    }

    public final PlusCommonExtras j()
    {
        return k;
    }

    public String toString()
    {
        return gq.a(this).a("versionCode", Integer.valueOf(b)).a("accountName", c).a("requestedScopes", d).a("visibleActivities", e).a("requiredFeatures", f).a("packageNameForAuth", g).a("callingPackageName", h).a("applicationName", i).a("extra", k.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        com.google.android.gms.plus.internal.g.a(this, parcel, l);
    }

}

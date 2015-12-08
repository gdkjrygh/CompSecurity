// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kr

public class zzqq
    implements SafeParcelable
{

    public static final kr CREATOR = new kr();
    final int a;
    private final String b;
    private final String c;
    private final List d;
    private final List e;
    private final List f;

    zzqq(int i, String s, String s1, List list, List list1, List list2)
    {
        a = i;
        b = s;
        c = s1;
        d = list;
        e = list1;
        f = list2;
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final List c()
    {
        return e;
    }

    public final List d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public final List e()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof zzqq))
            {
                return false;
            }
            obj = (zzqq)obj;
            if (!b.equals(((zzqq) (obj)).b) || !c.equals(((zzqq) (obj)).c) || !d.equals(((zzqq) (obj)).d) || !e.equals(((zzqq) (obj)).e) || !f.equals(((zzqq) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, d, e, f
        });
    }

    public String toString()
    {
        return an.a(this).a("accountName", b).a("placeId", c).a("testDataImpls", d).a("placeAliases", e).a("hereContents", f).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kr.a(this, parcel);
    }

}

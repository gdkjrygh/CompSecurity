// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import bfn;
import btj;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            SearchAdRequestParcel

public final class AdRequestParcel
    implements SafeParcelable
{

    public static final bfn CREATOR = new bfn();
    public final int a;
    public final long b;
    public final Bundle c;
    public final int d;
    public final List e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final SearchAdRequestParcel j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List o;
    public final String p;
    public final String q;

    public AdRequestParcel(int i1, long l1, Bundle bundle, int j1, List list, boolean flag, 
            int k1, boolean flag1, String s, SearchAdRequestParcel searchadrequestparcel, Location location, String s1, Bundle bundle1, 
            Bundle bundle2, List list1, String s2, String s3)
    {
        a = i1;
        b = l1;
        Bundle bundle3 = bundle;
        if (bundle == null)
        {
            bundle3 = new Bundle();
        }
        c = bundle3;
        d = j1;
        e = list;
        f = flag;
        g = k1;
        h = flag1;
        i = s;
        j = searchadrequestparcel;
        k = location;
        l = s1;
        m = bundle1;
        n = bundle2;
        o = list1;
        p = s2;
        q = s3;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof AdRequestParcel)
        {
            if (a == ((AdRequestParcel) (obj = (AdRequestParcel)obj)).a && b == ((AdRequestParcel) (obj)).b && btj.a(c, ((AdRequestParcel) (obj)).c) && d == ((AdRequestParcel) (obj)).d && btj.a(e, ((AdRequestParcel) (obj)).e) && f == ((AdRequestParcel) (obj)).f && g == ((AdRequestParcel) (obj)).g && h == ((AdRequestParcel) (obj)).h && btj.a(i, ((AdRequestParcel) (obj)).i) && btj.a(j, ((AdRequestParcel) (obj)).j) && btj.a(k, ((AdRequestParcel) (obj)).k) && btj.a(l, ((AdRequestParcel) (obj)).l) && btj.a(m, ((AdRequestParcel) (obj)).m) && btj.a(n, ((AdRequestParcel) (obj)).n) && btj.a(o, ((AdRequestParcel) (obj)).o) && btj.a(p, ((AdRequestParcel) (obj)).p) && btj.a(q, ((AdRequestParcel) (obj)).q))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), Long.valueOf(b), c, Integer.valueOf(d), e, Boolean.valueOf(f), Integer.valueOf(g), Boolean.valueOf(h), i, j, 
            k, l, m, n, o, p, q
        });
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        bfn.a(this, parcel, i1);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            hi, hj, cy, di, 
//            da, dc

public final class gb
{
    public static final class a
    {

        public final AdRequestInfoParcel a;
        public final AdResponseParcel b;
        public final da c;
        public final AdSizeParcel d;
        public final int e;
        public final long f;
        public final long g;
        public final JSONObject h;

        public a(AdRequestInfoParcel adrequestinfoparcel, AdResponseParcel adresponseparcel, da da, AdSizeParcel adsizeparcel, int i1, long l1, 
                long l2, JSONObject jsonobject)
        {
            a = adrequestinfoparcel;
            b = adresponseparcel;
            c = da;
            d = adsizeparcel;
            e = i1;
            f = l1;
            g = l2;
            h = jsonobject;
        }
    }


    public final AdRequestParcel a;
    public final hi b;
    public final List c;
    public final int d;
    public final List e;
    public final List f;
    public final int g;
    public final long h;
    public final String i;
    public final JSONObject j;
    public final boolean k;
    public final cy l;
    public final di m;
    public final String n;
    public final da o;
    public final dc p;
    public final long q;
    public final AdSizeParcel r;
    public final long s;
    public final long t;
    public final long u;
    public final String v;
    public final com.google.android.gms.ads.internal.formats.h.a w;
    public final String x;

    public gb(AdRequestParcel adrequestparcel, hi hi1, List list, int i1, List list1, List list2, int j1, 
            long l1, String s1, boolean flag, cy cy, di di, String s2, 
            da da, dc dc, long l2, AdSizeParcel adsizeparcel, long l3, 
            long l4, long l5, String s3, JSONObject jsonobject, com.google.android.gms.ads.internal.formats.h.a a1, 
            String s4)
    {
        a = adrequestparcel;
        b = hi1;
        if (list != null)
        {
            adrequestparcel = Collections.unmodifiableList(list);
        } else
        {
            adrequestparcel = null;
        }
        c = adrequestparcel;
        d = i1;
        if (list1 != null)
        {
            adrequestparcel = Collections.unmodifiableList(list1);
        } else
        {
            adrequestparcel = null;
        }
        e = adrequestparcel;
        if (list2 != null)
        {
            adrequestparcel = Collections.unmodifiableList(list2);
        } else
        {
            adrequestparcel = null;
        }
        f = adrequestparcel;
        g = j1;
        h = l1;
        i = s1;
        k = flag;
        l = cy;
        m = di;
        n = s2;
        o = da;
        p = dc;
        q = l2;
        r = adsizeparcel;
        s = l3;
        t = l4;
        u = l5;
        v = s3;
        j = jsonobject;
        w = a1;
        x = s4;
    }

    public gb(a a1)
    {
        this(a1.a.c, null, a1.b.d, a1.e, a1.b.f, a1.b.j, a1.b.l, a1.b.k, a1.a.i, a1.b.h, null, null, null, a1.c, null, a1.b.i, a1.d, a1.b.g, a1.f, a1.g, a1.b.o, a1.h, null, a1.a.x);
    }

    public final boolean a()
    {
        if (b == null || b.j() == null)
        {
            return false;
        } else
        {
            return b.j().b();
        }
    }
}

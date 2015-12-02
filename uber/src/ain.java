// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class ain
{

    public final AdRequestParcel a;
    public final akk b;
    public final List c;
    public final int d;
    public final List e;
    public final List f;
    public final int g;
    public final long h;
    public final String i;
    public final JSONObject j;
    public final boolean k;
    public final aea l;
    public final aem m;
    public final String n;
    public final aeb o;
    public final aed p;
    public final long q;
    public final AdSizeParcel r;
    public final long s;
    public final long t;
    public final long u;
    public final String v;
    public final aci w;
    public final String x;

    public ain(aio aio1, akk akk1)
    {
        this(aio1.a.c, akk1, aio1.b.d, aio1.e, aio1.b.f, aio1.b.j, aio1.b.l, aio1.b.k, aio1.a.i, aio1.b.h, null, null, null, aio1.c, null, aio1.b.i, aio1.d, aio1.b.g, aio1.f, aio1.g, aio1.b.o, aio1.h, null, aio1.a.x);
    }

    public ain(AdRequestParcel adrequestparcel, akk akk1, List list, int i1, List list1, List list2, int j1, 
            long l1, String s1, boolean flag, aea aea, aem aem, String s2, 
            aeb aeb, aed aed, long l2, AdSizeParcel adsizeparcel, long l3, 
            long l4, long l5, String s3, JSONObject jsonobject, aci aci, 
            String s4)
    {
        a = adrequestparcel;
        b = akk1;
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
        l = aea;
        m = aem;
        n = s2;
        o = aeb;
        p = aed;
        q = l2;
        r = adsizeparcel;
        s = l3;
        t = l4;
        u = l5;
        v = s3;
        j = jsonobject;
        w = aci;
        x = s4;
    }

    public final boolean a()
    {
        if (b == null || b.i() == null)
        {
            return false;
        } else
        {
            return b.i().b();
        }
    }
}

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

public final class cit
{

    public final AdRequestParcel a;
    public final ckw b;
    public final List c;
    public final int d;
    public final List e;
    public final List f;
    public final int g;
    public final long h;
    public final String i;
    public final JSONObject j;
    public final boolean k;
    public final cen l;
    public final cfa m;
    public final String n;
    public final ceo o;
    public final ceq p;
    public final AdSizeParcel q;
    public final long r;
    public final long s;
    public final String t;
    public final bhh u;

    public cit(ciu ciu1)
    {
        AdRequestParcel adrequestparcel = ciu1.a.c;
        List list = ciu1.b.d;
        int i1 = ciu1.e;
        List list1 = ciu1.b.f;
        List list2 = ciu1.b.j;
        int j1 = ciu1.b.l;
        long l1 = ciu1.b.k;
        String s1 = ciu1.a.i;
        boolean flag = ciu1.b.h;
        ceo ceo = ciu1.c;
        long l2 = ciu1.b.i;
        AdSizeParcel adsizeparcel = ciu1.d;
        l2 = ciu1.b.g;
        this(adrequestparcel, null, list, i1, list1, list2, j1, l1, s1, flag, null, null, null, ceo, null, adsizeparcel, ciu1.f, ciu1.g, ciu1.b.o, ciu1.h, null);
    }

    public cit(AdRequestParcel adrequestparcel, ckw ckw1, List list, int i1, List list1, List list2, int j1, 
            long l1, String s1, boolean flag, cen cen, cfa cfa, String s2, 
            ceo ceo, ceq ceq, AdSizeParcel adsizeparcel, long l2, long l3, 
            String s3, JSONObject jsonobject, bhh bhh)
    {
        a = adrequestparcel;
        b = ckw1;
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
        l = cen;
        m = cfa;
        n = s2;
        o = ceo;
        p = ceq;
        q = adsizeparcel;
        r = l2;
        s = l3;
        t = s3;
        j = jsonobject;
        u = bhh;
    }

    public final boolean a()
    {
        if (b == null || b.k() == null)
        {
            return false;
        } else
        {
            return b.k().a();
        }
    }
}

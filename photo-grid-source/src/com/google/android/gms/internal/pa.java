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
//            pb, ry, zzja, id, 
//            is, ie, ig

public final class pa
{

    public final AdRequestParcel a;
    public final ry b;
    public final List c;
    public final int d;
    public final List e;
    public final List f;
    public final int g;
    public final long h;
    public final String i;
    public final JSONObject j;
    public final boolean k;
    public final id l;
    public final is m;
    public final String n;
    public final ie o;
    public final ig p;
    public final long q;
    public final AdSizeParcel r;
    public final long s;
    public final long t;
    public final long u;
    public final String v;
    public final com.google.android.gms.ads.internal.formats.zzh.zza w;

    public pa(AdRequestParcel adrequestparcel, ry ry1, List list, int i1, List list1, List list2, int j1, 
            long l1, String s1, boolean flag, id id, is is, String s2, 
            ie ie, ig ig, long l2, AdSizeParcel adsizeparcel, long l3, 
            long l4, long l5, String s3, JSONObject jsonobject, com.google.android.gms.ads.internal.formats.zzh.zza zza)
    {
        a = adrequestparcel;
        b = ry1;
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
        l = id;
        m = is;
        n = s2;
        o = ie;
        p = ig;
        q = l2;
        r = adsizeparcel;
        s = l3;
        t = l4;
        u = l5;
        v = s3;
        j = jsonobject;
        w = zza;
    }

    public pa(pb pb1)
    {
        this(pb1.a.zzEn, null, pb1.b.zzyY, pb1.e, pb1.b.zzyZ, pb1.b.zzEM, pb1.b.orientation, pb1.b.zzzc, pb1.a.zzEq, pb1.b.zzEK, null, null, null, pb1.c, null, pb1.b.zzEL, pb1.d, pb1.b.zzEJ, pb1.f, pb1.g, pb1.b.zzEP, pb1.h, null);
    }

    public final boolean a()
    {
        if (b == null || b.k() == null)
        {
            return false;
        } else
        {
            return b.k().zzbY();
        }
    }
}

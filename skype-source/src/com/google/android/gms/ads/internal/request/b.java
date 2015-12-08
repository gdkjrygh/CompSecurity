// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.internal.ak;
import com.google.android.gms.internal.da;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.k;
import com.google.android.gms.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdResponseParcel, AdRequestInfoParcel

public final class b extends gi
    implements c.a
{
    static final class a extends Exception
    {

        private final int a;

        public final int a()
        {
            return a;
        }

        public a(String s, int j)
        {
            super(s);
            a = j;
        }
    }


    gi a;
    Object b;
    AdResponseParcel c;
    da d;
    private final a.a e;
    private final AdRequestInfoParcel.a f;
    private final Object g = new Object();
    private final Context h;
    private final o i;

    public b(Context context, AdRequestInfoParcel.a a1, o o1, a.a a2)
    {
        b = new Object();
        e = a2;
        h = context;
        f = a1;
        i = o1;
    }

    private AdSizeParcel a(AdRequestInfoParcel adrequestinfoparcel)
        throws a
    {
        if (c.m == null)
        {
            throw new a("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = c.m.split("x");
        if (aobj.length != 2)
        {
            throw new a((new StringBuilder("Invalid ad size format from the ad response: ")).append(c.m).toString(), 0);
        }
        int j1;
        int k1;
        int l1;
        try
        {
            j1 = Integer.parseInt(aobj[0]);
            k1 = Integer.parseInt(aobj[1]);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            throw new a((new StringBuilder("Invalid ad size number from the ad response: ")).append(c.m).toString(), 0);
        }
        aobj = adrequestinfoparcel.d.h;
        l1 = aobj.length;
        AdSizeParcel adsizeparcel;
        int l;
        int i1;
        for (int j = 0; j < l1; j++)
        {
            adsizeparcel = aobj[j];
            float f1 = h.getResources().getDisplayMetrics().density;
            if (adsizeparcel.f == -1)
            {
                l = (int)((float)adsizeparcel.g / f1);
            } else
            {
                l = adsizeparcel.f;
            }
            if (adsizeparcel.c == -2)
            {
                i1 = (int)((float)adsizeparcel.d / f1);
            } else
            {
                i1 = adsizeparcel.c;
            }
            if (j1 == l && k1 == i1)
            {
                return new AdSizeParcel(adsizeparcel, adrequestinfoparcel.d.h);
            }
        }

        throw new a((new StringBuilder("The ad size from the ad response was not one of the requested sizes: ")).append(c.m).toString(), 0);
    }

    private boolean a(long l)
        throws a
    {
        l = 60000L - (p.i().b() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            b.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new a("Ad request cancelled.", -1);
        }
        return true;
    }

    public final void a()
    {
        int j = -2;
        Object obj2 = b;
        obj2;
        JVM INSTR monitorenter ;
        AdRequestInfoParcel adrequestinfoparcel;
        long l2;
        com.google.android.gms.ads.internal.util.client.b.a(3);
        String s = i.a().a(h);
        String s1 = m.a(h).d();
        l2 = p.i().b();
        adrequestinfoparcel = new AdRequestInfoParcel(f, s, s1, l2);
        long l;
        long l1;
        l1 = -1L;
        l = l1;
        Object obj = h;
        l = l1;
        if (!(new c._cls1(((Context) (obj)))).a(adrequestinfoparcel)) goto _L2; else goto _L1
_L1:
        l = l1;
        com.google.android.gms.ads.internal.util.client.b.a(3);
        l = l1;
        obj = new d.a(((Context) (obj)), adrequestinfoparcel, this);
        l = l1;
        ((d.a) (obj)).e();
_L10:
        l = l1;
        Object obj1 = g;
        l = l1;
        obj1;
        JVM INSTR monitorenter ;
        a = ((gi) (obj));
        if (a == null)
        {
            throw new a("Could not start the ad request service.", 0);
        }
          goto _L3
        obj;
        obj1;
        JVM INSTR monitorexit ;
        l = l1;
        boolean flag;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj = null;
        }
        finally { }
_L17:
        j = ((a) (obj1)).a();
        if (j != 3 && j != -1) goto _L5; else goto _L4
_L4:
        com.google.android.gms.ads.internal.util.client.b.b(((a) (obj1)).getMessage());
_L14:
        if (c != null) goto _L7; else goto _L6
_L6:
        c = new AdResponseParcel(j);
_L15:
        gm.a.post(new Runnable() {

            final b a;

            public final void run()
            {
                a.b();
            }

            
            {
                a = b.this;
                super();
            }
        });
_L13:
        flag = TextUtils.isEmpty(c.r);
        if (flag) goto _L9; else goto _L8
_L8:
        obj1 = new JSONObject(c.r);
_L16:
        obj = new com.google.android.gms.internal.gb.a(adrequestinfoparcel, c, d, ((AdSizeParcel) (obj)), j, l, c.n, ((JSONObject) (obj1)));
        e.a(((com.google.android.gms.internal.gb.a) (obj)));
        obj2;
        JVM INSTR monitorexit ;
        return;
_L2:
        l = l1;
        com.google.android.gms.ads.internal.util.client.b.a(3);
        l = l1;
        n.a();
        l = l1;
        if (com.google.android.gms.ads.internal.util.client.a.b(((Context) (obj))))
        {
            break MISSING_BLOCK_LABEL_370;
        }
        l = l1;
        com.google.android.gms.ads.internal.util.client.b.c("Failed to connect to remote ad request service.");
        obj = null;
          goto _L10
        l = l1;
        obj = new d.b(((Context) (obj)), adrequestinfoparcel, this);
          goto _L10
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        obj1;
        JVM INSTR monitorexit ;
_L12:
        l = l1;
        if (a(l2))
        {
            break MISSING_BLOCK_LABEL_425;
        }
        l = l1;
        throw new a("Timed out waiting for ad response.", 2);
        l = l1;
        if (c == null) goto _L12; else goto _L11
_L11:
        l = l1;
        obj = g;
        l = l1;
        obj;
        JVM INSTR monitorenter ;
        a = null;
        obj;
        JVM INSTR monitorexit ;
        l = l1;
        if (c.e == -2)
        {
            break MISSING_BLOCK_LABEL_541;
        }
        l = l1;
        if (c.e == -3)
        {
            break MISSING_BLOCK_LABEL_541;
        }
        l = l1;
        throw new a((new StringBuilder("There was a problem getting an ad response. ErrorCode: ")).append(c.e).toString(), c.e);
        obj1;
        obj;
        JVM INSTR monitorexit ;
        l = l1;
        throw obj1;
        l = l1;
        l1 = p.i().b();
        l = l1;
        if (c.e == -3)
        {
            break MISSING_BLOCK_LABEL_666;
        }
        l = l1;
        if (!TextUtils.isEmpty(c.c))
        {
            break MISSING_BLOCK_LABEL_604;
        }
        l = l1;
        throw new a("No fill from ad server.", 3);
        l = l1;
        p.h().a(h, c.u);
        l = l1;
        boolean flag1 = c.h;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_666;
        }
        l = l1;
        d = new da(c.c);
        l = l1;
        if (adrequestinfoparcel.d.h == null)
        {
            break MISSING_BLOCK_LABEL_838;
        }
        l = l1;
        obj = a(adrequestinfoparcel);
_L18:
        boolean flag2 = c.v;
        p.h().a(flag2);
        obj1 = p.h().a(h);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_740;
        }
        if (!((ak) (obj1)).isAlive())
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            ((ak) (obj1)).a();
        }
        l = l1;
          goto _L13
        obj;
        l = l1;
        throw new a((new StringBuilder("Could not parse mediation config: ")).append(c.c).toString(), 0);
_L5:
        com.google.android.gms.ads.internal.util.client.b.c(((a) (obj1)).getMessage());
          goto _L14
_L7:
        c = new AdResponseParcel(j, c.k);
          goto _L15
        obj1;
        com.google.android.gms.ads.internal.util.client.b.a("Error parsing the JSON for Active View.", ((Throwable) (obj1)));
_L9:
        obj1 = null;
          goto _L16
        obj1;
        l = l1;
          goto _L17
        obj = null;
          goto _L18
    }

    public final void a(AdResponseParcel adresponseparcel)
    {
        synchronized (b)
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            c = adresponseparcel;
            b.notify();
        }
        return;
        adresponseparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adresponseparcel;
    }

    public final void b()
    {
        synchronized (g)
        {
            if (a != null)
            {
                a.g();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}

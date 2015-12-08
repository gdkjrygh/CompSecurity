// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;
import com.microsoft.advertising.android.a.e;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.microsoft.advertising.android:
//            bq, af, u, av, 
//            ai, s, i, bk

public final class m
{

    private static int f[];
    private final Map a;
    private final Map b;
    private final bk c;
    private final bq d;
    private ai e;

    private m(bk bk)
    {
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        if (bk == null)
        {
            throw new IllegalArgumentException("placementSize cannot be null");
        } else
        {
            c = bk;
            d = new bq();
            return;
        }
    }

    m(bk bk, ai ai1)
    {
        this(bk);
        e = ai1;
    }

    private void a(u u1, Double double1)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        if (!af.a(new Object[] {
    u1
}))
        {
            return;
        }
        if (double1 == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        flag = flag1;
        if (!af.a(new Object[] {
            u1
        })) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (double1 == null) goto _L2; else goto _L3
_L3:
        b()[u1.ordinal()];
        JVM INSTR tableswitch 23 24: default 76
    //                   23 96
    //                   24 126;
           goto _L4 _L5 _L6
_L4:
        flag = flag1;
_L2:
        if (flag)
        {
            b.put(u1, double1);
            return;
        } else
        {
            e((new StringBuilder("setting ")).append(u1.b()).append(" failed: invalid input").toString());
            return;
        }
_L5:
        if (double1.doubleValue() > 90D) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (double1.doubleValue() >= -90D) goto _L2; else goto _L8
_L8:
        flag = false;
          goto _L2
_L6:
        if (double1.doubleValue() > 180D) goto _L10; else goto _L9
_L9:
        flag = flag1;
        if (double1.doubleValue() >= -180D) goto _L2; else goto _L10
_L10:
        flag = false;
          goto _L2
        b.remove(u1);
        return;
    }

    private void a(u u1, String s1)
    {
        boolean flag;
        flag = false;
        if (!af.a(new Object[] {
    u1
}))
        {
            return;
        }
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        if (!af.a(new Object[] {
            u1
        }) || TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        b()[u1.ordinal()];
        JVM INSTR tableswitch 22 26: default 88
    //                   22 107
    //                   23 88
    //                   24 88
    //                   25 126
    //                   26 145;
           goto _L4 _L5 _L4 _L4 _L6 _L7
_L4:
        flag = true;
_L8:
        if (flag)
        {
            a.put(u1, s1);
            return;
        } else
        {
            e((new StringBuilder("setting ")).append(u1.b()).append(" failed: invalid input").toString());
            return;
        }
_L5:
        if (s1.length() == u.v.d().intValue()) goto _L9; else goto _L8
_L9:
        break; /* Loop/switch isn't completed */
_L6:
        if (s1.length() <= u.y.c().intValue()) goto _L10; else goto _L8
_L10:
        break; /* Loop/switch isn't completed */
_L7:
        if (s1.length() <= u.z.c().intValue()) goto _L4; else goto _L8
_L2:
        a.remove(u1);
        return;
    }

    private static int[] b()
    {
        int ai1[] = f;
        if (ai1 != null)
        {
            return ai1;
        }
        ai1 = new int[u.values().length];
        try
        {
            ai1[u.H.ordinal()] = 34;
        }
        catch (NoSuchFieldError nosuchfielderror37) { }
        try
        {
            ai1[u.K.ordinal()] = 37;
        }
        catch (NoSuchFieldError nosuchfielderror36) { }
        try
        {
            ai1[u.p.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror35) { }
        try
        {
            ai1[u.t.ordinal()] = 20;
        }
        catch (NoSuchFieldError nosuchfielderror34) { }
        try
        {
            ai1[u.s.ordinal()] = 19;
        }
        catch (NoSuchFieldError nosuchfielderror33) { }
        try
        {
            ai1[u.r.ordinal()] = 18;
        }
        catch (NoSuchFieldError nosuchfielderror32) { }
        try
        {
            ai1[u.q.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror31) { }
        try
        {
            ai1[u.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror30) { }
        try
        {
            ai1[u.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror29) { }
        try
        {
            ai1[u.v.ordinal()] = 22;
        }
        catch (NoSuchFieldError nosuchfielderror28) { }
        try
        {
            ai1[u.l.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror27) { }
        try
        {
            ai1[u.m.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror26) { }
        try
        {
            ai1[u.n.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror25) { }
        try
        {
            ai1[u.j.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror24) { }
        try
        {
            ai1[u.o.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror23) { }
        try
        {
            ai1[com.microsoft.advertising.android.u.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror22) { }
        try
        {
            ai1[u.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            ai1[u.B.ordinal()] = 28;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            ai1[u.E.ordinal()] = 31;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            ai1[u.i.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            ai1[u.y.ordinal()] = 25;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            ai1[u.w.ordinal()] = 23;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            ai1[u.h.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            ai1[u.x.ordinal()] = 24;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            ai1[u.g.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            ai1[u.G.ordinal()] = 33;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            ai1[u.z.ordinal()] = 26;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            ai1[u.C.ordinal()] = 29;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            ai1[u.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai1[u.F.ordinal()] = 32;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai1[u.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai1[u.u.ordinal()] = 21;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai1[u.I.ordinal()] = 35;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai1[u.k.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai1[u.J.ordinal()] = 36;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai1[u.A.ordinal()] = 27;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai1[u.D.ordinal()] = 30;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai1[u.L.ordinal()] = 38;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        f = ai1;
        return ai1;
    }

    private void e(String s1)
    {
        av.d("TargetingInfo", s1);
        if (e != null)
        {
            e.a(s1, e.d);
        }
    }

    final bq a()
    {
        return d;
    }

    final StringBuilder a(StringBuilder stringbuilder)
    {
        if (stringbuilder != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((StringBuilder) (obj));
_L2:
        obj = a.entrySet().iterator();
_L6:
        Iterator iterator;
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        iterator = b.entrySet().iterator();
_L5:
        obj = stringbuilder;
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj1 = (java.util.Map.Entry)iterator.next();
        if (((u)((java.util.Map.Entry) (obj1)).getKey()).f())
        {
            String s1 = ((u)((java.util.Map.Entry) (obj1)).getKey()).a();
            obj = (u)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = ((java.util.Map.Entry) (obj1)).getValue();
            java.util.Map.Entry entry;
            if (obj1 == null)
            {
                obj = "";
            } else
            if (obj == u.w || obj == u.x)
            {
                obj = String.format("%.3f", new Object[] {
                    obj1
                });
            } else
            {
                obj = obj1.toString();
            }
            s.a(stringbuilder, s1, ((String) (obj)));
        }
          goto _L5
        entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        if (((u)entry.getKey()).f())
        {
            s.a(stringbuilder, ((u)entry.getKey()).a(), (String)entry.getValue());
        }
          goto _L6
    }

    public final void a(Double double1)
    {
        a(u.w, double1);
    }

    public final void a(String s1)
    {
        a(u.v, s1);
    }

    public final void a(String s1, String s2)
    {
        if (TextUtils.isEmpty(s1))
        {
            return;
        }
        if (s1.equals("*http-header*X-ADS-USERAUTH-TICKET*"))
        {
            a.put(u.L, s2);
            return;
        }
        try
        {
            d.a(s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            e(s1.getMessage());
            return;
        }
        catch (Exception exception)
        {
            e((new StringBuilder("exception encountered adding tag: ")).append(s1).append("=").append(s2).toString());
        }
        return;
    }

    final void a(HttpGet httpget)
    {
        if (af.a(new Object[] {
    httpget
}))
        {
            Iterator iterator = a.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (((u)entry.getKey()).g())
                {
                    httpget.addHeader(((u)entry.getKey()).a(), (String)entry.getValue());
                }
            }
        }
    }

    public final void b(Double double1)
    {
        a(u.x, double1);
    }

    public final void b(String s1)
    {
        try
        {
            d.a(s1);
            return;
        }
        catch (Exception exception)
        {
            e((new StringBuilder("exception encountered removing tag: ")).append(s1).toString());
        }
    }

    public final void c(String s1)
    {
        a(u.y, s1);
    }

    public final void d(String s1)
    {
        a(u.z, s1);
    }
}

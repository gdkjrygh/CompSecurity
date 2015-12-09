// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import com.pandora.radio.util.i;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import p.cw.c;
import p.dd.bp;
import p.dd.s;

// Referenced classes of package com.pandora.radio.data:
//            ag, o

public class af
{

    private final boolean A;
    private final boolean B;
    private final boolean C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private long H;
    private String I;
    private List J;
    private final c K;
    private final boolean a;
    private boolean b;
    private String c;
    private String d;
    private String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private String j;
    private final String k;
    private String l;
    private boolean m;
    private boolean n;
    private String o;
    private int p;
    private String q;
    private String r;
    private boolean s;
    private final boolean t;
    private final String u;
    private String v;
    private int w;
    private int x;
    private final int y;
    private final boolean z;

    public af(c c1, boolean flag, boolean flag1, String s1, String s2, String s3, String s4, 
            String s5, String s6, String s7, String s8, String s9, boolean flag2, boolean flag3, 
            String s10, int i1, String s11, String s12, int j1, boolean flag4, String s13, 
            String s14, String s15, int k1, int l1, int i2, boolean flag5, boolean flag6, 
            boolean flag7, boolean flag8, boolean flag9, int j2, int k2, String s16, List list, 
            int l2)
    {
        I = null;
        K = c1;
        a = flag;
        b = flag1;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        g = s5;
        h = s6;
        j = s7;
        k = s8;
        m = flag2;
        n = flag3;
        o = s10;
        p = i1;
        q = s11;
        r = s12;
        u = s13;
        v = s14;
        i = s15;
        w = k1;
        x = l1;
        y = i2;
        z = flag5;
        A = flag6;
        B = flag7;
        C = flag8;
        D = flag9;
        E = j2;
        G = k2;
        if (com.pandora.radio.util.i.a(s9))
        {
            s9 = "mobile/still_listening.vm";
        }
        l = s9;
        if (l.startsWith("/"))
        {
            l = l.substring(1);
        }
        if (j1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = flag;
        t = flag4;
        I = s16;
        J = list;
        F = l2;
        H = 0xdbba0L;
    }

    public int A()
    {
        return E;
    }

    public int B()
    {
        return G;
    }

    public String C()
    {
        return I;
    }

    public List D()
    {
        return J;
    }

    public int E()
    {
        return F;
    }

    public void a(int i1)
    {
        if (p != i1)
        {
            p = i1;
            K.k().c(null);
        }
    }

    public void a(long l1)
    {
        H = l1;
    }

    public void a(String s1)
    {
        c = s1;
    }

    public void a(boolean flag)
    {
        b = flag;
        if (!b)
        {
            K.a(new s(null));
        }
        o o1 = K.j();
        o1.c();
        if (o1.e())
        {
            o1.a(false);
        }
    }

    public boolean a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public void b(int i1)
    {
        w = i1;
        x = i1;
    }

    public void b(String s1)
    {
        d = s1;
    }

    public void b(boolean flag)
    {
        if (flag != n)
        {
            n = flag;
            K.a(new bp(flag));
            K.k().c(null);
        }
    }

    public String c()
    {
        return d;
    }

    public void c(String s1)
    {
        if (s1 != null)
        {
            j = s1;
        }
    }

    public void c(boolean flag)
    {
        s = flag;
    }

    public String d()
    {
        return e;
    }

    public void d(String s1)
    {
        if (s1 == null || !s1.equals(q))
        {
            q = s1;
            K.k().c(null);
        }
    }

    public void d(boolean flag)
    {
        D = flag;
    }

    public String e()
    {
        return f;
    }

    public void e(String s1)
    {
        r = s1;
    }

    public String f()
    {
        return j;
    }

    public String g()
    {
        return l;
    }

    public boolean h()
    {
        return m;
    }

    public boolean i()
    {
        return n;
    }

    public String j()
    {
        return o;
    }

    public int k()
    {
        return p;
    }

    public String l()
    {
        return q;
    }

    public String m()
    {
        return r;
    }

    public int n()
    {
        return w;
    }

    public int o()
    {
        return x;
    }

    public boolean p()
    {
        return z;
    }

    public boolean q()
    {
        return A;
    }

    public boolean r()
    {
        return B;
    }

    public String s()
    {
        return h;
    }

    public int t()
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.setTime(new Date());
        return Integer.valueOf(gregoriancalendar.get(1)).intValue() - p;
    }

    public String toString()
    {
        return (new StringBuilder()).append("UserData{canListen='").append(a).append('\'').append(", userAuthToken='").append(c).append('\'').append(", username='").append(d).append('\'').append(", userId=").append(e).append(", splashScreenAdUrl=").append(f).append(", createStationAdUrl=").append(g).append(", pandoraOneUpgradeUrl=").append(j).append(", pandoraOneUpgradeInfo=").append(k).append(", listeningTimeoutMsgUri=").append(l).append(", withinComplimentaryTrial=").append(s).append(", hasUsedTrial=").append(t).append(", isAdSupported=").append(b).append(", isSubscriber=").append(n).append(", showPromotedStation=").append(A).append(", promotedStationsRecommendationFallback=").append(B).append(", maxAdInitiatedRefreshDelaySeconds=").append(F).append('}').toString();
    }

    public String u()
    {
        if (com.pandora.radio.util.i.a(q))
        {
            return "M";
        } else
        {
            return q.substring(0, 1);
        }
    }

    public String v()
    {
        return i;
    }

    public boolean w()
    {
        return s;
    }

    public boolean x()
    {
        return C;
    }

    public boolean y()
    {
        return D;
    }

    public long z()
    {
        return H;
    }
}

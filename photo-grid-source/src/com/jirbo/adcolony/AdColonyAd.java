// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.Serializable;

// Referenced classes of package com.jirbo.adcolony:
//            AdColonyIAPEngagement, a, d

public abstract class AdColonyAd
    implements Serializable
{

    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 3;
    static final int e = 4;
    int f;
    String g;
    n.ab h;
    n.a i;
    String j;
    String k;
    String l;
    String m;
    double n;
    double o;
    int p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    AdColonyIAPEngagement u;

    public AdColonyAd()
    {
        f = 0;
        j = "";
        k = "";
        l = "";
        m = "";
        n = 0.0D;
        o = 0.0D;
        u = AdColonyIAPEngagement.NONE;
    }

    abstract void a();

    abstract boolean a(boolean flag);

    abstract boolean b();

    boolean b(boolean flag)
    {
        if (f == 4)
        {
            return true;
        }
        if (!isReady() && !flag)
        {
            return false;
        }
        if (!a(true) && flag)
        {
            return false;
        }
        h = a.l.h(g);
        n.a a1;
        if (flag)
        {
            a1 = h.j();
        } else
        {
            a1 = h.i();
        }
        i = a1;
        return i != null;
    }

    boolean c()
    {
        return b(false);
    }

    public boolean canceled()
    {
        return f == 1;
    }

    public int getAvailableViews()
    {
        while (!isReady() || !c()) 
        {
            return 0;
        }
        return h.d();
    }

    public boolean iapEnabled()
    {
        return t;
    }

    public AdColonyIAPEngagement iapEngagementType()
    {
        return u;
    }

    public String iapProductID()
    {
        return m;
    }

    abstract boolean isReady();

    public boolean noFill()
    {
        return f == 2;
    }

    public boolean notShown()
    {
        return f != 4;
    }

    public boolean shown()
    {
        return f == 4;
    }

    public boolean skipped()
    {
        return f == 3;
    }
}

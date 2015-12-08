// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import java.util.ArrayList;

public final class zk
{

    final zj a;
    final String b;
    final String c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    int i;
    int j;
    public int k;
    public int l;
    public int m;
    public Bundle n;
    public IntentSender o;
    yp p;
    private final ArrayList q = new ArrayList();
    private int r;

    zk(zj zj1, String s, String s1)
    {
        r = -1;
        a = zj1;
        b = s;
        c = s1;
    }

    final int a(yp yp1)
    {
label0:
        {
            int j1 = 1;
            boolean flag1 = false;
            boolean flag = false;
            int i1 = ((flag1) ? 1 : 0);
            if (p != yp1)
            {
                p = yp1;
                i1 = ((flag1) ? 1 : 0);
                if (yp1 != null)
                {
                    i1 = ((flag) ? 1 : 0);
                    if (!zb.a(d, yp1.b()))
                    {
                        d = yp1.b();
                        i1 = 1;
                    }
                    if (!zb.a(e, yp1.c()))
                    {
                        e = yp1.c();
                        i1 = 1;
                    }
                    if (f != yp1.d())
                    {
                        f = yp1.d();
                    } else
                    {
                        j1 = i1;
                    }
                    i1 = j1;
                    if (g != yp1.e())
                    {
                        g = yp1.e();
                        i1 = j1 | true;
                    }
                    j1 = i1;
                    if (!q.equals(yp1.h()))
                    {
                        q.clear();
                        q.addAll(yp1.h());
                        j1 = i1 | 1;
                    }
                    i1 = j1;
                    if (i != yp1.j())
                    {
                        i = yp1.j();
                        i1 = j1 | true;
                    }
                    j1 = i1;
                    if (j != yp1.k())
                    {
                        j = yp1.k();
                        j1 = i1 | 1;
                    }
                    i1 = j1;
                    if (k != yp1.n())
                    {
                        k = yp1.n();
                        i1 = j1 | 3;
                    }
                    j1 = i1;
                    if (l != yp1.l())
                    {
                        l = yp1.l();
                        j1 = i1 | 3;
                    }
                    i1 = j1;
                    if (m != yp1.m())
                    {
                        m = yp1.m();
                        i1 = j1 | 3;
                    }
                    j1 = i1;
                    if (r != yp1.o())
                    {
                        r = yp1.o();
                        j1 = i1 | 5;
                    }
                    i1 = j1;
                    if (!zb.a(n, yp1.p()))
                    {
                        n = yp1.p();
                        i1 = j1 | 1;
                    }
                    j1 = i1;
                    if (!zb.a(o, yp1.g()))
                    {
                        o = yp1.g();
                        j1 = i1 | 1;
                    }
                    if (h == yp1.f())
                    {
                        break label0;
                    }
                    h = yp1.f();
                    i1 = j1 | 5;
                }
            }
            return i1;
        }
        return j1;
    }

    public final void a(int i1)
    {
        zb.e();
        ze ze1 = zb.a;
        i1 = Math.min(m, Math.max(0, i1));
        if (this == ze1.j && ze1.k != null)
        {
            ze1.k.b(i1);
        }
    }

    public final boolean a()
    {
        zb.e();
        return zb.a.b() == this;
    }

    public final boolean a(String s)
    {
        zb.e();
        int j1 = q.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((IntentFilter)q.get(i1)).hasCategory(s))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean a(yz yz1)
    {
        if (yz1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            zb.e();
            return yz1.a(q);
        }
    }

    public final void b(int i1)
    {
        zb.e();
        if (i1 != 0)
        {
            ze ze1 = zb.a;
            if (this == ze1.j && ze1.k != null)
            {
                ze1.k.c(i1);
            }
        }
    }

    public final boolean b()
    {
        zb.e();
        return zb.a.a() == this;
    }

    public final void c()
    {
        zb.e();
        zb.a.a(this, 3);
    }

    final ys d()
    {
        zj zj1 = a;
        zb.e();
        return zj1.a;
    }

    public final String toString()
    {
        return (new StringBuilder("MediaRouter.RouteInfo{ uniqueId=")).append(c).append(", name=").append(d).append(", description=").append(e).append(", enabled=").append(f).append(", connecting=").append(g).append(", canDisconnect=").append(h).append(", playbackType=").append(i).append(", playbackStream=").append(j).append(", volumeHandling=").append(k).append(", volume=").append(l).append(", volumeMax=").append(m).append(", presentationDisplayId=").append(r).append(", extras=").append(n).append(", settingsIntent=").append(o).append(", providerPackageName=").append(a.a()).append(" }").toString();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import com.pandora.radio.data.aa;
import com.pandora.radio.data.ae;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.o;
import java.util.Calendar;
import p.cw.c;
import p.cw.f;
import p.dd.h;
import p.de.a;

public class d
{

    private boolean a;
    private boolean b;
    private int c;
    private final o d;
    private final ag e;
    private final a f;
    private final c g;
    private final f h;

    public d(c c1, a a1, f f1)
    {
        c = 0;
        g = c1;
        d = c1.j();
        e = c1.k();
        f = a1;
        h = f1;
    }

    private boolean a(float f1, int i)
    {
        long l = d.b();
        if (l > 0L)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(l);
            if (calendar.get(2) != Calendar.getInstance().get(2))
            {
                d.c();
            }
        }
        int j = d.a();
        return f1 > (float)j && j < i;
    }

    private boolean b(int i, aa aa1)
    {
        if (a() && i > 0)
        {
            if (aa1 != null)
            {
                if (!aa1.M())
                {
                    return aa1.S();
                }
            } else
            {
                return true;
            }
        }
        return false;
    }

    private int c(ae ae1)
    {
        float f2 = 0.0F;
        if (d.e())
        {
            return -3;
        }
        int k = ae1.c() * 60 * 60;
        float f1;
        int i;
        if (ae1.a() > 0)
        {
            f1 = (float)ae1.a() / (float)k / 0.01F;
        } else
        {
            f1 = 0.0F;
        }
        if (ae1.b() > 0)
        {
            f2 = (float)ae1.b() / (float)k / 0.01F;
        }
        f1 = Math.max(f1, f2);
        i = ae1.d();
        int j;
        do
        {
            if (f1 <= (float)i)
            {
                return -3;
            }
            j = i;
            if (f1 > (float)i)
            {
                if (a(f1, i))
                {
                    float f3 = (float)(k - Math.max(ae1.a(), ae1.b())) / 60F / 60F;
                    if ((double)f3 > 0.0D)
                    {
                        if (h.F())
                        {
                            return -1;
                        } else
                        {
                            g.a(new h(f3, i));
                            return 0;
                        }
                    }
                }
                j = i + ae1.e();
            }
            i = j;
        } while (j < 100);
        return -2;
    }

    public void a(int i)
    {
        c = i;
    }

    public void a(int i, aa aa1)
    {
        if (b(i, aa1))
        {
            d.a(i);
        }
    }

    public void a(ae ae1)
    {
        ae ae2 = e.y();
        if (ae1.h() != ae2.h())
        {
            d.b(f());
            a(0);
        }
        if (ae1.f())
        {
            d.c();
        }
        if (d.e() && ae1.f())
        {
            ae1.a(false);
        }
        a = ae1.f();
        e.a(ae1);
    }

    public boolean a()
    {
        if (f != null)
        {
            return f.e();
        } else
        {
            return false;
        }
    }

    public void b(ae ae1)
    {
        a = ae1.f();
        e.a(ae1);
        if (ae1.g() && d.e())
        {
            d.a(false);
        }
    }

    public boolean b()
    {
        if (!a())
        {
            return false;
        } else
        {
            return a;
        }
    }

    public void c()
    {
        if (!a())
        {
            return;
        } else
        {
            a = false;
            ae ae1 = e.y();
            ae1.a(false);
            e.a(ae1);
            return;
        }
    }

    public long d()
    {
        return e.y().h();
    }

    public int e()
    {
        int i = d.d();
        if (i < 0)
        {
            d.b(1);
            return 0;
        }
        if (i > 28500)
        {
            d.b(i - 28500);
            return 28500;
        } else
        {
            return i;
        }
    }

    public int f()
    {
        return c;
    }

    public int g()
    {
        if (a())
        {
            int i = c(e.y());
            boolean flag;
            if (i == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
            return i;
        } else
        {
            return -3;
        }
    }

    public boolean h()
    {
        return b;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.av;

import android.content.Context;
import com.comscore.utils.n;
import com.comscore.utils.p;
import p.ar.c;
import p.ar.d;

public class a
{

    private String a;
    private String b;
    private n c;
    private Context d;
    private String e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private boolean j;
    private Boolean k;

    public a(Context context, n n1)
    {
        h = false;
        i = false;
        j = false;
        d = context;
        c = n1;
    }

    private void a(String s, boolean flag)
    {
        if (s != null)
        {
            h = flag;
            String s1 = c.b("md5RawCrossPublisherId");
            if (g == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g = p.a(s);
            if (b(g))
            {
                a = c.b("crossPublisherId");
                return;
            }
            if (h && s1 != null && !s1.isEmpty() && s1 != g)
            {
                i = true;
                j = flag;
            }
            a = c(s);
            c.a("crossPublisherId", a);
            c.a("md5RawCrossPublisherId", g);
            return;
        } else
        {
            a = null;
            g = null;
            return;
        }
    }

    private boolean b(String s)
    {
        String s1 = c.b("md5RawCrossPublisherId");
        return s1 != null && s1.equals(s);
    }

    private String c(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (s != null)
        {
            s1 = obj;
            if (s.length() > 0)
            {
                try
                {
                    s1 = p.b(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return null;
                }
            }
        }
        return s1;
    }

    private void h()
    {
        c c1 = p.ar.d.c(d);
        if (c1 == null)
        {
            h = true;
            a(null, false);
            return;
        }
        if (c1.b() == 0 && c1.c() == 0)
        {
            a(c1.a(), true);
            return;
        } else
        {
            a(c1.a(), false);
            return;
        }
    }

    private void i()
    {
        if (c.a("vid").booleanValue())
        {
            b = c.b("vid");
        } else
        {
            Object obj = p.ar.d.d(d);
            String s = ((c) (obj)).a();
            obj = (new StringBuilder()).append("-cs").append(((c) (obj)).d()).toString();
            if (b == null)
            {
                b = (new StringBuilder()).append(p.a((new StringBuilder()).append(s).append(d()).toString())).append(((String) (obj))).toString();
                c.a("vid", b);
                return;
            }
        }
    }

    private boolean j()
    {
        boolean flag = p.ar.d.b(d);
        if (k == null)
        {
            k = Boolean.valueOf(flag);
        } else
        if (k.booleanValue() != flag)
        {
            h();
            return flag;
        }
        return flag;
    }

    public void a(String s)
    {
        e = s;
    }

    public boolean a()
    {
        return i;
    }

    public String b()
    {
        if (h)
        {
            if (j())
            {
                h();
                if (i && !j)
                {
                    return "none";
                } else
                {
                    return a;
                }
            } else
            {
                return "none";
            }
        } else
        {
            return a;
        }
    }

    public String c()
    {
        return b;
    }

    public String d()
    {
        if (e == null)
        {
            e = "";
        }
        return e;
    }

    public boolean e()
    {
        return e == null || e.length() == 0;
    }

    public void f()
    {
        if (e())
        {
            return;
        } else
        {
            f = p.ar.d.d(d).a();
            i();
            h();
            return;
        }
    }

    public String g()
    {
        if (h && j())
        {
            return g;
        } else
        {
            return null;
        }
    }
}

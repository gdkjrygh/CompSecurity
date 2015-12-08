// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package b.a:
//            bu, bo, bi

public abstract class a
{

    private final int a = 10;
    private final int b = 20;
    private final String c;
    private List d;
    private bo e;

    public a(String s)
    {
        c = s;
    }

    public final void a(bu bu1)
    {
        e = (bo)bu1.a().get(c);
        bu1 = bu1.c();
        if (bu1 != null && bu1.size() > 0)
        {
            if (d == null)
            {
                d = new ArrayList();
            }
            bu1 = bu1.iterator();
            do
            {
                if (!bu1.hasNext())
                {
                    break;
                }
                bi bi1 = (bi)bu1.next();
                if (c.equals(bi1.a))
                {
                    d.add(bi1);
                }
            } while (true);
        }
    }

    public final boolean a()
    {
        Object obj;
        Object obj1;
        boolean flag1 = false;
        obj1 = null;
        Object obj2 = e;
        String s;
        int i;
        boolean flag;
        if (obj2 == null)
        {
            s = null;
        } else
        {
            s = ((bo) (obj2)).a();
        }
        if (obj2 == null)
        {
            i = 0;
        } else
        {
            i = ((bo) (obj2)).f();
        }
        obj = g();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
_L4:
        flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (!((String) (obj)).equals(s))
            {
                obj1 = obj2;
                if (obj2 == null)
                {
                    obj1 = new bo();
                }
                ((bo) (obj1)).a(((String) (obj)));
                ((bo) (obj1)).a(System.currentTimeMillis());
                ((bo) (obj1)).a(i + 1);
                obj2 = new bi();
                ((bi) (obj2)).a(c);
                ((bi) (obj2)).c(((String) (obj)));
                ((bi) (obj2)).b(s);
                ((bi) (obj2)).a(((bo) (obj1)).c());
                if (d == null)
                {
                    d = new ArrayList(2);
                }
                d.add(obj2);
                if (d.size() > 10)
                {
                    d.remove(0);
                }
                e = ((bo) (obj1));
                flag = true;
            }
        }
        return flag;
_L2:
        String s1 = ((String) (obj)).trim();
        obj = obj1;
        if (s1.length() != 0)
        {
            obj = obj1;
            if (!"0".equals(s1))
            {
                obj = obj1;
                if (!"unknown".equals(s1.toLowerCase(Locale.US)))
                {
                    obj = s1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String b()
    {
        return c;
    }

    public final boolean c()
    {
        return e == null || e.f() <= 20;
    }

    public final bo d()
    {
        return e;
    }

    public final List e()
    {
        return d;
    }

    public final void f()
    {
        d = null;
    }

    public abstract String g();
}

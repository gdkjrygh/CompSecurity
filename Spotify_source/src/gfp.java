// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gfp
{

    public String a;
    public int b;
    public boolean c;
    public gfp d;
    private boolean e;

    public gfp(String s)
    {
        this(s, 0, false);
    }

    public gfp(String s, int i)
    {
        this(s, i, true);
    }

    public gfp(String s, int i, boolean flag)
    {
        a = s;
        b = i;
        c = flag;
        e = false;
    }

    public static gfp a(gin gin1, gip gip, gfp gfp1, List list)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            gfp gfp2 = (gfp)iterator.next();
            arraylist.add(gfp2.a());
            if (gfp2.c)
            {
                arraylist.add(gfp2.b(true));
            }
        } while (true);
        String as[];
        if (gfp1 == null)
        {
            gfp1 = "";
        } else
        {
            gfp1 = gfp1.a();
        }
        as = (String[])arraylist.toArray(new String[arraylist.size()]);
        return a((String)gin.a(gin1.a(gip, gfp1), gfp1, as), list);
    }

    public static gfp a(String s, List list)
    {
        if (s == null)
        {
            return null;
        }
        int i = s.lastIndexOf(" REVERSE");
        boolean flag;
        if (i > 0)
        {
            s = s.substring(0, i);
            flag = true;
        } else
        {
            flag = false;
        }
        i = list.indexOf(new gfp(s));
        if (i >= 0)
        {
            return ((gfp)list.get(i)).a(flag);
        } else
        {
            return null;
        }
    }

    private String b(boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(a);
        String s;
        if (c && flag)
        {
            s = " REVERSE";
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).toString();
    }

    public final gfp a(boolean flag)
    {
        if (!c)
        {
            return this;
        } else
        {
            e = flag;
            return this;
        }
    }

    public final String a()
    {
        return b(e);
    }

    public final boolean b()
    {
        if (!c)
        {
            return false;
        } else
        {
            return e;
        }
    }

    public final boolean equals(Object obj)
    {
        while (!(obj instanceof gfp) || !((gfp)obj).a.equals(a)) 
        {
            return false;
        }
        return true;
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}

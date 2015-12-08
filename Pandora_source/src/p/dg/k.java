// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import com.pandora.radio.data.o;
import java.util.Date;
import java.util.Vector;
import p.cw.c;
import p.df.a;

public class k
{
    public static class a
    {

        private String a;
        private String b;
        private long c;

        public long a()
        {
            return c;
        }

        public String b()
        {
            return b;
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (a)obj;
                if (c != ((a) (obj)).c)
                {
                    return false;
                }
                if (b == null ? ((a) (obj)).b != null : !b.equals(((a) (obj)).b))
                {
                    return false;
                }
                if (a == null ? ((a) (obj)).a != null : !a.equals(((a) (obj)).a))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            if (b != null)
            {
                b.hashCode();
            }
            int i;
            if (a != null)
            {
                i = a.hashCode();
            } else
            {
                i = 0;
            }
            return i * 31 + (int)(c ^ c >>> 32);
        }

        public a(String s, String s1, long l)
        {
            a = s;
            b = s1;
            c = l;
        }
    }


    private String a;
    private Vector b;
    private int c;
    private int d;
    private c e;
    private boolean f;

    public k(c c1, String s, boolean flag, int i, int j)
    {
        e = c1;
        a = s;
        b = c1.j().a(s, i);
        f = flag;
        c = i;
        d = j;
    }

    private void a(boolean flag)
    {
        long l = (new Date()).getTime() - (long)d;
        for (int i = 0; i < b.size(); i++)
        {
            a a1 = (a)b.elementAt(i);
            if (a1.a() <= l)
            {
                p.df.a.c("PANDORA", (new StringBuilder()).append("aging out old skipped track: ").append(a1.b()).append(" listened: ").append(a1.a()).append(" threshold: ").append(l).toString());
                b.removeElementAt(i);
            }
        }

        if (flag)
        {
            e.j().a(b, a, c);
        }
    }

    private boolean c()
    {
        return f || c == -1;
    }

    public void a(int i)
    {
        c = i;
    }

    public void a(String s)
    {
        if (c())
        {
            return;
        } else
        {
            a(false);
            b.addElement(new a(a, s, (new Date()).getTime()));
            e.j().a(b, a, c);
            return;
        }
    }

    public boolean a()
    {
        if (!c())
        {
            a(true);
            if (b.size() >= c)
            {
                return false;
            }
        }
        return true;
    }

    public boolean b()
    {
        return f;
    }
}

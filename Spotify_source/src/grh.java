// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class grh
{

    public final String a[];

    private grh(gri gri1)
    {
        a = (String[])gri1.a.toArray(new String[gri1.a.size()]);
    }

    grh(gri gri1, byte byte0)
    {
        this(gri1);
    }

    public final String a(int i)
    {
        i <<= 1;
        if (i < 0 || i >= a.length)
        {
            return null;
        } else
        {
            return a[i];
        }
    }

    public final String a(String s)
    {
        String as[] = a;
        for (int i = as.length - 2; i >= 0; i -= 2)
        {
            if (s.equalsIgnoreCase(as[i]))
            {
                return as[i + 1];
            }
        }

        return null;
    }

    public final Set a()
    {
        TreeSet treeset = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int i = 0;
        for (int j = a.length / 2; i < j; i++)
        {
            treeset.add(a(i));
        }

        return Collections.unmodifiableSet(treeset);
    }

    public final gri b()
    {
        gri gri1 = new gri();
        Collections.addAll(gri1.a, a);
        return gri1;
    }

    public final String b(int i)
    {
        i = (i << 1) + 1;
        if (i < 0 || i >= a.length)
        {
            return null;
        } else
        {
            return a[i];
        }
    }

    public final Date b(String s)
    {
        s = a(s);
        if (s != null)
        {
            return guh.a(s);
        } else
        {
            return null;
        }
    }

    public final List c(String s)
    {
        int j = a.length / 2;
        ArrayList arraylist = null;
        for (int i = 0; i < j;)
        {
            ArrayList arraylist1 = arraylist;
            if (s.equalsIgnoreCase(a(i)))
            {
                arraylist1 = arraylist;
                if (arraylist == null)
                {
                    arraylist1 = new ArrayList(2);
                }
                arraylist1.add(b(i));
            }
            i++;
            arraylist = arraylist1;
        }

        if (arraylist != null)
        {
            return Collections.unmodifiableList(arraylist);
        } else
        {
            return Collections.emptyList();
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        for (int j = a.length / 2; i < j; i++)
        {
            stringbuilder.append(a(i)).append(": ").append(b(i)).append("\n");
        }

        return stringbuilder.toString();
    }
}

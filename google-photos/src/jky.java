// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class jky extends jkx
{

    public final long ao;
    public final List ap = new ArrayList();
    public final List aq = new ArrayList();

    public jky(int i, long l)
    {
        super(i);
        ao = l;
    }

    public final void a(jky jky1)
    {
        aq.add(jky1);
    }

    public final void a(jkz jkz1)
    {
        ap.add(jkz1);
    }

    public final jkz d(int i)
    {
        int k = ap.size();
        for (int j = 0; j < k; j++)
        {
            jkz jkz1 = (jkz)ap.get(j);
            if (jkz1.an == i)
            {
                return jkz1;
            }
        }

        return null;
    }

    public final jky e(int i)
    {
        int k = aq.size();
        for (int j = 0; j < k; j++)
        {
            jky jky1 = (jky)aq.get(j);
            if (jky1.an == i)
            {
                return jky1;
            }
        }

        return null;
    }

    public final int f(int i)
    {
        boolean flag = false;
        int i1 = ap.size();
        int k = 0;
        int j = 0;
        for (; k < i1; k++)
        {
            if (((jkz)ap.get(k)).an == i)
            {
                j++;
            }
        }

        i1 = aq.size();
        for (int l = ((flag) ? 1 : 0); l < i1; l++)
        {
            if (((jky)aq.get(l)).an == i)
            {
                j++;
            }
        }

        return j;
    }

    public final String toString()
    {
        String s = String.valueOf(c(an));
        String s1 = String.valueOf(Arrays.toString(ap.toArray(new jkz[0])));
        String s2 = String.valueOf(Arrays.toString(aq.toArray(new jky[0])));
        return (new StringBuilder(String.valueOf(s).length() + 22 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(" leaves: ").append(s1).append(" containers: ").append(s2).toString();
    }
}

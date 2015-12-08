// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ajg
{

    public HashMap a;
    public String b;
    public long c;

    public ajg(aif aif1)
    {
        a = new HashMap();
        b = aif1.B;
        c = System.currentTimeMillis();
    }

    private void a(String s, Boolean boolean1, Boolean boolean2)
    {
        ajf ajf1 = (ajf)a.get(s);
        if (ajf1 != null && (!(ajf1 instanceof aji) || boolean2.booleanValue() || boolean1.booleanValue()))
        {
            a.remove(s);
        }
    }

    private void b(ajf ajf1)
    {
        if (a.get(ajf1.a) == null)
        {
            a.put(ajf1.a, ajf1);
        }
    }

    public final String a(String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        HashMap hashmap = new HashMap(a);
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            String s = as[i];
            ajf ajf1 = (ajf)hashmap.get(s);
            if (ajf1 != null)
            {
                stringbuilder.append(ajf1.a());
                hashmap.remove(s);
            }
        }

        if (as != ajr.c)
        {
            as = ajr.c;
            for (int j = 0; j < 127; j++)
            {
                String s1 = as[j];
                ajf ajf2 = (ajf)hashmap.get(s1);
                if (ajf2 != null)
                {
                    stringbuilder.append(ajf2.a());
                    hashmap.remove(s1);
                }
            }

        }
        for (as = hashmap.values().iterator(); as.hasNext(); stringbuilder.append(((ajf)as.next()).a())) { }
        if (stringbuilder.length() > 0 && stringbuilder.charAt(0) == '&')
        {
            return stringbuilder.substring(1);
        } else
        {
            return stringbuilder.toString();
        }
    }

    public final void a(ajf ajf1)
    {
        a(ajf1.a, ajf1.c, Boolean.valueOf(ajf1 instanceof aji));
        b(ajf1);
    }

    public final void a(String s, String s1, Boolean boolean1)
    {
        a(s, boolean1, Boolean.valueOf(false));
        if (Boolean.valueOf(false).booleanValue())
        {
            b(new aji(s, s1, boolean1));
            return;
        } else
        {
            b(new ajf(s, s1, boolean1));
            return;
        }
    }

    public final void a(HashMap hashmap, boolean flag)
    {
        if (hashmap != null)
        {
            String s;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); a(s, (String)hashmap.get(s), Boolean.valueOf(flag)))
            {
                s = (String)iterator.next();
            }

        }
    }

    public final void b(String s, String s1)
    {
        a(s, s1, Boolean.valueOf(false));
    }
}

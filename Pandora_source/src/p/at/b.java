// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.at;

import com.comscore.utils.f;
import com.comscore.utils.h;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package p.at:
//            a, d

public class b
{

    protected HashMap a;
    protected String b;
    protected long c;

    protected b(p.aq.b b1)
    {
        a = new HashMap();
        b(b1.S());
        c = h.a();
    }

    public Boolean a(String s)
    {
        return Boolean.valueOf(a.containsKey(s));
    }

    public String a(String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        HashMap hashmap = new HashMap(a);
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            String s = as[i];
            a a1 = (a)hashmap.get(s);
            if (a1 != null)
            {
                stringbuilder.append(a1.a());
                hashmap.remove(s);
            }
        }

        if (as != f.c)
        {
            as = f.c;
            int l = as.length;
            for (int j = 0; j < l; j++)
            {
                String s1 = as[j];
                a a2 = (a)hashmap.get(s1);
                if (a2 != null)
                {
                    stringbuilder.append(a2.a());
                    hashmap.remove(s1);
                }
            }

        }
        for (as = hashmap.values().iterator(); as.hasNext(); stringbuilder.append(((a)as.next()).a())) { }
        if (stringbuilder.length() > 0 && stringbuilder.charAt(0) == '&')
        {
            return stringbuilder.substring(1);
        } else
        {
            return stringbuilder.toString();
        }
    }

    public void a(String s, Boolean boolean1, Boolean boolean2)
    {
        a a1 = (a)a.get(s);
        if (a1 != null && (!(a1 instanceof d) || boolean2.booleanValue() || boolean1.booleanValue()))
        {
            a.remove(s);
        }
    }

    public void a(String s, String s1)
    {
        a(s, s1, Boolean.valueOf(false));
    }

    public void a(String s, String s1, Boolean boolean1)
    {
        a(s, boolean1, Boolean.valueOf(false));
        a(s, s1, boolean1, Boolean.valueOf(false));
    }

    protected void a(String s, String s1, Boolean boolean1, Boolean boolean2)
    {
        if (boolean2.booleanValue())
        {
            a(((a) (new d(s, s1, boolean1))));
            return;
        } else
        {
            a(new a(s, s1, boolean1));
            return;
        }
    }

    protected void a(HashMap hashmap)
    {
        a(hashmap, false);
    }

    protected void a(HashMap hashmap, boolean flag)
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

    protected void a(a a1)
    {
        if (a.get(a1.a) == null)
        {
            a.put(a1.a, a1);
        }
    }

    public void b(String s)
    {
        b = s;
    }

    public void b(a a1)
    {
        a(a1.a, a1.c, Boolean.valueOf(a1 instanceof d));
        a(a1);
    }

    public String c()
    {
        return b;
    }
}

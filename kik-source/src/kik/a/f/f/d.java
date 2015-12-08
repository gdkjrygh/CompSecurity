// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kik.a.d.r;
import kik.a.f.n;
import kik.a.f.o;
import kik.a.h.j;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.a.f.f:
//            y

public final class d extends y
{

    private static final b i = c.a("CheckLinkSpamRequest");
    final Set a;
    final HashMap b;

    public d(Set set)
    {
        super(null, "get");
        a = set;
        b = new HashMap(set.size());
    }

    private static String b(String s)
    {
        int k = s.indexOf("#");
        if (k == -1)
        {
            return s;
        } else
        {
            return s.substring(0, k);
        }
    }

    public final r a(String s)
    {
        return (r)b.get(b(s));
    }

    protected final void a(n n1)
    {
        long l1;
        n1.a(null, "query");
        n1.b("xmlns", "kik:iq:linkmod");
        l1 = j.b();
_L3:
        if (n1.b("query")) goto _L2; else goto _L1
_L1:
        boolean flag;
        long l;
        if (!n1.a("item"))
        {
            continue; /* Loop/switch isn't completed */
        }
        long l2;
        if (Integer.parseInt(n1.getAttributeValue(null, "warn")) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = 0x36ee80L;
        l2 = Long.parseLong(n1.getAttributeValue(null, "expiry-minutes"));
        l = l2 * 60L * 1000L + l1;
_L4:
        String s2 = null;
        String s1 = null;
        Object obj = null;
        String s = null;
        while (!n1.b("item")) 
        {
            String s3;
            String s4;
            String s5;
            if (n1.a("link"))
            {
                s5 = n1.nextText();
                s4 = ((String) (obj));
                s3 = s1;
            } else
            if (n1.a("title"))
            {
                s4 = n1.nextText();
                s3 = s1;
                s5 = s;
            } else
            if (n1.a("body"))
            {
                s3 = n1.nextText();
                s4 = ((String) (obj));
                s5 = s;
            } else
            {
                s3 = s1;
                s4 = ((String) (obj));
                s5 = s;
                if (n1.a("source"))
                {
                    s2 = n1.nextText();
                    s3 = s1;
                    s4 = ((String) (obj));
                    s5 = s;
                }
            }
            n1.next();
            s1 = s3;
            obj = s4;
            s = s5;
        }
        if (flag)
        {
            obj = r.a(l, ((String) (obj)), s1, s2);
        } else
        {
            obj = r.a(l);
        }
        b.put(s, obj);
        n1.next();
          goto _L3
_L2:
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L4
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:linkmod");
        for (Iterator iterator = a.iterator(); iterator.hasNext(); o1.b("item"))
        {
            String s = (String)iterator.next();
            o1.a("item");
            o1.a("link");
            o1.c(b(s));
            o1.b("link");
        }

        o1.b("query");
    }

}

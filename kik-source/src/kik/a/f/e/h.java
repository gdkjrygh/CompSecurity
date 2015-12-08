// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import java.util.HashMap;
import kik.a.d.a.a;
import kik.a.d.a.f;
import kik.a.d.a.g;
import kik.a.d.a.i;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.a.f.e:
//            o, e, f, m, 
//            n, b, j, c, 
//            l, d, k, g, 
//            i

public final class h
{

    private static final b a = org.c.c.a("MessageAttachmentXmlRouter");
    private static final HashMap b;
    private static final HashMap c;

    public static kik.a.f.e.g a(String s)
    {
        while (s == null || !b.containsKey(s)) 
        {
            return null;
        }
        Object obj = (Class)b.get(s);
        try
        {
            obj = (kik.a.f.e.g)((Class) (obj)).newInstance();
        }
        catch (Exception exception)
        {
            a.b((new StringBuilder("Failed to instantiate parser for : ")).append(s).toString());
            throw new RuntimeException(exception);
        }
        return ((kik.a.f.e.g) (obj));
    }

    public static kik.a.f.e.i a(g g1)
    {
        Object obj;
        if (g1 != null)
        {
            if (c.containsKey(obj = g1.getClass()))
            {
                obj = (Class)c.get(obj);
                try
                {
                    obj = (kik.a.f.e.i)((Class) (obj)).newInstance();
                }
                catch (Exception exception)
                {
                    a.b((new StringBuilder("Failed to instantiate serializer for : ")).append(g1).toString());
                    throw new RuntimeException(exception);
                }
                return ((kik.a.f.e.i) (obj));
            }
        }
        return null;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        b = hashmap;
        hashmap.put("sysmsg", kik/a/f/e/o);
        b.put("g", kik/a/f/e/e);
        b.put("is-typing", kik/a/f/e/f);
        b.put("scan-notification", kik/a/f/e/m);
        b.put("status", kik/a/f/e/n);
        b.put("content", kik/a/f/e/b);
        b.put("ping", kik/a/f/e/j);
        b.put("flag", kik/a/f/e/c);
        b.put("ri", kik/a/f/e/k$a);
        b.put("roster", kik/a/f/e/l);
        b.put("friend-attribution", kik/a/f/e/d);
        hashmap = new HashMap();
        c = hashmap;
        hashmap.put(kik/a/d/a/f, kik/a/f/e/f);
        c.put(kik/a/d/a/a, kik/a/f/e/b);
        c.put(kik/a/d/a/i, kik/a/f/e/j);
        c.put(kik/a/d/a/c, kik/a/f/e/c);
        c.put(kik/a/f/e/k, kik/a/f/e/k$a);
    }
}

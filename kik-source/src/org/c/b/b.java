// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.b;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.c.a;

// Referenced classes of package org.c.b:
//            a

public class b
    implements a
{

    private final Map a = new HashMap();

    public b()
    {
    }

    private org.c.b.a b(String s)
    {
        Object obj;
        if (s != null && s.length() > 23)
        {
            obj = new StringTokenizer(s, ".");
            if (((StringTokenizer) (obj)).hasMoreTokens())
            {
                Object obj1 = new StringBuilder();
                do
                {
                    Object obj2 = ((StringTokenizer) (obj)).nextToken();
                    if (((String) (obj2)).length() == 1)
                    {
                        ((StringBuilder) (obj1)).append(((String) (obj2)));
                        ((StringBuilder) (obj1)).append('.');
                    } else
                    if (((StringTokenizer) (obj)).hasMoreTokens())
                    {
                        ((StringBuilder) (obj1)).append(((String) (obj2)).charAt(0));
                        ((StringBuilder) (obj1)).append("*.");
                    } else
                    {
                        ((StringBuilder) (obj1)).append(((String) (obj2)));
                    }
                } while (((StringTokenizer) (obj)).hasMoreTokens());
                obj = ((StringBuilder) (obj1)).toString();
            } else
            {
                obj = s;
            }
            if (((String) (obj)).length() > 23)
            {
                obj = (new StringBuilder()).append(((String) (obj)).substring(0, 22)).append('*').toString();
            }
        } else
        {
            obj = s;
        }
        this;
        JVM INSTR monitorenter ;
        obj2 = (org.c.b.a)a.get(obj);
        obj1 = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (!((String) (obj)).equals(s))
        {
            org/c/b/b.getSimpleName();
            (new StringBuilder("Logger name '")).append(s).append("' exceeds maximum length of 23 characters, using '").append(((String) (obj))).append("' instead.");
        }
        obj1 = new org.c.b.a(((String) (obj)));
        a.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
        return ((org.c.b.a) (obj1));
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final org.c.b a(String s)
    {
        return b(s);
    }
}

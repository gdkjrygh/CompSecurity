// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c.a.a;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package c.a.a:
//            b, c, f, g, 
//            i

public final class d extends HashMap
    implements b, c, f
{

    public d()
    {
    }

    public d(Map map)
    {
        super(map);
    }

    private static String a(Map map, g g1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            a(map, ((Appendable) (stringbuilder)), g1);
        }
        // Misplaced declaration of an exception variable
        catch (Map map) { }
        return stringbuilder.toString();
    }

    public static void a(String s, Object obj, Appendable appendable, g g1)
    {
        if (s == null)
        {
            appendable.append("null");
        } else
        if (!g1.a(s))
        {
            appendable.append(s);
        } else
        {
            appendable.append('"');
            i.a(s, appendable, g1);
            appendable.append('"');
        }
        appendable.append(':');
        if (obj instanceof String)
        {
            if (!g1.b((String)obj))
            {
                appendable.append((String)obj);
                return;
            } else
            {
                appendable.append('"');
                i.a((String)obj, appendable, g1);
                appendable.append('"');
                return;
            }
        } else
        {
            i.a(obj, appendable, g1);
            return;
        }
    }

    public static void a(Map map, Appendable appendable, g g1)
    {
        if (map == null)
        {
            appendable.append("null");
            return;
        }
        appendable.append('{');
        map = map.entrySet().iterator();
        boolean flag = true;
        while (map.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (flag)
            {
                flag = false;
            } else
            {
                appendable.append(',');
            }
            a(entry.getKey().toString(), entry.getValue(), appendable, g1);
        }
        appendable.append('}');
    }

    public final String a()
    {
        return a(((Map) (this)), i.a);
    }

    public final String a(g g1)
    {
        return a(((Map) (this)), g1);
    }

    public final void a(Appendable appendable)
    {
        a(((Map) (this)), appendable, i.a);
    }

    public final void a(Appendable appendable, g g1)
    {
        a(((Map) (this)), appendable, g1);
    }

    public final String toString()
    {
        return a(this, i.a);
    }
}

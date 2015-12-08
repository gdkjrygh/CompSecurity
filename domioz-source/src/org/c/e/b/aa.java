// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;

import java.io.Serializable;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.c.d.a;

// Referenced classes of package org.c.e.b:
//            ab, u, a

public class aa
    implements Serializable
{

    private static final Pattern a = Pattern.compile("\\{([^/]+?)\\}");
    private final org.c.e.b.a b;
    private final List c;
    private final Pattern d;
    private final String e;

    public aa(String s)
    {
        ab ab1 = new ab(s, (byte)0);
        e = s;
        c = org.c.e.b.ab.a(ab1);
        d = ab.b(ab1);
        b = u.fromUriString(s).build();
    }

    static Pattern a()
    {
        return a;
    }

    public URI expand(Map map)
    {
        return b.expand(map).encode().toUri();
    }

    public transient URI expand(Object aobj[])
    {
        return b.expand(aobj).encode().toUri();
    }

    public List getVariableNames()
    {
        return c;
    }

    public Map match(String s)
    {
        org.c.d.a.notNull(s, "'uri' must not be null");
        LinkedHashMap linkedhashmap = new LinkedHashMap(c.size());
        s = d.matcher(s);
        if (s.find())
        {
            for (int i = 1; i <= s.groupCount(); i++)
            {
                linkedhashmap.put((String)c.get(i - 1), s.group(i));
            }

        }
        return linkedhashmap;
    }

    public boolean matches(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return d.matcher(s).matches();
        }
    }

    public String toString()
    {
        return e;
    }

}

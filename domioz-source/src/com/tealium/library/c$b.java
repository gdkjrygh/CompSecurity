// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.tealium.library:
//            u, C

final class a
{

    private final Map a = new HashMap();

    static Map a(a a1)
    {
        return a1.a;
    }

    final String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder("(\r\n");
        a aa[] = (<init>[])a.values().toArray(new rray[a.size()]);
        for (int i = 0; i < aa.length - 1; i++)
        {
            stringbuilder.append(s).append("\t(").append(aa[i]).append(") &&\r\n");
        }

        if (aa.length > 0)
        {
            stringbuilder.append(s).append("\t(").append(aa[aa.length - 1]).append(")\r\n");
        }
        return stringbuilder.append(s).append(")").toString();
    }

    final void a(long l, String s, String s1)
    {
        toString tostring1 = (toString)a.get(Long.valueOf(l));
        toString tostring = tostring1;
        if (tostring1 == null)
        {
            tostring = new <init>((byte)0);
            a.put(Long.valueOf(l), tostring);
        }
        if ("filter".equalsIgnoreCase(s))
        {
            tostring.a = s1;
            return;
        }
        if ("filtertype".equalsIgnoreCase(s))
        {
            tostring.b = a(s1);
            return;
        }
        if ("source".equalsIgnoreCase(s))
        {
            if ("Tealium Reference ID".equals(s1))
            {
                tostring.c = "tealium_id";
                return;
            }
            if ("Object Class".equals(s1))
            {
                tostring.c = "object_class";
                return;
            } else
            {
                tostring.c = s1;
                return;
            }
        } else
        {
            u.a(new Exception(String.format(Locale.ROOT, "Unknown field: \"%s\"...", new Object[] {
                s
            })));
            return;
        }
    }

    final boolean a(String s, C c)
    {
        for (s = a.entrySet().iterator(); s.hasNext();)
        {
            t> t> = (xt)((java.util.Entry)s.next()).getValue();
            Object obj = c.get(t>.c);
            boolean flag;
            if (obj == null)
            {
                flag = false;
            } else
            {
                flag = t>.b.a.a(t>.a, obj.toString());
            }
            if (!flag)
            {
                return true;
            }
        }

        return false;
    }

    public final String toString()
    {
        return a("");
    }

    a(long l)
    {
    }
}

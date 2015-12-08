// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a.b;

import com.nuance.dragon.toolkit.b.b;
import com.nuance.dragon.toolkit.d.a;
import com.nuance.dragon.toolkit.d.b.c;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

public final class e
    implements a
{

    private final String a;
    private final com.nuance.dragon.toolkit.b.e b;
    private final String c;
    private final com.nuance.dragon.toolkit.b.e d;
    private final com.nuance.dragon.toolkit.audio.e e;
    private final int f;

    public e(String s, com.nuance.dragon.toolkit.b.e e1, String s1, com.nuance.dragon.toolkit.b.e e2, com.nuance.dragon.toolkit.audio.e e3)
    {
        this(s, e1, s1, e2, e3, (byte)0);
    }

    private e(String s, com.nuance.dragon.toolkit.b.e e1, String s1, com.nuance.dragon.toolkit.b.e e2, com.nuance.dragon.toolkit.audio.e e3, byte byte0)
    {
        com.nuance.dragon.toolkit.d.b.c.a("command", s);
        com.nuance.dragon.toolkit.d.b.c.a("ttsParamName", s1);
        com.nuance.dragon.toolkit.d.b.c.a("ttsParamData", e2);
        boolean flag;
        if (e2.b().size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.dragon.toolkit.d.b.c.a("ttsParamData", "not empty", flag);
        com.nuance.dragon.toolkit.d.b.c.a("audioType", e3);
        com.nuance.dragon.toolkit.d.b.c.a("timeout", "greater than 0", true);
        a = s;
        b = e1;
        c = s1;
        d = a(e2);
        e = e3;
        f = 10000;
    }

    private static com.nuance.dragon.toolkit.b.e a(com.nuance.dragon.toolkit.b.e e1)
    {
        Iterator iterator = e1.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (193 == ((com.nuance.dragon.toolkit.b.a)entry.getValue()).a())
            {
                Object obj = (b)entry.getValue();
                if (obj != null)
                {
                    obj = ((b) (obj)).a.replace("\033", "\\!");
                    e1.a((String)entry.getKey(), ((String) (obj)));
                }
            }
        } while (true);
        return e1;
    }

    public final String a()
    {
        return a;
    }

    public final com.nuance.dragon.toolkit.b.e b()
    {
        return b;
    }

    public final JSONObject c()
    {
        com.nuance.dragon.toolkit.d.a.a a1 = new com.nuance.dragon.toolkit.d.a.a();
        a1.a("cmd", a);
        a1.a("settings", b.c());
        a1.a("pname", c);
        a1.a("pdata", d.c());
        a1.a("type", e.c());
        a1.a("timeout", Integer.valueOf(f));
        return a1;
    }

    public final String d()
    {
        return c;
    }

    public final com.nuance.dragon.toolkit.b.e e()
    {
        return d;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (e)obj;
        if (e == null)
        {
            if (((e) (obj)).e != null)
            {
                return false;
            }
        } else
        if (!e.equals(((e) (obj)).e))
        {
            return false;
        }
        if (d != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((e) (obj)).d == null) goto _L1; else goto _L3
_L3:
        return false;
        if (d.equals(((e) (obj)).d)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final com.nuance.dragon.toolkit.audio.e f()
    {
        return e;
    }

    public final int g()
    {
        return f;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (e == null)
        {
            i = 0;
        } else
        {
            i = e.hashCode();
        }
        if (d != null)
        {
            j = d.hashCode();
        }
        return (i + 31) * 31 + j;
    }
}

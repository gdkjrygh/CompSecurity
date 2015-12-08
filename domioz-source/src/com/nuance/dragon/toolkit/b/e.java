// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.b;

import com.nuance.dragon.toolkit.d.b.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.dragon.toolkit.b:
//            a, b, c

public final class e extends a
{

    private final Map a;

    public e()
    {
        this((byte)0);
    }

    private e(byte byte0)
    {
        super((short)224);
        a = new LinkedHashMap();
    }

    protected final String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{\n");
        String s1 = (new StringBuilder()).append(s).append("  ").toString();
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",\n"))
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            stringbuilder.append(s1);
            stringbuilder.append((String)entry.getKey());
            stringbuilder.append(" : ");
            stringbuilder.append(((a)entry.getValue()).a((new StringBuilder()).append(s1).append("  ").toString()));
        }

        stringbuilder.append(s);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final void a(String s, a a1)
    {
        com.nuance.dragon.toolkit.d.b.c.a("key", s);
        a.put(s, a1);
    }

    public final void a(String s, String s1)
    {
        com.nuance.dragon.toolkit.d.b.c.a("key", s);
        a.put(s, new b(s1));
    }

    protected final void a(JSONObject jsonobject)
    {
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); jsonobject1.put((String)entry.getKey(), ((a)entry.getValue()).c()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return;
        }
        jsonobject.put("value", jsonobject1);
        return;
    }

    public final Set b()
    {
        return a.entrySet();
    }

    public final void b(String s)
    {
        com.nuance.dragon.toolkit.d.b.c.a("key", s);
        a.put(s, new com.nuance.dragon.toolkit.b.c(0));
    }

    public final a c(String s)
    {
        return (a)a.get(s);
    }

    public final com.nuance.dragon.toolkit.b.c d(String s)
    {
        s = c(s);
        if (s != null && com.nuance.dragon.toolkit.b.a.a(s) == 192)
        {
            return (com.nuance.dragon.toolkit.b.c)s;
        } else
        {
            return null;
        }
    }

    public final b e(String s)
    {
        s = c(s);
        if (s != null && com.nuance.dragon.toolkit.b.a.a(s) == 193)
        {
            return (b)s;
        } else
        {
            return null;
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!super.equals(obj))
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (e)obj;
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((e) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((e) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final e f(String s)
    {
        s = c(s);
        if (s != null && com.nuance.dragon.toolkit.b.a.a(s) == 224)
        {
            return (e)s;
        } else
        {
            return null;
        }
    }

    public final int hashCode()
    {
        int j = super.hashCode();
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return i + j * 31;
    }
}

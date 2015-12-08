// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.nuance.dragon.toolkit.b:
//            a

public final class d extends a
{

    private final List a;

    public d()
    {
        this((byte)0);
    }

    private d(byte byte0)
    {
        super((short)16);
        a = new ArrayList();
    }

    public final String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[\n");
        String s1 = (new StringBuilder()).append(s).append("  ").toString();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder.append(",\n"))
        {
            a a1 = (a)iterator.next();
            stringbuilder.append(s1);
            stringbuilder.append(a1.a(s1));
        }

        stringbuilder.append(s);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    protected final void a(JSONObject jsonobject)
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); jsonarray.put(((a)iterator.next()).c())) { }
        jsonobject.put("value", jsonarray);
    }

    public final List b()
    {
        return a;
    }

    public final void b(a a1)
    {
        a.add(a1);
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
        obj = (d)obj;
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((d) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((d) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
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

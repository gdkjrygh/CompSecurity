// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.b;

import com.nuance.dragon.toolkit.d.b.c;
import org.json.JSONObject;

// Referenced classes of package com.nuance.dragon.toolkit.b:
//            a

public final class b extends a
{

    public String a;

    public b(String s)
    {
        super((short)193);
        c.a("value", s);
        a = s;
    }

    public final String a(String s)
    {
        return a;
    }

    protected final void a(JSONObject jsonobject)
    {
        jsonobject.put("value", a);
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
        obj = (b)obj;
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((b) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((b) (obj)).a)) goto _L1; else goto _L4
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

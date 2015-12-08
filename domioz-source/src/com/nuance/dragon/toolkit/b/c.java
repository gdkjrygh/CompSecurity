// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.b;

import org.json.JSONObject;

// Referenced classes of package com.nuance.dragon.toolkit.b:
//            a

public final class c extends a
{

    public final int a;

    public c(int i)
    {
        super((short)192);
        a = i;
    }

    public final String a(String s)
    {
        return String.valueOf(a);
    }

    protected final void a(JSONObject jsonobject)
    {
        jsonobject.put("value", a);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!super.equals(obj))
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (c)obj;
            if (a != ((c) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return super.hashCode() * 31 + a;
    }
}

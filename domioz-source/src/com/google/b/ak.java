// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.b.a;

// Referenced classes of package com.google.b:
//            am, ae, v, aj, 
//            k, al

final class ak
    implements am
{

    private final com.google.b.c.a a;
    private final boolean b;
    private final Class c;
    private final ae d;
    private final v e;

    private ak(Object obj, com.google.b.c.a a1, boolean flag)
    {
        ae ae1;
        boolean flag1;
        if (obj instanceof ae)
        {
            ae1 = (ae)obj;
        } else
        {
            ae1 = null;
        }
        d = ae1;
        if (obj instanceof v)
        {
            obj = (v)obj;
        } else
        {
            obj = null;
        }
        e = ((v) (obj));
        if (d != null || e != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        com.google.b.b.a.a(flag1);
        a = a1;
        b = flag;
        c = null;
    }

    ak(Object obj, com.google.b.c.a a1, boolean flag, byte byte0)
    {
        this(obj, a1, flag);
    }

    public final al a(k k, com.google.b.c.a a1)
    {
        boolean flag;
        if (a != null)
        {
            if (a.equals(a1) || b && a.getType() == a1.getRawType())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = c.isAssignableFrom(a1.getRawType());
        }
        if (flag)
        {
            return new aj(d, e, k, a1, this, (byte)0);
        } else
        {
            return null;
        }
    }
}

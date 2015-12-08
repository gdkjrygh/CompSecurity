// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.a;

// Referenced classes of package com.google.a:
//            an, af, w, ak, 
//            k, am

final class al
    implements an
{

    private final com.google.a.c.a a;
    private final boolean b;
    private final Class c;
    private final af d;
    private final w e;

    private al(Object obj, com.google.a.c.a a1, boolean flag)
    {
        af af1;
        boolean flag1;
        if (obj instanceof af)
        {
            af1 = (af)obj;
        } else
        {
            af1 = null;
        }
        d = af1;
        if (obj instanceof w)
        {
            obj = (w)obj;
        } else
        {
            obj = null;
        }
        e = ((w) (obj));
        if (d != null || e != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        com.google.a.b.a.a(flag1);
        a = a1;
        b = flag;
        c = null;
    }

    al(Object obj, com.google.a.c.a a1, boolean flag, byte byte0)
    {
        this(obj, a1, flag);
    }

    public final am a(k k, com.google.a.c.a a1)
    {
        boolean flag;
        if (a != null)
        {
            if (a.equals(a1) || b && a.b() == a1.a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = c.isAssignableFrom(a1.a());
        }
        if (flag)
        {
            return new ak(d, e, k, a1, this, (byte)0);
        } else
        {
            return null;
        }
    }
}

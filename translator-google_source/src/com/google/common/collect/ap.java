// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;

// Referenced classes of package com.google.common.collect:
//            aq, af, dt

class ap extends aq
{

    Object a[];
    int b;

    ap()
    {
        af.a(4, "initialCapacity");
        a = new Object[4];
        b = 0;
    }

    private void a(int i)
    {
        if (a.length < i)
        {
            a = dt.b(a, a(a.length, i));
        }
    }

    public ap a(Object obj)
    {
        p.a(obj);
        a(b + 1);
        Object aobj[] = a;
        int i = b;
        b = i + 1;
        aobj[i] = obj;
        return this;
    }

    public transient aq a(Object aobj[])
    {
        dt.a(aobj);
        a(b + aobj.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (a)), b, aobj.length);
        b = b + aobj.length;
        return this;
    }

    public aq b(Object obj)
    {
        return a(obj);
    }
}

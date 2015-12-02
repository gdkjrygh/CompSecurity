// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.o;

import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.common.o:
//            b, a

public class c
    implements com.facebook.common.o.b
{

    Class a;

    public c(Class class1)
    {
        a = class1;
    }

    public Object a()
    {
        Object obj = a.newInstance();
        return obj;
        Object obj1;
        obj1;
        com.facebook.debug.log.b.e(com.facebook.common.o.a.d(), ((InstantiationException) (obj1)).toString());
_L2:
        return null;
        obj1;
        com.facebook.debug.log.b.e(com.facebook.common.o.a.d(), ((IllegalAccessException) (obj1)).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(a a1)
    {
    }

    public void a(Object obj)
    {
    }

    public void b(Object obj)
    {
    }

    public void c(Object obj)
    {
    }
}

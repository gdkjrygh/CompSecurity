// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import javax.inject.a;

// Referenced classes of package com.facebook.inject:
//            l, n, bd

class m
    implements a
{

    final a a;
    final l b;

    m(l l1, a a1)
    {
        b = l1;
        a = a1;
        super();
    }

    public Object b()
    {
        l.b(b).a(com.facebook.inject.l.a(b));
        if (!(l.c(b) instanceof bd)) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (bd)l.c(b);
        ((bd) (obj)).a(b);
_L4:
        Object obj1 = a.b();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        ((bd) (obj)).a();
        l.b(b).b();
        return obj1;
        Exception exception;
        exception;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        ((bd) (obj)).a();
        throw exception;
        obj;
        l.b(b).b();
        throw obj;
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }
}

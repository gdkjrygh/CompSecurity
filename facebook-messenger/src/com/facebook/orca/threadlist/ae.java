// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.threadlist:
//            t

class ae
    implements h
{

    final t a;

    ae(t t1)
    {
        a = t1;
        super();
    }

    public void a(Boolean boolean1)
    {
        t.a(a, boolean1.booleanValue());
    }

    public volatile void a(Object obj)
    {
        a((Boolean)obj);
    }

    public void a(Throwable throwable)
    {
        t.a(a, false);
    }
}

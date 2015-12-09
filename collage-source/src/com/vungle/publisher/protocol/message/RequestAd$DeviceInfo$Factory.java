// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.AdConfig;
import com.vungle.publisher.bt;
import com.vungle.publisher.bv;
import com.vungle.publisher.cp;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            MessageFactory

public static class imension.Factory extends MessageFactory
{

    protected AdConfig a;
    protected bt b;
    protected imension.Factory c;
    protected cp d;
    protected bv e;

    protected final Object a()
    {
        return new imension.Factory();
    }

    protected final volatile Object[] a(int i)
    {
        return new imension.Factory[i];
    }

    protected final imension.Factory b()
    {
        imension.Factory factory = new imension.Factory();
        factory.Factory = d.a();
        factory.d = c.b();
        factory.b = Boolean.valueOf(b.o());
        factory.b = Boolean.valueOf(a.isSoundEnabled());
        factory.a = b.j();
        factory.b = b.m();
        factory.b = d.b();
        factory.d = b.g();
        factory.b = b;
        factory.b = b.n();
        factory.b = b.s();
        return factory;
    }

    protected imension.Factory()
    {
    }
}

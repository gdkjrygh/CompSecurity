// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.Demographic;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            MessageFactory

public static class .Factory extends MessageFactory
{

    protected Demographic a;
    protected .Factory b;

    protected final Object a()
    {
        return new .Factory();
    }

    protected final volatile Object[] a(int i)
    {
        return new .Factory[i];
    }

    protected final .Factory b()
    {
        Demographic demographic = a;
        .Factory factory = new a();
        factory.a = demographic.getAge();
        factory.a = demographic.getGender();
        factory.a = b.b();
        return factory;
    }

    protected .Factory()
    {
    }
}

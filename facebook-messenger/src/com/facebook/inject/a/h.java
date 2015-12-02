// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject.a;

import com.facebook.inject.ContextScoped;
import com.facebook.inject.ThreadLocalScoped;
import com.facebook.inject.f;
import javax.inject.Singleton;

// Referenced classes of package com.facebook.inject.a:
//            g

public class h
    implements g
{

    protected final com.facebook.inject.h a;

    public h(com.facebook.inject.h h1)
    {
        a = h1;
    }

    public void a()
    {
        a.a(javax/inject/Singleton);
    }

    public void a(Class class1, f f1)
    {
        a.a(class1);
        a.a(f1);
    }

    public void b()
    {
        a.a(com/facebook/inject/ThreadLocalScoped);
    }

    public void c()
    {
        a.a(javax/inject/Singleton);
        a.a(f.LESS_EAGER_ON_UI_THREAD);
    }

    public void d()
    {
        a.a(com/facebook/inject/ContextScoped);
    }

    public void d(Class class1)
    {
        a.a(class1);
    }
}

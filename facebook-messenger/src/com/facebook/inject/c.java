// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.facebook.inject.a.e;
import com.google.inject.a;

// Referenced classes of package com.facebook.inject:
//            ag, e, aj, t, 
//            au

public abstract class c
    implements ag
{

    private com.facebook.inject.e a;

    public c()
    {
    }

    protected com.facebook.inject.a.a a(Class class1)
    {
        return a.a(class1);
    }

    protected com.facebook.inject.a.c a(a a1)
    {
        return a.a(a1);
    }

    protected e a(ag ag1)
    {
        return a.a(ag1);
    }

    protected aj a(Class class1, Class class2)
    {
        return a.c(com.google.inject.a.a(class1, class2));
    }

    protected abstract void a();

    public final void a(com.facebook.inject.e e1)
    {
        a = e1;
        a();
    }

    public void a(t t)
    {
    }

    protected void a(Class class1, au au)
    {
        a.a(class1, au);
    }

    protected com.facebook.inject.a.a b(Class class1)
    {
        return a.b(class1);
    }

    protected com.facebook.inject.a.c b(a a1)
    {
        return a.b(a1);
    }

    protected void b(Class class1, Class class2)
    {
        a.d(com.google.inject.a.a(class1, class2));
    }

    protected aj c(Class class1)
    {
        return a.c(class1);
    }

    protected void d(Class class1)
    {
        a.d(class1);
    }

    protected void e(Class class1)
    {
        a.e(class1);
    }

    protected e f(Class class1)
    {
        return a.f(class1);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import java.util.Set;

// Referenced classes of package com.facebook.inject:
//            t, ab

public abstract class a extends t
{

    public a()
    {
    }

    public Object a(com.google.inject.a a1)
    {
        return b(a1).b();
    }

    public Object a(Class class1)
    {
        return b(class1).b();
    }

    public Object a(Class class1, Class class2)
    {
        return b(com.google.inject.a.a(class1, class2)).b();
    }

    public abstract javax.inject.a b(com.google.inject.a a1);

    public javax.inject.a b(Class class1)
    {
        return b(com.google.inject.a.a(class1));
    }

    public javax.inject.a b(Class class1, Class class2)
    {
        return b(com.google.inject.a.a(class1, class2));
    }

    public Set c(Class class1)
    {
        return (Set)a(f(class1, null));
    }

    public Set c(Class class1, Class class2)
    {
        return (Set)a(f(class1, class2));
    }

    public abstract javax.inject.a c(com.google.inject.a a1);

    public javax.inject.a d(Class class1)
    {
        return b(f(class1, null));
    }

    public javax.inject.a d(Class class1, Class class2)
    {
        return b(f(class1, class2));
    }

    public javax.inject.a e(Class class1)
    {
        return c(com.google.inject.a.a(class1));
    }

    public javax.inject.a e(Class class1, Class class2)
    {
        return c(com.google.inject.a.a(class1, class2));
    }

    public ab f(Class class1)
    {
        return this;
    }
}

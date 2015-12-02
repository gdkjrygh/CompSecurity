// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject.a;

import com.facebook.inject.ac;
import com.facebook.inject.ar;
import com.facebook.inject.as;
import com.facebook.inject.h;
import com.google.inject.a;

// Referenced classes of package com.facebook.inject.a:
//            h, c, g

public class d extends com.facebook.inject.a.h
    implements c
{

    public d(h h1)
    {
        super(h1);
    }

    public g a(a a1)
    {
        a.a(new ar(a1));
        return new com.facebook.inject.a.h(a);
    }

    public g a(Class class1, Class class2)
    {
        return a(com.google.inject.a.a(class1, class2));
    }

    public g a(javax.inject.a a1)
    {
        a.a(a1);
        return new com.facebook.inject.a.h(a);
    }

    public void a(Object obj)
    {
        a.a(new ac(obj));
    }

    public g b(Class class1)
    {
        a.a(new ar(com.google.inject.a.a(class1)));
        return new com.facebook.inject.a.h(a);
    }

    public g c(Class class1)
    {
        a.a(new as(class1));
        return new com.facebook.inject.a.h(a);
    }
}

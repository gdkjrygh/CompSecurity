// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.google.common.a.kl;
import com.google.inject.a;
import java.util.Set;

public class aj
{

    private final a a;
    private final Set b = kl.b();

    public aj(a a1)
    {
        a = a1;
    }

    public aj a(a a1)
    {
        b.add(a1);
        return this;
    }

    public aj a(Class class1)
    {
        b.add(com.google.inject.a.a(class1));
        return this;
    }

    public aj a(Class class1, Class class2)
    {
        return a(com.google.inject.a.a(class1, class2));
    }

    public Set a()
    {
        return b;
    }
}

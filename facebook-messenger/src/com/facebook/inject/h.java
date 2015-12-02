// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.google.common.base.Objects;
import com.google.inject.a;

// Referenced classes of package com.facebook.inject:
//            f

public class h
{

    private a a;
    private javax.inject.a b;
    private Class c;
    private f d;
    private boolean e;

    public h()
    {
        d = f.NONE;
    }

    public a a()
    {
        return a;
    }

    public void a(f f1)
    {
        d = f1;
    }

    public void a(a a1)
    {
        a = a1;
    }

    public void a(Class class1)
    {
        c = class1;
    }

    public void a(javax.inject.a a1)
    {
        b = a1;
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public javax.inject.a b()
    {
        return b;
    }

    public Class c()
    {
        return c;
    }

    public f d()
    {
        return d;
    }

    public boolean e()
    {
        return e;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("key", a).add("provider", b).add("scope", c).add("eager", d).add("default", Boolean.valueOf(e)).toString();
    }
}

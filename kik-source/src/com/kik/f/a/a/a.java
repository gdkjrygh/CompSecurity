// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.f.a.a;

import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.kik.f.a.a:
//            b

public final class a
    implements n, Externalizable
{

    static final a a = new a();
    static final u i = new b();
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;

    public a()
    {
    }

    public a(String s, String s1)
    {
        e = s;
        g = s1;
    }

    public static u b()
    {
        return i;
    }

    public final u a()
    {
        return i;
    }

    public final a a(String s)
    {
        b = s;
        return this;
    }

    public final a b(String s)
    {
        c = s;
        return this;
    }

    public final a c(String s)
    {
        d = s;
        return this;
    }

    public final String c()
    {
        return b;
    }

    public final a d(String s)
    {
        f = s;
        return this;
    }

    public final String d()
    {
        return c;
    }

    public final a e(String s)
    {
        h = s;
        return this;
    }

    public final String e()
    {
        return d;
    }

    public final String f()
    {
        return e;
    }

    public final String g()
    {
        return f;
    }

    public final String h()
    {
        return g;
    }

    public final String i()
    {
        return h;
    }

    public final void readExternal(ObjectInput objectinput)
    {
        com.b.a.h.a(objectinput, this, i);
    }

    public final void writeExternal(ObjectOutput objectoutput)
    {
        com.b.a.h.a(objectoutput, this, i);
    }

}

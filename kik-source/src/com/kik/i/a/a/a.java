// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.i.a.a;

import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.kik.i.a.a:
//            b

public final class a
    implements n, Externalizable
{

    static final a a = new a();
    static final u f = new b();
    Integer b;
    Integer c;
    String d;
    String e;

    public a()
    {
    }

    public static u b()
    {
        return f;
    }

    public final u a()
    {
        return f;
    }

    public final a a(Integer integer)
    {
        b = integer;
        return this;
    }

    public final a a(String s)
    {
        d = s;
        return this;
    }

    public final a b(Integer integer)
    {
        c = integer;
        return this;
    }

    public final a b(String s)
    {
        e = s;
        return this;
    }

    public final Integer c()
    {
        return b;
    }

    public final Integer d()
    {
        return c;
    }

    public final String e()
    {
        return d;
    }

    public final String f()
    {
        return e;
    }

    public final void readExternal(ObjectInput objectinput)
    {
        h.a(objectinput, this, f);
    }

    public final void writeExternal(ObjectOutput objectoutput)
    {
        h.a(objectoutput, this, f);
    }

}

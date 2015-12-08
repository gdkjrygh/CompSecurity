// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.b;

import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.kik.n.a.b:
//            h

public final class g
    implements n, Externalizable
{

    static final g a = new g();
    static final u g = new com.kik.n.a.b.h();
    String b;
    String c;
    String d;
    Long e;
    String f;

    public g()
    {
    }

    public static u b()
    {
        return g;
    }

    public final u a()
    {
        return g;
    }

    public final g a(Long long1)
    {
        e = long1;
        return this;
    }

    public final g a(String s)
    {
        b = s;
        return this;
    }

    public final g b(String s)
    {
        c = s;
        return this;
    }

    public final g c(String s)
    {
        d = s;
        return this;
    }

    public final String c()
    {
        return b;
    }

    public final g d(String s)
    {
        f = s;
        return this;
    }

    public final String d()
    {
        return c;
    }

    public final String e()
    {
        return d;
    }

    public final Long f()
    {
        return e;
    }

    public final String g()
    {
        return f;
    }

    public final void readExternal(ObjectInput objectinput)
    {
        h.a(objectinput, this, g);
    }

    public final void writeExternal(ObjectOutput objectoutput)
    {
        h.a(objectoutput, this, g);
    }

}

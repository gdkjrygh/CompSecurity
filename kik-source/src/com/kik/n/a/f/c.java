// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.f;

import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.List;

// Referenced classes of package com.kik.n.a.f:
//            d

public final class c
    implements n, Externalizable
{

    static final c a = new c();
    static final u f = new d();
    String b;
    String c;
    String d;
    List e;

    public c()
    {
    }

    public final u a()
    {
        return f;
    }

    public final c a(String s)
    {
        b = s;
        return this;
    }

    public final c a(List list)
    {
        e = list;
        return this;
    }

    public final c b(String s)
    {
        c = s;
        return this;
    }

    public final String b()
    {
        return b;
    }

    public final c c(String s)
    {
        d = s;
        return this;
    }

    public final String c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public final List e()
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

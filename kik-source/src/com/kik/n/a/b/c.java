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
import java.util.List;

// Referenced classes of package com.kik.n.a.b:
//            d, a

public final class c
    implements n, Externalizable
{

    static final c a = new c();
    static final u e = new d();
    String b;
    List c;
    a d;

    public c()
    {
    }

    public final u a()
    {
        return e;
    }

    public final c a(a a1)
    {
        d = a1;
        return this;
    }

    public final c a(String s)
    {
        b = s;
        return this;
    }

    public final c a(List list)
    {
        c = list;
        return this;
    }

    public final List b()
    {
        return c;
    }

    public final a c()
    {
        return d;
    }

    public final void readExternal(ObjectInput objectinput)
    {
        h.a(objectinput, this, e);
    }

    public final void writeExternal(ObjectOutput objectoutput)
    {
        h.a(objectoutput, this, e);
    }

}

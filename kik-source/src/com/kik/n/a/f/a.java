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

// Referenced classes of package com.kik.n.a.f:
//            b

public final class a
    implements n, Externalizable
{

    static final a a = new a();
    static final u e = new b();
    String b;
    String c;
    String d;

    public a()
    {
    }

    public static u b()
    {
        return e;
    }

    public final u a()
    {
        return e;
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

    public final String d()
    {
        return c;
    }

    public final String e()
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

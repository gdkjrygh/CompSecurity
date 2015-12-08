// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.e;

import com.b.a.b;
import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.kik.n.a.e:
//            b

public final class a
    implements n, Externalizable
{

    static final a a = new a();
    static final u f = new com.kik.n.a.e.b();
    b b;
    b c;
    b d;
    b e;

    public a()
    {
    }

    public final u a()
    {
        return f;
    }

    public final a a(b b1)
    {
        b = b1;
        return this;
    }

    public final b b()
    {
        return b;
    }

    public final a b(b b1)
    {
        c = b1;
        return this;
    }

    public final b c()
    {
        return c;
    }

    public final a c(b b1)
    {
        d = b1;
        return this;
    }

    public final b d()
    {
        return d;
    }

    public final a d(b b1)
    {
        e = b1;
        return this;
    }

    public final b e()
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

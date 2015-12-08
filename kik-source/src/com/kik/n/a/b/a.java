// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.b;

import com.b.a.b;
import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.kik.n.a.b:
//            b

public final class a
    implements n, Externalizable
{

    static final a a = new a();
    static final u d = new com.kik.n.a.b.b();
    b b;
    b c;

    public a()
    {
    }

    public static u b()
    {
        return d;
    }

    public final u a()
    {
        return d;
    }

    public final a a(b b1)
    {
        b = b1;
        return this;
    }

    public final a b(b b1)
    {
        c = b1;
        return this;
    }

    public final b c()
    {
        return b;
    }

    public final b d()
    {
        return c;
    }

    public final void readExternal(ObjectInput objectinput)
    {
        h.a(objectinput, this, d);
    }

    public final void writeExternal(ObjectOutput objectoutput)
    {
        h.a(objectoutput, this, d);
    }

}

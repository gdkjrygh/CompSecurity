// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.j;

import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.kik.n.a.j:
//            b

public final class a
    implements n, Externalizable
{

    static final a a = new a();
    static final u d = new b();
    String b;
    String c;

    public a()
    {
    }

    public final u a()
    {
        return d;
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

    public final String b()
    {
        return b;
    }

    public final String c()
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

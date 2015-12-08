// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.i;

import com.b.a.b;
import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.kik.n.a.i:
//            b

public final class a
    implements n, Externalizable
{

    static final a a = new a();
    static final u c = new com.kik.n.a.i.b();
    b b;

    public a()
    {
    }

    public final u a()
    {
        return c;
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

    public final void readExternal(ObjectInput objectinput)
    {
        h.a(objectinput, this, c);
    }

    public final void writeExternal(ObjectOutput objectoutput)
    {
        h.a(objectoutput, this, c);
    }

}

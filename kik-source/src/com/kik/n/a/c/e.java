// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.c;

import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.List;

// Referenced classes of package com.kik.n.a.c:
//            f, a

public final class e
    implements n, Externalizable
{

    static final e a = new e();
    static final u o = new f();
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    Long i;
    Long j;
    a k;
    List l;
    String m;
    List n;

    public e()
    {
    }

    public final u a()
    {
        return o;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public final Long e()
    {
        return j;
    }

    public final a f()
    {
        return k;
    }

    public final List g()
    {
        return l;
    }

    public final String h()
    {
        return m;
    }

    public final void readExternal(ObjectInput objectinput)
    {
        com.b.a.h.a(objectinput, this, o);
    }

    public final void writeExternal(ObjectOutput objectoutput)
    {
        com.b.a.h.a(objectoutput, this, o);
    }

}

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
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.kik.n.a.b:
//            f, g

public final class e
    implements n, Externalizable
{

    static final e a = new e();
    static final u c = new f();
    List b;

    public e()
    {
    }

    public final u a()
    {
        return c;
    }

    public final e a(g g)
    {
        if (b == null)
        {
            b = new ArrayList();
        }
        b.add(g);
        return this;
    }

    public final List b()
    {
        return b;
    }

    public final int c()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.size();
        }
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

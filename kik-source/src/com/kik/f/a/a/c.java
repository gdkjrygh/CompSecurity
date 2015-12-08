// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.f.a.a;

import com.b.a.h;
import com.b.a.n;
import com.b.a.u;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.kik.f.a.a:
//            d, a

public final class c
    implements n, Externalizable
{

    static final c a = new c();
    static final u c = new d();
    List b;

    public c()
    {
    }

    public final u a()
    {
        return c;
    }

    public final a a(int i)
    {
        if (b == null)
        {
            return null;
        } else
        {
            return (a)b.get(i);
        }
    }

    public final c a(a a1)
    {
        if (b == null)
        {
            b = new ArrayList();
        }
        b.add(a1);
        return this;
    }

    public final int b()
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

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
//            j

public final class i
    implements n, Externalizable
{

    static final i a = new i();
    static final u c = new j();
    List b;

    public i()
    {
    }

    public final u a()
    {
        return c;
    }

    public final List b()
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.c;

import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.wg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.c:
//            c, f

public abstract class e
{

    protected final c a;
    private final f b;
    private final List c = new ArrayList();

    protected e(f f, wg wg)
    {
        bl.a(f);
        b = f;
        f = new c(this, wg);
        f.j();
        a = f;
    }

    protected void a(c c1)
    {
    }

    public c g()
    {
        c c1 = a.a();
        j();
        return c1;
    }

    public final c h()
    {
        return a;
    }

    public final List i()
    {
        return a.c();
    }

    protected final void j()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    protected final f k()
    {
        return b;
    }
}

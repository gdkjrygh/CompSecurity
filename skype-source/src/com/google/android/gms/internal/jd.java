// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jb, je, io

public abstract class jd
{

    protected final jb a;
    private final je b;
    private final List c = new ArrayList();

    protected jd(je je, io io)
    {
        y.a(je);
        b = je;
        je = new jb(this, io);
        je.j();
        a = je;
    }

    protected void a(jb jb1)
    {
    }

    public jb j()
    {
        jb jb1 = a.a();
        m();
        return jb1;
    }

    public final jb k()
    {
        return a;
    }

    public final List l()
    {
        return a.c();
    }

    protected final void m()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    protected final je n()
    {
        return b;
    }
}

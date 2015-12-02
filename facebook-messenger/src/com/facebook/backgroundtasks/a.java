// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundtasks;

import com.google.common.a.fi;
import java.util.Set;

// Referenced classes of package com.facebook.backgroundtasks:
//            c, q

public abstract class a
    implements c
{

    private final String a;
    private q b;

    public a(String s)
    {
        a = s;
    }

    public Set a()
    {
        return fi.d();
    }

    public void a(q q1)
    {
        b = q1;
    }

    protected q e()
    {
        return b;
    }

    public String f()
    {
        return a;
    }

    public Set g()
    {
        return fi.d();
    }

    public Set h()
    {
        return fi.d();
    }

    public long i()
    {
        return -1L;
    }

    protected void j()
    {
        if (b != null)
        {
            b.b();
        }
    }
}

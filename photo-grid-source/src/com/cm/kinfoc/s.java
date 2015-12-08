// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import com.cm.kinfoc.a.a;
import com.cm.kinfoc.a.c;
import com.cm.kinfoc.a.g;

// Referenced classes of package com.cm.kinfoc:
//            q, x, t, w, 
//            u, f

public final class s
{

    private a a;

    private s()
    {
        a = null;
        q.b();
        x x1 = new x(this, (byte)0);
        a = (new c()).b().a(new t(this, x1)).a();
    }

    s(byte byte0)
    {
        this();
    }

    public static s a()
    {
        return com.cm.kinfoc.w.a();
    }

    static void a(s s1, f f)
    {
        s1.a.a(f);
    }

    public final void a(String s1, String s2)
    {
        if (s2 == null)
        {
            return;
        } else
        {
            g.a().a(new u(this, s1, s2));
            return;
        }
    }
}

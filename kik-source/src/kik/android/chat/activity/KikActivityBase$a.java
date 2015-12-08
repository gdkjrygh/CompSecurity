// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import com.kik.g.f;
import com.kik.g.i;
import kik.a.ab;

// Referenced classes of package kik.android.chat.activity:
//            KikActivityBase, m

private final class c
{

    final KikActivityBase a;
    private f b;
    private i c;

    static f a(c c1)
    {
        return c1.b;
    }

    public final void a()
    {
        b.a();
    }

    public (KikActivityBase kikactivitybase)
    {
        a = kikactivitybase;
        super();
        c = new m(this);
        b = new f();
        b.a(kikactivitybase.c.a(), c);
        b.a(kikactivitybase.c.c(), c);
    }
}

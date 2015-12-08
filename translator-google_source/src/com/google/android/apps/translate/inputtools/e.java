// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputtools;


// Referenced classes of package com.google.android.apps.translate.inputtools:
//            f, g

final class e
{

    final g a;
    f b;
    f c;
    String d;

    public e(g g1)
    {
        b = new f();
        c = new f();
        d = "";
        a = g1;
    }

    final void a(String s)
    {
        String s1 = b.a;
        if (s.isEmpty() || s1.isEmpty() || !s.endsWith(s1) && !s1.endsWith(s))
        {
            b();
        }
    }

    public final boolean a()
    {
        return a.a != null;
    }

    final void b()
    {
        d = "";
        c.a();
        b.a();
    }
}

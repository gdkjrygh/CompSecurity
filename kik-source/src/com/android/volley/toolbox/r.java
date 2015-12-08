// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;


// Referenced classes of package com.android.volley.toolbox:
//            q

final class r
    implements Runnable
{

    final i.c a;
    final q b;

    r(q q1, i.c c)
    {
        b = q1;
        a = c;
        super();
    }

    public final void run()
    {
        b.a(a, false);
    }
}

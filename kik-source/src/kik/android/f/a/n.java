// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.app.Activity;

// Referenced classes of package kik.android.f.a:
//            m, l, f

final class n
    implements Runnable
{

    final String a;
    final Activity b;
    final m c;

    n(m m1, String s, Activity activity)
    {
        c = m1;
        a = s;
        b = activity;
        super();
    }

    public final void run()
    {
        f.a(a, b, c.b.d, c.b.e, c.b.b);
    }
}

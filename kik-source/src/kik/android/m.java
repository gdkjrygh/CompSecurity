// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import kik.android.d.b;
import kik.android.d.c;

// Referenced classes of package kik.android:
//            a, j

final class m
    implements Runnable
{

    final c a;
    final a b;
    final j c;

    m(j j, c c1, a a1)
    {
        c = j;
        a = c1;
        b = a1;
        super();
    }

    public final void run()
    {
        if (((Boolean)a.a("matching-opt-in").b()).booleanValue())
        {
            b.d();
            return;
        } else
        {
            b.e();
            return;
        }
    }
}

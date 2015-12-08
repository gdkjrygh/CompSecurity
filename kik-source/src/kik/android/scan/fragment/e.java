// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import com.kik.g.p;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment, f

final class e
    implements Runnable
{

    final kik.android.chat.activity.k.b a;
    final ScanFragment b;

    e(ScanFragment scanfragment, kik.android.chat.activity.k.b b1)
    {
        b = scanfragment;
        a = b1;
        super();
    }

    public final void run()
    {
        p p1 = a.f();
        boolean flag;
        if (!ScanFragment.j(b).c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p1.a(new f(this, flag));
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import com.kik.g.p;
import com.kik.g.r;
import java.util.List;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

final class l extends r
{

    final p a;
    final ScanFragment b;

    l(ScanFragment scanfragment, p p)
    {
        b = scanfragment;
        a = p;
        super();
    }

    public final void a()
    {
        synchronized (ScanFragment.n(b))
        {
            ScanFragment.n(b).remove(a);
        }
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }
}

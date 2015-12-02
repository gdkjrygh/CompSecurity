// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.support.v4.a:
//            q, i

class k extends q
{

    final i a;

    k(i j)
    {
        a = j;
        super(null);
    }

    public Object call()
    {
        i.a(a).set(true);
        Process.setThreadPriority(10);
        return i.a(a, a.a(b));
    }
}

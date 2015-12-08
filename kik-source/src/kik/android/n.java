// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import com.kik.g.a;
import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.i;
import java.util.concurrent.ExecutorService;
import kik.a.e.k;

// Referenced classes of package kik.android:
//            o

public final class n
    implements k
{

    private f a;
    private com.kik.g.k b;
    private i c;

    public n()
    {
        c = new o(this);
    }

    public final e a()
    {
        return b.a();
    }

    public final void a(ExecutorService executorservice, kik.a.a a1)
    {
        a = new f();
        b = new a(this, executorservice);
        a.a(a1.b(), c);
    }

    public final void b()
    {
        a.a();
    }

    public final void c()
    {
        b.a(null);
    }
}

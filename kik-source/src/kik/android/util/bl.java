// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.kik.g.p;
import java.lang.ref.WeakReference;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.f;
import kik.a.d.s;
import kik.a.e.i;
import kik.a.e.n;
import kik.a.e.t;
import kik.a.e.v;
import kik.a.f.k;
import kik.android.net.a.b;
import kik.android.net.a.e;

// Referenced classes of package kik.android.util:
//            bm, bn

public final class bl extends Handler
{

    private com.kik.android.a a;
    private i b;
    private v c;
    private k d;
    private n e;
    private t f;

    public bl(Looper looper, i j, v v, com.kik.android.a a1, k k, n n, t t)
    {
        super(looper);
        a = a1;
        b = j;
        c = v;
        d = k;
        e = n;
        f = t;
    }

    static com.kik.android.a a(bl bl1)
    {
        return bl1.a;
    }

    static k b(bl bl1)
    {
        return bl1.d;
    }

    static n c(bl bl1)
    {
        return bl1.e;
    }

    static v d(bl bl1)
    {
        return bl1.c;
    }

    static i e(bl bl1)
    {
        return bl1.b;
    }

    static t f(bl bl1)
    {
        return bl1.f;
    }

    public final void handleMessage(Message message)
    {
        s s1;
        super.handleMessage(message);
        s1 = (s)message.obj;
        message.what;
        JVM INSTR tableswitch 1023 1024: default 40
    //                   1023 41
    //                   1024 65;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        b.d(s1).a(new bm(this, s1));
        return;
_L3:
        b.c(s1);
        f f1 = b.a(s1.i());
        a a1 = (a)g.a(s1, kik/a/d/a/a);
        WeakReference weakreference = kik.android.net.a.e.a().a(a1.o());
        message = null;
        if (weakreference != null)
        {
            message = (b)weakreference.get();
        }
        if (message != null)
        {
            f1.a(s1.b(), 101, c);
            message.l().a(new bn(this, s1));
            return;
        }
        int j = a1.v();
        if (j == kik.a.d.a.a.a.e || j == kik.a.d.a.a.a.a)
        {
            b.d(s1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}

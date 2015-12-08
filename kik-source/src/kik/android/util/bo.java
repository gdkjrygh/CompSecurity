// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import com.kik.android.a;
import com.kik.g.f;
import kik.a.ab;
import kik.a.d.s;
import kik.a.e.i;
import kik.a.e.n;
import kik.a.e.t;
import kik.a.e.v;
import kik.a.f.k;

// Referenced classes of package kik.android.util:
//            bp, bq, bl

public final class bo
{

    private HandlerThread a;
    private bl b;
    private f c;
    private Context d;
    private a e;
    private n f;
    private k g;
    private v h;
    private i i;
    private t j;
    private com.kik.g.i k;
    private com.kik.g.i l;

    public bo(Context context, i i1, v v, a a1, k k1, n n, t t, 
            ab ab1)
    {
        a = new HandlerThread("UploadingHandler");
        c = new f();
        k = new bp(this);
        l = new bq(this);
        d = context;
        e = a1;
        a.start();
        g = k1;
        f = n;
        h = v;
        i = i1;
        j = t;
        b = new bl(a.getLooper(), i1, v, a1, g, f, t);
        c.a(ab1.b(), l);
        c.a(ab1.a(), l);
        c.a(i1.q(), k);
    }

    static a a(bo bo1)
    {
        return bo1.e;
    }

    static k b(bo bo1)
    {
        return bo1.g;
    }

    static n c(bo bo1)
    {
        return bo1.f;
    }

    static v d(bo bo1)
    {
        return bo1.h;
    }

    static i e(bo bo1)
    {
        return bo1.i;
    }

    static t f(bo bo1)
    {
        return bo1.j;
    }

    static bl g(bo bo1)
    {
        return bo1.b;
    }

    public final void a()
    {
        c.a();
    }

    public final void a(s s)
    {
        if (b != null)
        {
            Message message = b.obtainMessage();
            message.what = 1023;
            message.obj = s;
            b.sendMessage(message);
        }
    }

    public final void b(s s)
    {
        if (b != null)
        {
            Message message = b.obtainMessage();
            message.what = 1024;
            message.obj = s;
            b.sendMessage(message);
        }
    }
}

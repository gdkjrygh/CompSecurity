// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.l;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import p.s.c;
import p.t.d;
import p.t.f;
import p.u.g;
import p.u.i;
import p.v.a;

// Referenced classes of package p.l:
//            g

public class h
{

    private final Context a;
    private c b;
    private p.t.c c;
    private p.u.h d;
    private ExecutorService e;
    private ExecutorService f;
    private p.q.a g;
    private p.u.a.a h;

    public h(Context context)
    {
        a = context.getApplicationContext();
    }

    p.l.g a()
    {
        if (e == null)
        {
            e = new a(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (f == null)
        {
            f = new a(1);
        }
        i j = new i(a);
        if (c == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                c = new f(j.b());
            } else
            {
                c = new d();
            }
        }
        if (d == null)
        {
            d = new g(j.a());
        }
        if (h == null)
        {
            h = new p.u.f(a);
        }
        if (b == null)
        {
            b = new c(d, h, f, e);
        }
        if (g == null)
        {
            g = p.q.a.d;
        }
        return new p.l.g(b, d, c, a, g);
    }
}

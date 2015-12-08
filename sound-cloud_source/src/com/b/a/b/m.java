// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.b.a.b.a.f;
import com.b.a.b.g.a;
import com.b.a.c.c;

// Referenced classes of package com.b.a.b:
//            h, b, c, i, 
//            f

final class m
    implements Runnable
{

    private final com.b.a.b.f a;
    private final Bitmap b;
    private final h c;
    private final Handler d;

    public m(com.b.a.b.f f1, Bitmap bitmap, h h1, Handler handler)
    {
        a = f1;
        b = bitmap;
        c = h1;
        d = handler;
    }

    public final void run()
    {
        com.b.a.c.c.a("PostProcess image before displaying [%s]", new Object[] {
            c.b
        });
        com.b.a.b.i.a(new b(c.e.p.a(), c, a, f.c), c.e.s, d, a);
    }
}

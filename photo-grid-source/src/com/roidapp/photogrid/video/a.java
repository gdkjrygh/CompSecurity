// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import com.roidapp.baselib.c.t;
import com.roidapp.baselib.e.b;
import java.util.concurrent.AbstractExecutorService;

// Referenced classes of package com.roidapp.photogrid.video:
//            b

public final class a
{

    private b a;
    private com.roidapp.baselib.e.a b;
    private String c;

    public a()
    {
        a = null;
        b = null;
        c = null;
    }

    static b a(a a1)
    {
        return a1.a;
    }

    static String b(a a1)
    {
        return a1.c;
    }

    public final void a()
    {
        if (b != null)
        {
            b.f();
            b = null;
        }
    }

    public final void a(b b1)
    {
        a = b1;
    }

    public final void a(String s, String s1)
    {
        if (b != null)
        {
            return;
        } else
        {
            c = s1;
            b = new com.roidapp.baselib.e.a(s, s1, new com.roidapp.photogrid.video.b(this));
            t.a().execute(b);
            return;
        }
    }
}

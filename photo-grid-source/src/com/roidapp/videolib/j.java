// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib;

import android.os.Handler;
import android.os.Message;
import com.roidapp.videolib.core.a.b;

// Referenced classes of package com.roidapp.videolib:
//            g

final class j
    implements b
{

    final g a;

    j(g g1)
    {
        a = g1;
        super();
    }

    public final void a()
    {
    }

    public final void a(int i, int k)
    {
    }

    public final void a(int i, int k, String s, String s1, String s2)
    {
        s = Message.obtain(g.a(a), 2, s);
        g.a(a).sendMessage(s);
    }

    public final void a(String s)
    {
        g.a(a).sendEmptyMessage(1);
    }

    public final void b()
    {
    }
}

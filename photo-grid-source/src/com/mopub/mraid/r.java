// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.os.Handler;
import android.view.View;

// Referenced classes of package com.mopub.mraid:
//            s

final class r
{

    int a;
    private final View b[];
    private final Handler c;
    private Runnable d;
    private final Runnable e;

    private r(Handler handler, View aview[])
    {
        e = new s(this);
        c = handler;
        b = aview;
    }

    r(Handler handler, View aview[], byte byte0)
    {
        this(handler, aview);
    }

    static View[] a(r r1)
    {
        return r1.b;
    }

    static void b(r r1)
    {
        r1.a = r1.a - 1;
        if (r1.a == 0 && r1.d != null)
        {
            r1.d.run();
            r1.d = null;
        }
    }

    final void a()
    {
        c.removeCallbacks(e);
        d = null;
    }

    final void a(Runnable runnable)
    {
        d = runnable;
        a = b.length;
        c.post(e);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import android.view.View;
import com.kik.g.p;
import com.kik.g.r;

// Referenced classes of package com.kik.sdkutils:
//            h, f, g

final class e extends r
{

    final View a;
    final p b;

    e(View view, p p)
    {
        a = view;
        b = p;
        super();
    }

    public final void a(Object obj)
    {
        a.post(new h(this, obj));
    }

    public final void b()
    {
        a.post(new f(this));
    }

    public final void b(Throwable throwable)
    {
        a.post(new g(this, throwable));
    }
}

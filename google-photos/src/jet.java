// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.view.View;

public final class jet
{

    public jfq a;
    jgf b;
    jgc c;
    jgd d;
    View e;
    public int f;
    private final Handler g = new Handler(Looper.getMainLooper());
    private final Runnable h = new jeu(this);

    public jet()
    {
    }

    public final void a()
    {
        b();
        mk.a(e, h);
    }

    public final void a(jgc jgc, View view, jgf jgf, jgd jgd)
    {
        c = jgc;
        e = view;
        b = jgf;
        d = jgd;
    }

    public final void b()
    {
        g.removeCallbacks(h);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ezy
    implements faz, fbb, fbf, fbj
{

    private Context a;

    public ezy(Context context, fop fop1)
    {
        a = (Context)ctz.a(context);
        ctz.a(fop1);
    }

    private static dnh a(String s, String s1, String s2)
    {
        return new dnh(s, s1, s2);
    }

    public final void a()
    {
        fop.a(a, a("now-playing", "play-button-touched-up-inside", "1.0"));
    }

    public final void b()
    {
        fop.a(a, a("now-playing", "previous-button-touched-up-inside", "1.0"));
    }

    public final void c()
    {
        fop.a(a, a("now-playing", "next-button-touched-up-inside", "1.0"));
    }

    public final void d()
    {
        fop.a(a, a("now-playing", "repeat-button-touched-up-inside", "1.0"));
    }

    public final void e()
    {
        fop.a(a, a("now-playing", "shuffle-button-touched-up-inside", "1.0"));
    }

    public final void f()
    {
        fop.a(a, a("now-playing", "radio-thumb-down-button-touched-up-inside", "1.0"));
    }

    public final void g()
    {
        fop.a(a, a("now-playing", "radio-thumb-up-button-touched-up-inside", "1.0"));
    }

    public final void h()
    {
        fop.a(a, a("now-playing", "skip-15-back-touched-up-inside", "1.0"));
    }

    public final void i()
    {
        fop.a(a, a("now-playing", "skip15-forward-touched-up-inside", "1.0"));
    }

    public final void j()
    {
        fop.a(a, a("now-playing", "collection-button-touched-up-inside", "1.0"));
    }

    public final void k()
    {
        fop.a(a, a("now-playing", "context-menu-button-touched-up-inside", "1.0"));
    }

    public final void l()
    {
        fop.a(a, a("now-playing", "close-button-touched-up-inside", "1.0"));
    }

    public final void m()
    {
        fop.a(a, a("now-playing", "queue-button-touched-up-inside", "1.0"));
    }

    public final void n()
    {
        fop.a(a, a("now-playing", "cover-art-dragged-left", "1.0"));
    }

    public final void o()
    {
        fop.a(a, a("now-playing", "cover-art-dragged-right", "1.0"));
    }
}

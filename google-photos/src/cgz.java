// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.MovieMakerActivity;

public final class cgz extends omp
    implements che, chh
{

    private bss a;

    public cgz()
    {
        (new msi(pwp.P)).a(ae);
        new msh(af, (byte)0);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            a.b();
        }
    }

    public final void l()
    {
        super.l();
        if (MovieMakerActivity.b(this).d != null)
        {
            a = MovieMakerActivity.b(this).d.s;
            a.a(true);
        }
    }

    public final void n()
    {
        a.a(false);
        ((bsx)a.a.b).i(true);
        super.n();
    }

    public final msm r()
    {
        return ((mso)ae.a(mso)).r();
    }

    public final boolean s()
    {
        a.b();
        return false;
    }
}

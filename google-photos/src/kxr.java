// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

public final class kxr
{

    Activity a;
    boolean b;
    boolean c;
    private boolean d;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener e;
    private android.view.ViewTreeObserver.OnScrollChangedListener f;

    public kxr(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        a = activity;
        e = ongloballayoutlistener;
        f = null;
    }

    void a()
    {
        while (a == null || d) 
        {
            return;
        }
        if (e != null)
        {
            jqc.c();
            kwz.a(a, e);
        }
        if (f != null)
        {
            jqc.c();
            kwz.a(a, f);
        }
        d = true;
    }

    void b()
    {
        while (a == null || !d) 
        {
            return;
        }
        if (e != null)
        {
            jqc.e().a(a, e);
        }
        if (f != null)
        {
            jqc.c();
            kwz.b(a, f);
        }
        d = false;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.os.TraceCompat;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.widget:
//            am, bi, an

public abstract class al
{

    private final am a = new am();
    private boolean b;

    public al()
    {
        b = false;
    }

    public abstract int a();

    public int a(int i)
    {
        return 0;
    }

    public abstract bi a(ViewGroup viewgroup, int i);

    public final void a(int i, int j)
    {
        a.a(i, j);
    }

    public final void a(an an)
    {
        a.registerObserver(an);
    }

    public abstract void a(bi bi1, int i);

    public long b(int i)
    {
        return -1L;
    }

    public final void b(int i, int j)
    {
        a.b(i, j);
    }

    public final void b(an an)
    {
        a.unregisterObserver(an);
    }

    public final void b(bi bi1, int i)
    {
        bi1.b = i;
        if (b)
        {
            bi1.d = b(i);
        }
        bi1.a(1, 519);
        TraceCompat.beginSection("RV OnBindView");
        a(bi1, i);
        TraceCompat.endSection();
    }

    public final void c()
    {
        a.a();
    }

    public final void c_(int i)
    {
        a.a(i, 1);
    }

    public final void d(int i)
    {
        a.b(i, 1);
    }

    public final boolean k_()
    {
        return b;
    }
}

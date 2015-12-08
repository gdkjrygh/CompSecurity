// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.ViewGroup;
import au;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class b
{

    public final c a = new <init>();
    boolean b;

    public final void S_()
    {
        if (a.a())
        {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else
        {
            b = true;
            return;
        }
    }

    public int a(int i)
    {
        return 0;
    }

    public abstract b a(ViewGroup viewgroup, int i);

    public final void a(int i, int j)
    {
        a.d(i, j);
    }

    public final void a(d d1)
    {
        a.registerObserver(d1);
    }

    public void a(registerObserver registerobserver)
    {
    }

    public abstract void a(registerObserver registerobserver, int i);

    public void a(RecyclerView recyclerview)
    {
    }

    public abstract int b();

    public long b(int i)
    {
        return -1L;
    }

    public final void b(registerObserver registerobserver)
    {
        a.unregisterObserver(registerobserver);
    }

    public void b(unregisterObserver unregisterobserver)
    {
    }

    public final void b(unregisterObserver unregisterobserver, int i)
    {
        unregisterobserver.b = i;
        if (b)
        {
            unregisterobserver.d = b(i);
        }
        unregisterobserver.a(1, 519);
        au.a("RV OnBindView");
        a(unregisterobserver, i);
        au.a();
    }

    public final void c(int i)
    {
        a.a(i, 1);
    }

    public final void d(int i)
    {
        a.b(i, 1);
    }

    public final void e(int i)
    {
        a.c(i, 1);
    }

    public ()
    {
        b = false;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.os.TraceCompat;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class b
{

    private final a a = new <init>();
    private boolean b;

    public abstract int a();

    public int a(int i)
    {
        return 0;
    }

    public abstract b a(ViewGroup viewgroup, int i);

    public final void a(b b1)
    {
        a.registerObserver(b1);
    }

    public void a(registerObserver registerobserver)
    {
    }

    public abstract void a(registerObserver registerobserver, int i);

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
            unregisterobserver.d = -1L;
        }
        unregisterobserver.a(1, 519);
        TraceCompat.beginSection("RV OnBindView");
        a(unregisterobserver, i);
        TraceCompat.endSection();
    }

    public final boolean b()
    {
        return b;
    }

    public final void c()
    {
        a.a();
    }

    public ()
    {
        b = false;
    }
}

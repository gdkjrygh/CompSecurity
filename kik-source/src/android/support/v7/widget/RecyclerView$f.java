// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView

private final class <init>
    implements a
{

    final RecyclerView a;

    public final void a(a a1)
    {
        a1.a(true);
        if (!RecyclerView.c(a, a1.a) && a1.n())
        {
            a.removeDetachedView(a1.a, false);
        }
    }

    public final void b(a a1)
    {
        a1.a(true);
        if (!c(a1))
        {
            RecyclerView.c(a, a1.a);
        }
    }

    public final void c(a a1)
    {
        a1.a(true);
        if (!c(a1))
        {
            RecyclerView.c(a, a1.a);
        }
    }

    public final void d(a a1)
    {
        a1.a(true);
        if (a1.g != null && a1.h == null)
        {
            a1.g = null;
            a1.a(-65, d(a1));
        }
        a1.h = null;
        if (!c(a1))
        {
            RecyclerView.c(a, a1.a);
        }
    }

    private a(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    a(RecyclerView recyclerview, byte byte0)
    {
        this(recyclerview);
    }
}

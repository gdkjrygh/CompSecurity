// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class <init>
    implements b
{

    private RecyclerView a;

    public final void a(b b1)
    {
        b1.a(true);
        if (!RecyclerView.c(a, b1.a) && b1.p())
        {
            a.removeDetachedView(b1.a, false);
        }
    }

    public final void b(a a1)
    {
        a1.a(true);
        if (!a(a1))
        {
            RecyclerView.c(a, a1.a);
        }
    }

    public final void c(a a1)
    {
        a1.a(true);
        if (!a(a1))
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
            a1.a(-65, a1.i);
        }
        a1.h = null;
        if (!a(a1))
        {
            RecyclerView.c(a, a1.a);
        }
    }

    private b(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    a(RecyclerView recyclerview, byte byte0)
    {
        this(recyclerview);
    }
}

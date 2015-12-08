// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            aq, bi, RecyclerView

final class ar
    implements aq
{

    final RecyclerView a;

    private ar(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    ar(RecyclerView recyclerview, byte byte0)
    {
        this(recyclerview);
    }

    public final void a(bi bi1)
    {
        bi1.a(true);
        if (!RecyclerView.c(a, bi1.a) && bi1.p())
        {
            a.removeDetachedView(bi1.a, false);
        }
    }

    public final void b(bi bi1)
    {
        bi1.a(true);
        if (!bi.c(bi1))
        {
            RecyclerView.c(a, bi1.a);
        }
    }

    public final void c(bi bi1)
    {
        bi1.a(true);
        if (!bi.c(bi1))
        {
            RecyclerView.c(a, bi1.a);
        }
    }

    public final void d(bi bi1)
    {
        bi1.a(true);
        if (bi1.g != null && bi1.h == null)
        {
            bi1.g = null;
            bi1.a(-65, bi.d(bi1));
        }
        bi1.h = null;
        if (!bi.c(bi1))
        {
            RecyclerView.c(a, bi1.a);
        }
    }
}

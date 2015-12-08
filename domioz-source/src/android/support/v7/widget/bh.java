// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            bg, bv, RecyclerView

final class bh
    implements bg
{

    final RecyclerView a;

    private bh(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    bh(RecyclerView recyclerview, byte byte0)
    {
        this(recyclerview);
    }

    public final void a(bv bv1)
    {
        bv1.setIsRecyclable(true);
        if (!RecyclerView.c(a, bv1.itemView) && bv1.isTmpDetached())
        {
            a.removeDetachedView(bv1.itemView, false);
        }
    }

    public final void b(bv bv1)
    {
        bv1.setIsRecyclable(true);
        if (!bv.access$5200(bv1))
        {
            RecyclerView.c(a, bv1.itemView);
        }
    }

    public final void c(bv bv1)
    {
        bv1.setIsRecyclable(true);
        if (!bv.access$5200(bv1))
        {
            RecyclerView.c(a, bv1.itemView);
        }
    }

    public final void d(bv bv1)
    {
        bv1.setIsRecyclable(true);
        if (bv1.mShadowedHolder != null && bv1.mShadowingHolder == null)
        {
            bv1.mShadowedHolder = null;
            bv1.setFlags(-65, bv.access$5300(bv1));
        }
        bv1.mShadowingHolder = null;
        if (!bv.access$5200(bv1))
        {
            RecyclerView.c(a, bv1.itemView);
        }
    }
}

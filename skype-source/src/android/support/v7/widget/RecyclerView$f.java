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
        a1.setIsRecyclable(true);
        if (!RecyclerView.access$5300(a, a1.itemView) && a1.isTmpDetached())
        {
            a.removeDetachedView(a1.itemView, false);
        }
    }

    public final void b(itemView itemview)
    {
        itemview.setIsRecyclable(true);
        if (!access._mth5400(itemview))
        {
            RecyclerView.access$5300(a, itemview.itemView);
        }
    }

    public final void c(itemView itemview)
    {
        itemview.setIsRecyclable(true);
        if (!access._mth5400(itemview))
        {
            RecyclerView.access$5300(a, itemview.itemView);
        }
    }

    public final void d(itemView itemview)
    {
        itemview.setIsRecyclable(true);
        if (itemview.mShadowedHolder != null && itemview.mShadowingHolder == null)
        {
            itemview.mShadowedHolder = null;
            itemview.setFlags(-65, access._mth5500(itemview));
        }
        itemview.mShadowingHolder = null;
        if (!access._mth5400(itemview))
        {
            RecyclerView.access$5300(a, itemview.itemView);
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

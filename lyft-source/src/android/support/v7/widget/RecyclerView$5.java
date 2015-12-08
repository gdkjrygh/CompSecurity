// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView, ChildHelper

class a
    implements allback
{

    final RecyclerView a;

    public ewHolder a(int i)
    {
        ewHolder ewholder;
        for (ewholder = a.findViewHolderForPosition(i, true); ewholder == null || a.mChildHelper.c(ewholder.itemView);)
        {
            return null;
        }

        return ewholder;
    }

    public void a(int i, int j)
    {
        a.offsetPositionRecordsForRemove(i, j, true);
        a.mItemsAddedOrRemoved = true;
        ate.a(a.mState, j);
    }

    public void a(int i, int j, Object obj)
    {
        a.viewRangeUpdate(i, j, obj);
        a.mItemsChanged = true;
    }

    public void a(pdateOp pdateop)
    {
        c(pdateop);
    }

    public void b(int i, int j)
    {
        a.offsetPositionRecordsForRemove(i, j, false);
        a.mItemsAddedOrRemoved = true;
    }

    public void b(pdateOp pdateop)
    {
        c(pdateop);
    }

    public void c(int i, int j)
    {
        a.offsetPositionRecordsForInsert(i, j);
        a.mItemsAddedOrRemoved = true;
    }

    void c(pdateOp pdateop)
    {
        switch (pdateop.a)
        {
        default:
            return;

        case 0: // '\0'
            RecyclerView.access$1300(a).a(a, pdateop.b, pdateop.d);
            return;

        case 1: // '\001'
            RecyclerView.access$1300(a).b(a, pdateop.b, pdateop.d);
            return;

        case 2: // '\002'
            RecyclerView.access$1300(a).a(a, pdateop.b, pdateop.d, pdateop.c);
            return;

        case 3: // '\003'
            RecyclerView.access$1300(a).a(a, pdateop.b, pdateop.d, 1);
            break;
        }
    }

    public void d(int i, int j)
    {
        a.offsetPositionRecordsForMove(i, j);
        a.mItemsAddedOrRemoved = true;
    }

    pdateOp(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }
}

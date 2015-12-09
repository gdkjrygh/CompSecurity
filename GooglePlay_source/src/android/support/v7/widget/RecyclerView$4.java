// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class this._cls0
    implements lback
{

    final RecyclerView this$0;

    public final void addView(View view, int i)
    {
        RecyclerView.this.addView(view, i);
        RecyclerView.access$600(RecyclerView.this, view);
    }

    public final void attachViewToParent(View view, int i, android.view.tParams tparams)
    {
        ewHolder ewholder = RecyclerView.getChildViewHolderInt(view);
        if (ewholder != null)
        {
            if (!ewholder.isTmpDetached() && !ewholder.shouldIgnore())
            {
                throw new IllegalArgumentException((new StringBuilder("Called attach on a child which is not detached: ")).append(ewholder).toString());
            }
            ewholder.clearTmpDetachFlag();
        }
        RecyclerView.access$800(RecyclerView.this, view, i, tparams);
    }

    public final void detachViewFromParent(int i)
    {
        Object obj = getChildAt(i);
        if (obj != null)
        {
            obj = RecyclerView.getChildViewHolderInt(((View) (obj)));
            if (obj != null)
            {
                if (((ewHolder) (obj)).isTmpDetached() && !((ewHolder) (obj)).shouldIgnore())
                {
                    throw new IllegalArgumentException((new StringBuilder("called detach on an already detached child ")).append(obj).toString());
                }
                ((ewHolder) (obj)).addFlags(256);
            }
        }
        RecyclerView.access$900(RecyclerView.this, i);
    }

    public final View getChildAt(int i)
    {
        return RecyclerView.this.getChildAt(i);
    }

    public final int getChildCount()
    {
        return RecyclerView.this.getChildCount();
    }

    public final ewHolder getChildViewHolder(View view)
    {
        return RecyclerView.getChildViewHolderInt(view);
    }

    public final int indexOfChild(View view)
    {
        return RecyclerView.this.indexOfChild(view);
    }

    public final void removeAllViews()
    {
        int j = RecyclerView.this.getChildCount();
        for (int i = 0; i < j; i++)
        {
            RecyclerView.access$700(RecyclerView.this, getChildAt(i));
        }

        RecyclerView.this.removeAllViews();
    }

    public final void removeViewAt(int i)
    {
        View view = RecyclerView.this.getChildAt(i);
        if (view != null)
        {
            RecyclerView.access$700(RecyclerView.this, view);
        }
        RecyclerView.this.removeViewAt(i);
    }

    ewHolder()
    {
        this$0 = RecyclerView.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

class a
    implements lback
{

    final RecyclerView a;

    public int a()
    {
        return a.getChildCount();
    }

    public int a(View view)
    {
        return a.indexOfChild(view);
    }

    public void a(int i)
    {
        View view = a.getChildAt(i);
        if (view != null)
        {
            RecyclerView.access$700(a, view);
        }
        a.removeViewAt(i);
    }

    public void a(View view, int i)
    {
        a.addView(view, i);
        RecyclerView.access$600(a, view);
    }

    public void a(View view, int i, android.view.tParams tparams)
    {
        ewHolder ewholder = RecyclerView.getChildViewHolderInt(view);
        if (ewholder != null)
        {
            if (!ewholder.isTmpDetached() && !ewholder.shouldIgnore())
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Called attach on a child which is not detached: ").append(ewholder).toString());
            }
            ewholder.clearTmpDetachFlag();
        }
        RecyclerView.access$800(a, view, i, tparams);
    }

    public ewHolder b(View view)
    {
        return RecyclerView.getChildViewHolderInt(view);
    }

    public View b(int i)
    {
        return a.getChildAt(i);
    }

    public void b()
    {
        int j = a();
        for (int i = 0; i < j; i++)
        {
            RecyclerView.access$700(a, b(i));
        }

        a.removeAllViews();
    }

    public void c(int i)
    {
        Object obj = b(i);
        if (obj != null)
        {
            obj = RecyclerView.getChildViewHolderInt(((View) (obj)));
            if (obj != null)
            {
                if (((ewHolder) (obj)).isTmpDetached() && !((ewHolder) (obj)).shouldIgnore())
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("called detach on an already detached child ").append(obj).toString());
                }
                ((ewHolder) (obj)).addFlags(256);
            }
        }
        RecyclerView.access$900(a, i);
    }

    public void c(View view)
    {
        view = RecyclerView.getChildViewHolderInt(view);
        if (view != null)
        {
            ewHolder.access._mth1000(view);
        }
    }

    public void d(View view)
    {
        view = RecyclerView.getChildViewHolderInt(view);
        if (view != null)
        {
            ewHolder.access._mth1100(view);
        }
    }

    ewHolder(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.widget.AbsListView;

// Referenced classes of package android.databinding.adapters:
//            AbsListViewBindingAdapter

static final class val.scrollListener
    implements android.widget.
{

    final Scroll val$scrollListener;
    final ScrollStateChanged val$scrollStateListener;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (val$scrollListener != null)
        {
            val$scrollListener.onScroll(abslistview, i, j, k);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (val$scrollStateListener != null)
        {
            val$scrollStateListener.onScrollStateChanged(abslistview, i);
        }
    }

    Scroll(ScrollStateChanged scrollstatechanged, Scroll scroll)
    {
        val$scrollStateListener = scrollstatechanged;
        val$scrollListener = scroll;
        super();
    }
}

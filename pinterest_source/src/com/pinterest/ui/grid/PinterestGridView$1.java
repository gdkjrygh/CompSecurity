// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.view.View;
import android.widget.ScrollView;
import com.pinterest.ui.actions.ScrollableListener;

// Referenced classes of package com.pinterest.ui.grid:
//            PinterestGridView, PinterestAdapterView

class tener extends com.pinterest.ui.scrollview..ScrollViewListener
{

    final PinterestGridView this$0;
    final ScrollableListener val$listener;

    public void onLayout()
    {
        super.onLayout();
        if (val$listener != null && com/pinterest/ui/scrollview/ObservableScrollView$ScrollViewListener.isAssignableFrom(val$listener.getClass()))
        {
            ((com.pinterest.ui.scrollview..ScrollViewListener)val$listener).onLayout();
        }
    }

    public void onMeasure()
    {
        super.onMeasure();
        if (val$listener != null && com/pinterest/ui/scrollview/ObservableScrollView$ScrollViewListener.isAssignableFrom(val$listener.getClass()))
        {
            ((com.pinterest.ui.scrollview..ScrollViewListener)val$listener).onMeasure();
        }
    }

    public void onScroll(View view, int i, int j, int k, int l)
    {
        _adapterVw.onScroll((ScrollView)view, j, l);
        if (val$listener != null)
        {
            val$listener.onScroll(view, i, j, k, l);
        }
    }

    r()
    {
        this$0 = final_pinterestgridview;
        val$listener = ScrollableListener.this;
        super();
    }
}

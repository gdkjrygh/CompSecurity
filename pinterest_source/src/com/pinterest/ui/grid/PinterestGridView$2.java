// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.view.ViewTreeObserver;

// Referenced classes of package com.pinterest.ui.grid:
//            PinterestGridView, PinterestAdapterView

class val.offset
    implements android.view.reDrawListener
{

    final PinterestGridView this$0;
    final float val$offset;

    public boolean onPreDraw()
    {
        int i = (int)(val$offset * (float)_adapterVw.getMeasuredHeight());
        scrollTo(0, i);
        PinterestGridView.access$000(PinterestGridView.this, 0, i, 0, 0);
        getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }

    ()
    {
        this$0 = final_pinterestgridview;
        val$offset = F.this;
        super();
    }
}

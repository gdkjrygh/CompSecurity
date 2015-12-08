// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.view.View;
import com.pinterest.adapter.PinterestBaseAdapter;

// Referenced classes of package com.pinterest.ui.grid:
//            PinterestAdapterView

class val.storyIndex
    implements android.view.erView._cls2
{

    final PinterestAdapterView this$0;
    final int val$storyIndex;

    public void onClick(View view)
    {
        if (PinterestAdapterView.access$200(PinterestAdapterView.this) == null || _adapter == null)
        {
            return;
        } else
        {
            PinterestAdapterView.access$200(PinterestAdapterView.this).onItemClick(PinterestAdapterView.this, view, val$storyIndex, _adapter.getItemId(val$storyIndex));
            return;
        }
    }

    r()
    {
        this$0 = final_pinterestadapterview;
        val$storyIndex = I.this;
        super();
    }
}

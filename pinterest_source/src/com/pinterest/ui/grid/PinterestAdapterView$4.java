// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.view.View;
import com.pinterest.adapter.PinterestBaseAdapter;

// Referenced classes of package com.pinterest.ui.grid:
//            PinterestAdapterView

class this._cls0
    implements android.view.r
{

    final PinterestAdapterView this$0;

    public boolean onLongClick(View view)
    {
        if (PinterestAdapterView.access$600(PinterestAdapterView.this) == null || _adapter == null)
        {
            return false;
        } else
        {
            int i = ((Integer)view.getTag(0x7f0706d9)).intValue();
            return PinterestAdapterView.access$600(PinterestAdapterView.this).onItemLongClick(PinterestAdapterView.this, view, i, _adapter.getItemId(i));
        }
    }

    tener()
    {
        this$0 = PinterestAdapterView.this;
        super();
    }
}

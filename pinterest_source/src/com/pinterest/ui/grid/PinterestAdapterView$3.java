// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.view.View;
import com.pinterest.adapter.PinterestBaseAdapter;

// Referenced classes of package com.pinterest.ui.grid:
//            PinterestAdapterView

class this._cls0
    implements android.view.erView._cls3
{

    final PinterestAdapterView this$0;

    public void onClick(View view)
    {
        if (PinterestAdapterView.access$500(PinterestAdapterView.this) == null || _adapter == null)
        {
            return;
        } else
        {
            int i = ((Integer)view.getTag(0x7f0706d9)).intValue();
            PinterestAdapterView.access$500(PinterestAdapterView.this).onItemClick(PinterestAdapterView.this, view, i, _adapter.getItemId(i));
            return;
        }
    }

    r()
    {
        this$0 = PinterestAdapterView.this;
        super();
    }
}

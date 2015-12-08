// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package org.lucasr.twowayview:
//            ClickItemTouchListener, ItemClickSupport

class this._cls0 extends ClickItemTouchListener
{

    final ItemClickSupport this$0;

    boolean performItemClick(RecyclerView recyclerview, View view, int i, long l)
    {
        boolean flag = false;
        if (ItemClickSupport.access$000(ItemClickSupport.this) != null)
        {
            view.playSoundEffect(0);
            ItemClickSupport.access$000(ItemClickSupport.this).onItemClick(recyclerview, view, i, l);
            flag = true;
        }
        return flag;
    }

    boolean performItemLongClick(RecyclerView recyclerview, View view, int i, long l)
    {
        boolean flag = false;
        if (ItemClickSupport.access$100(ItemClickSupport.this) != null)
        {
            view.performHapticFeedback(0);
            flag = ItemClickSupport.access$100(ItemClickSupport.this).onItemLongClick(recyclerview, view, i, l);
        }
        return flag;
    }

    kListener(RecyclerView recyclerview)
    {
        this$0 = ItemClickSupport.this;
        super(recyclerview);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import aen;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package org.lucasr.twowayview:
//            ClickItemTouchListener, ItemSelectionSupport

class this._cls0 extends ClickItemTouchListener
{

    final ItemSelectionSupport this$0;

    boolean performItemClick(RecyclerView recyclerview, View view, int i, long l)
    {
        boolean flag1;
        flag1 = true;
        recyclerview = ItemSelectionSupport.access$200(ItemSelectionSupport.this).d;
        if (ItemSelectionSupport.access$300(ItemSelectionSupport.this) != TIPLE) goto _L2; else goto _L1
_L1:
        boolean flag2;
        if (!ItemSelectionSupport.access$400(ItemSelectionSupport.this).get(i, false))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ItemSelectionSupport.access$400(ItemSelectionSupport.this).put(i, flag2);
        if (ItemSelectionSupport.access$500(ItemSelectionSupport.this) != null && ((aen) (recyclerview)).b)
        {
            if (flag2)
            {
                ItemSelectionSupport.access$500(ItemSelectionSupport.this).put(recyclerview.b(i), Integer.valueOf(i));
            } else
            {
                ItemSelectionSupport.access$500(ItemSelectionSupport.this).delete(recyclerview.b(i));
            }
        }
        if (flag2)
        {
            ItemSelectionSupport.access$608(ItemSelectionSupport.this);
            i = ((flag1) ? 1 : 0);
        } else
        {
            ItemSelectionSupport.access$610(ItemSelectionSupport.this);
            i = ((flag1) ? 1 : 0);
        }
_L4:
        if (i != 0)
        {
            ItemSelectionSupport.access$700(ItemSelectionSupport.this);
        }
        return false;
_L2:
        if (ItemSelectionSupport.access$300(ItemSelectionSupport.this) == GLE)
        {
            boolean flag;
            if (!ItemSelectionSupport.access$400(ItemSelectionSupport.this).get(i, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                ItemSelectionSupport.access$400(ItemSelectionSupport.this).clear();
                ItemSelectionSupport.access$400(ItemSelectionSupport.this).put(i, true);
                if (ItemSelectionSupport.access$500(ItemSelectionSupport.this) != null && ((aen) (recyclerview)).b)
                {
                    ItemSelectionSupport.access$500(ItemSelectionSupport.this).clear();
                    ItemSelectionSupport.access$500(ItemSelectionSupport.this).put(recyclerview.b(i), Integer.valueOf(i));
                }
                ItemSelectionSupport.access$602(ItemSelectionSupport.this, 1);
                i = ((flag1) ? 1 : 0);
                continue; /* Loop/switch isn't completed */
            }
            if (ItemSelectionSupport.access$400(ItemSelectionSupport.this).size() != 0)
            {
                i = ((flag1) ? 1 : 0);
                if (ItemSelectionSupport.access$400(ItemSelectionSupport.this).valueAt(0))
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            ItemSelectionSupport.access$602(ItemSelectionSupport.this, 0);
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean performItemLongClick(RecyclerView recyclerview, View view, int i, long l)
    {
        return true;
    }

    s(RecyclerView recyclerview)
    {
        this$0 = ItemSelectionSupport.this;
        super(recyclerview);
    }
}

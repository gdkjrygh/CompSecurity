// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.view.View;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardFragment

class val.v
    implements Runnable
{

    final BoardFragment this$0;
    final View val$v;

    public void run()
    {
        int i;
        if (BoardFragment.access$2100(BoardFragment.this) != null)
        {
            if ((i = BoardFragment.access$2200(BoardFragment.this).getHeight() - val$v.getBottom()) > 0)
            {
                val$v.setPadding(val$v.getPaddingLeft(), val$v.getPaddingTop(), val$v.getPaddingRight(), i + val$v.getPaddingBottom());
                return;
            }
        }
    }

    ()
    {
        this$0 = final_boardfragment;
        val$v = View.this;
        super();
    }
}

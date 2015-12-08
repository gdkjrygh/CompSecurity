// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.adapter;

import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;

// Referenced classes of package com.pinterest.activity.sendapin.adapter:
//            PeopleSearchAdapter

class val.showSpinner
    implements Runnable
{

    final PeopleSearchAdapter this$0;
    final boolean val$showSpinner;

    public void run()
    {
        if (val$showSpinner)
        {
            ProgressSpinnerListCell progressspinnerlistcell = PeopleSearchAdapter.access$400(PeopleSearchAdapter.this);
            boolean flag;
            if (getCount() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            progressspinnerlistcell.showSpinner(flag);
            return;
        } else
        {
            PeopleSearchAdapter.access$400(PeopleSearchAdapter.this).hideSpinner();
            return;
        }
    }

    ()
    {
        this$0 = final_peoplesearchadapter;
        val$showSpinner = Z.this;
        super();
    }
}

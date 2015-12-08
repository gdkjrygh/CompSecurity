// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.adapter;

import com.pinterest.activity.task.view.MainViewPager;

// Referenced classes of package com.pinterest.activity.task.adapter:
//            MainViewAdapter

class this._cls0
    implements Runnable
{

    final MainViewAdapter this$0;

    public void run()
    {
        if (MainViewAdapter.access$000(MainViewAdapter.this) != null)
        {
            MainViewAdapter.access$000(MainViewAdapter.this).setEnabled(true);
        }
    }

    ()
    {
        this$0 = MainViewAdapter.this;
        super();
    }
}

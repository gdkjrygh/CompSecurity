// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.activity;

import com.pinterest.activity.task.view.MainViewPager;

// Referenced classes of package com.pinterest.activity.task.activity:
//            MainActivity

class val.page
    implements Runnable
{

    final MainActivity this$0;
    final int val$page;

    public void run()
    {
        if (val$page == MainActivity.access$000(MainActivity.this).getCurrentItem())
        {
            MainActivity.access$000(MainActivity.this).handlePageSelected(val$page);
        }
    }

    _cls9()
    {
        this$0 = final_mainactivity;
        val$page = I.this;
        super();
    }
}

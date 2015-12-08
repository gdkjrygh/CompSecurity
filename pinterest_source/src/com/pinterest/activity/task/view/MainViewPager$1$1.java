// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.view;


// Referenced classes of package com.pinterest.activity.task.view:
//            MainViewPager

class val.position
    implements Runnable
{

    final val.position this$1;
    final int val$position;

    public void run()
    {
        handlePageSelected(val$position);
    }

    ()
    {
        this$1 = final_;
        val$position = I.this;
        super();
    }
}

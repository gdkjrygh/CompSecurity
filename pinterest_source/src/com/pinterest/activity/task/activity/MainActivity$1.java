// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.activity;

import com.pinterest.base.Services;

// Referenced classes of package com.pinterest.activity.task.activity:
//            MainActivity

class this._cls0
    implements Runnable
{

    final MainActivity this$0;

    public void run()
    {
        Services.startDelayedStartupService();
    }

    _cls9()
    {
        this$0 = MainActivity.this;
        super();
    }
}

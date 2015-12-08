// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.model.Navigation;

// Referenced classes of package com.pinterest.activity.create:
//            PinItActivity

class this._cls0
    implements com.pinterest.base.scriber
{

    final PinItActivity this$0;

    public void onEventMainThread(Navigation navigation)
    {
        ActivityHelper.goTask(PinItActivity.this, navigation);
    }

    public void onEventMainThread(com.pinterest.base.dateEvent dateevent)
    {
        FragmentHelper.updateFragmentWidth(PinItActivity.this);
    }

    ()
    {
        this$0 = PinItActivity.this;
        super();
    }
}

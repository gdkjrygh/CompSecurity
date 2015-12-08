// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest.view;

import com.pinterest.api.model.ModelHelper;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.activity.interest.view:
//            FollowInterestButton

class this._cls0 extends BackgroundTask
{

    final FollowInterestButton this$0;

    public void run()
    {
        ModelHelper.setInterest(_interest);
    }

    A()
    {
        this$0 = FollowInterestButton.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.PinFeed;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedMyPinSearchFragment

class this._cls1 extends BackgroundTask
{

    public PinFeed feed;
    final feed this$1;

    public void onFinish()
    {
        super.onFinish();
        Success(feed);
    }

    public void run()
    {
        feed = new PinFeed();
        feed.setItems(ModelHelper.searchUserPins(MyUser.getUid(), _lastQuery));
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

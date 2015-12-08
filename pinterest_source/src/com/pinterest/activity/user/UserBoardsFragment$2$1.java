// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.common.async.BackgroundTask;

class this._cls1 extends BackgroundTask
{

    BoardFeed _feed;
    final ards this$1;

    public void onFinish()
    {
        if (_feed != null && _feed.getAbsCount() > 0)
        {
            _feed.setOffline(true);
            Success(_feed);
        }
    }

    public void run()
    {
        _feed = new BoardFeed();
        _feed.setItems(ModelHelper.getUserSecretBoards(MyUser.getUid()));
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

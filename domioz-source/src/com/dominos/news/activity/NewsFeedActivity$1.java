// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.activity;

import com.dominos.views.ToolBarView;

// Referenced classes of package com.dominos.news.activity:
//            NewsFeedActivity

class this._cls0
    implements com.dominos.loader.etupLoadCallback
{

    final NewsFeedActivity this$0;

    public void onSetupFailure(int i, String s)
    {
    }

    public void onSetupSuccess()
    {
        mTopBarView.setHomeButtonVisibility(0);
    }

    dCallback()
    {
        this$0 = NewsFeedActivity.this;
        super();
    }
}

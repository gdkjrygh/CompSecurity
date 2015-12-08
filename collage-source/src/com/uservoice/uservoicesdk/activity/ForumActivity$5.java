// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.ui.DefaultCallback;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            ForumActivity

class  extends DefaultCallback
{

    final ForumActivity this$0;

    public void onModel(Forum forum)
    {
        Session.getInstance().setForum(forum);
        ForumActivity.access$002(ForumActivity.this, forum);
        setTitle(ForumActivity.access$000(ForumActivity.this).getName());
        getModelAdapter().loadMore();
    }

    public volatile void onModel(Object obj)
    {
        onModel((Forum)obj);
    }

    _cls9(Context context)
    {
        this$0 = ForumActivity.this;
        super(context);
    }
}

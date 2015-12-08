// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            PostIdeaActivity

class this._cls0 extends DefaultCallback
{

    final PostIdeaActivity this$0;

    public void onModel(Forum forum)
    {
        Session.getInstance().setForum(forum);
        PostIdeaActivity.access$001(PostIdeaActivity.this);
    }

    public volatile void onModel(Object obj)
    {
        onModel((Forum)obj);
    }

    (Context context)
    {
        this$0 = PostIdeaActivity.this;
        super(context);
    }
}

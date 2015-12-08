// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import android.os.Bundle;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.ui.DefaultCallback;
import com.uservoice.uservoicesdk.ui.InstantAnswersAdapter;
import com.uservoice.uservoicesdk.ui.PostIdeaAdapter;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            InstantAnswersActivity

public class PostIdeaActivity extends InstantAnswersActivity
{

    public PostIdeaActivity()
    {
    }

    protected InstantAnswersAdapter createAdapter()
    {
        return new PostIdeaAdapter(this);
    }

    protected int getDiscardDialogMessage()
    {
        return com.uservoice.uservoicesdk.R.string.uv_msg_confirm_discard_idea;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(com.uservoice.uservoicesdk.R.string.uv_idea_form_title);
    }

    protected void onInitialize()
    {
        if (Session.getInstance().getForum() != null)
        {
            super.onInitialize();
            return;
        } else
        {
            Forum.loadForum(Session.getInstance().getConfig().getForumId(), new DefaultCallback(this) {

                final PostIdeaActivity this$0;

                public void onModel(Forum forum)
                {
                    Session.getInstance().setForum(forum);
                    onInitialize();
                }

                public volatile void onModel(Object obj)
                {
                    onModel((Forum)obj);
                }

            
            {
                this$0 = PostIdeaActivity.this;
                super(context);
            }
            });
            return;
        }
    }

}

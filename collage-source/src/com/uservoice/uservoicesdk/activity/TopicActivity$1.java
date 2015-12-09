// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Intent;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.Topic;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            TopicActivity

class this._cls0
    implements android.support.v7.app.gationListener
{

    final TopicActivity this$0;

    public boolean onNavigationItemSelected(int i, long l)
    {
        Topic topic = (Topic)Session.getInstance().getTopics().get(i);
        getIntent().putExtra("topic", topic);
        getModelAdapter().reload();
        return true;
    }

    r()
    {
        this$0 = TopicActivity.this;
        super();
    }
}

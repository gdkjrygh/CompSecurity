// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.Topic;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            TopicActivity

class > extends PaginatedAdapter
{

    final TopicActivity this$0;

    protected void customizeLayout(View view, Article article)
    {
        Topic topic = (Topic)getIntent().getParcelableExtra("topic");
        TextView textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.tivity.getIntent);
        view = (TextView)view.findViewById(com.uservoice.uservoicesdk.);
        textview.setText(article.getTitle());
        if (topic.getId() == -1 && article.getTopicName() != null)
        {
            view.setVisibility(0);
            view.setText(article.getTopicName());
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    protected volatile void customizeLayout(View view, Object obj)
    {
        customizeLayout(view, (Article)obj);
    }

    public int getTotalNumberOfObjects()
    {
        Topic topic = (Topic)getIntent().getParcelableExtra("topic");
        if (topic.getId() == -1)
        {
            return -1;
        } else
        {
            return topic.getNumberOfArticles();
        }
    }

    protected void loadPage(int i, Callback callback)
    {
        Topic topic = (Topic)getIntent().getParcelableExtra("topic");
        if (topic.getId() == -1)
        {
            Article.loadPage(i, callback);
            return;
        } else
        {
            Article.loadPageForTopic(topic.getId(), i, callback);
            return;
        }
    }

    _cls9(Context context, int i, List list)
    {
        this$0 = TopicActivity.this;
        super(context, i, list);
    }
}

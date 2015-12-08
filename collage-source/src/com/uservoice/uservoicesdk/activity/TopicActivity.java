// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.Topic;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;
import com.uservoice.uservoicesdk.ui.PaginationScrollListener;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            SearchActivity, ContactActivity, ArticleActivity

public class TopicActivity extends SearchActivity
{

    public TopicActivity()
    {
    }

    public PaginatedAdapter getModelAdapter()
    {
        return (PaginatedAdapter)getListAdapter();
    }

    public void hideSearch()
    {
        super.hideSearch();
        actionBar.setNavigationMode(1);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (Topic)getIntent().getParcelableExtra("topic");
        if (hasActionBar())
        {
            actionBar.setNavigationMode(1);
            ArrayAdapter arrayadapter = new ArrayAdapter(actionBar.getThemedContext(), com.uservoice.uservoicesdk.R.layout.support_simple_spinner_dropdown_item, Session.getInstance().getTopics());
            actionBar.setListNavigationCallbacks(arrayadapter, new android.support.v7.app.ActionBar.OnNavigationListener() {

                final TopicActivity this$0;

                public boolean onNavigationItemSelected(int j, long l)
                {
                    Topic topic = (Topic)Session.getInstance().getTopics().get(j);
                    getIntent().putExtra("topic", topic);
                    getModelAdapter().reload();
                    return true;
                }

            
            {
                this$0 = TopicActivity.this;
                super();
            }
            });
            arrayadapter.setDropDownViewResource(com.uservoice.uservoicesdk.R.layout.support_simple_spinner_dropdown_item);
            for (int i = 0; i < Session.getInstance().getTopics().size(); i++)
            {
                if (((Topic)Session.getInstance().getTopics().get(i)).getId() == bundle.getId())
                {
                    actionBar.setSelectedNavigationItem(i);
                }
            }

        }
        setTitle(null);
        getListView().setDivider(null);
        setListAdapter(new PaginatedAdapter(this, com.uservoice.uservoicesdk.R.layout.uv_text_item, new ArrayList()) {

            final TopicActivity this$0;

            protected void customizeLayout(View view, Article article)
            {
                Topic topic = (Topic)getIntent().getParcelableExtra("topic");
                TextView textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text);
                view = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text2);
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

            protected void loadPage(int j, Callback callback)
            {
                Topic topic = (Topic)getIntent().getParcelableExtra("topic");
                if (topic.getId() == -1)
                {
                    Article.loadPage(j, callback);
                    return;
                } else
                {
                    Article.loadPageForTopic(topic.getId(), j, callback);
                    return;
                }
            }

            
            {
                this$0 = TopicActivity.this;
                super(context, i, list);
            }
        });
        getListView().setOnScrollListener(new PaginationScrollListener(getModelAdapter()));
        getListView().setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final TopicActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                adapterview = (Article)getListAdapter().getItem(j);
                view = new Intent(TopicActivity.this, com/uservoice/uservoicesdk/activity/ArticleActivity);
                view.putExtra("article", adapterview);
                startActivity(view);
            }

            
            {
                this$0 = TopicActivity.this;
                super();
            }
        });
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_TOPIC, bundle.getId());
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.uservoice.uservoicesdk.R.menu.uv_portal, menu);
        setupScopedSearch(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.uservoice.uservoicesdk.R.id.uv_action_contact)
        {
            startActivity(new Intent(this, com/uservoice/uservoicesdk/activity/ContactActivity));
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }
}

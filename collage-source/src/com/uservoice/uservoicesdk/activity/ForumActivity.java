// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.dialog.SuggestionDialogFragment;
import com.uservoice.uservoicesdk.flow.InitManager;
import com.uservoice.uservoicesdk.model.ClientConfig;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTask;
import com.uservoice.uservoicesdk.ui.DefaultCallback;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;
import com.uservoice.uservoicesdk.ui.PaginationScrollListener;
import com.uservoice.uservoicesdk.ui.SearchAdapter;
import com.uservoice.uservoicesdk.ui.SearchExpandListener;
import com.uservoice.uservoicesdk.ui.SearchQueryListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            SearchActivity, PostIdeaActivity

public class ForumActivity extends SearchActivity
{

    private Forum forum;

    public ForumActivity()
    {
    }

    private void loadForum()
    {
        if (Session.getInstance().getForum() != null)
        {
            forum = Session.getInstance().getForum();
            Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_FORUM, forum.getId());
            setTitle(forum.getName());
            getModelAdapter().loadMore();
            return;
        } else
        {
            Forum.loadForum(Session.getInstance().getConfig().getForumId(), new DefaultCallback(this) {

                final ForumActivity this$0;

                public void onModel(Forum forum1)
                {
                    Session.getInstance().setForum(forum1);
                    forum = forum1;
                    setTitle(forum.getName());
                    getModelAdapter().loadMore();
                }

                public volatile void onModel(Object obj)
                {
                    onModel((Forum)obj);
                }

            
            {
                this$0 = ForumActivity.this;
                super(context);
            }
            });
            return;
        }
    }

    public PaginatedAdapter getModelAdapter()
    {
        return (PaginatedAdapter)getListAdapter();
    }

    public SearchAdapter getSearchAdapter()
    {
        return getModelAdapter();
    }

    public void hideSearch()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(com.uservoice.uservoicesdk.R.string.uv_feedback_forum);
        bundle = new ArrayList();
        getListView().setDivider(null);
        setListAdapter(new PaginatedAdapter(this, com.uservoice.uservoicesdk.R.layout.uv_suggestion_item, bundle) {

            boolean initializing;
            List staticRows;
            final ForumActivity this$0;

            private void computeStaticRows()
            {
                if (staticRows == null)
                {
                    staticRows = new ArrayList();
                    if (Session.getInstance().getConfig().shouldShowPostIdea())
                    {
                        staticRows.add(Integer.valueOf(2));
                    }
                    staticRows.add(Integer.valueOf(3));
                }
            }

            protected void customizeLayout(View view, Suggestion suggestion)
            {
                ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_suggestion_title)).setText(suggestion.getTitle());
                TextView textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_subscriber_count);
                if (Session.getInstance().getClientConfig().shouldDisplaySuggestionsByRank())
                {
                    textview.setText(suggestion.getRankString());
                } else
                {
                    textview.setText(String.valueOf(suggestion.getNumberOfSubscribers()));
                }
                textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_suggestion_status);
                view = view.findViewById(com.uservoice.uservoicesdk.R.id.uv_suggestion_status_color);
                if (suggestion.getStatus() == null)
                {
                    textview.setVisibility(8);
                    view.setVisibility(8);
                    return;
                } else
                {
                    int i = Color.parseColor(suggestion.getStatusColor());
                    textview.setVisibility(0);
                    textview.setTextColor(i);
                    textview.setText(suggestion.getStatus().toUpperCase(Locale.getDefault()));
                    view.setVisibility(0);
                    view.setBackgroundColor(i);
                    return;
                }
            }

            protected volatile void customizeLayout(View view, Object obj)
            {
                customizeLayout(view, (Suggestion)obj);
            }

            public int getCount()
            {
                computeStaticRows();
                int j = super.getCount();
                int k = staticRows.size();
                int i;
                if (initializing)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                return i + (k + j);
            }

            public Object getItem(int i)
            {
                computeStaticRows();
                return super.getItem(i - staticRows.size());
            }

            public int getItemViewType(int i)
            {
                computeStaticRows();
                if (i < staticRows.size())
                {
                    return ((Integer)staticRows.get(i)).intValue();
                }
                if (i == staticRows.size() && initializing)
                {
                    return 1;
                } else
                {
                    return super.getItemViewType(i - staticRows.size());
                }
            }

            public int getTotalNumberOfObjects()
            {
                return forum.getNumberOfOpenSuggestions();
            }

            public View getView(int i, View view, ViewGroup viewgroup)
            {
label0:
                {
label1:
                    {
                        int j = getItemViewType(i);
                        if (j != 2 && j != 3)
                        {
                            break label0;
                        }
                        viewgroup = view;
                        if (view == null)
                        {
                            if (j != 2)
                            {
                                break label1;
                            }
                            viewgroup = getLayoutInflater().inflate(com.uservoice.uservoicesdk.R.layout.uv_text_item, null);
                            ((TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(com.uservoice.uservoicesdk.R.string.uv_post_an_idea);
                            viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_divider).setVisibility(8);
                            viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text2).setVisibility(8);
                        }
                        return viewgroup;
                    }
                    view = getLayoutInflater().inflate(com.uservoice.uservoicesdk.R.layout.uv_header_item_light, null);
                    ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text)).setText(com.uservoice.uservoicesdk.R.string.uv_idea_text_heading);
                    return view;
                }
                return super.getView(i, view, viewgroup);
            }

            public int getViewTypeCount()
            {
                return super.getViewTypeCount() + 2;
            }

            public boolean isEnabled(int i)
            {
                return getItemViewType(i) == 2 || super.isEnabled(i);
            }

            public void loadMore()
            {
                if (initializing)
                {
                    notifyDataSetChanged();
                }
                initializing = false;
                super.loadMore();
            }

            public void loadPage(int i, Callback callback)
            {
                Suggestion.loadSuggestions(forum, i, callback);
            }

            public RestTask search(String s, Callback callback)
            {
            /* block-local class not found */
            class _cls1 {}

                if (forum == null)
                {
                    return null;
                } else
                {
                    return Suggestion.searchSuggestions(forum, s, new _cls1(s, callback));
                }
            }

            
            {
                this$0 = ForumActivity.this;
                super(context, i, list);
                initializing = true;
            }
        });
        getListView().setOnScrollListener(new PaginationScrollListener(getModelAdapter()) {

            final ForumActivity this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                if (forum != null)
                {
                    super.onScroll(abslistview, i, j, k);
                }
            }

            
            {
                this$0 = ForumActivity.this;
                super(paginatedadapter);
            }
        });
        getListView().setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final ForumActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (i == 0)
                {
                    startActivity(new Intent(ForumActivity.this, com/uservoice/uservoicesdk/activity/PostIdeaActivity));
                } else
                if (i != 1)
                {
                    (new SuggestionDialogFragment((Suggestion)getModelAdapter().getItem(i), null)).show(getSupportFragmentManager(), "SuggestionDialogFragment");
                    return;
                }
            }

            
            {
                this$0 = ForumActivity.this;
                super();
            }
        });
        (new InitManager(this, new Runnable() {

            final ForumActivity this$0;

            public void run()
            {
                loadForum();
            /* block-local class not found */
            class _cls1 {}

                Session.getInstance().setSignInListener(new _cls1());
            }

            
            {
                this$0 = ForumActivity.this;
                super();
            }
        })).init();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.uservoice.uservoicesdk.R.menu.uv_forum, menu);
        MenuItem menuitem = menu.findItem(com.uservoice.uservoicesdk.R.id.uv_menu_search);
        if (hasActionBar())
        {
            MenuItemCompat.setOnActionExpandListener(menuitem, new SearchExpandListener(this));
            ((SearchView)MenuItemCompat.getActionView(menuitem)).setOnQueryTextListener(new SearchQueryListener(this));
        } else
        {
            menuitem.setVisible(false);
        }
        menu.findItem(com.uservoice.uservoicesdk.R.id.uv_new_idea).setVisible(Session.getInstance().getConfig().shouldShowPostIdea());
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.uservoice.uservoicesdk.R.id.uv_new_idea)
        {
            startActivity(new Intent(this, com/uservoice/uservoicesdk/activity/PostIdeaActivity));
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onStop()
    {
        Session.getInstance().setSignInListener(null);
        super.onStop();
    }

    public void showSearch()
    {
    }

    public void suggestionUpdated(Suggestion suggestion)
    {
        getModelAdapter().notifyDataSetChanged();
    }



/*
    static Forum access$002(ForumActivity forumactivity, Forum forum1)
    {
        forumactivity.forum = forum1;
        return forum1;
    }

*/

}

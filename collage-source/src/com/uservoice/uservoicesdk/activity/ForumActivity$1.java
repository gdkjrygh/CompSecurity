// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.ClientConfig;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTask;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            ForumActivity

class initializing extends PaginatedAdapter
{

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
        ((TextView)view.findViewById(com.uservoice.uservoicesdk.on_title)).setText(suggestion.getTitle());
        TextView textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.er_count);
        if (Session.getInstance().getClientConfig().shouldDisplaySuggestionsByRank())
        {
            textview.setText(suggestion.getRankString());
        } else
        {
            textview.setText(String.valueOf(suggestion.getNumberOfSubscribers()));
        }
        textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.on_status);
        view = view.findViewById(com.uservoice.uservoicesdk.on_status_color);
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
        return ForumActivity.access$000(ForumActivity.this).getNumberOfOpenSuggestions();
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
                    viewgroup = getLayoutInflater().inflate(com.uservoice.uservoicesdk._item, null);
                    ((TextView)viewgroup.findViewById(com.uservoice.uservoicesdk._item)).setText(com.uservoice.uservoicesdk._an_idea);
                    viewgroup.findViewById(com.uservoice.uservoicesdk._an_idea).setVisibility(8);
                    viewgroup.findViewById(com.uservoice.uservoicesdk._an_idea).setVisibility(8);
                }
                return viewgroup;
            }
            view = getLayoutInflater().inflate(com.uservoice.uservoicesdk.er_item_light, null);
            ((TextView)view.findViewById(com.uservoice.uservoicesdk.ext)).setText(com.uservoice.uservoicesdk._text_heading);
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
        Suggestion.loadSuggestions(ForumActivity.access$000(ForumActivity.this), i, callback);
    }

    public RestTask search(String s, Callback callback)
    {
    /* block-local class not found */
    class _cls1 {}

        if (ForumActivity.access$000(ForumActivity.this) == null)
        {
            return null;
        } else
        {
            return Suggestion.searchSuggestions(ForumActivity.access$000(ForumActivity.this), s, new _cls1(s, callback));
        }
    }

    _cls1(Context context, int i, List list)
    {
        this$0 = ForumActivity.this;
        super(context, i, list);
        initializing = true;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.atmention;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.pinterest.api.model.AtMention;
import com.pinterest.ui.ViewHelper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.ui.atmention:
//            AtMentionListCell

public class AtMentionAdapter extends BaseAdapter
    implements Filterable
{

    private List _dataSource;
    private AtMentionFilter _filter;
    private LayoutInflater _inflater;

    public AtMentionAdapter()
    {
        _dataSource = new ArrayList();
        _filter = new AtMentionFilter(null);
    }

    public int getCount()
    {
        return _dataSource.size();
    }

    public Filter getFilter()
    {
        return _filter;
    }

    protected LayoutInflater getInflater(View view, View view1)
    {
        if (_inflater == null)
        {
            _inflater = LayoutInflater.from(ViewHelper.getContext(view, view1));
        }
        return _inflater;
    }

    public AtMention getItem(int i)
    {
        return (AtMention)_dataSource.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof AtMentionListCell))
        {
            view = (AtMentionListCell)getInflater(view, viewgroup).inflate(0x7f03013b, null);
        } else
        {
            view = (AtMentionListCell)view;
        }
        view.setAtMention(getItem(i));
        return view;
    }

    public void replaceAll(List list)
    {
        _dataSource = list;
        notifyDataSetChanged();
    }


    private class AtMentionFilter extends Filter
    {

        final AtMentionAdapter this$0;

        public CharSequence convertResultToString(Object obj)
        {
            return ((AtMention)obj).getUsername();
        }

        protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
        {
            charsequence = new android.widget.Filter.FilterResults();
            charsequence.values = _dataSource;
            charsequence.count = _dataSource.size();
            return charsequence;
        }

        protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
        {
        }

        private AtMentionFilter()
        {
            this$0 = AtMentionAdapter.this;
            super();
        }

        AtMentionFilter(_cls1 _pcls1)
        {
            this();
        }
    }

}

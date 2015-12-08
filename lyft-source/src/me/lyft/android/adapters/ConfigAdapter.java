// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.adapters;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.infrastructure.s3.ConfigDTO;

public class ConfigAdapter extends ArrayAdapter
{

    private List configs;
    private List filteredConfigs;

    public ConfigAdapter(Context context, int i, List list)
    {
        super(context, i, list);
        configs = list;
        filteredConfigs = list;
    }

    public int getCount()
    {
        return filteredConfigs.size();
    }

    public Filter getFilter()
    {
        return new Filter() {

            final ConfigAdapter this$0;

            protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
            {
                ArrayList arraylist = new ArrayList();
                Iterator iterator = configs.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    ConfigDTO configdto = (ConfigDTO)iterator.next();
                    if (configdto.getDisplayName().toLowerCase().contains(charsequence.toString().toLowerCase()))
                    {
                        arraylist.add(configdto);
                    }
                } while (true);
                charsequence = new android.widget.Filter.FilterResults();
                charsequence.count = arraylist.size();
                charsequence.values = arraylist;
                return charsequence;
            }

            protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
            {
                filteredConfigs = (List)filterresults.values;
                notifyDataSetChanged();
            }

            
            {
                this$0 = ConfigAdapter.this;
                super();
            }
        };
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public ConfigDTO getItem(int i)
    {
        return (ConfigDTO)filteredConfigs.get(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)super.getView(i, view, viewgroup);
        viewgroup = (ConfigDTO)filteredConfigs.get(i);
        view.setText(Html.fromHtml(getContext().getString(0x7f070118, new Object[] {
            viewgroup.getDisplayName(), viewgroup.getUrl()
        })));
        return view;
    }



/*
    static List access$102(ConfigAdapter configadapter, List list)
    {
        configadapter.filteredConfigs = list;
        return list;
    }

*/
}

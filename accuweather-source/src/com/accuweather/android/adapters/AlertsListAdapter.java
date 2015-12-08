// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.accuweather.android.models.alert.AlertModel;
import com.accuweather.android.utilities.Logger;
import java.util.ArrayList;
import java.util.List;

public class AlertsListAdapter extends ArrayAdapter
{
    public static class ViewHolder
    {

        TextView alert_description;
        TextView area_tv;
        TextView text_tv;
        TextView time_tv;

        public ViewHolder()
        {
        }
    }


    private List mAlertsList;
    private Context mContext;

    public AlertsListAdapter(Context context, int i, List list)
    {
        super(context, com.accuweather.android.R.layout.alerts_list, list);
        mAlertsList = new ArrayList();
        mAlertsList = list;
        mContext = context;
    }

    public String buildHtmlAreaString(List list, int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int j = 0; j < ((AlertModel)list.get(i)).getAlertAreas().size(); j++)
        {
            stringbuilder.append("<font>").append(((com.accuweather.android.models.alert.AlertModel.AreaModel)((AlertModel)list.get(i)).getAlertAreas().get(j)).getName()).append("</font><br/><font>").append(((com.accuweather.android.models.alert.AlertModel.AreaModel)((AlertModel)list.get(i)).getAlertAreas().get(j)).getEndTime()).append("</font><br/><font>").append(((com.accuweather.android.models.alert.AlertModel.AreaModel)((AlertModel)list.get(i)).getAlertAreas().get(j)).getAlertText()).append("</font><br/><br/>");
        }

        return stringbuilder.toString();
    }

    public int getCount()
    {
        Logger.i(this, (new StringBuilder()).append("getCount = ").append(mAlertsList.size()).toString());
        return mAlertsList.size();
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        LayoutInflater layoutinflater = (LayoutInflater)mContext.getSystemService("layout_inflater");
        View view1 = view;
        ViewHolder viewholder = new ViewHolder();
        if (view == null)
        {
            view1 = layoutinflater.inflate(com.accuweather.android.R.layout.alert_item, viewgroup, false);
            viewholder.alert_description = (TextView)view1.findViewById(com.accuweather.android.R.id.alert_description);
            viewholder.area_tv = (TextView)view1.findViewById(com.accuweather.android.R.id.alert_area);
            view1.setTag(viewholder);
            view = viewholder;
        } else
        {
            view = (ViewHolder)view1.getTag();
        }
        ((ViewHolder) (view)).alert_description.setText(((AlertModel)mAlertsList.get(i)).getAlertDescription());
        ((ViewHolder) (view)).area_tv.setText(Html.fromHtml(buildHtmlAreaString(mAlertsList, i)));
        return view1;
    }

    public void updateAdapter(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            mAlertsList = (ArrayList)arraylist.clone();
        }
        notifyDataSetChanged();
    }
}

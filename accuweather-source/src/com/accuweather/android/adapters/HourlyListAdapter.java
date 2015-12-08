// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.hourly.HourlyResult;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.GuiUtils;
import com.accuweather.android.utilities.StringUtils;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.Utilities;
import java.util.ArrayList;
import java.util.List;

public class HourlyListAdapter extends BaseAdapter
{
    public static interface IHourlyListListener
    {

        public abstract void onHourlySelected(int i);
    }


    private List hourlyTitles;
    private Context mContext;
    private HourlyResults mHourlyList;
    private LayoutInflater mInflater;

    public HourlyListAdapter(Context context, WeatherDataModel weatherdatamodel)
    {
        mHourlyList = new HourlyResults();
        hourlyTitles = new ArrayList();
        mContext = context;
        if (weatherdatamodel != null)
        {
            mHourlyList.addAll(weatherdatamodel.getCappedHourlyModels());
            hourlyTitles.addAll(buildHourlyTitles(context, weatherdatamodel));
        }
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    private List buildHourlyTitles(Context context, WeatherDataModel weatherdatamodel)
    {
        return GuiUtils.buildHourlyTitles(UserPreferences.isTwelveHourFormat(context), context, weatherdatamodel);
    }

    private String buildTimeText(String s)
    {
        return (new StringBuilder()).append("<bold>").append(s).append("</bold>").toString();
    }

    private String getTemperatureText(Context context, HourlyResult hourlyresult)
    {
        if (hourlyresult.getTemperature() != null && hourlyresult.getTemperature().getValue() != null)
        {
            return (new StringBuilder()).append(hourlyresult.getTemperature().getValue().intValue()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    private void updateView(View view, HourlyResult hourlyresult, String s)
    {
        ((TextView)view.findViewById(com.accuweather.android.R.id.time)).setText(Html.fromHtml(buildTimeText(s)));
        ((TextView)view.findViewById(com.accuweather.android.R.id.short_text)).setText(hourlyresult.getIconPhrase());
        ((TextView)view.findViewById(com.accuweather.android.R.id.temperature)).setText(Html.fromHtml(getTemperatureText(view.getContext(), hourlyresult)));
        ((ImageView)view.findViewById(com.accuweather.android.R.id.icon)).setImageDrawable(getWeatherIconDrawable(hourlyresult));
        setTypeFaces(view);
    }

    public int getCount()
    {
        return mHourlyList.size();
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
        viewgroup = view;
        if (view == null)
        {
            viewgroup = mInflater.inflate(setContentView(), null);
        }
        if (i >= mHourlyList.size())
        {
            return viewgroup;
        } else
        {
            updateView(viewgroup, (HourlyResult)mHourlyList.get(i), (String)hourlyTitles.get(i));
            return viewgroup;
        }
    }

    protected Drawable getWeatherIconDrawable(HourlyResult hourlyresult)
    {
        return Utilities.getImageDrawable((new StringBuilder()).append("icon_").append(StringUtils.padLeft(hourlyresult.getWeatherIcon(), '0', 2)).toString(), mContext);
    }

    protected int setContentView()
    {
        return com.accuweather.android.R.layout.hourly_item;
    }

    protected void setTypeFaces(View view)
    {
        ((TextView)view.findViewById(com.accuweather.android.R.id.time)).setTypeface(Data.getRobotoCondensed());
        ((TextView)view.findViewById(com.accuweather.android.R.id.short_text)).setTypeface(Data.getRobotoBoldCondensed());
        ((TextView)view.findViewById(com.accuweather.android.R.id.temperature)).setTypeface(Data.getRobotoLight());
    }

    public void updateAdapter(WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel == null)
        {
            throw new IllegalArgumentException("The WeatherDataModel cannot be null.");
        } else
        {
            mHourlyList = weatherdatamodel.getCappedHourlyModels();
            hourlyTitles = buildHourlyTitles(mContext, weatherdatamodel);
            notifyDataSetChanged();
            return;
        }
    }
}

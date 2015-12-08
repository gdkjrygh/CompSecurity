// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.utilities.Alarms;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.StringUtils;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.Utilities;
import java.util.List;

public class DailyListAdapter extends BaseAdapter
{

    private Context context;
    private ForecastResult forecastResult;
    private LayoutInflater inflater;

    public DailyListAdapter(Context context1, ForecastResult forecastresult)
    {
        forecastResult = new ForecastResult();
        forecastResult = forecastresult;
        context = context1;
        inflater = (LayoutInflater)context1.getSystemService("layout_inflater");
    }

    private String getHighTemperatureText(DailyForecast dailyforecast)
    {
        if (dailyforecast.getHighTemperature() != null)
        {
            return (new StringBuilder()).append(dailyforecast.getHighTemperature().intValue()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    private String getLowTemperatureText(DailyForecast dailyforecast)
    {
        if (dailyforecast.getLowTemperature() != null)
        {
            return (new StringBuilder()).append(dailyforecast.getLowTemperature().intValue()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    public int getCount()
    {
        return forecastResult.getDailyForecasts().size();
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
        if (view == null)
        {
            view = inflater.inflate(com.accuweather.android.R.layout.daily_item, null);
        }
        viewgroup = (DailyForecast)forecastResult.getDailyForecasts().get(i);
        int j = UserPreferences.getMetricIntPreference(context);
        boolean flag = (new Alarms()).hasAlarm(viewgroup, Integer.valueOf(j), i);
        Object obj = (ImageView)view.findViewById(com.accuweather.android.R.id.alarmIcon);
        if (flag)
        {
            ((ImageView) (obj)).setVisibility(0);
        } else
        {
            ((ImageView) (obj)).setVisibility(8);
        }
        obj = DateUtils.toFullDayName(viewgroup.getDate(), context.getResources().getConfiguration().locale);
        obj = (new StringBuilder()).append(((String) (obj))).append(" ").append(DateUtils.toUserPreferredDate(viewgroup.getDate(), context)).toString().toUpperCase(context.getResources().getConfiguration().locale);
        ((TextView)view.findViewById(com.accuweather.android.R.id.day_date)).setText(((CharSequence) (obj)));
        ((TextView)view.findViewById(com.accuweather.android.R.id.short_text)).setText(viewgroup.getDay().getIconPhrase());
        ((TextView)view.findViewById(com.accuweather.android.R.id.temperature)).setText(Html.fromHtml((new StringBuilder()).append(getHighTemperatureText(viewgroup)).append("/").append(getLowTemperatureText(viewgroup)).toString()));
        viewgroup = StringUtils.padLeft((new StringBuilder()).append(viewgroup.getDay().getIcon()).append("").toString(), '0', 2);
        ((ImageView)view.findViewById(com.accuweather.android.R.id.icon)).setImageResource(Utilities.getDrawableId((new StringBuilder()).append("icon_").append(viewgroup).toString()));
        setTypeFaces(view);
        return view;
    }

    protected void setTypeFaces(View view)
    {
        ((TextView)view.findViewById(com.accuweather.android.R.id.day_date)).setTypeface(Data.getRobotoCondensed());
        ((TextView)view.findViewById(com.accuweather.android.R.id.short_text)).setTypeface(Data.getRobotoBoldCondensed());
        ((TextView)view.findViewById(com.accuweather.android.R.id.temperature)).setTypeface(Data.getRobotoLight());
    }

    public void updateAdapter(ForecastResult forecastresult)
    {
        if (forecastresult != null)
        {
            forecastResult = forecastresult;
        }
        notifyDataSetChanged();
    }
}

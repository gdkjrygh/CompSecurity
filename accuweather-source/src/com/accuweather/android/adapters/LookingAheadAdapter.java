// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.FontUtils;
import com.accuweather.android.utilities.StringUtils;
import com.accuweather.android.utilities.Utilities;
import java.util.ArrayList;
import java.util.List;

public class LookingAheadAdapter extends BaseAdapter
{

    private Context mContext;
    private List mDailyForecastsForLfs;

    public LookingAheadAdapter(Context context)
    {
        mDailyForecastsForLfs = new ArrayList();
        mContext = context;
    }

    private String getDateForDisplay(DailyForecast dailyforecast)
    {
        java.util.Locale locale = mContext.getResources().getConfiguration().locale;
        String s = DateUtils.toFullDayName(dailyforecast.getDate(), locale);
        return (new StringBuilder()).append(s).append(" ").append(DateUtils.toUserPreferredDate(dailyforecast.getDate(), mContext)).toString().toUpperCase(locale);
    }

    public int getCount()
    {
        return mDailyForecastsForLfs.size();
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
        if (mContext == null)
        {
            return viewgroup;
        }
        if (view == null)
        {
            viewgroup = LayoutInflater.from(mContext).inflate(com.accuweather.android.R.layout.now_looking_ahead_list_item, null);
        }
        if (i < mDailyForecastsForLfs.size())
        {
            view = (DailyForecast)mDailyForecastsForLfs.get(i);
            Object obj = StringUtils.padLeft((new StringBuilder()).append(view.getDay().getIcon()).append("").toString(), '0', 2);
            ((ImageView)viewgroup.findViewById(com.accuweather.android.R.id.forecastIcon)).setImageResource(Utilities.getDrawableId((new StringBuilder()).append("icon_").append(((String) (obj))).toString()));
            obj = (TextView)viewgroup.findViewById(com.accuweather.android.R.id.dateTextView);
            ((TextView) (obj)).setText(getDateForDisplay(view));
            TextView textview = (TextView)viewgroup.findViewById(com.accuweather.android.R.id.forecastTextView);
            if (view.getDay() != null)
            {
                textview.setText(view.getDay().getShortPhrase());
            } else
            {
                textview.setText(mContext.getString(com.accuweather.android.R.string.NA));
            }
            ((TextView) (obj)).setTypeface(FontUtils.getRobotoCondensed(mContext));
            textview.setTypeface(FontUtils.getRobotoCondensed(mContext));
        }
        return viewgroup;
    }

    public void setDailyForecastsForLfs(List list)
    {
        if (!list.equals(mDailyForecastsForLfs))
        {
            mDailyForecastsForLfs = list;
            notifyDataSetChanged();
        }
    }
}

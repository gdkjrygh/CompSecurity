// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.models.MultilineItem;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.utilities.Alarms;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.UserPreferences;
import java.util.ArrayList;
import java.util.List;

public class NavigationDrawerListAdapter extends BaseAdapter
{
    public static interface INavigationDrawerListListener
    {

        public abstract void onNavigationDrawerItemSelected(int i);
    }


    private static final int DAILY_ITEM_DRAWER_INDEX = 2;
    private static final int MAX_ALARM_DAYS_OUT = 3;
    private static final int NOW_ITEM_DRAWER_INDEX = 0;
    private Context mContext;
    private float mDpi;
    private LayoutInflater mInflater;
    private List mItems;
    private INavigationDrawerListListener mListener;

    public NavigationDrawerListAdapter(Context context, List list)
    {
        mItems = new ArrayList();
        mDpi = 1.0F;
        mItems = list;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        mDpi = context.getResources().getDisplayMetrics().density;
        mContext = context;
    }

    private boolean hasAlarm()
    {
        Object obj = Data.getInstance(mContext).getCurrentlyViewedWeatherDataModel();
        if (obj != null)
        {
            obj = ((WeatherDataModel) (obj)).getForecast();
            int j = UserPreferences.getMetricIntPreference(mContext);
            Alarms alarms = new Alarms();
            for (int i = 0; i < 3 && i < ((ForecastResult) (obj)).getDailyForecasts().size(); i++)
            {
                if (alarms.hasAlarm((DailyForecast)((ForecastResult) (obj)).getDailyForecasts().get(i), Integer.valueOf(j), i))
                {
                    return true;
                }
            }

        }
        return false;
    }

    private void setTypeFaces(View view)
    {
        ((TextView)view.findViewById(com.accuweather.android.R.id.title)).setTypeface(Data.getRobotoCondensed());
        ((TextView)view.findViewById(com.accuweather.android.R.id.subtitle)).setTypeface(Data.getRobotoNormal());
    }

    private void updateAlarmIconVisibility(int i, View view)
    {
label0:
        {
            ((ImageView)view.findViewById(com.accuweather.android.R.id.alarmIcon)).setVisibility(8);
            if (i == 2)
            {
                if (!hasAlarm())
                {
                    break label0;
                }
                ((ImageView)view.findViewById(com.accuweather.android.R.id.alarmIcon)).setVisibility(0);
            }
            return;
        }
        ((ImageView)view.findViewById(com.accuweather.android.R.id.alarmIcon)).setVisibility(8);
    }

    private void updateAlertIconVisibility(int i, View view)
    {
label0:
        {
            ((ImageView)view.findViewById(com.accuweather.android.R.id.alertIcon)).setVisibility(8);
            WeatherDataModel weatherdatamodel = Data.getInstance(mContext).getCurrentlyViewedWeatherDataModel();
            if (weatherdatamodel != null && i == 0)
            {
                if (!weatherdatamodel.getAlertIsActive())
                {
                    break label0;
                }
                ((ImageView)view.findViewById(com.accuweather.android.R.id.alertIcon)).setVisibility(0);
            }
            return;
        }
        ((ImageView)view.findViewById(com.accuweather.android.R.id.alertIcon)).setVisibility(8);
    }

    private void updateSubtitleVisibility(MultilineItem multilineitem, View view)
    {
        if (TextUtils.isEmpty(multilineitem.getSubtitle()))
        {
            ((TextView)view.findViewById(com.accuweather.android.R.id.subtitle)).setVisibility(8);
            return;
        } else
        {
            ((TextView)view.findViewById(com.accuweather.android.R.id.subtitle)).setVisibility(0);
            return;
        }
    }

    public int getCount()
    {
        return mItems.size();
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(final int position, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = mInflater.inflate(com.accuweather.android.R.layout.navigation_drawer_item, null);
            view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, (int)(52F * mDpi)));
        }
        viewgroup = (MultilineItem)mItems.get(position);
        ((TextView)view.findViewById(com.accuweather.android.R.id.title)).setText(viewgroup.getTitle());
        ((TextView)view.findViewById(com.accuweather.android.R.id.subtitle)).setText(viewgroup.getSubtitle());
        updateAlertIconVisibility(position, view);
        updateAlarmIconVisibility(position, view);
        updateSubtitleVisibility(viewgroup, view);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final NavigationDrawerListAdapter this$0;
            final int val$position;

            public void onClick(View view1)
            {
                mListener.onNavigationDrawerItemSelected(position);
            }

            
            {
                this$0 = NavigationDrawerListAdapter.this;
                position = i;
                super();
            }
        });
        view.setBackgroundResource(com.accuweather.android.R.drawable.abs__list_selector_holo_dark);
        setTypeFaces(view);
        return view;
    }

    public void setNavigationDrawerListListener(INavigationDrawerListListener inavigationdrawerlistlistener)
    {
        mListener = inavigationdrawerlistlistener;
    }

    public void updateAdapter(List list)
    {
        if (list != null)
        {
            mItems = (ArrayList)list;
        }
        notifyDataSetChanged();
    }

}

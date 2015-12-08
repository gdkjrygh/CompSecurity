// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.minutecast.Intervals;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.utilities.MinuteCastUtilities;
import java.util.List;

// Referenced classes of package com.accuweather.android.minutecast:
//            TurboMinuteCastUtilities

public class MinuteCastListAdapter extends BaseAdapter
{
    public static class ViewHolder
    {

        TextView shortText;
        TextView time;
        ImageView weatherIcon;

        public ViewHolder()
        {
        }
    }


    private static final int PRECIPITATION_ICON_COLOR = Color.parseColor("#99808284");
    private Context mContext;
    private LayoutInflater mInflater;
    private List mIntervals;
    private WeatherDataModel mWeatherDataModel;

    public MinuteCastListAdapter(Context context, WeatherDataModel weatherdatamodel)
    {
        mWeatherDataModel = weatherdatamodel;
        mIntervals = weatherdatamodel.getMinuteCastResult().getIntervals();
        mContext = context;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public int getCount()
    {
        return 120;
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    protected Drawable getPrecipitationIconDrawable(int i)
    {
        i = TurboMinuteCastUtilities.getPrecipitationImageResourceId(i, mWeatherDataModel);
        if (i != com.accuweather.android.R.drawable.ic_minute_cast_no_precip)
        {
            Drawable drawable = mContext.getResources().getDrawable(i);
            drawable.setColorFilter(PRECIPITATION_ICON_COLOR, android.graphics.PorterDuff.Mode.SRC_ATOP);
            return drawable;
        } else
        {
            return null;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        ViewHolder viewholder = new ViewHolder();
        if (view == null)
        {
            view1 = mInflater.inflate(com.accuweather.android.R.layout.minute_by_minute_list_item, viewgroup, false);
            viewholder.weatherIcon = (ImageView)view1.findViewById(com.accuweather.android.R.id.weather_icon);
            viewholder.time = (TextView)view1.findViewById(com.accuweather.android.R.id.time);
            viewholder.shortText = (TextView)view1.findViewById(com.accuweather.android.R.id.short_text);
            view1.setTag(viewholder);
            view = viewholder;
        } else
        {
            view = (ViewHolder)view1.getTag();
        }
        ((ViewHolder) (view)).weatherIcon.setBackgroundDrawable(getPrecipitationIconDrawable(i));
        ((ViewHolder) (view)).shortText.setText(MinuteCastUtilities.getShortPhrase(i, mWeatherDataModel));
        if (mIntervals.size() - 1 >= i)
        {
            viewgroup = (Intervals)mIntervals.get(i);
            ((ViewHolder) (view)).time.setText(MinuteCastUtilities.getMinuteTime(mContext, viewgroup.getStartDateTime()));
            return view1;
        } else
        {
            ((ViewHolder) (view)).time.setText(MinuteCastUtilities.getMinuteTime(mContext, mWeatherDataModel, i));
            return view1;
        }
    }

}

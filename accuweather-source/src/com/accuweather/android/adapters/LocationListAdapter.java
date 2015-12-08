// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.Utilities;
import java.util.ArrayList;

public class LocationListAdapter extends BaseAdapter
{
    public static interface ILocationListListener
    {

        public abstract void onLocationLongPressed(LocationModel locationmodel);

        public abstract void onLocationSelected(LocationModel locationmodel, int i);
    }


    private Context mContext;
    private LayoutInflater mInflater;
    private ILocationListListener mListener;
    private ArrayList mModelList;

    public LocationListAdapter(Context context, ArrayList arraylist)
    {
        mModelList = new ArrayList();
        mModelList = arraylist;
        mContext = context;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public void addContent(WeatherDataModel weatherdatamodel)
    {
        if (!mModelList.contains(weatherdatamodel))
        {
            mModelList.add(weatherdatamodel);
            notifyDataSetChanged();
        }
    }

    public void clear()
    {
        mModelList.clear();
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return mModelList.size();
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
        java.util.Locale locale = mContext.getResources().getConfiguration().locale;
        final Data data = Data.getInstance(mContext);
        if (view == null)
        {
            viewgroup = mInflater.inflate(com.accuweather.android.R.layout.location_item, null);
        } else
        {
            viewgroup = view;
        }
        if (position >= mModelList.size())
        {
            return viewgroup;
        }
        final WeatherDataModel wdm = (WeatherDataModel)mModelList.get(position);
        boolean flag = wdm.getAlertIsActive();
        view = (ImageView)viewgroup.findViewById(com.accuweather.android.R.id.alertIcon);
        android.view.View.OnClickListener onclicklistener;
        android.view.View.OnLongClickListener onlongclicklistener;
        if (flag)
        {
            view.setVisibility(0);
        } else
        {
            view.setVisibility(8);
        }
        onclicklistener = new android.view.View.OnClickListener() {

            final LocationListAdapter this$0;
            final Data val$data;
            final int val$position;
            final WeatherDataModel val$wdm;

            public void onClick(View view1)
            {
                Logger.d(this, "onclick");
                mListener.onLocationSelected(data.getLocationFromKey(wdm.getLocationKey()), position);
            }

            
            {
                this$0 = LocationListAdapter.this;
                data = data1;
                wdm = weatherdatamodel;
                position = i;
                super();
            }
        };
        onlongclicklistener = new android.view.View.OnLongClickListener() {

            final LocationListAdapter this$0;
            final Data val$data;
            final WeatherDataModel val$wdm;

            public boolean onLongClick(View view1)
            {
                mListener.onLocationLongPressed(data.getLocationFromKey(wdm.getLocationKey()));
                return true;
            }

            
            {
                this$0 = LocationListAdapter.this;
                data = data1;
                wdm = weatherdatamodel;
                super();
            }
        };
        data = Data.getInstance(mContext).getLocationFromKey(wdm.getLocationKey());
        view = data;
        if (data == null)
        {
            view = Data.getInstance(mContext).getCurrentFollowMeLocation();
        }
        data = view;
        if (view == null)
        {
            data = new LocationModel();
            data.setLocKey(wdm.getLocationKey());
            data.setLocationName(wdm.getCityName());
        }
        ((TextView)viewgroup.findViewById(com.accuweather.android.R.id.my_location_label)).setText(((TextView)viewgroup.findViewById(com.accuweather.android.R.id.my_location_label)).getText().toString().toUpperCase(locale));
        ((TextView)viewgroup.findViewById(com.accuweather.android.R.id.location)).setText(data.getAliasedName());
        ((TextView)viewgroup.findViewById(com.accuweather.android.R.id.short_text)).setText(wdm.getText());
        ((TextView)viewgroup.findViewById(com.accuweather.android.R.id.temperature)).setText(Html.fromHtml((new StringBuilder()).append(wdm.getTemperature()).append("\260").toString()));
        ((ImageView)viewgroup.findViewById(com.accuweather.android.R.id.icon)).setImageDrawable(getWeatherIconDrawable(wdm, mContext));
        viewgroup.findViewById(com.accuweather.android.R.id.my_location_label).setVisibility(8);
        view = viewgroup.findViewById(com.accuweather.android.R.id.home_icon);
        if (wdm.getLocationKey().equals(Data.getInstance(mContext).getHomeLocation().getKey()))
        {
            position = 0;
        } else
        {
            position = 8;
        }
        view.setVisibility(position);
        viewgroup.setOnClickListener(onclicklistener);
        viewgroup.setOnLongClickListener(onlongclicklistener);
        viewgroup.setBackgroundResource(com.accuweather.android.R.drawable.abs__list_selector_holo_light);
        setTypeFaces(viewgroup);
        return viewgroup;
    }

    protected Drawable getWeatherIconDrawable(WeatherDataModel weatherdatamodel, Context context)
    {
        return Utilities.getImageDrawable((new StringBuilder()).append("icon_").append(weatherdatamodel.getIconCode()).toString(), context);
    }

    public void setLocationListListener(ILocationListListener ilocationlistlistener)
    {
        mListener = ilocationlistlistener;
    }

    protected void setTypeFaces(View view)
    {
        Utilities.setTypeFace(view, Data.getRobotoCondensed());
        ((TextView)view.findViewById(com.accuweather.android.R.id.location)).setTypeface(Data.getRobotoBoldCondensed());
        ((TextView)view.findViewById(com.accuweather.android.R.id.temperature)).setTypeface(Data.getRobotoLight());
    }

    public void updateAdapter(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            mModelList = (ArrayList)arraylist.clone();
        }
        notifyDataSetChanged();
    }

}

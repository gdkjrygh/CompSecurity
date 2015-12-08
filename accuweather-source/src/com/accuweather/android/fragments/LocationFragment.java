// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.accuweather.android.adapters.LocationListAdapter;
import com.accuweather.android.adapters.TitleSpinnerAdapter;
import com.accuweather.android.models.FragmentPayload;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.SearchView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.fragments:
//            WeatherFragment

public class LocationFragment extends WeatherFragment
    implements com.accuweather.android.adapters.LocationListAdapter.ILocationListListener, com.accuweather.android.views.SimpleSearchView.ISearchViewListener
{
    public static interface ILocationFragmentListener
        extends com.accuweather.android.views.SimpleSearchView.ISearchViewListener
    {

        public abstract void onLocationAdded(String s, String s1, String s2, String s3, String s4);

        public abstract void onLocationLongPressed(LocationModel locationmodel);

        public abstract void onLocationSearch(String s);

        public abstract void onLocationSelected(LocationModel locationmodel, int i);

        public abstract void onMyLocationLongPressed();

        public abstract void onMyLocationSelected();
    }


    private LocationListAdapter mAdapter;
    private ListView mList;
    private ILocationFragmentListener mListener;
    private SearchView mSearchView;
    private LocationFragment mSelf;

    public LocationFragment()
    {
    }

    private void clearSearchViewInput()
    {
        mSearchView.clearInput();
    }

    public static LocationFragment newInstance()
    {
        return new LocationFragment();
    }

    private void setMyLocationOnClickListener(View view)
    {
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final LocationFragment this$0;

            public void onClick(View view1)
            {
                if (mListener != null)
                {
                    mListener.onMyLocationSelected();
                }
            }

            
            {
                this$0 = LocationFragment.this;
                super();
            }
        });
    }

    private void setMyLocationOnLongClickListener(View view)
    {
        view.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            final LocationFragment this$0;

            public boolean onLongClick(View view1)
            {
                if (mListener != null)
                {
                    mListener.onMyLocationLongPressed();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = LocationFragment.this;
                super();
            }
        });
    }

    private void updateSearchViewAdapter(ArrayList arraylist, boolean flag)
    {
        if (mSearchView != null)
        {
            TitleSpinnerAdapter titlespinneradapter = new TitleSpinnerAdapter(getActivity(), com.accuweather.android.R.layout.spinner_dropdown_item, arraylist);
            titlespinneradapter.setTextColor(getResources().getColor(com.accuweather.android.R.color.primary_text));
            mSearchView.setAdapter(titlespinneradapter);
            if (!arraylist.isEmpty())
            {
                mSearchView.showDropDown();
                return;
            }
        }
    }

    public int describeContents()
    {
        return 0;
    }

    protected int getLayout()
    {
        return com.accuweather.android.R.layout.location_fragment;
    }

    protected LocationListAdapter getListAdapter()
    {
        return new LocationListAdapter(getActivity(), new ArrayList());
    }

    protected void init()
    {
        mList = (ListView)getView().findViewById(com.accuweather.android.R.id.list);
        mAdapter = getListAdapter();
        mList.setAdapter(mAdapter);
        mAdapter.setLocationListListener(mSelf);
        mSearchView = (SearchView)getView().findViewById(com.accuweather.android.R.id.search_view);
        mSearchView.setSearchViewListener(this);
        updateView();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        init();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (getActivity() instanceof ILocationFragmentListener)
        {
            mListener = (ILocationFragmentListener)getActivity();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mSelf = this;
        mTitle = getString(com.accuweather.android.R.string.Locations).toUpperCase(getResources().getConfiguration().locale);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(getLayout(), null);
        setLayerType(layoutinflater);
        return layoutinflater;
    }

    public void onLocationLongPressed(LocationModel locationmodel)
    {
        Logger.i(getClass().getName(), "onLocationLongPressed");
        mListener.onLocationLongPressed(locationmodel);
    }

    public void onLocationSelected(LocationModel locationmodel, int i)
    {
        mListener.onLocationSelected(locationmodel, i);
    }

    public void onQueryChanged(String s)
    {
        if (mListener != null)
        {
            mListener.onQueryChanged(s);
        }
    }

    public void onReceive(Intent intent)
    {
        if (intent.getAction().equals("accuwx.intent.action.UPDATE_FRAGMENT"))
        {
            if (intent.getExtras().get("fragment_payload") instanceof FragmentPayload)
            {
                updateView();
            }
        } else
        if (intent.getAction().equals("accuwx.intent.action.UPDATE_LOCATION_AUTOCOMPLETE"))
        {
            intent = intent.getExtras();
            if (intent instanceof Bundle)
            {
                ArrayList arraylist = (ArrayList)((Bundle)intent).get("autocomplete_payload");
                boolean flag = ((Bundle)intent).getBoolean("is_autocomplete");
                boolean flag1 = ((Bundle)intent).getBoolean("request_focus");
                boolean flag2 = ((Bundle)intent).getBoolean("clear_input");
                if (arraylist != null)
                {
                    updateSearchViewAdapter(arraylist, flag);
                }
                if (flag1)
                {
                    requestSearchViewFocus();
                }
                if (flag2)
                {
                    clearSearchViewInput();
                    return;
                }
            }
        }
    }

    public void onSearch(String s)
    {
        if (mListener != null)
        {
            mListener.onSearch(s);
        }
    }

    public void onSearchItemSelected(int i, Object obj)
    {
        if (mListener != null)
        {
            mListener.onSearchItemSelected(i, obj);
        }
    }

    protected void populateMyCurrentLocation()
    {
        if (getActivity() != null)
        {
            Object obj = getActivity().getResources().getConfiguration().locale;
            View view = getView().findViewById(com.accuweather.android.R.id.my_location);
            ((TextView)view.findViewById(com.accuweather.android.R.id.my_location_label)).setText(((TextView)view.findViewById(com.accuweather.android.R.id.my_location_label)).getText().toString().toUpperCase(((java.util.Locale) (obj))));
            obj = Data.getInstance(getActivity()).getCurrentFollowMeLocation();
            if (obj != null)
            {
                WeatherDataModel weatherdatamodel = Data.getInstance(getActivity()).getWeatherDataModelFromCode(((LocationModel) (obj)).getKey());
                if (weatherdatamodel != null)
                {
                    getView().findViewById(com.accuweather.android.R.id.current_location_layout).setVisibility(0);
                    ((TextView)view.findViewById(com.accuweather.android.R.id.location)).setText(((LocationModel) (obj)).getAliasedName());
                    ((TextView)view.findViewById(com.accuweather.android.R.id.short_text)).setText(weatherdatamodel.getText());
                    ((TextView)view.findViewById(com.accuweather.android.R.id.temperature)).setText(Html.fromHtml((new StringBuilder()).append(weatherdatamodel.getTemperature()).append("\260").toString()));
                    ((ImageView)view.findViewById(com.accuweather.android.R.id.icon)).setImageResource(Utilities.getDrawableId((new StringBuilder()).append("icon_").append(weatherdatamodel.getIconCode()).toString()));
                    setMyLocationOnClickListener(view);
                    setMyLocationOnLongClickListener(view);
                    view.setBackgroundResource(com.accuweather.android.R.drawable.first_launch_selector);
                } else
                {
                    getView().findViewById(com.accuweather.android.R.id.current_location_layout).setVisibility(8);
                    view.findViewById(com.accuweather.android.R.id.my_location).setOnClickListener(null);
                }
                setTypeFaces(view);
                return;
            }
        }
    }

    public void requestSearchViewFocus()
    {
        mSearchView.requestQueryFocus(true);
    }

    protected void setLayerType(View view)
    {
    }

    public void setLocationFragmentListener(ILocationFragmentListener ilocationfragmentlistener)
    {
        mListener = ilocationfragmentlistener;
    }

    public void setTitle(String s)
    {
        TextView textview;
        if (s != null && !TextUtils.isEmpty(s))
        {
            if ((textview = (TextView)getView().findViewById(com.accuweather.android.R.id.title)) != null)
            {
                textview.setText(s);
                return;
            }
        }
    }

    protected void setTypeFaces(View view)
    {
        Utilities.setTypeFace(view.findViewById(com.accuweather.android.R.id.my_location), Data.getRobotoCondensed());
        ((TextView)view.findViewById(com.accuweather.android.R.id.location)).setTypeface(Data.getRobotoBoldCondensed());
        ((TextView)view.findViewById(com.accuweather.android.R.id.temperature)).setTypeface(Data.getRobotoLight());
    }

    public void updateView()
    {
        if (!isInitialized())
        {
            return;
        }
        List list = getData().getPrimarySortedWeatherDataModels();
        if (mAdapter != null)
        {
            Logger.i(this, (new StringBuilder()).append("UpdateView Adapter size is ").append(list.size()).toString());
            mAdapter.updateAdapter((ArrayList)getData().sortWeatherDataModels(list, getData().getHomeLocation().getKey()));
        }
        populateMyCurrentLocation();
        setTitle(mTitle);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.accuweather.android.adapters.TitleSpinnerAdapter;
import com.accuweather.android.fragments.WeatherFragment;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.GeocodedAddress;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.services.request.AsyncTaskCallback;
import com.accuweather.android.services.request.GeocoderAsyncTask;
import com.accuweather.android.services.request.LocationRequester;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.FontUtils;
import com.accuweather.android.utilities.GuiUtils;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.SearchViewListenerAdapter;
import com.accuweather.android.views.SimpleSearchView;
import java.util.List;

// Referenced classes of package com.accuweather.android.minutecast:
//            MinuteCastCircleFragment, MinuteCastListFragment

public class MinuteCastFlipperFragment extends WeatherFragment
    implements AsyncTaskCallback, MinuteCastCircleFragment.ICircleListener, MinuteCastListFragment.IListListener
{
    public static interface IMinuteCastFlipperListener
    {

        public abstract void onAddressSearchFieldTapped();
    }

    public static final class MinuteCastViewType extends Enum
    {

        private static final MinuteCastViewType $VALUES[];
        public static final MinuteCastViewType Circle;
        public static final MinuteCastViewType List;
        public String viewName;

        public static MinuteCastViewType valueOf(String s)
        {
            return (MinuteCastViewType)Enum.valueOf(com/accuweather/android/minutecast/MinuteCastFlipperFragment$MinuteCastViewType, s);
        }

        public static MinuteCastViewType[] values()
        {
            return (MinuteCastViewType[])$VALUES.clone();
        }

        static 
        {
            Circle = new MinuteCastViewType("Circle", 0, "circle");
            List = new MinuteCastViewType("List", 1, "list");
            $VALUES = (new MinuteCastViewType[] {
                Circle, List
            });
        }

        private MinuteCastViewType(String s, int i, String s1)
        {
            super(s, i);
            viewName = s1;
        }
    }


    private static MinuteCastViewType LAST_SELECTED_VIEW;
    public static final String LAST_SELECTED_VIEW_KEY = "last_selected_minutecast_page";
    public static final String MINUTE_CAST_CIRCLE_FRAGMENT = "minuteCastCircleFragment";
    public static final String MINUTE_CAST_LIST_FRAGMENT = "minuteCastListFragment";
    private int circleViewFlipperIndex;
    private int listViewFlipperIndex;
    private GeocoderAsyncTask mCurrentGeocoderAsyncTask;
    private boolean mIsOnLandscape;
    private int mLastSelectedMinute;
    private LocationRequester mLocationRequester;
    private IMinuteCastFlipperListener mMinuteCastFlipperListener;
    private SimpleSearchView mSimpleSearchView;
    private TextView mToggleMinuteCastUiTextView;

    public MinuteCastFlipperFragment()
    {
        mLastSelectedMinute = 0;
        mIsOnLandscape = false;
        circleViewFlipperIndex = 0;
        listViewFlipperIndex = 1;
    }

    private MinuteCastCircleFragment findMinuteCastCircleFragment()
    {
        if (getFragmentManager() != null)
        {
            return (MinuteCastCircleFragment)getFragmentManager().findFragmentByTag("minuteCastCircleFragment");
        } else
        {
            return null;
        }
    }

    private MinuteCastListFragment findMinuteCastListFragment()
    {
        if (getFragmentManager() != null)
        {
            return (MinuteCastListFragment)getFragmentManager().findFragmentByTag("minuteCastListFragment");
        } else
        {
            return null;
        }
    }

    private GeocodedAddress getAddressToDisplay()
    {
        if (Data.getInstance(getActivity()).isFollowMeCurrentlyViewed())
        {
            LocationModel locationmodel = Data.getInstance(getActivity()).getCurrentFollowMeLocation();
            if (locationmodel != null)
            {
                return locationmodel.getAddress();
            }
        }
        Object obj = Data.getInstance(getActivity()).getCurrentlyViewedWeatherDataModel();
        obj = Data.getInstance(getActivity()).getLocationFromKey(((WeatherDataModel) (obj)).getLocationKey());
        if (obj != null)
        {
            return ((LocationModel) (obj)).getAddress();
        } else
        {
            return null;
        }
    }

    public static MinuteCastViewType getLastSelectedView()
    {
        return LAST_SELECTED_VIEW;
    }

    private int getMinuteCastFragmentContainer()
    {
        if (Utilities.isScreenSizeLargeOrGreater(getActivity()) && !Utilities.isLandscape(getActivity()))
        {
            return com.accuweather.android.R.id.minuteCastLinearLayout;
        } else
        {
            return com.accuweather.android.R.id.minuteCastViewFlipper;
        }
    }

    private int getSelectedMinute()
    {
        if (getView() != null && getActivity() != null)
        {
            if (LAST_SELECTED_VIEW.equals(com.accuweather.android.minutecast.MinuteCastViewType.List) || !Utilities.isScreenSizeLargeOrGreater(getActivity()) && mIsOnLandscape)
            {
                MinuteCastListFragment minutecastlistfragment = findMinuteCastListFragment();
                if (minutecastlistfragment != null)
                {
                    return minutecastlistfragment.getSelectedMinute();
                }
            } else
            {
                MinuteCastCircleFragment minutecastcirclefragment = findMinuteCastCircleFragment();
                if (minutecastcirclefragment != null)
                {
                    return minutecastcirclefragment.getSelectedMinute();
                }
            }
        }
        return 0;
    }

    private void hideVirtualKeyboard()
    {
        if (getActivity() != null)
        {
            GuiUtils.hideVirtualKeyboard(getActivity().getCurrentFocus(), getActivity());
        }
    }

    private void initCircleFragment()
    {
        MinuteCastCircleFragment minutecastcirclefragment = getMinuteCastCircleFragment(mLastSelectedMinute);
        minutecastcirclefragment.setCircleListener(this);
        getFragmentManager().beginTransaction().add(getMinuteCastFragmentContainer(), minutecastcirclefragment, "minuteCastCircleFragment").commit();
    }

    private void initListFragment()
    {
        MinuteCastListFragment minutecastlistfragment = getMinuteCastListFragment();
        minutecastlistfragment.setListListener(this);
        getFragmentManager().beginTransaction().add(getMinuteCastFragmentContainer(), minutecastlistfragment, "minuteCastListFragment").commit();
    }

    private void onAddressSelected(GeocodedAddress geocodedaddress)
    {
        hideVirtualKeyboard();
        mLocationRequester.performGeoSearch(geocodedaddress);
    }

    private void onAddressTextChanged(String s)
    {
        if (mCurrentGeocoderAsyncTask != null)
        {
            mCurrentGeocoderAsyncTask.cancel(true);
        }
        mCurrentGeocoderAsyncTask = new GeocoderAsyncTask(getActivity());
        mCurrentGeocoderAsyncTask.setCallback(this);
        mCurrentGeocoderAsyncTask.execute(new String[] {
            s
        });
    }

    private void setPageTitle(String s)
    {
        if (getView() != null && getActivity() != null && !TextUtils.isEmpty(s))
        {
            TextView textview = (TextView)getView().findViewById(com.accuweather.android.R.id.title);
            if (textview != null)
            {
                textview.setText(s);
            }
        }
    }

    private void updateCircleAndListViews()
    {
        Object obj = findMinuteCastCircleFragment();
        if (obj != null)
        {
            ((MinuteCastCircleFragment) (obj)).updateView();
        }
        obj = findMinuteCastListFragment();
        if (obj != null)
        {
            ((MinuteCastListFragment) (obj)).updateView();
        }
    }

    private void updateMinuteCastUiToggleText(MinuteCastViewType minutecastviewtype)
    {
        if (minutecastviewtype.equals(MinuteCastViewType.Circle))
        {
            mToggleMinuteCastUiTextView.setText(com.accuweather.android.R.string.MinuteCastViewList);
            return;
        } else
        {
            mToggleMinuteCastUiTextView.setText(com.accuweather.android.R.string.MinuteCastViewCircle);
            return;
        }
    }

    private void updateSearchViewAddress()
    {
        Object obj = getAddressToDisplay();
        if (obj != null)
        {
            obj = ((GeocodedAddress) (obj)).toString();
            if (!mSimpleSearchView.getDisplayedSearchText().equals(obj))
            {
                mSimpleSearchView.setDisplayedSearchText(((String) (obj)));
            }
        }
    }

    protected int getContentViewId()
    {
        return com.accuweather.android.R.layout.minute_cast_flipper;
    }

    protected MinuteCastCircleFragment getMinuteCastCircleFragment(int i)
    {
        return MinuteCastCircleFragment.newInstance(i);
    }

    protected MinuteCastListFragment getMinuteCastListFragment()
    {
        return MinuteCastListFragment.newInstance(mLastSelectedMinute);
    }

    protected int getSearchViewTextColor()
    {
        return com.accuweather.android.R.color.primary_text;
    }

    protected void init()
    {
        if (getActivity() instanceof IMinuteCastFlipperListener)
        {
            mMinuteCastFlipperListener = (IMinuteCastFlipperListener)getActivity();
        }
        final ViewFlipper viewFlipper = getView().findViewById(com.accuweather.android.R.id.minuteCastTrademarkTextView);
        if (viewFlipper != null)
        {
            viewFlipper.setVisibility(4);
        }
        mToggleMinuteCastUiTextView = (TextView)getView().findViewById(com.accuweather.android.R.id.toggleMinuteCastUiTextView);
        viewFlipper = (ViewFlipper)getView().findViewById(com.accuweather.android.R.id.minuteCastViewFlipper);
        if (viewFlipper != null && mToggleMinuteCastUiTextView != null)
        {
            mToggleMinuteCastUiTextView.setOnClickListener(new android.view.View.OnClickListener() {

                final MinuteCastFlipperFragment this$0;
                final ViewFlipper val$viewFlipper;

                public void onClick(View view)
                {
                    AccuAnalytics.logStateEvent(getActivity(), "Clicks on trigger to switch between MinuteCast circle view and list view");
                    int i = getSelectedMinute();
                    viewFlipper.showNext();
                    int j = viewFlipper.getDisplayedChild();
                    MinuteCastFlipperFragment.LAST_SELECTED_VIEW = com.accuweather.android.minutecast.MinuteCastViewType.List;
                    if (j == circleViewFlipperIndex)
                    {
                        MinuteCastFlipperFragment.LAST_SELECTED_VIEW = MinuteCastViewType.Circle;
                    }
                    PreferenceUtils.save(mToggleMinuteCastUiTextView.getContext(), "last_selected_minutecast_page", MinuteCastFlipperFragment.LAST_SELECTED_VIEW.viewName);
                    updateMinuteCastUiToggleText(MinuteCastFlipperFragment.LAST_SELECTED_VIEW);
                    updateCircleAndListProgress(i);
                    FragmentActivity fragmentactivity = getActivity();
                    if (MinuteCastFlipperFragment.LAST_SELECTED_VIEW.equals(MinuteCastViewType.Circle))
                    {
                        view = "Views on MinuteCast Circle view";
                    } else
                    {
                        view = "Views on MinuteCast List view";
                    }
                    AccuAnalytics.logStateEvent(fragmentactivity, view);
                }

            
            {
                this$0 = MinuteCastFlipperFragment.this;
                viewFlipper = viewflipper;
                super();
            }
            });
            Utilities.setTypeFace(mToggleMinuteCastUiTextView, FontUtils.getRobotoNormal(getActivity()));
        }
        mLocationRequester = new LocationRequester(getActivity());
        mSimpleSearchView = (SimpleSearchView)getView().findViewById(com.accuweather.android.R.id.locationSearchEditText);
        mSimpleSearchView.setSelected(false);
        mSimpleSearchView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final MinuteCastFlipperFragment this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (!mSimpleSearchView.hasFocus() && motionevent.getAction() == 0)
                {
                    mSimpleSearchView.clearInput();
                }
                if (mMinuteCastFlipperListener != null)
                {
                    mMinuteCastFlipperListener.onAddressSearchFieldTapped();
                }
                return false;
            }

            
            {
                this$0 = MinuteCastFlipperFragment.this;
                super();
            }
        });
        mSimpleSearchView.setSearchViewListener(new SearchViewListenerAdapter() {

            final MinuteCastFlipperFragment this$0;

            public void onQueryChanged(String s)
            {
                onAddressTextChanged(s);
            }

            public void onSearchItemSelected(int i, Object obj)
            {
                obj = (GeocodedAddress)obj;
                onAddressSelected(((GeocodedAddress) (obj)));
            }

            
            {
                this$0 = MinuteCastFlipperFragment.this;
                super();
            }
        });
        setPageTitle(getString(com.accuweather.android.R.string.MinuteCast).toUpperCase());
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mIsOnLandscape = Utilities.isLandscape(getActivity());
        init();
        if (bundle != null && bundle.containsKey("selectedMinute"))
        {
            mLastSelectedMinute = bundle.getInt("selectedMinute");
        }
    }

    public void onBackground()
    {
    }

    public void onBackgroundProcessingError(Exception exception)
    {
    }

    public void onCircleMinuteChanged(int i)
    {
        MinuteCastListFragment minutecastlistfragment = findMinuteCastListFragment();
        if (minutecastlistfragment != null)
        {
            minutecastlistfragment.setListListener(null);
            minutecastlistfragment.setSelectedMinute(i);
            minutecastlistfragment.setListListener(this);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(getContentViewId(), null);
    }

    public void onListMinuteChanged(int i)
    {
        MinuteCastCircleFragment minutecastcirclefragment = findMinuteCastCircleFragment();
        if (minutecastcirclefragment != null)
        {
            minutecastcirclefragment.setCircleListener(null);
            minutecastcirclefragment.setSelectedMinute(i);
            minutecastcirclefragment.setCircleListener(this);
        }
    }

    public void onPause()
    {
        FragmentManager fragmentmanager;
        super.onPause();
        fragmentmanager = getFragmentManager();
        if (fragmentmanager == null) goto _L2; else goto _L1
_L1:
        android.support.v4.app.Fragment fragment;
        android.support.v4.app.Fragment fragment1;
        fragment = fragmentmanager.findFragmentByTag("minuteCastCircleFragment");
        fragment1 = fragmentmanager.findFragmentByTag("minuteCastListFragment");
        if (!LAST_SELECTED_VIEW.equals(com.accuweather.android.minutecast.MinuteCastViewType.List) && (Utilities.isScreenSizeLargeOrGreater(getActivity()) || !mIsOnLandscape)) goto _L4; else goto _L3
_L3:
        if (fragment1 != null)
        {
            mLastSelectedMinute = ((MinuteCastListFragment)fragment1).getSelectedMinute();
        }
_L6:
        if (fragment1 != null)
        {
            fragmentmanager.beginTransaction().remove(fragment1).commitAllowingStateLoss();
        }
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commitAllowingStateLoss();
        }
_L2:
        return;
_L4:
        if (fragment != null)
        {
            mLastSelectedMinute = ((MinuteCastCircleFragment)fragment).getSelectedMinute();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public volatile void onPostExecute(Object obj)
    {
        onPostExecute((List)obj);
    }

    public void onPostExecute(List list)
    {
        if (getActivity() != null && mSimpleSearchView != null)
        {
            list = new TitleSpinnerAdapter(getActivity(), com.accuweather.android.R.layout.spinner_dropdown_item, list);
            list.setTextColor(getResources().getColor(com.accuweather.android.R.color.primary_text));
            mSimpleSearchView.setAdapter(list);
            mSimpleSearchView.showDropDown();
        }
    }

    public void onReceive(Intent intent)
    {
        if (intent != null && "accuwx.intent.action.UPDATE_FRAGMENT".equals(intent.getAction()))
        {
            if (!intent.getBooleanExtra("weather_update_timer_based", false))
            {
                updateSearchViewAddress();
            }
            updateCircleAndListViews();
        }
    }

    public void onResume()
    {
        super.onResume();
        final String lastSelectedViewName = PreferenceUtils.get(getActivity(), "last_selected_minutecast_page", LAST_SELECTED_VIEW.viewName);
        LAST_SELECTED_VIEW = com.accuweather.android.minutecast.MinuteCastViewType.List;
        if (MinuteCastViewType.Circle.viewName.equals(lastSelectedViewName))
        {
            LAST_SELECTED_VIEW = MinuteCastViewType.Circle;
        }
        final ViewFlipper viewFlipper;
        if (!Utilities.isScreenSizeLargeOrGreater(getActivity()) && mIsOnLandscape)
        {
            initListFragment();
        } else
        if (Utilities.isScreenSizeLargeOrGreater(getActivity()) && !mIsOnLandscape || MinuteCastViewType.Circle.viewName.equals(lastSelectedViewName))
        {
            initCircleFragment();
            initListFragment();
            circleViewFlipperIndex = 0;
            listViewFlipperIndex = 1;
        } else
        {
            initListFragment();
            initCircleFragment();
            listViewFlipperIndex = 0;
            circleViewFlipperIndex = 1;
        }
        viewFlipper = (ViewFlipper)getView().findViewById(com.accuweather.android.R.id.minuteCastViewFlipper);
        if (viewFlipper != null)
        {
            viewFlipper.post(new Runnable() {

                final MinuteCastFlipperFragment this$0;
                final String val$lastSelectedViewName;
                final ViewFlipper val$viewFlipper;

                public void run()
                {
                    if (MinuteCastViewType.Circle.viewName.equals(lastSelectedViewName))
                    {
                        viewFlipper.setDisplayedChild(circleViewFlipperIndex);
                        return;
                    } else
                    {
                        viewFlipper.setDisplayedChild(listViewFlipperIndex);
                        return;
                    }
                }

            
            {
                this$0 = MinuteCastFlipperFragment.this;
                lastSelectedViewName = s;
                viewFlipper = viewflipper;
                super();
            }
            });
        }
        if (mToggleMinuteCastUiTextView != null)
        {
            updateMinuteCastUiToggleText(LAST_SELECTED_VIEW);
        }
        if (mSimpleSearchView != null)
        {
            updateSearchViewAddress();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (getView() == null || getActivity() == null) goto _L2; else goto _L1
_L1:
        if (!LAST_SELECTED_VIEW.equals(com.accuweather.android.minutecast.MinuteCastViewType.List) && (Utilities.isScreenSizeLargeOrGreater(getActivity()) || !mIsOnLandscape)) goto _L4; else goto _L3
_L3:
        MinuteCastListFragment minutecastlistfragment = findMinuteCastListFragment();
        if (minutecastlistfragment != null)
        {
            mLastSelectedMinute = minutecastlistfragment.getSelectedMinute();
        }
_L6:
        bundle.putInt("selectedMinute", mLastSelectedMinute);
_L2:
        return;
_L4:
        MinuteCastCircleFragment minutecastcirclefragment = findMinuteCastCircleFragment();
        if (minutecastcirclefragment != null)
        {
            mLastSelectedMinute = minutecastcirclefragment.getSelectedMinute();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void updateCircleAndListProgress(int i)
    {
        if (getView() != null && getActivity() != null)
        {
            if (LAST_SELECTED_VIEW.equals(com.accuweather.android.minutecast.MinuteCastViewType.List) || !Utilities.isScreenSizeLargeOrGreater(getActivity()) && mIsOnLandscape)
            {
                MinuteCastListFragment minutecastlistfragment = findMinuteCastListFragment();
                if (minutecastlistfragment != null)
                {
                    minutecastlistfragment.setSelectedMinute(i);
                }
            } else
            {
                MinuteCastCircleFragment minutecastcirclefragment = findMinuteCastCircleFragment();
                if (minutecastcirclefragment != null)
                {
                    minutecastcirclefragment.setSelectedMinute(i);
                    return;
                }
            }
        }
    }

    static 
    {
        LAST_SELECTED_VIEW = MinuteCastViewType.Circle;
    }




/*
    static MinuteCastViewType access$102(MinuteCastViewType minutecastviewtype)
    {
        LAST_SELECTED_VIEW = minutecastviewtype;
        return minutecastviewtype;
    }

*/








}

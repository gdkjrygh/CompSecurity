// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.accuweather.android.adapters.HourlyListAdapter;
import com.accuweather.android.adapters.TitleSpinnerAdapterWithHeader;
import com.accuweather.android.ias.AmazonUtilities;
import com.accuweather.android.models.FragmentPayload;
import com.accuweather.android.models.HourlyFragmentModel;
import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.hourly.HourlyResult;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.GuiUtils;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.views.PrecipitationVisualization;
import com.accuweather.android.views.TemperatureVisualization;
import com.actionbarsherlock.internal.widget.IcsAdapterView;
import com.actionbarsherlock.internal.widget.IcsSpinner;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.fragments:
//            WeatherFragment

public class HourlyFragment extends WeatherFragment
    implements android.widget.AdapterView.OnItemClickListener, com.actionbarsherlock.internal.widget.IcsAdapterView.OnItemSelectedListener, com.accuweather.android.adapters.TitleSpinnerAdapterWithHeader.ITitleSpinnerListener
{
    public static interface IHourlyFragmentListener
    {

        public abstract void onHourlySelected(int i);

        public abstract void onSpinnerItemChanged(Object obj);
    }


    private static String PRECIPITATION = "";
    private static final int PRECIPITATION_POSITION = 1;
    private static String TEMPERATURE_AND_REALFEEL = "";
    private static final int TEMPERATURE_AND_REALFEEL_POSITION = 0;
    private static boolean mIsGraphShowing;
    private HourlyListAdapter mAdapter;
    private int mCurrentSpinnerPosition;
    private ListView mList;
    private IHourlyFragmentListener mListener;
    private PrecipitationVisualization mPrecipitationVisualization;
    private HourlyFragment mSelf;
    private IcsSpinner mSpinner;
    private TitleSpinnerAdapterWithHeader mSpinnerAdapter;
    private TemperatureVisualization mTemperatureVisualization;

    public HourlyFragment()
    {
    }

    private List buildConverted24HourLabelValues()
    {
        return GuiUtils.buildHourlyTitlesGraph(false, getActivity(), mWeatherDataModel);
    }

    private List buildConvertedLabelValues()
    {
        return GuiUtils.buildHourlyTitlesGraph(UserPreferences.isTwelveHourFormat(getActivity()), getActivity(), mWeatherDataModel);
    }

    private String[] buildGraphDayNameLabels()
    {
        java.util.Locale locale = getResources().getConfiguration().locale;
        Object obj = mWeatherDataModel.getCappedHourlyModels();
        if (((HourlyResults) (obj)).size() > 1)
        {
            String s = ((HourlyResult)((HourlyResults) (obj)).get(0)).getDateTime();
            obj = ((HourlyResult)((HourlyResults) (obj)).get(((HourlyResults) (obj)).size() - 1)).getDateTime();
            return (new String[] {
                DateUtils.getAbbreviatedDay(s, locale), DateUtils.getAbbreviatedDay(((String) (obj)), locale)
            });
        } else
        {
            return new String[0];
        }
    }

    private int[] buildRainProbabilityValues(HourlyResults hourlyresults)
    {
        int ai[] = new int[hourlyresults.size()];
        for (int i = 0; i < ai.length; i++)
        {
            ai[i] = ((HourlyResult)hourlyresults.get(i)).getPrecipitationProbability().intValue();
        }

        return ai;
    }

    private int[] buildRealFeelValues(HourlyResults hourlyresults)
    {
        int ai[] = new int[hourlyresults.size()];
        for (int i = 0; i < ai.length; i++)
        {
            ai[i] = ((HourlyResult)hourlyresults.get(i)).getRealFeelTemperature().getValue().intValue();
        }

        return ai;
    }

    private int[] buildTemperatures(HourlyResults hourlyresults)
    {
        int ai[] = new int[hourlyresults.size()];
        for (int i = 0; i < ai.length; i++)
        {
            ai[i] = ((HourlyResult)hourlyresults.get(i)).getTemperature().getValue().intValue();
        }

        return ai;
    }

    private int[] buildWinterPrecipProbabilityValues(HourlyResults hourlyresults)
    {
        return null;
    }

    private int getFirstSubsetSize(int ai[])
    {
        int l = ai.length;
        int k = 0;
        int i = 0;
        for (int j = 0; j < l && ai[j] > k; j++)
        {
            k = ai[j];
            i++;
        }

        return i;
    }

    private int[] getHourlyPoints(int ai[])
    {
        int j = -1;
        byte byte0 = -1;
        int i = 0;
        while (i < ai.length) 
        {
            int k = byte0;
            int l = j;
            if (ai[i] % 12 == 0)
            {
                if (j == -1)
                {
                    l = i;
                    k = byte0;
                } else
                {
                    k = i;
                    l = j;
                }
            }
            i++;
            byte0 = k;
            j = l;
        }
        return (new int[] {
            j, byte0
        });
    }

    private String getObservationDateTime()
    {
        return DateUtils.to24HourTime(mWeatherDataModel.getLocalObservationDateTime());
    }

    private void init()
    {
        mTemperatureVisualization = (TemperatureVisualization)getView().findViewById(com.accuweather.android.R.id.temperature_visualization);
        mPrecipitationVisualization = (PrecipitationVisualization)getView().findViewById(com.accuweather.android.R.id.precipitation_visualization);
        mList = (ListView)getView().findViewById(com.accuweather.android.R.id.list);
        mAdapter = new HourlyListAdapter(getActivity(), mWeatherDataModel);
        Object obj = ((LayoutInflater)getActivity().getSystemService("layout_inflater")).inflate(com.accuweather.android.R.layout.amazon_details, null, false);
        mList.addFooterView(((View) (obj)));
        mList.setAdapter(mAdapter);
        mList.setOnItemClickListener(this);
        int i = getActivity().getResources().getColor(com.accuweather.android.R.color.light_blue);
        int j = getActivity().getResources().getColor(com.accuweather.android.R.color.secondary_text);
        int k = getActivity().getResources().getColor(com.accuweather.android.R.color.light_green);
        Object obj1 = new ArrayList();
        ((ArrayList) (obj1)).add(TEMPERATURE_AND_REALFEEL);
        ((ArrayList) (obj1)).add(PRECIPITATION);
        obj = (IcsSpinner)getView().findViewById(com.accuweather.android.R.id.spinner);
        mSpinner = ((IcsSpinner) (obj));
        obj1 = new TitleSpinnerAdapterWithHeader(getActivity(), com.accuweather.android.R.layout.location_spinner_item, ((List) (obj1)), new int[] {
            i & 0xffffff, j & 0xffffff, k & 0xffffff
        });
        mSpinnerAdapter = ((TitleSpinnerAdapterWithHeader) (obj1));
        ((TitleSpinnerAdapterWithHeader) (obj1)).setOverrideDefaultActions(false);
        ((TitleSpinnerAdapterWithHeader) (obj1)).setTitleSpinnerListener(this);
        ((IcsSpinner) (obj)).setAdapter(((android.widget.SpinnerAdapter) (obj1)));
        ((IcsSpinner) (obj)).setBackgroundResource(com.accuweather.android.R.drawable.abs__spinner_ab_holo_light);
        mCurrentSpinnerPosition = PreferenceUtils.get(getActivity(), "hourly_spinner_selection", 0);
        setSpinnerSelectionWithoutCallingListener(((IcsSpinner) (obj)), mCurrentSpinnerPosition);
        obj = getView().findViewById(com.accuweather.android.R.id.visualization);
        if (mIsGraphShowing)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        updateView();
    }

    public static HourlyFragment newInstance(HourlyFragmentModel hourlyfragmentmodel)
    {
        HourlyFragment hourlyfragment = new HourlyFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("content", hourlyfragmentmodel);
        hourlyfragment.setArguments(bundle);
        return hourlyfragment;
    }

    private void setSpinnerSelectionWithoutCallingListener(final IcsSpinner spinner, final int selection)
    {
        spinner.setOnItemSelectedListener(null);
        spinner.post(new Runnable() {

            final HourlyFragment this$0;
            final int val$selection;
            final IcsSpinner val$spinner;

            public void run()
            {
                spinner.setSelection(selection);
                spinner.post(new Runnable() {

                    final _cls1 this$1;

                    public void run()
                    {
                        spinner.setOnItemSelectedListener(_fld0);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = HourlyFragment.this;
                spinner = icsspinner;
                selection = i;
                super();
            }
        });
    }

    private void setVisualizationToProperty(int i)
    {
        mCurrentSpinnerPosition = i;
        updateVisualization();
    }

    private void updateVisualization()
    {
        if (mCurrentSpinnerPosition == 0)
        {
            updateVisualizationForTemperatureAndRealfeel();
        } else
        if (mCurrentSpinnerPosition == 1)
        {
            updateVisualizationForPrecipitation();
            return;
        }
    }

    private void updateVisualizationForPrecipitation()
    {
        if (mWeatherDataModel == null)
        {
            return;
        }
        mPrecipitationVisualization.setVisibility(0);
        mTemperatureVisualization.setVisibility(8);
        HourlyResults hourlyresults = mWeatherDataModel.getCappedHourlyModels();
        String as[] = buildGraphDayNameLabels();
        int ai[] = new int[mWeatherDataModel.getCappedHourlyModels().size()];
        int ai1[] = new int[ai.length];
        List list = buildConvertedLabelValues();
        List list1 = buildConverted24HourLabelValues();
        for (int i = 0; i < list.size(); i++)
        {
            ai[i] = (int)Math.round(Double.parseDouble((String)list.get(i)));
            ai1[i] = Integer.parseInt((String)list1.get(i));
        }

        int ai3[] = buildRainProbabilityValues(hourlyresults);
        int ai2[] = buildWinterPrecipProbabilityValues(hourlyresults);
        mPrecipitationVisualization.setFirstSubsetSize(getFirstSubsetSize(ai1));
        mPrecipitationVisualization.setShouldDrawHourlyContrastBackgroundBar(true);
        mPrecipitationVisualization.setHourlyContrastBackgroundBarStartEndPoints(getHourlyPoints(ai1));
        mPrecipitationVisualization.setValues(ai3, ai2, as, ai);
        PrecipitationVisualization precipitationvisualization = mPrecipitationVisualization;
        int j;
        boolean flag;
        if (Integer.parseInt(getObservationDateTime().split(":")[0]) < 12)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        precipitationvisualization.setDayTime(flag);
        j = getActivity().getResources().getColor(com.accuweather.android.R.color.secondary_text);
        mSpinnerAdapter.setColors(new int[] {
            0xffffff & j
        });
        mSpinnerAdapter.notifyDataSetChanged();
    }

    private void updateVisualizationForTemperatureAndRealfeel()
    {
        if (mWeatherDataModel == null)
        {
            return;
        }
        if (mAdapter != null)
        {
            mAdapter.updateAdapter(mWeatherDataModel);
            mList.setSelectionAfterHeaderView();
        }
        mPrecipitationVisualization.setVisibility(8);
        mTemperatureVisualization.setVisibility(0);
        HourlyResults hourlyresults = mWeatherDataModel.getCappedHourlyModels();
        String as[] = buildGraphDayNameLabels();
        int ai[] = new int[hourlyresults.size()];
        int ai1[] = new int[ai.length];
        List list = buildConvertedLabelValues();
        List list1 = buildConverted24HourLabelValues();
        for (int i = 0; i < list.size(); i++)
        {
            ai[i] = (int)Math.round(Double.parseDouble((String)list.get(i)));
            ai1[i] = Integer.parseInt((String)list1.get(i));
        }

        int ai3[] = buildTemperatures(hourlyresults);
        int ai2[] = buildRealFeelValues(hourlyresults);
        mTemperatureVisualization.setFirstSubsetSize(getFirstSubsetSize(ai1));
        mTemperatureVisualization.setValues(ai3, null, ai2, null, as, ai);
        mTemperatureVisualization.setPrimaryColor(getActivity().getResources().getColor(com.accuweather.android.R.color.light_blue));
        mTemperatureVisualization.setPrimaryFillColor(getActivity().getResources().getColor(com.accuweather.android.R.color.light_blue));
        mTemperatureVisualization.setSecondaryColor(getActivity().getResources().getColor(com.accuweather.android.R.color.light_green));
        mTemperatureVisualization.setSecondaryFillColor(0);
        TemperatureVisualization temperaturevisualization = mTemperatureVisualization;
        int j;
        int k;
        int l;
        boolean flag;
        if (Integer.parseInt(getObservationDateTime().split(":")[0]) < 12)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        temperaturevisualization.setDayTime(flag);
        j = getActivity().getResources().getColor(com.accuweather.android.R.color.light_blue);
        k = getActivity().getResources().getColor(com.accuweather.android.R.color.secondary_text);
        l = getActivity().getResources().getColor(com.accuweather.android.R.color.light_green);
        mSpinnerAdapter.setColors(new int[] {
            0xffffff & j, 0xffffff & k, 0xffffff & l
        });
        mSpinnerAdapter.notifyDataSetChanged();
    }

    public boolean isEmpty()
    {
        return mList.getAdapter().getCount() == 0;
    }

    protected boolean isInitialized()
    {
        return mWeatherDataModel != null && super.isInitialized();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        init();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getActivity().getResources().getConfiguration().locale;
        mSelf = this;
        TEMPERATURE_AND_REALFEEL = mSelf.getResources().getString(com.accuweather.android.R.string.TemperatureAndRealfeel).toUpperCase(bundle);
        PRECIPITATION = mSelf.getResources().getString(com.accuweather.android.R.string.Precipitation).toUpperCase(bundle);
        if (getActivity() instanceof IHourlyFragmentListener)
        {
            mListener = (IHourlyFragmentListener)getActivity();
        }
        if (getArguments() != null)
        {
            bundle = (HourlyFragmentModel)getArguments().getSerializable("content");
        } else
        {
            bundle = null;
        }
        mTitle = getString(com.accuweather.android.R.string.Hourly).toUpperCase(getResources().getConfiguration().locale);
        if (bundle == null)
        {
            return;
        }
        String s = bundle.getLocationKey();
        if (s != null)
        {
            mWeatherDataModel = getData().getWeatherDataModelFromCode(s);
        }
        mIsGraphShowing = PreferenceUtils.get(getActivity(), "hourly_graph_showing", bundle.isGraphShowing());
        setTitle(mTitle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.accuweather.android.R.layout.hourly_fragment, null);
    }

    public void onDestroy()
    {
        PreferenceUtils.save(getActivity(), "hourly_spinner_selection", mSpinner.getSelectedItemPosition());
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        mListener.onHourlySelected(i);
    }

    public void onItemSelected(IcsAdapterView icsadapterview, View view, int i, long l)
    {
        if (mListener != null)
        {
            setVisualizationToProperty(i);
            mListener.onSpinnerItemChanged(icsadapterview.getItemAtPosition(i));
        }
    }

    public void onNothingSelected(IcsAdapterView icsadapterview)
    {
    }

    public void onPause()
    {
        super.onPause();
        mSpinner.setOnItemSelectedListener(null);
    }

    public void onReceive(Intent intent)
    {
        if (intent.getAction().equals("accuwx.intent.action.UPDATE_FRAGMENT"))
        {
            intent = ((Intent) (intent.getExtras().get("fragment_payload")));
            if (intent instanceof FragmentPayload)
            {
                Object obj = (FragmentPayload)intent;
                if (((FragmentPayload) (obj)).getHourlyFragmentModel() != null)
                {
                    intent = ((FragmentPayload) (obj)).getHourlyFragmentModel();
                    obj = ((FragmentPayload) (obj)).getLocationKey();
                    if (obj != null)
                    {
                        obj = getData().getWeatherDataModelFromCode(((String) (obj)));
                        if (obj != null)
                        {
                            mWeatherDataModel = ((WeatherDataModel) (obj));
                            mIsGraphShowing = intent.isGraphShowing();
                            updateView();
                        }
                    }
                }
            }
        } else
        if (intent.getAction().equals("accuwx.intent.action.UPDATE_AMAZON_PRODUCTS") && mWeatherDataModel != null && mWeatherDataModel.getForecast().getDailyForecasts().size() > 3)
        {
            AmazonUtilities.updateAmazonProductsView(getView(), getActivity(), getChildFragmentManager(), (DailyForecast)mWeatherDataModel.getForecast().getDailyForecasts().get(3));
            return;
        }
    }

    public void onSpinnerHeaderGroupItemSelected(String s, int i)
    {
        mSpinner.setSelection(mSpinnerAdapter.getItemCount() + i);
        mSpinner.getPopup().dismiss();
    }

    public void onSpinnerItemSelected(int i)
    {
    }

    public void setHourlyFragmentListener(IHourlyFragmentListener ihourlyfragmentlistener)
    {
        mListener = ihourlyfragmentlistener;
    }

    public void setTitle(String s)
    {
        if (getView() != null && s != null && !TextUtils.isEmpty(s))
        {
            TextView textview = (TextView)getView().findViewById(com.accuweather.android.R.id.title);
            if (textview != null)
            {
                textview.setText(s);
                return;
            }
        }
    }

    public void setVisualizationVisible(boolean flag)
    {
        mIsGraphShowing = flag;
        View view = getView().findViewById(com.accuweather.android.R.id.visualization);
        int i;
        if (mIsGraphShowing)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void updateView()
    {
        if (isInitialized())
        {
            View view = getView().findViewById(com.accuweather.android.R.id.visualization);
            int i;
            if (mIsGraphShowing)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
            updateVisualization();
            mAdapter.updateAdapter(mWeatherDataModel);
            setTitle(mTitle);
            if (AmazonUtilities.shouldShowAmazonProducts(getActivity()))
            {
                AmazonUtilities.updateAmazonProductsView(getView(), getActivity(), getChildFragmentManager(), (DailyForecast)mWeatherDataModel.getForecast().getDailyForecasts().get(3));
                return;
            }
        }
    }

}

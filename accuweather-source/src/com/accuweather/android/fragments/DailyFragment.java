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
import com.accuweather.android.adapters.DailyListAdapter;
import com.accuweather.android.adapters.TitleSpinnerAdapterWithHeader;
import com.accuweather.android.ias.AmazonUtilities;
import com.accuweather.android.models.ForecastFragmentModel;
import com.accuweather.android.models.FragmentPayload;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.daily.Headline;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.views.PrecipitationVisualization;
import com.accuweather.android.views.TemperatureVisualization;
import com.actionbarsherlock.internal.widget.IcsAdapterView;
import com.actionbarsherlock.internal.widget.IcsSpinner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// Referenced classes of package com.accuweather.android.fragments:
//            WeatherFragment

public class DailyFragment extends WeatherFragment
    implements com.actionbarsherlock.internal.widget.IcsAdapterView.OnItemSelectedListener, android.widget.AdapterView.OnItemClickListener, com.accuweather.android.adapters.TitleSpinnerAdapterWithHeader.ITitleSpinnerListener
{
    public static interface IForecastFragmentListener
    {

        public abstract void onForecastSelected(int i);

        public abstract void onSpinnerItemChanged(Object obj);
    }


    private static String PRECIPITATION = "";
    private static final int PRECIPITATION_POSITIOIN = 1;
    private static String TEMPERATURE = "";
    private static final int TEMPERATURE_POSITION = 0;
    private static boolean mIsGraphShowing;
    private DailyListAdapter mAdapter;
    private int mCurrentSpinnerPosition;
    private ListView mList;
    private IForecastFragmentListener mListener;
    private PrecipitationVisualization mPrecipitationVisualization;
    private IcsSpinner mSpinner;
    private TitleSpinnerAdapterWithHeader mSpinnerAdapter;
    private TemperatureVisualization mTemperatureVisualization;

    public DailyFragment()
    {
    }

    private int[] buildHighTemperatures(List list)
    {
        int ai[] = new int[list.size()];
        for (int i = 0; i < ai.length; i++)
        {
            ai[i] = ((DailyForecast)list.get(i)).getHighTemperature().intValue();
        }

        return ai;
    }

    private String[] buildLabels()
    {
        java.util.Locale locale = getResources().getConfiguration().locale;
        return (new String[] {
            DateUtils.getAbbreviatedMonth(DateUtils.getMonthIndex(0, mWeatherDataModel.getGmtOffset(), locale), locale).toUpperCase(locale), DateUtils.getAbbreviatedMonth(DateUtils.getMonthIndex(1, mWeatherDataModel.getGmtOffset(), locale), locale).toUpperCase(locale)
        });
    }

    private int[] buildLowTemperatures(List list)
    {
        int ai[] = new int[list.size()];
        for (int i = 0; i < ai.length; i++)
        {
            ai[i] = ((DailyForecast)list.get(i)).getLowTemperature().intValue();
        }

        return ai;
    }

    private int[] buildRainProbabilityValues(List list)
    {
        int ai[] = new int[list.size()];
        for (int i = 0; i < ai.length; i++)
        {
            Integer integer = ((DailyForecast)list.get(i)).getDay().getRainProbability();
            Integer integer1 = ((DailyForecast)list.get(i)).getNight().getRainProbability();
            ai[i] = Math.max(integer.intValue(), integer1.intValue());
        }

        return ai;
    }

    private int[] buildWinterPrecipProbabilityValues(List list)
    {
        int ai[] = new int[list.size()];
        for (int i = 0; i < ai.length; i++)
        {
            Integer integer = ((DailyForecast)list.get(i)).getDay().getSnowProbability();
            Integer integer1 = ((DailyForecast)list.get(i)).getNight().getSnowProbability();
            Integer integer2 = ((DailyForecast)list.get(i)).getDay().getIceProbability();
            Integer integer3 = ((DailyForecast)list.get(i)).getNight().getIceProbability();
            int j = Math.max(integer.intValue(), integer1.intValue());
            ai[i] = Math.max(Math.max(integer2.intValue(), integer3.intValue()), j);
        }

        return ai;
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

    private int getHeadlineSeverity()
    {
        if (mWeatherDataModel.getForecast().getHeadline() != null && mWeatherDataModel.getForecast().getHeadline().getSeverity() != null)
        {
            return mWeatherDataModel.getForecast().getHeadline().getSeverity().intValue();
        } else
        {
            return 0;
        }
    }

    private String getHeadlineText()
    {
        if (mWeatherDataModel.getForecast().getHeadline() != null)
        {
            return mWeatherDataModel.getForecast().getHeadline().getText();
        } else
        {
            return "";
        }
    }

    private int[] getWeekendDates(List list)
    {
        int j = -1;
        byte byte0 = -1;
        Calendar calendar = Calendar.getInstance(getResources().getConfiguration().locale);
        int i = 0;
        while (i < list.size()) 
        {
            java.util.Date date = DateUtils.toDate(((DailyForecast)list.get(i)).getDate(), getActivity());
            int k = j;
            int l = byte0;
            if (date != null)
            {
                calendar.setTime(date);
                k = j;
                l = byte0;
                if (calendar.get(7) == 7)
                {
                    k = calendar.get(5);
                    if (j == -1)
                    {
                        l = byte0;
                    } else
                    {
                        l = k;
                        k = j;
                    }
                }
            }
            i++;
            j = k;
            byte0 = l;
        }
        return (new int[] {
            j, byte0
        });
    }

    private void init()
    {
        mTemperatureVisualization = (TemperatureVisualization)getView().findViewById(com.accuweather.android.R.id.temperature_visualization);
        mPrecipitationVisualization = (PrecipitationVisualization)getView().findViewById(com.accuweather.android.R.id.precipitation_visualization);
        mList = (ListView)getView().findViewById(com.accuweather.android.R.id.list);
        mAdapter = new DailyListAdapter(getActivity(), new ForecastResult());
        Object obj = ((LayoutInflater)getActivity().getSystemService("layout_inflater")).inflate(com.accuweather.android.R.layout.amazon_details, null, false);
        mList.addFooterView(((View) (obj)));
        mList.setAdapter(mAdapter);
        mList.setOnItemClickListener(this);
        int i = getActivity().getResources().getColor(com.accuweather.android.R.color.secondary_text);
        int j = getActivity().getResources().getColor(com.accuweather.android.R.color.light_pink);
        int k = getActivity().getResources().getColor(com.accuweather.android.R.color.secondary_text);
        int l = getActivity().getResources().getColor(com.accuweather.android.R.color.light_blue);
        Object obj1 = new ArrayList();
        ((List) (obj1)).add(TEMPERATURE);
        ((List) (obj1)).add(PRECIPITATION);
        obj = (IcsSpinner)getView().findViewById(com.accuweather.android.R.id.spinner);
        mSpinner = ((IcsSpinner) (obj));
        obj1 = new TitleSpinnerAdapterWithHeader(getActivity(), com.accuweather.android.R.layout.location_spinner_item, ((List) (obj1)), new int[] {
            i & 0xffffff, j & 0xffffff, k & 0xffffff, l & 0xffffff
        });
        mSpinnerAdapter = ((TitleSpinnerAdapterWithHeader) (obj1));
        ((TitleSpinnerAdapterWithHeader) (obj1)).setOverrideDefaultActions(false);
        ((TitleSpinnerAdapterWithHeader) (obj1)).setTitleSpinnerListener(this);
        ((IcsSpinner) (obj)).setAdapter(((android.widget.SpinnerAdapter) (obj1)));
        ((IcsSpinner) (obj)).setBackgroundResource(com.accuweather.android.R.drawable.abs__spinner_ab_holo_light);
        mCurrentSpinnerPosition = PreferenceUtils.get(getActivity(), "forecast_spinner_selection", 0);
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

    public static DailyFragment newInstance(ForecastFragmentModel forecastfragmentmodel)
    {
        DailyFragment dailyfragment = new DailyFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("content", forecastfragmentmodel);
        dailyfragment.setArguments(bundle);
        return dailyfragment;
    }

    private void setSpinnerSelectionWithoutCallingListener(final IcsSpinner spinner, final int selection)
    {
        spinner.setOnItemSelectedListener(null);
        spinner.post(new Runnable() {

            final DailyFragment this$0;
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
                this$0 = DailyFragment.this;
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
            updateVisualizationForTemperature();
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
        if (mAdapter != null)
        {
            mAdapter.updateAdapter(mWeatherDataModel.getForecast());
            mList.setSelectionAfterHeaderView();
        }
        mPrecipitationVisualization.setVisibility(0);
        mTemperatureVisualization.setVisibility(8);
        ForecastResult forecastresult = mWeatherDataModel.getForecast();
        String as[] = buildLabels();
        int ai[] = buildRainProbabilityValues(forecastresult.getDailyForecasts());
        int ai1[] = buildWinterPrecipProbabilityValues(forecastresult.getDailyForecasts());
        int ai2[] = new int[mWeatherDataModel.getForecast().getDailyForecasts().size()];
        for (int i = 0; i < ai2.length; i++)
        {
            ai2[i] = DateUtils.getDayOfMonth(((DailyForecast)mWeatherDataModel.getForecast().getDailyForecasts().get(i)).getDate(), getActivity());
        }

        for (int j = 0; j < ai.length; j++)
        {
            if (ai1[j] > 0)
            {
                ai[j] = 0;
            }
        }

        mPrecipitationVisualization.setFirstSubsetSize(getFirstSubsetSize(ai2));
        mPrecipitationVisualization.setShouldDrawWeekendContrastBackgroundBar(true);
        mPrecipitationVisualization.setWeekendContrastBackgroundBarStartPoints(getWeekendDates(mWeatherDataModel.getForecast().getDailyForecasts()));
        mPrecipitationVisualization.setValues(ai, ai1, as, ai2);
        int k = getActivity().getResources().getColor(com.accuweather.android.R.color.secondary_text);
        mSpinnerAdapter.setColors(new int[] {
            0xffffff & k
        });
        mSpinnerAdapter.notifyDataSetChanged();
    }

    private void updateVisualizationForTemperature()
    {
        if (mWeatherDataModel == null)
        {
            return;
        }
        if (mAdapter != null)
        {
            mAdapter.updateAdapter(mWeatherDataModel.getForecast());
            mList.setSelectionAfterHeaderView();
        }
        mPrecipitationVisualization.setVisibility(8);
        mTemperatureVisualization.setVisibility(0);
        String as[] = buildLabels();
        int ai[] = new int[mWeatherDataModel.getForecast().getDailyForecasts().size()];
        int ai1[] = buildHighTemperatures(mWeatherDataModel.getForecast().getDailyForecasts());
        int ai2[] = buildLowTemperatures(mWeatherDataModel.getForecast().getDailyForecasts());
        for (int i = 0; i < ai2.length; i++)
        {
            ai2[i] = ((DailyForecast)mWeatherDataModel.getForecast().getDailyForecasts().get(i)).getLowTemperature().intValue();
        }

        for (int j = 0; j < ai.length; j++)
        {
            ai[j] = DateUtils.getDayOfMonth(((DailyForecast)mWeatherDataModel.getForecast().getDailyForecasts().get(j)).getDate(), getActivity());
        }

        mTemperatureVisualization.setFirstSubsetSize(getFirstSubsetSize(ai));
        mTemperatureVisualization.setValues(ai1, ai2, null, null, as, ai);
        mTemperatureVisualization.setPrimaryColor(getActivity().getResources().getColor(com.accuweather.android.R.color.light_pink));
        mTemperatureVisualization.setPrimaryFillColor(getActivity().getResources().getColor(com.accuweather.android.R.color.light_pink));
        mTemperatureVisualization.setSecondaryColor(getActivity().getResources().getColor(com.accuweather.android.R.color.light_blue));
        mTemperatureVisualization.setSecondaryFillColor(getActivity().getResources().getColor(com.accuweather.android.R.color.light_blue));
        int k = getActivity().getResources().getColor(com.accuweather.android.R.color.secondary_text);
        int l = getActivity().getResources().getColor(com.accuweather.android.R.color.light_pink);
        int i1 = getActivity().getResources().getColor(com.accuweather.android.R.color.secondary_text);
        int j1 = getActivity().getResources().getColor(com.accuweather.android.R.color.light_blue);
        mSpinnerAdapter.setColors(new int[] {
            k & 0xffffff, l & 0xffffff, i1 & 0xffffff, j1 & 0xffffff
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
        bundle = getResources();
        TEMPERATURE = bundle.getString(com.accuweather.android.R.string.TemperatureHiLo).toUpperCase(bundle.getConfiguration().locale);
        PRECIPITATION = bundle.getString(com.accuweather.android.R.string.Precipitation).toUpperCase(bundle.getConfiguration().locale);
        if (getActivity() instanceof IForecastFragmentListener)
        {
            mListener = (IForecastFragmentListener)getActivity();
        }
        if (getArguments() != null)
        {
            bundle = (ForecastFragmentModel)getArguments().getSerializable("content");
        } else
        {
            bundle = null;
        }
        mTitle = getString(com.accuweather.android.R.string.Daily).toUpperCase(getResources().getConfiguration().locale);
        if (bundle == null)
        {
            return;
        }
        String s = bundle.getLocationKey();
        if (s != null)
        {
            mWeatherDataModel = getData().getWeatherDataModelFromCode(s);
        }
        mIsGraphShowing = PreferenceUtils.get(getActivity(), "forecast_graph_showing", bundle.isGraphShowing());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.accuweather.android.R.layout.daily_fragment, null);
    }

    public void onDestroy()
    {
        PreferenceUtils.save(getActivity(), "forecast_spinner_selection", mSpinner.getSelectedItemPosition());
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        mListener.onForecastSelected(i);
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
                if (((FragmentPayload) (obj)).getForecastFragmentModel() != null)
                {
                    intent = ((FragmentPayload) (obj)).getForecastFragmentModel();
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

    public void setForecastFragmentListener(IForecastFragmentListener iforecastfragmentlistener)
    {
        mListener = iforecastfragmentlistener;
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
        boolean flag = false;
        if (isInitialized())
        {
            Object obj = (TextView)getView().findViewById(com.accuweather.android.R.id.headine_text);
            ((TextView) (obj)).setText(getHeadlineText());
            int i;
            if (TextUtils.isEmpty(((TextView) (obj)).getText()))
            {
                i = 8;
            } else
            {
                i = 0;
            }
            ((TextView) (obj)).setVisibility(i);
            if (getHeadlineSeverity() < 5)
            {
                i = com.accuweather.android.R.drawable.alarm_gradient;
            } else
            {
                i = com.accuweather.android.R.drawable.alarm_gradient_low_severity;
            }
            ((TextView) (obj)).setBackgroundResource(i);
            obj = getView().findViewById(com.accuweather.android.R.id.visualization);
            if (mIsGraphShowing)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            ((View) (obj)).setVisibility(i);
            updateVisualization();
            mAdapter.updateAdapter(mWeatherDataModel.getForecast());
            setTitle(mTitle);
            if (AmazonUtilities.shouldShowAmazonProducts(getActivity()))
            {
                AmazonUtilities.updateAmazonProductsView(getView(), getActivity(), getChildFragmentManager(), (DailyForecast)mWeatherDataModel.getForecast().getDailyForecasts().get(3));
                return;
            }
        }
    }

}

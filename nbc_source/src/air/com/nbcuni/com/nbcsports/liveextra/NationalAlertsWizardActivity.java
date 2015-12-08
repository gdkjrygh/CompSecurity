// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package air.com.nbcuni.com.nbcsports.liveextra;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import android.support.v7.app.ActionBar;
import android.util.Log;
import com.comscore.analytics.comScore;
import com.google.gson.Gson;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.ui.core.BaseActivity;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.content.AlertOption;
import com.phunware.nbc.sochi.content.GeoRequestResponse;
import com.phunware.nbc.sochi.fragments.NationalAlertsWizardFragment1;
import com.phunware.nbc.sochi.fragments.NationalAlertsWizardFragment2;
import com.phunware.nbc.sochi.fragments.NationalAlertsWizardFragment3;
import com.phunware.nbc.sochi.system.AppSharedPreferences;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.urbanairship.push.PushManager;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NationalAlertsWizardActivity extends BaseActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, com.phunware.nbc.sochi.fragments.NationalAlertsWizardFragment1.NaWizardCallback1, com.phunware.nbc.sochi.fragments.NationalAlertsWizardFragment2.NaWizardCallback2, com.phunware.nbc.sochi.fragments.NationalAlertsWizardFragment3.NaWizardCallback3
{
    public static class DataContainer
    {

        public List alertOptions;
        public RsnDmaModel rsnDmaModel;

        public DataContainer()
        {
            alertOptions = new ArrayList();
            rsnDmaModel = new RsnDmaModel();
        }
    }

    public static class RsnDmaModel
    {

        public List allRsns;
        public String dma;
        public List matchingRsns;

        public String toString()
        {
            return (new StringBuilder()).append("RsnDmaModel [matchingRsns=").append(matchingRsns).append(", allRsns=").append(allRsns).append(", dma=").append(dma).append("]").toString();
        }

        public RsnDmaModel()
        {
            matchingRsns = new ArrayList();
            allRsns = new ArrayList();
        }
    }

    public static class RsnDmaModel.RsnDma
    {

        public String dma;
        public String market;
        public String rsn;

        public String toString()
        {
            return (new StringBuilder()).append("RsnDma [dma=").append(dma).append(", rsn=").append(rsn).append(", market=").append(market).append("]").toString();
        }

        public RsnDmaModel.RsnDma()
        {
        }
    }

    public static class RsnDmaModel.RsnDmaList extends ArrayList
    {

        public RsnDmaModel.RsnDmaList()
        {
        }
    }

    public static class RsnLoader extends AsyncTaskLoader
    {

        private final Configuration configuration;
        private OkHttpClient mClient;
        private DataContainer mData;
        private Gson mGson;

        private void fetchAlertOptions()
        {
            Object obj = configuration.getAlertsUrl();
            if (obj == null) goto _L2; else goto _L1
_L1:
            if (((String) (obj)).isEmpty()) goto _L2; else goto _L3
_L3:
            obj = new URL(((String) (obj)));
            obj = (new com.squareup.okhttp.Request.Builder()).url(((URL) (obj))).get().build();
            obj = mClient.newCall(((com.squareup.okhttp.Request) (obj))).execute().body().string();
            mData.alertOptions = (List)mGson.fromJson(((String) (obj)), com/phunware/nbc/sochi/content/AlertOption$Collection);
            obj = PushManager.shared().getTags();
            Iterator iterator = mData.alertOptions.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj1 = (AlertOption)iterator.next();
                ((AlertOption) (obj1)).setSelected(((Set) (obj)).contains(((AlertOption) (obj1)).getTag()));
                if (((AlertOption) (obj1)).getSubsections() != null)
                {
                    obj1 = ((AlertOption) (obj1)).getSubsections().iterator();
                    while (((Iterator) (obj1)).hasNext()) 
                    {
                        AlertOption alertoption = (AlertOption)((Iterator) (obj1)).next();
                        alertoption.setSelected(((Set) (obj)).contains(alertoption.getTag()));
                    }
                }
            } while (true);
            break MISSING_BLOCK_LABEL_198;
            obj;
            ((IOException) (obj)).printStackTrace();
            return;
_L2:
            obj = "http://stream.nbcsports.com/data/mobile/alerts.json";
            if (true) goto _L3; else goto _L4
_L4:
        }

        private void findRSNs()
        {
            Object obj;
            try
            {
                obj = configuration.getRsnDmaUrl();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                return;
            }
            if (obj == null) goto _L2; else goto _L1
_L1:
            if (((String) (obj)).isEmpty()) goto _L2; else goto _L3
_L3:
            obj = new URL(((String) (obj)));
            obj = (new com.squareup.okhttp.Request.Builder()).url(((URL) (obj))).get().build();
            obj = mClient.newCall(((com.squareup.okhttp.Request) (obj))).execute().body().string();
            mData.rsnDmaModel.allRsns = (List)mGson.fromJson(((String) (obj)), air/com/nbcuni/com/nbcsports/liveextra/NationalAlertsWizardActivity$RsnDmaModel$RsnDmaList);
            obj = mData.rsnDmaModel.allRsns.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                RsnDmaModel.RsnDma rsndma = (RsnDmaModel.RsnDma)((Iterator) (obj)).next();
                if (mData.rsnDmaModel.dma != null && mData.rsnDmaModel.dma.equals(rsndma.dma))
                {
                    mData.rsnDmaModel.matchingRsns.add(rsndma);
                }
            } while (true);
            break; /* Loop/switch isn't completed */
_L2:
            obj = "http://stream.nbcsports.com/data/mobile/rsndma.json";
            if (true) goto _L3; else goto _L4
_L4:
            Log.d("Alerts", (new StringBuilder()).append("Matching rsns: ").append(mData.rsnDmaModel.matchingRsns).toString());
            return;
        }

        public DataContainer loadInBackground()
        {
            if (getContext() != null && (!(getContext() instanceof Activity) || !((Activity)getContext()).isFinishing()))
            {
                break MISSING_BLOCK_LABEL_37;
            }
            cancelLoad();
            return null;
            if (mData != null) goto _L2; else goto _L1
_L1:
            mData = new DataContainer();
            if (!NBCSystem.IS_GEO_LOCATION_ENABLED) goto _L4; else goto _L3
_L3:
            mData.rsnDmaModel.dma = NBCSystem.LAST_KNOWN_GEO_LOCATION.NielsonDMA;
            findRSNs();
_L5:
            fetchAlertOptions();
_L2:
            deliverResult(mData);
_L6:
            return mData;
_L4:
            mData.rsnDmaModel.dma = null;
            findRSNs();
              goto _L5
            Exception exception;
            exception;
            mData = new DataContainer();
            NBCSystem.debugLog("NationalAlertsWizardActivity", exception.toString());
              goto _L6
        }

        public volatile Object loadInBackground()
        {
            return loadInBackground();
        }

        public RsnLoader(Context context)
        {
            super(context);
            mData = null;
            context = NBCSportsApplication.component();
            mGson = context.gson();
            mClient = context.okHttpClient();
            configuration = context.configuration();
        }
    }


    private static final String FRAGMENT_TAG_WIZARD_1 = "FRAGMENT_TAG_WIZARD_1";
    private static final String FRAGMENT_TAG_WIZARD_2 = "FRAGMENT_TAG_WIZARD_2";
    private static final String FRAGMENT_TAG_WIZARD_3 = "FRAGMENT_TAG_WIZARD_3";
    private static final String FRAGMENT_TAG_WIZARD_4 = "FRAGMENT_TAG_WIZARD_4";
    public static final String PREF_SELECTED_DMA = "PREF_SELECTED_DMA";
    private Configuration configuration;
    private List mAlertOptions;
    private Set mCurrentTags;
    private RsnDmaModel mData;
    private List mSelectedAlertOptions;

    public NationalAlertsWizardActivity()
    {
    }

    public void onCloseClicked()
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04001d);
        configuration = NBCSportsApplication.component().configuration();
        setOrientation();
        mCurrentTags = PushManager.shared().getTags();
        getSupportActionBar().hide();
        if (mCurrentTags == null)
        {
            mCurrentTags = new HashSet();
        }
        if (bundle == null)
        {
            getSupportFragmentManager().beginTransaction().add(0x7f0f006d, NationalAlertsWizardFragment1.newInstance(false), "FRAGMENT_TAG_WIZARD_1").commit();
        }
        getSupportLoaderManager().restartLoader(0, null, this).forceLoad();
        mSelectedAlertOptions = new ArrayList();
        Log.d("Alerts", (new StringBuilder()).append("Current tags: ").append(mCurrentTags).toString());
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new RsnLoader(this);
    }

    public void onLoadFinished(Loader loader, DataContainer datacontainer)
    {
        mData = datacontainer.rsnDmaModel;
        mAlertOptions = datacontainer.alertOptions;
        runOnUiThread(new Runnable() {

            final NationalAlertsWizardActivity this$0;

            public void run()
            {
                NationalAlertsWizardFragment1 nationalalertswizardfragment1 = (NationalAlertsWizardFragment1)getSupportFragmentManager().findFragmentByTag("FRAGMENT_TAG_WIZARD_1");
                if (nationalalertswizardfragment1 != null)
                {
                    nationalalertswizardfragment1.setNextButtonEnabled(true);
                }
            }

            
            {
                this$0 = NationalAlertsWizardActivity.this;
                super();
            }
        });
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (DataContainer)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onNationalAlertOptionsChosen(List list, List list1)
    {
        mSelectedAlertOptions.addAll(list);
        Log.d("Alerts", "onNationalAlertOptionsChosen()");
        Log.d("Alerts", (new StringBuilder()).append("AlertOptions chosen: ").append(list).toString());
        Log.d("Alerts", (new StringBuilder()).append("About to modify tags: ").append(mCurrentTags).toString());
        list1 = list1.iterator();
        do
        {
            if (!list1.hasNext())
            {
                break;
            }
            AlertOption alertoption = (AlertOption)list1.next();
            mCurrentTags.remove(alertoption.getTag());
            if (alertoption.getTag().equals("dont_miss_9_11_ET"))
            {
                mCurrentTags.remove("full_event_9_11_ET");
                mCurrentTags.remove("on_tv");
            }
        } while (true);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            list1 = (AlertOption)list.next();
            mCurrentTags.add(list1.getTag());
            if (list1.getTag().equals("dont_miss_9_11_ET"))
            {
                mCurrentTags.add("full_event_9_11_ET");
                mCurrentTags.add("on_tv");
            }
        } while (true);
        Log.d("Alerts", (new StringBuilder()).append("Subscribing to tags: ").append(mCurrentTags).toString());
        PushManager.shared().setTags(mCurrentTags);
        PushManager.shared().updateApidIfNecessary();
        getSupportFragmentManager().beginTransaction().add(0x7f0f006d, NationalAlertsWizardFragment1.newInstance(true), "FRAGMENT_TAG_WIZARD_4").addToBackStack(null).commit();
    }

    public void onNextClicked()
    {
        getSupportFragmentManager().beginTransaction().add(0x7f0f006d, NationalAlertsWizardFragment2.newInstance(mData), "FRAGMENT_TAG_WIZARD_2").addToBackStack(null).commit();
    }

    public void onNoClicked()
    {
        Log.d("Alerts", "onNoClicked()");
        NationalAlertsWizardFragment2 nationalalertswizardfragment2 = (NationalAlertsWizardFragment2)getSupportFragmentManager().findFragmentByTag("FRAGMENT_TAG_WIZARD_2");
        if (nationalalertswizardfragment2 == null)
        {
            mData.matchingRsns.clear();
            getSupportFragmentManager().beginTransaction().add(0x7f0f006d, NationalAlertsWizardFragment2.newInstance(mData), "FRAGMENT_TAG_WIZARD_2").addToBackStack(null).commit();
            return;
        } else
        {
            nationalalertswizardfragment2.showAllRsnDmas();
            return;
        }
    }

    public void onNoneOfTheseClicked()
    {
        NationalAlertsWizardFragment3 nationalalertswizardfragment3 = (NationalAlertsWizardFragment3)getSupportFragmentManager().findFragmentByTag("FRAGMENT_TAG_WIZARD_3");
        if (nationalalertswizardfragment3 == null)
        {
            getSupportFragmentManager().beginTransaction().add(0x7f0f006d, NationalAlertsWizardFragment3.newInstance(mData, mAlertOptions, new ArrayList(), true, false), "FRAGMENT_TAG_WIZARD_3").addToBackStack(null).commit();
            return;
        } else
        {
            nationalalertswizardfragment3.showAllAlertOptions();
            return;
        }
    }

    protected void onPause()
    {
        super.onPause();
        comScore.onExitForeground();
    }

    public void onRegionalAlertOptionsChosen(List list, List list1)
    {
        mSelectedAlertOptions.addAll(list);
        Log.d("Alerts", "onRegionalAlertOptionsChosen()");
        Log.d("Alerts", (new StringBuilder()).append("AlertOptions chosen: ").append(list).toString());
        Log.d("Alerts", (new StringBuilder()).append("AlertOptions NOT chosen: ").append(list1).toString());
        AlertOption alertoption;
        for (list1 = list1.iterator(); list1.hasNext(); mCurrentTags.remove(alertoption.getTag()))
        {
            alertoption = (AlertOption)list1.next();
        }

        for (list = list.iterator(); list.hasNext(); mCurrentTags.add(list1.getTag()))
        {
            list1 = (AlertOption)list.next();
        }

        list = (NationalAlertsWizardFragment3)getSupportFragmentManager().findFragmentByTag("FRAGMENT_TAG_WIZARD_3");
        if (list == null)
        {
            getSupportFragmentManager().beginTransaction().add(0x7f0f006d, NationalAlertsWizardFragment3.newInstance(mData, mAlertOptions, new ArrayList(), true, false), "FRAGMENT_TAG_WIZARD_3").addToBackStack(null).commit();
            return;
        } else
        {
            list.showAllAlertOptions();
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        comScore.onEnterForeground();
    }

    public void onRsnDmasChosen(List list)
    {
        Log.d("Alerts", "onRsnDmasChosen()");
        Log.d("Alerts", (new StringBuilder()).append("Selected RsnDmas: ").append(list.toString()).toString());
        if ((NationalAlertsWizardFragment3)getSupportFragmentManager().findFragmentByTag("FRAGMENT_TAG_WIZARD_3") == null)
        {
            if (list != null && list.size() == 1)
            {
                AppSharedPreferences.addSetting(this, "PREF_SELECTED_DMA", ((RsnDmaModel.RsnDma)list.get(0)).dma);
            }
            getSupportFragmentManager().beginTransaction().add(0x7f0f006d, NationalAlertsWizardFragment3.newInstance(mData, mAlertOptions, list, false, false), "FRAGMENT_TAG_WIZARD_3").addToBackStack(null).commit();
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.text.Html;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.tracker.TrackerManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.fragments.AlertFragment;
import com.dominos.fragments.AlertFragment_;
import com.dominos.notification.TrackerService_;
import com.dominos.remote.receiver.NotificationReceiver;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.StoreNumberOrder;
import com.dominos.views.TrackerAdapter;
import com.google.a.b.ar;
import java.util.ArrayList;

// Referenced classes of package com.dominos.activities:
//            IndexingActivity, TrackerActivity_, TermsWebActivity

public class PizzaTrackerPhoneNumberActivity extends IndexingActivity
    implements com.dominos.android.sdk.data.http.power.PowerCallback.OnError, com.dominos.fragments.AlertFragment.OnAlertDismissListener
{

    public static final String SPKEY_TRACKERPHONE = "trackerPhone";
    public static final String SPKEY_TRACKERPHONE_EXTENSION = "trackerPhoneExtension";
    private static final String TRACKER_BY_PHONE_TAG = "trackerByPhoneTag";
    private TrackerAdapter adapter;
    private boolean goOnProfile;
    private int launchId;
    TextView lblTermsOfUse;
    private ListView listView;
    EditText mPhoneExtension;
    EditText mPhoneNumber;
    TrackerManager mTrackerManager;
    private ArrayList orders;
    private ar trackings;

    public PizzaTrackerPhoneNumberActivity()
    {
        launchId = -1;
        goOnProfile = false;
    }

    private void launchTracker(StoreNumberOrder storenumberorder)
    {
        mAnalyticsUtil.postPizzaTrackerSubmitted();
        TrackerOrderStatus trackerorderstatus = storenumberorder.status;
        mTrackerManager.clear();
        Intent intent = new Intent(getApplicationContext(), com/dominos/notification/TrackerService_);
        intent.putExtra("phone", trackerorderstatus.getPhone());
        intent.putExtra("extension", "");
        intent.putExtra("orderID", storenumberorder.status.getOrderId());
        intent.putExtra("storeProfile", storenumberorder.storeProfile);
        intent.putExtra("tracker-receiver", new NotificationReceiver());
        if (storenumberorder.storeProfile != null)
        {
            intent.putExtra("storeID", storenumberorder.storeProfile.getStoreId());
        }
        intent.setAction("OrderPlaced");
        startService(intent);
        TrackerActivity_.intent(this).mOrderId(storenumberorder.status.getOrderId()).mStoreProfile(storenumberorder.storeProfile).mOrderStatus(trackerorderstatus).start();
        finish();
    }

    public void displayTerms(View view)
    {
        startActivity(new Intent(this, com/dominos/activities/TermsWebActivity));
    }

    public int getIndexingResourceId()
    {
        return 0x7f090004;
    }

    public boolean handleHomeButtonClicked()
    {
        if (mStoreManager.getStoreProfile() != StoreProfile.EMPTY)
        {
            goToCart();
        }
        finish();
        return true;
    }

    void init()
    {
        String s = getResources().getString(0x7f080325);
        lblTermsOfUse.setText(Html.fromHtml(s));
        if (App.settings().contains("trackerPhone"))
        {
            mPhoneNumber.setText(App.settings().getString("trackerPhone", ""));
        }
        if (App.settings().contains("trackerPhoneExtension"))
        {
            mPhoneExtension.setText(App.settings().getString("trackerPhoneExtension", ""));
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03009b);
        ((TextView)findViewById(0x7f0f000f)).setText(getString(0x7f080241));
        listView = (ListView)findViewById(0x7f0f035a);
        orders = new ArrayList();
        listView.setOnItemClickListener(new _cls1());
    }

    public void onError(Exception exception, String s)
    {
        if (!isActivityValid())
        {
            return;
        } else
        {
            hideLoading();
            showShortToast(getString(0x7f080119));
            return;
        }
    }

    protected void onStart()
    {
        super.onStart();
        mAnalyticsUtil.postPizzaTrackerResume();
    }

    public void onSubmitClick(View view)
    {
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(mPhoneNumber.getWindowToken(), 0);
        view = mPhoneNumber.getText().toString().replace("-", "");
        String s = mPhoneExtension.getText().toString();
        App.editor().putString("trackerPhone", view);
        App.editor().putString("trackerPhoneExtension", s);
        App.editor().commit();
        mPowerService.trackOrderByPhone(view, s, new _cls2(this));
    }

    public void processStoreProfileJson(String s, int i)
    {
        StoreNumberOrder storenumberorder = (StoreNumberOrder)orders.get(i);
        storenumberorder.storeProfile = StoreProfile.from(s);
        if (goOnProfile)
        {
            storenumberorder.status = (TrackerOrderStatus)trackings.get(0);
            launchTracker(storenumberorder);
            return;
        }
        if (launchId == i)
        {
            launchTracker(storenumberorder);
            return;
        } else
        {
            adapter.notifyDataSetChanged();
            return;
        }
    }

    protected void showOrderNotFoundDialog()
    {
        AlertFragment alertfragment = (AlertFragment)getSupportFragmentManager().a("trackerByPhoneTag");
        if (alertfragment != null)
        {
            getSupportFragmentManager().a().a(alertfragment).b();
        }
        AlertFragment_.builder().title(getString(0x7f0801dc)).message(getString(0x7f0801db)).build().show(getSupportFragmentManager(), "trackerByPhoneTag");
    }



/*
    static int access$102(PizzaTrackerPhoneNumberActivity pizzatrackerphonenumberactivity, int i)
    {
        pizzatrackerphonenumberactivity.launchId = i;
        return i;
    }

*/



/*
    static ar access$202(PizzaTrackerPhoneNumberActivity pizzatrackerphonenumberactivity, ar ar1)
    {
        pizzatrackerphonenumberactivity.trackings = ar1;
        return ar1;
    }

*/


/*
    static boolean access$302(PizzaTrackerPhoneNumberActivity pizzatrackerphonenumberactivity, boolean flag)
    {
        pizzatrackerphonenumberactivity.goOnProfile = flag;
        return flag;
    }

*/




/*
    static TrackerAdapter access$502(PizzaTrackerPhoneNumberActivity pizzatrackerphonenumberactivity, TrackerAdapter trackeradapter)
    {
        pizzatrackerphonenumberactivity.adapter = trackeradapter;
        return trackeradapter;
    }

*/


    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final PizzaTrackerPhoneNumberActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            mAnalyticsUtil.postPizzaTrackerSubmitted();
            adapterview = (StoreNumberOrder)view.getTag();
            if (((StoreNumberOrder) (adapterview)).storeProfile != null)
            {
                launchTracker(adapterview);
                return;
            } else
            {
                launchId = i;
                LogUtil.d("trackerByPhoneTag", "Store profile empty!", new Object[0]);
                return;
            }
        }

        _cls1()
        {
            this$0 = PizzaTrackerPhoneNumberActivity.this;
            super();
        }
    }


    private class _cls2 extends DelegatingCallback
    {

        final PizzaTrackerPhoneNumberActivity this$0;

        public void onBegin()
        {
            showLoading();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            boolean flag = false;
            hideLoading();
            s = TrackerResult.from(s);
            trackings = s.getOrderStatuses();
            if (trackings != null)
            {
                if (trackings.size() == 0)
                {
                    mAnalyticsUtil.postOrderNotFound();
                    showOrderNotFoundDialog();
                } else
                {
                    if (trackings.size() == 1)
                    {
                        goOnProfile = true;
                        orders.add(new StoreNumberOrder((TrackerOrderStatus)trackings.get(0), null));
                        class _cls1 extends DelegatingCallback
                        {

                            final _cls2 this$1;

                            public volatile void onSuccess(Object obj)
                            {
                                onSuccess((String)obj);
                            }

                            public void onSuccess(String s1)
                            {
                                processStoreProfileJson(s1, 0);
                            }

                _cls1(PowerCallback powercallback)
                {
                    this$1 = _cls2.this;
                    super(powercallback);
                }
                        }

                        mPowerService.getStoreProfile(((StoreNumberOrder)orders.get(0)).status.getStoreId(), new _cls1(PizzaTrackerPhoneNumberActivity.this));
                        return;
                    }
                    orders.clear();
                    int i = trackings.size() - 1;
                    for (int j = 0; i >= 0 && j <= 9; i--)
                    {
                        s = new StoreNumberOrder((TrackerOrderStatus)trackings.get(i), null);
                        orders.add(s);
                        j++;
                    }

                    adapter = new TrackerAdapter(PizzaTrackerPhoneNumberActivity.this, orders);
                    class _cls2
                        implements Runnable
                    {

                        final _cls2 this$1;

                        public void run()
                        {
                            listView.setAdapter(adapter);
                        }

                _cls2()
                {
                    this$1 = _cls2.this;
                    super();
                }
                    }

                    runOnUiThread(new _cls2());
                    i = ((flag) ? 1 : 0);
                    while (i < orders.size()) 
                    {
                        class _cls3 extends DelegatingCallback
                        {

                            final _cls2 this$1;
                            final int val$orderIndex;

                            public volatile void onSuccess(Object obj)
                            {
                                onSuccess((String)obj);
                            }

                            public void onSuccess(String s1)
                            {
                                processStoreProfileJson(s1, orderIndex);
                            }

                _cls3(int i)
                {
                    this$1 = _cls2.this;
                    orderIndex = i;
                    super(final_powercallback);
                }
                        }

                        mPowerService.getStoreProfile(((StoreNumberOrder)orders.get(i)).status.getStoreId(), new _cls3(i));
                        i++;
                    }
                }
                return;
            } else
            {
                showShortToast(getString(0x7f080254));
                return;
            }
        }

        _cls2(PowerCallback powercallback)
        {
            this$0 = PizzaTrackerPhoneNumberActivity.this;
            super(powercallback);
        }
    }

}

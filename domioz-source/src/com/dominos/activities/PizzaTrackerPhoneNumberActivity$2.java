// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerResult;
import com.dominos.android.sdk.data.http.power.DelegatingCallback;
import com.dominos.android.sdk.data.http.power.PowerCallback;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.StoreNumberOrder;
import com.dominos.views.TrackerAdapter;
import com.google.a.b.ar;
import java.util.ArrayList;

// Referenced classes of package com.dominos.activities:
//            PizzaTrackerPhoneNumberActivity

class k extends DelegatingCallback
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
        PizzaTrackerPhoneNumberActivity.access$202(PizzaTrackerPhoneNumberActivity.this, s.getOrderStatuses());
        if (PizzaTrackerPhoneNumberActivity.access$200(PizzaTrackerPhoneNumberActivity.this) != null)
        {
            if (PizzaTrackerPhoneNumberActivity.access$200(PizzaTrackerPhoneNumberActivity.this).size() == 0)
            {
                mAnalyticsUtil.postOrderNotFound();
                showOrderNotFoundDialog();
            } else
            {
                if (PizzaTrackerPhoneNumberActivity.access$200(PizzaTrackerPhoneNumberActivity.this).size() == 1)
                {
                    PizzaTrackerPhoneNumberActivity.access$302(PizzaTrackerPhoneNumberActivity.this, true);
                    PizzaTrackerPhoneNumberActivity.access$400(PizzaTrackerPhoneNumberActivity.this).add(new StoreNumberOrder((TrackerOrderStatus)PizzaTrackerPhoneNumberActivity.access$200(PizzaTrackerPhoneNumberActivity.this).get(0), null));
                    class _cls1 extends DelegatingCallback
                    {

                        final PizzaTrackerPhoneNumberActivity._cls2 this$1;

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
                this$1 = PizzaTrackerPhoneNumberActivity._cls2.this;
                super(powercallback);
            }
                    }

                    mPowerService.getStoreProfile(((StoreNumberOrder)PizzaTrackerPhoneNumberActivity.access$400(PizzaTrackerPhoneNumberActivity.this).get(0)).status.getStoreId(), new _cls1(PizzaTrackerPhoneNumberActivity.this));
                    return;
                }
                PizzaTrackerPhoneNumberActivity.access$400(PizzaTrackerPhoneNumberActivity.this).clear();
                int i = PizzaTrackerPhoneNumberActivity.access$200(PizzaTrackerPhoneNumberActivity.this).size() - 1;
                for (int j = 0; i >= 0 && j <= 9; i--)
                {
                    s = new StoreNumberOrder((TrackerOrderStatus)PizzaTrackerPhoneNumberActivity.access$200(PizzaTrackerPhoneNumberActivity.this).get(i), null);
                    PizzaTrackerPhoneNumberActivity.access$400(PizzaTrackerPhoneNumberActivity.this).add(s);
                    j++;
                }

                PizzaTrackerPhoneNumberActivity.access$502(PizzaTrackerPhoneNumberActivity.this, new TrackerAdapter(PizzaTrackerPhoneNumberActivity.this, PizzaTrackerPhoneNumberActivity.access$400(PizzaTrackerPhoneNumberActivity.this)));
                class _cls2
                    implements Runnable
                {

                    final PizzaTrackerPhoneNumberActivity._cls2 this$1;

                    public void run()
                    {
                        PizzaTrackerPhoneNumberActivity.access$600(this$0).setAdapter(PizzaTrackerPhoneNumberActivity.access$500(this$0));
                    }

            _cls2()
            {
                this$1 = PizzaTrackerPhoneNumberActivity._cls2.this;
                super();
            }
                }

                runOnUiThread(new _cls2());
                i = ((flag) ? 1 : 0);
                while (i < PizzaTrackerPhoneNumberActivity.access$400(PizzaTrackerPhoneNumberActivity.this).size()) 
                {
                    class _cls3 extends DelegatingCallback
                    {

                        final PizzaTrackerPhoneNumberActivity._cls2 this$1;
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
                this$1 = PizzaTrackerPhoneNumberActivity._cls2.this;
                orderIndex = i;
                super(final_powercallback);
            }
                    }

                    mPowerService.getStoreProfile(((StoreNumberOrder)PizzaTrackerPhoneNumberActivity.access$400(PizzaTrackerPhoneNumberActivity.this).get(i)).status.getStoreId(), new _cls3(i));
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

    _cls3(PowerCallback powercallback)
    {
        this$0 = PizzaTrackerPhoneNumberActivity.this;
        super(powercallback);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import android.widget.TextView;
import com.dominos.App;
import com.dominos.activities.HistoricalListActivity_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.dialogs.LoginDialogFragment;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.fragments.landing:
//            ReOrderFragment, EasyOrderFragment_

public class EasyOrderFragment extends ReOrderFragment
{

    TextView easyOrderHeader;
    TextView easyOrderName;
    TextView easyOrderReorder;
    private EasyOrderBusSubscriber mEasyOrderBus;

    public EasyOrderFragment()
    {
    }

    private void displayEasyOrderName(LabsOrder labsorder)
    {
label0:
        {
label1:
            {
                if (labsorder == null)
                {
                    break label0;
                }
                String s = mProfileManager.getEasyOrder().getEasyOrderNickName();
                if (s != null)
                {
                    labsorder = s;
                    if (!s.trim().equals(""))
                    {
                        break label1;
                    }
                }
                labsorder = getString(0x7f0800ef);
            }
            easyOrderName.setText(String.format("\"%s\"", new Object[] {
                labsorder
            }));
        }
    }

    private void navigateToRecentOrders()
    {
        mSpeechManager.preventNinaPause();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ShowEasyOrder());
        ((com.dominos.activities.HistoricalListActivity_.IntentBuilder_)HistoricalListActivity_.intent(this).flags(0x40000000)).start();
    }

    public static EasyOrderFragment newInstance()
    {
        return new EasyOrderFragment_();
    }

    private void onSessionTimedOut()
    {
        mProfileManager.clearCurrentUser();
        showLongToast(getString(0x7f0802a2));
        mSpeechManager.resetDialogModel();
    }

    private void showLoginDialog(final LabsOrder order)
    {
        LoginDialogFragment.newInstance(mProfileManager.getCurrentUser().getFirstName(), null, false, false, new _cls1()).show(getFragmentManager());
    }

    void onAfterViews()
    {
        FontManager.applyDominosFont(this);
        displayEasyOrderName(mProfileManager.getEasyOrder());
    }

    public void onEasyOrderDetailsClick()
    {
        showEasyOrderDetails();
    }

    public void onEasyOrderReorderButton()
    {
        mAnalyticsUtil.postReorder();
        orderEasyOrder();
    }

    public void onPause()
    {
        super.onPause();
        if (mEasyOrderBus != null)
        {
            App.getInstance().bus.unregister(mEasyOrderBus);
            mEasyOrderBus = null;
        }
    }

    public void onResume()
    {
        super.onResume();
        if (mEasyOrderBus == null)
        {
            mEasyOrderBus = new EasyOrderBusSubscriber(null);
        }
        App.getInstance().bus.register(mEasyOrderBus);
    }

    protected void orderEasyOrder()
    {
        if (mProfileManager.isSessionTimedOut())
        {
            onSessionTimedOut();
            return;
        }
        mOrderManager.setOrderType(com.dominos.android.sdk.core.order.OrderManager.OrderType.EASY_ORDER);
        LabsOrder labsorder = mProfileManager.getEasyOrder();
        if (mProfileManager.isAuthorizedToPlaceOrder(labsorder))
        {
            reorder(new LabsOrder(labsorder));
            return;
        } else
        {
            showLoginDialog(labsorder);
            return;
        }
    }

    protected void showEasyOrderDetails()
    {
        if (mProfileManager.isSessionTimedOut())
        {
            onSessionTimedOut();
            return;
        } else
        {
            mOrderManager.setOrderType(com.dominos.android.sdk.core.order.OrderManager.OrderType.EASY_ORDER);
            navigateToRecentOrders();
            return;
        }
    }

    private class _cls1
        implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
    {

        final EasyOrderFragment this$0;
        final LabsOrder val$order;

        public void onCanceled()
        {
            mSpeechManager.resetDialogModel();
        }

        public void onContinueAsGuest()
        {
        }

        public void onLoginSuccess()
        {
            reorder(order);
        }

        public void onSignOut()
        {
            mSpeechManager.resetDialogModel();
            ((com.dominos.activities.LandingActivity_.IntentBuilder_)LandingActivity_.intent(getActivity()).flags(0x4000000)).start();
        }

        _cls1()
        {
            this$0 = EasyOrderFragment.this;
            order = labsorder;
            super();
        }
    }


    private class EasyOrderBusSubscriber
    {

        final EasyOrderFragment this$0;

        public void onReorderEasyOrder(com.dominos.bus.events.OriginatedFromSpeech.EasyOrderResponse easyorderresponse)
        {
            orderEasyOrder();
        }

        public void onShowEasyOrder(com.dominos.bus.events.OriginatedFromSpeech.ShowEasyOrder showeasyorder)
        {
            showEasyOrderDetails();
        }

        private EasyOrderBusSubscriber()
        {
            this$0 = EasyOrderFragment.this;
            super();
        }

        EasyOrderBusSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

}

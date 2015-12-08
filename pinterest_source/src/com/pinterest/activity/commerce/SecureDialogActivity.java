// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.commerce.dialog.CommerceFormAddressFragment;
import com.pinterest.activity.commerce.dialog.CommerceFormPaymentFragment;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Events;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.UserCard;

public class SecureDialogActivity extends BaseActivity
{

    public static final String EXTRA_ADDRESS = "user_address";
    public static final String EXTRA_CARD_INCENTIVE = "card_incentive";
    public static final String EXTRA_DIALOG_TYPE = "dialog_type";
    public static final String EXTRA_DIALOG_TYPE_ADDRESS = "address";
    public static final String EXTRA_DIALOG_TYPE_PAYMENT = "payment";
    public static final String EXTRA_MERCHANT = "merchant";
    public static final String EXTRA_SHIP_ADDRESS = "ship_address";
    public static final String EXTRA_USER_CARD = "user_card";
    public static final String TAG = com/pinterest/activity/commerce/SecureDialogActivity.getName();
    private int _contentContainerPaddingPx;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriberToast;
    private FrameLayout _fragmentContainer;
    private ToastContainer _toastContainer;

    public SecureDialogActivity()
    {
        _eventsSubscriber = new _cls2();
        _eventsSubscriberToast = new _cls3();
    }

    private void addKeyboardVisibilityListener()
    {
        final View contentView = findViewById(0x1020002);
        contentView.getViewTreeObserver().addOnGlobalLayoutListener(new _cls4());
    }

    private void updateFragmentContainerPadding(boolean flag)
    {
        int j = 0;
        FrameLayout framelayout = _fragmentContainer;
        int k = _contentContainerPaddingPx;
        int i;
        int l;
        if (flag)
        {
            i = 0;
        } else
        {
            i = _contentContainerPaddingPx;
        }
        l = _contentContainerPaddingPx;
        if (!flag)
        {
            j = _contentContainerPaddingPx;
        }
        framelayout.setPadding(k, i, l, j);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        getWindow().setFlags(8192, 8192);
        super.onCreate(bundle);
        setContentView(0x7f030054);
        _toastContainer = (ToastContainer)findViewById(0x7f0f008a);
        _fragmentContainer = (FrameLayout)findViewById(0x7f0f010f);
        _contentContainerPaddingPx = (int)Resources.dimension(0x7f0a009e);
        if (bundle != null)
        {
            return;
        }
        Intent intent = getIntent();
        String s = intent.getStringExtra("dialog_type");
        if (s == null)
        {
            if (ApplicationInfo.isNonProduction())
            {
                Toast.makeText(this, "A dialogType needs to be provided", 0).show();
            }
            finish();
            return;
        }
        bundle = null;
        if (s.equals("address"))
        {
            bundle = intent.getParcelableExtra("user_address");
            if (bundle != null)
            {
                bundle = CommerceFormAddressFragment.newInstanceForEdit((DetailedShipping)bundle);
            } else
            {
                bundle = CommerceFormAddressFragment.newInstance(intent.getStringExtra("merchant"));
            }
        } else
        if (s.equals("payment"))
        {
            bundle = intent.getParcelableExtra("user_card");
            if (bundle != null)
            {
                bundle = CommerceFormPaymentFragment.newInstanceForEdit((UserCard)bundle);
            } else
            {
                bundle = CommerceFormPaymentFragment.newInstance((DetailedShipping)intent.getParcelableExtra("ship_address"), intent.getStringExtra("merchant"), intent.getStringExtra("card_incentive"));
            }
        }
        if (bundle == null)
        {
            throw new IllegalStateException("New type? Update the logic above!");
        } else
        {
            FragmentHelper.addFragment(getSupportFragmentManager(), 0x7f0f010f, bundle);
            return;
        }
    }

    protected void onDestroy()
    {
        Events.unregister(_eventsSubscriber);
        Events.unregister(_eventsSubscriberToast);
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        Events.unregister(_eventsSubscriberToast);
    }

    protected void onResume()
    {
        super.onResume();
        Events.register(_eventsSubscriberToast);
    }

    protected void onStart()
    {
        Events.register(_eventsSubscriber);
        super.onStart();
        _fragmentContainer.setOnClickListener(new _cls1());
        addKeyboardVisibilityListener();
    }




    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final SecureDialogActivity this$0;

        public void onEventMainThread(SecureDialogActivityEvent securedialogactivityevent)
        {
            if (securedialogactivityevent.getType() == com.pinterest.activity.commerce.event.SecureDialogActivityEvent.Type.Close)
            {
                finish();
            }
        }

        _cls2()
        {
            this$0 = SecureDialogActivity.this;
            super();
        }
    }


    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final SecureDialogActivity this$0;

        public void onEventMainThread(ToastEvent toastevent)
        {
            if (_toastContainer != null)
            {
                _toastContainer.addToast(toastevent.getToast());
            }
        }

        _cls3()
        {
            this$0 = SecureDialogActivity.this;
            super();
        }
    }


    private class _cls4
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        private int mPreviousHeight;
        final SecureDialogActivity this$0;
        final View val$contentView;

        public void onGlobalLayout()
        {
            int i = contentView.getHeight();
            if (mPreviousHeight == 0) goto _L2; else goto _L1
_L1:
            if (mPreviousHeight <= i) goto _L4; else goto _L3
_L3:
            updateFragmentContainerPadding(true);
_L2:
            mPreviousHeight = i;
            return;
_L4:
            if (mPreviousHeight < i)
            {
                updateFragmentContainerPadding(false);
            }
            if (true) goto _L2; else goto _L5
_L5:
        }

        _cls4()
        {
            this$0 = SecureDialogActivity.this;
            contentView = view;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SecureDialogActivity this$0;

        public void onClick(View view)
        {
            finish();
        }

        _cls1()
        {
            this$0 = SecureDialogActivity.this;
            super();
        }
    }

}

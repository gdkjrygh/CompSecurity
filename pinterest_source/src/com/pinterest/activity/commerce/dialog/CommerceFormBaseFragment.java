// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.event.CloseCommerceFormDialogEvent;
import com.pinterest.activity.commerce.event.SecureDialogActivityEvent;
import com.pinterest.activity.commerce.logic.CommerceFormBaseFragmentController;
import com.pinterest.activity.commerce.view.CommerceFormView;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Events;
import com.pinterest.ui.notify.DialogTitleView;

public abstract class CommerceFormBaseFragment extends BaseFragment
{

    protected static final String EXTRA_MERCHANT_NAME = "merchant_name";
    private View _container;
    private com.pinterest.base.Events.EventsSubscriber eventsSubscriber;
    DialogTitleView title;

    public CommerceFormBaseFragment()
    {
        eventsSubscriber = new _cls1();
        _layoutId = 0x7f030066;
        _menuId = 0x7f100002;
    }

    protected abstract int getContainerResourceId();

    protected abstract CommerceFormBaseFragmentController getController();

    protected abstract String getDialogTitle();

    public void handleNegativeButtonClicked()
    {
        Events.post(new SecureDialogActivityEvent(com.pinterest.activity.commerce.event.SecureDialogActivityEvent.Type.Close));
    }

    public void handlePositiveButtonClicked()
    {
        getController().handleSaveClicked();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        title.titleTv.setText(getDialogTitle());
        getController().onViewCreated((CommerceFormView)_container);
        getController().setFragment(this);
        Events.register(eventsSubscriber, com/pinterest/activity/commerce/event/CloseCommerceFormDialogEvent, new Class[0]);
    }

    public void onDestroyView()
    {
        Events.unregister(eventsSubscriber);
        super.onDestroyView();
        getController().onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _container = LayoutInflater.from(getActivity()).inflate(getContainerResourceId(), null);
        ((FrameLayout)view.findViewById(0x7f0f0134)).addView(_container);
        ButterKnife.a(this, view);
    }

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final CommerceFormBaseFragment this$0;

        public void onEventMainThread(CloseCommerceFormDialogEvent closecommerceformdialogevent)
        {
            Events.post(new SecureDialogActivityEvent(com.pinterest.activity.commerce.event.SecureDialogActivityEvent.Type.Close));
        }

        _cls1()
        {
            this$0 = CommerceFormBaseFragment.this;
            super();
        }
    }

}

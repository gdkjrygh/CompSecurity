// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.pin.view.modules.util.VerifiedDomainUtil;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.activity.user.view.FollowUserButton;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentData;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ToastType;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

public class FollowModuleToast extends BaseToast
{

    FollowUserButton _button;
    Pin _pin;

    public FollowModuleToast(Pin pin)
    {
        _pin = pin;
        setDuration(5000);
    }

    public View getView(final ToastContainer container)
    {
        final View toastView = VerifiedDomainUtil.getOfficialUser(_pin);
        if (toastView == null)
        {
            return super.getView(container);
        } else
        {
            _button = new FollowUserButton(container.getContext(), null, 0x7f0100de);
            _button.setUser(toastView);
            setImageUrl(toastView.getImageMediumUrl());
            setImageOval(false);
            setMessage(toastView.getFullName());
            setSecondaryMessage(Resources.stringPluralShort(0x7f090007, toastView.getFollowersCount()));
            setLayoutGravity(81);
            addCustomButton(_button);
            toastView = super.getView(container);
            _button.setOnClickListener(new _cls1());
            return toastView;
        }
    }

    public void onToastClicked(Context context)
    {
        Pinalytics.a(ComponentType.TOAST, (new ComponentData()).setToastType(ToastType.USER_FOLLOW));
        Events.post(new Navigation(Location.USER, _button.getUser()));
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final FollowModuleToast this$0;
        final ToastContainer val$container;
        final View val$toastView;

        public void onClick(View view)
        {
            _button.onClick(view);
            container.extendToast(toastView, 5000);
        }

        _cls1()
        {
            this$0 = FollowModuleToast.this;
            container = toastcontainer;
            toastView = view;
            super();
        }
    }

}

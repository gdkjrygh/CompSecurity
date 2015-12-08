// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules.util;

import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.toast.FollowModuleToast;
import com.pinterest.api.model.Domain;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;

public class VerifiedDomainUtil
{

    public static final int TOAST_DURATION_MS = 5000;
    public static final int WEBVIEW_TOAST_DELAY_MS = 0;

    public VerifiedDomainUtil()
    {
    }

    public static User getOfficialUser(Pin pin)
    {
        if (pin != null)
        {
            pin = pin.getDomainObj();
            if (ModelHelper.isValid(pin))
            {
                return pin.getOfficialUser();
            }
        }
        return null;
    }

    public static String getOfficialUserFullName(Pin pin)
    {
        pin = getOfficialUser(pin);
        if (pin != null)
        {
            return pin.getFullName();
        } else
        {
            return null;
        }
    }

    public static String getOfficialUserImageMediumUrl(Pin pin)
    {
        pin = getOfficialUser(pin);
        if (pin != null)
        {
            return pin.getImageMediumUrl();
        } else
        {
            return null;
        }
    }

    public static boolean isConfirmedDomain(Pin pin)
    {
        return ModelHelper.isValid(getOfficialUser(pin));
    }

    public static boolean shouldShowFollowModule(Pin pin)
    {
        return pin != null && !pin.isCSR() && isConfirmedDomain(pin) && !getOfficialUser(pin).getFollowing().booleanValue() && Experiments.J();
    }

    public static boolean showToastIfNecessary(Pin pin)
    {
        if (shouldShowFollowModule(pin))
        {
            Events.post(new ToastEvent(new FollowModuleToast(pin)));
            return true;
        } else
        {
            return false;
        }
    }
}

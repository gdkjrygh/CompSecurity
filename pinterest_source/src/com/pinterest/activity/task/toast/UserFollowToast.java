// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentData;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.ToastType;
import org.apache.commons.lang3.BooleanUtils;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

public class UserFollowToast extends BaseToast
{

    private User _user;

    public UserFollowToast(User user)
    {
        this(user, true);
    }

    public UserFollowToast(User user, boolean flag)
    {
        _user = user;
        setClickable(flag);
    }

    public View getView(ToastContainer toastcontainer)
    {
        if (_user == null)
        {
            return super.getView(toastcontainer);
        }
        setImageUrl(_user.getImageMediumUrl());
        if (BooleanUtils.isTrue(_user.getFollowing()))
        {
            setMessage(0x7f070613);
        } else
        {
            setMessage(0x7f07061b);
        }
        setSecondaryMessage(_user.getFullName());
        setLayoutGravity(81);
        setArrowVis(true);
        return super.getView(toastcontainer);
    }

    public void onToastClicked(Context context)
    {
        if (_clickable)
        {
            Pinalytics.a(ElementType.HOMEFEED_BUILDER_FOLLOW_TOAST, ComponentType.TOAST, _user.getUid(), (new ComponentData()).setToastType(ToastType.USER_FOLLOW));
            Events.post(new Navigation(Location.USER, _user));
        }
    }
}

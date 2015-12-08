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
import com.pinterest.api.model.Interest;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentData;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.ToastType;
import org.apache.commons.lang3.BooleanUtils;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

public class TopicFollowToast extends BaseToast
{

    private Interest _interest;

    public TopicFollowToast(Interest interest)
    {
        this(interest, true);
    }

    public TopicFollowToast(Interest interest, boolean flag)
    {
        _interest = interest;
        setClickable(flag);
    }

    public View getView(ToastContainer toastcontainer)
    {
        if (_interest == null)
        {
            return super.getView(toastcontainer);
        }
        setImageUrl(_interest.getImageSmallUrl());
        if (BooleanUtils.isTrue(_interest.getFollowing()))
        {
            setMessage(0x7f070613);
        } else
        {
            setMessage(0x7f07061b);
        }
        setSecondaryMessage(_interest.getName());
        setLayoutGravity(81);
        setArrowVis(true);
        return super.getView(toastcontainer);
    }

    public void onToastClicked(Context context)
    {
        if (_clickable)
        {
            Events.post(new Navigation(Location.INTEREST, _interest));
            Pinalytics.a(ElementType.HOMEFEED_BUILDER_FOLLOW_TOAST, ComponentType.TOAST, _interest.getUid(), (new ComponentData()).setToastType(ToastType.TOPIC_FOLLOW));
        }
    }
}

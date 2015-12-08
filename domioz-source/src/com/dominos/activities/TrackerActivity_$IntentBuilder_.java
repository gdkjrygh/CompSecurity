// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;
import org.androidannotations.api.a.a;

// Referenced classes of package com.dominos.activities:
//            TrackerActivity_

public class fragmentSupport_ extends a
{

    private android.support.v4.app.Fragment fragmentSupport_;
    private Fragment fragment_;

    public fragmentSupport_ mErrorCode(PlaceOrderErrorCode placeordererrorcode)
    {
        return (fragmentSupport_)super.extra("mErrorCode", placeordererrorcode);
    }

    public fragmentSupport_ mFromCheckout(boolean flag)
    {
        return (fragmentSupport_)super.extra("mFromCheckout", flag);
    }

    public fragmentSupport_ mOrderId(String s)
    {
        return (fragmentSupport_)super.extra("mOrderId", s);
    }

    public Status mOrderStatus(TrackerOrderStatus trackerorderstatus)
    {
        return (Status)super.extra("mOrderStatus", trackerorderstatus);
    }

    public Status mPhone(String s)
    {
        return (Status)super.extra("mPhone", s);
    }

    public Status mServiceMethod(String s)
    {
        return (Status)super.extra("mServiceMethod", s);
    }

    public Status mStoreProfile(StoreProfile storeprofile)
    {
        return (Status)super.extra("mStoreProfile", storeprofile);
    }

    public void startForResult(int i)
    {
        if (fragmentSupport_ != null)
        {
            fragmentSupport_.startActivityForResult(intent, i);
            return;
        }
        if (fragment_ != null)
        {
            if (android.os.entBuilder_.fragment_ >= 16)
            {
                fragment_.startActivityForResult(intent, i, lastOptions);
                return;
            } else
            {
                fragment_.startActivityForResult(intent, i);
                return;
            }
        }
        if (context instanceof Activity)
        {
            android.support.v4.app.a.a((Activity)context, intent, i, lastOptions);
            return;
        }
        if (android.os.entBuilder_.lastOptions >= 16)
        {
            context.startActivity(intent, lastOptions);
            return;
        } else
        {
            context.startActivity(intent);
            return;
        }
    }

    public Status(Fragment fragment)
    {
        super(fragment.getActivity(), com/dominos/activities/TrackerActivity_);
        fragment_ = fragment;
    }

    public fragment_(Context context)
    {
        super(context, com/dominos/activities/TrackerActivity_);
    }

    public fragment_(android.support.v4.app.Fragment fragment)
    {
        super(fragment.getActivity(), com/dominos/activities/TrackerActivity_);
        fragmentSupport_ = fragment;
    }
}

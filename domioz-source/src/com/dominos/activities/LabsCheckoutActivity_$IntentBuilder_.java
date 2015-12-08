// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import com.google.android.gms.wallet.MaskedWallet;
import org.androidannotations.api.a.a;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity_

public class fragmentSupport_ extends a
{

    private android.support.v4.app.Fragment fragmentSupport_;
    private Fragment fragment_;

    public fragmentSupport_ anonymousCardUsed(boolean flag)
    {
        return (fragmentSupport_)super.extra("anonymousCardUsed", flag);
    }

    public fragmentSupport_ cardId(String s)
    {
        return (fragmentSupport_)super.extra("cardId", s);
    }

    public fragmentSupport_ maskedWallet(MaskedWallet maskedwallet)
    {
        return (fragmentSupport_)super.extra("maskedWallet", maskedwallet);
    }

    public fragmentSupport_ reorderPaymentType(String s)
    {
        return (fragmentSupport_)super.extra("reorderPaymentType", s);
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

    public intent useGoogleWallet(boolean flag)
    {
        return (intent)super.extra("useGoogleWallet", flag);
    }

    public A(Fragment fragment)
    {
        super(fragment.getActivity(), com/dominos/activities/LabsCheckoutActivity_);
        fragment_ = fragment;
    }

    public fragment_(Context context)
    {
        super(context, com/dominos/activities/LabsCheckoutActivity_);
    }

    public fragment_(android.support.v4.app.Fragment fragment)
    {
        super(fragment.getActivity(), com/dominos/activities/LabsCheckoutActivity_);
        fragmentSupport_ = fragment;
    }
}

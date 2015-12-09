// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import com.dominos.MobileSession_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.AnalyticsUtil_;

// Referenced classes of package com.dominos.adapters:
//            LabsProductGridAdapter

public final class LabsProductGridAdapter_ extends LabsProductGridAdapter
{

    private Context context_;

    private LabsProductGridAdapter_(Context context)
    {
        context_ = context;
        init_();
    }

    public static LabsProductGridAdapter_ getInstance_(Context context)
    {
        return new LabsProductGridAdapter_(context);
    }

    private void init_()
    {
        inflater = (LayoutInflater)context_.getSystemService("layout_inflater");
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context_);
        mMobileSession = MobileSession_.getInstance_(context_);
        mSpeechManager = SpeechManager_.getInstance_(context_);
        context = context_;
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}

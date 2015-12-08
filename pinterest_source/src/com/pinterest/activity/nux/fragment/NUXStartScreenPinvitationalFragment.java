// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.view.ViewGroup;
import android.widget.ImageView;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXStartScreenFragment

public class NUXStartScreenPinvitationalFragment extends NUXStartScreenFragment
{

    public NUXStartScreenPinvitationalFragment()
    {
    }

    protected com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams getFanUtilParams()
    {
        com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams fanutilparams = super.getFanUtilParams();
        fanutilparams.setRotation(-4F);
        return fanutilparams;
    }

    protected void setupCards()
    {
        _leftIv.setImageResource(0x7f020214);
        _centerIv.setImageResource(0x7f020216);
        _rightIv.setImageResource(0x7f020213);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 17;
        _leftIv.setLayoutParams(layoutparams);
        _rightIv.setLayoutParams(layoutparams);
        _centerIv.setLayoutParams(layoutparams);
        _animationContainer.requestLayout();
    }
}

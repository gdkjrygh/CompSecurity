// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.reporting.CrashReporting;

public class PinvitationalUnauthWallBaseFragment extends BaseFragment
{

    private static final int _SCROLLING_WALL_OFFSET = (int)Resources.dimension(0x7f0a01d1);
    ViewGroup _containerView;
    Animator _shiftAnimator;

    public PinvitationalUnauthWallBaseFragment()
    {
    }

    private void setupScrollingWall()
    {
        try
        {
            ImageView imageview = new ImageView(getView().getContext());
            imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            imageview.setImageResource(0x7f02025a);
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutparams.setMargins(0, 0, 0, -_SCROLLING_WALL_OFFSET);
            _containerView.addView(imageview, 0, layoutparams);
            _shiftAnimator = ObjectAnimator.ofFloat(imageview, "y", new float[] {
                0.0F, (float)(-_SCROLLING_WALL_OFFSET)
            });
            _shiftAnimator.setInterpolator(new LinearInterpolator());
            _shiftAnimator.setDuration(20000L);
            _shiftAnimator.start();
            return;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            CrashReporting.a(outofmemoryerror);
        }
    }

    protected void onActivate()
    {
        super.onActivate();
        if (!Device.isTablet() && getActivity() != null)
        {
            getActivity().setRequestedOrientation(1);
        }
    }

    protected void onDeactivate()
    {
        super.onDeactivate();
        if (!Device.isTablet() && getActivity() != null)
        {
            getActivity().setRequestedOrientation(-1);
        }
    }

    public void onDetach()
    {
        if (_shiftAnimator != null)
        {
            _shiftAnimator.cancel();
        }
        super.onDetach();
    }

    public void onStart()
    {
        if (!Device.isTablet() && getActivity() != null)
        {
            getActivity().setRequestedOrientation(1);
        }
        super.onStart();
        AnalyticsApi.a("unauth_home");
    }

    public void onStop()
    {
        if (!Device.isTablet() && getActivity() != null)
        {
            getActivity().setRequestedOrientation(-1);
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _containerView = (ViewGroup)view;
        setupScrollingWall();
    }

}

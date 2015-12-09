// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import gaj;

public class AutoScrollingViewPager extends ViewPager
{

    public final gaj e;
    private boolean f;

    public AutoScrollingViewPager(Context context)
    {
        super(context);
        e = new gaj(this);
        f = true;
    }

    public AutoScrollingViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new gaj(this);
        f = true;
    }

    public static boolean a(AutoScrollingViewPager autoscrollingviewpager)
    {
        return autoscrollingviewpager.f;
    }

    public static void b(AutoScrollingViewPager autoscrollingviewpager)
    {
        autoscrollingviewpager.e.a();
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            super.onRestoreInstanceState(parcelable.getParcelable("super_state"));
            f = parcelable.getBoolean("auto_scroll_state");
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle(2);
        bundle.putParcelable("super_state", super.onSaveInstanceState());
        bundle.putBoolean("auto_scroll_state", f);
        return bundle;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        f = false;
        return super.onTouchEvent(motionevent);
    }
}

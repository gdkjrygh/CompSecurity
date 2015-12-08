// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import a.a;
import android.app.Activity;
import android.content.res.Resources;
import android.support.design.widget.AppBarLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.soundcloud.android.profile.ProfileScreen;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProfileScrollHelper extends DefaultActivityLightCycle
    implements android.support.design.widget.AppBarLayout.OnOffsetChangedListener
{

    private static final int TOP = 0;
    private AppBarLayout appBarLayout;
    private float elevationTarget;
    private View header;
    private int lastOffset;
    private List profileScreens;
    private final Resources resources;
    private Toolbar toolbar;
    private ViewPager viewPager;

    public ProfileScrollHelper(Resources resources1)
    {
        profileScreens = new ArrayList();
        resources = resources1;
    }

    private float calculateElevation(int i)
    {
        float f = header.getHeight();
        return Math.min(elevationTarget, f / 2.0F - Math.abs(f / 2.0F + (float)i));
    }

    private int calculateListHeight()
    {
        return viewPager.getHeight() - appBarLayout.getTotalScrollRange() - lastOffset;
    }

    private void setScreenOffset(ProfileScreen profilescreen)
    {
        profilescreen.setEmptyViewHeight(calculateListHeight());
        boolean flag;
        if (lastOffset >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        profilescreen.setSwipeToRefreshEnabled(flag);
    }

    private void setupElevation()
    {
        ViewCompat.setElevation(toolbar, 0.0F);
        elevationTarget = resources.getDimension(0x7f0b0106);
    }

    public void addProfileCollection(ProfileScreen profilescreen)
    {
        profileScreens.add(profilescreen);
        setScreenOffset(profilescreen);
    }

    public void onOffsetChanged(AppBarLayout appbarlayout, int i)
    {
        lastOffset = i;
        ViewCompat.setTranslationZ(toolbar, calculateElevation(i));
        for (appbarlayout = profileScreens.iterator(); appbarlayout.hasNext(); setScreenOffset((ProfileScreen)appbarlayout.next())) { }
    }

    public volatile void onStart(Activity activity)
    {
        onStart((AppCompatActivity)activity);
    }

    public void onStart(AppCompatActivity appcompatactivity)
    {
        appBarLayout = (AppBarLayout)a.a(appcompatactivity, 0x7f0f0168);
        viewPager = (ViewPager)a.a(appcompatactivity, 0x7f0f00b7);
        toolbar = (Toolbar)a.a(appcompatactivity, 0x7f0f0022);
        header = a.a(appcompatactivity, 0x7f0f0209);
        setupElevation();
        Preconditions.checkNotNull(appBarLayout, "Expected to find AppBarLayout with ID R.id.appbar");
        appBarLayout.addOnOffsetChangedListener(this);
    }

    public volatile void onStop(Activity activity)
    {
        onStop((AppCompatActivity)activity);
    }

    public void onStop(AppCompatActivity appcompatactivity)
    {
        appBarLayout.removeOnOffsetChangedListener(this);
        appBarLayout = null;
        profileScreens.clear();
    }

    public void removeProfileScreen(ProfileScreen profilescreen)
    {
        profileScreens.remove(profilescreen);
    }
}

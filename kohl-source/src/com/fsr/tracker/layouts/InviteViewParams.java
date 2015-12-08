// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.layouts;

import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;

public class InviteViewParams
{

    private int alternateOrientationWidth;
    private Configuration configuration;
    private int defaultOrientationWidth;
    private Display display;
    private int foreSeeLogoHeight;
    private int inviteBodyTextSize;
    private int inviteButtonTextSize;
    private int inviteHeadingTextSize;
    private int inviteMargin;
    private int orientation;
    private int screenLayout;
    private int trustELogoHeight;

    public InviteViewParams(Display display1, Configuration configuration1)
    {
        display = display1;
        configuration = configuration1;
        screenLayout = configuration1.screenLayout;
        orientation = configuration1.orientation;
        initDimensions();
    }

    protected static int getDeviceDefaultOrientation(Display display1, Configuration configuration1)
    {
        int i = display1.getRotation();
        return (i != 0 && i != 2 || configuration1.orientation != 2) && (i != 1 && i != 3 || configuration1.orientation != 1) ? 1 : 2;
    }

    protected static int getSizeAsFractionOfScreen(int i, int j, Display display1)
    {
        return Math.max(getSizeAsFractionOfScreen(i, display1), j);
    }

    protected static int getSizeAsFractionOfScreen(int i, Display display1)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display1.getMetrics(displaymetrics);
        return Math.round(((float)i * (float)displaymetrics.densityDpi) / 240F);
    }

    private void initDimensions()
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        int i = screenLayout;
        Log.d("ForeSee Trigger Code", String.format("Screen dims (%d x %d), density = %d", new Object[] {
            Integer.valueOf(displaymetrics.widthPixels), Integer.valueOf(displaymetrics.heightPixels), Integer.valueOf(displaymetrics.densityDpi)
        }));
        switch (i & 0xf)
        {
        default:
            defaultOrientationWidth = Math.round((float)resolveDefaultOrientationWidth(display, configuration) * 0.66F);
            alternateOrientationWidth = defaultOrientationWidth;
            inviteButtonTextSize = getSizeAsFractionOfScreen(20, display);
            inviteHeadingTextSize = getSizeAsFractionOfScreen(20, display);
            inviteBodyTextSize = getSizeAsFractionOfScreen(17, display);
            inviteMargin = getSizeAsFractionOfScreen(10, 20, display);
            trustELogoHeight = 30;
            foreSeeLogoHeight = 60;
            return;

        case 4: // '\004'
            defaultOrientationWidth = Math.round((float)resolveDefaultOrientationWidth(display, configuration) * 0.5F);
            alternateOrientationWidth = Math.round((float)resolveDefaultOrientationHeight(display, configuration) * 0.75F);
            inviteButtonTextSize = getSizeAsFractionOfScreen(30, display);
            inviteHeadingTextSize = getSizeAsFractionOfScreen(30, display);
            inviteBodyTextSize = getSizeAsFractionOfScreen(27, display);
            inviteMargin = getSizeAsFractionOfScreen(20, 30, display);
            trustELogoHeight = 60;
            foreSeeLogoHeight = 120;
            return;

        case 3: // '\003'
            Log.d("ForeSee Trigger Code", "Large");
            defaultOrientationWidth = Math.round((float)resolveDefaultOrientationWidth(display, configuration) * 0.7F);
            alternateOrientationWidth = defaultOrientationWidth;
            inviteButtonTextSize = getSizeAsFractionOfScreen(25, display);
            inviteHeadingTextSize = getSizeAsFractionOfScreen(25, display);
            inviteBodyTextSize = getSizeAsFractionOfScreen(22, display);
            inviteMargin = getSizeAsFractionOfScreen(15, 24, display);
            trustELogoHeight = 35;
            foreSeeLogoHeight = 70;
            return;

        case 2: // '\002'
            Log.d("ForeSee Trigger Code", String.format("Normal, %d", new Object[] {
                Integer.valueOf(displaymetrics.densityDpi)
            }));
            defaultOrientationWidth = Math.round((float)resolveDefaultOrientationWidth(display, configuration) * 0.8F);
            alternateOrientationWidth = Math.round((float)resolveDefaultOrientationHeight(display, configuration) * 0.6F);
            inviteButtonTextSize = getSizeAsFractionOfScreen(20, display);
            inviteHeadingTextSize = getSizeAsFractionOfScreen(20, display);
            inviteBodyTextSize = getSizeAsFractionOfScreen(17, display);
            inviteMargin = getSizeAsFractionOfScreen(10, 17, display);
            if (displaymetrics.densityDpi == 160)
            {
                alternateOrientationWidth = Math.round((float)resolveDefaultOrientationHeight(display, configuration) * 0.75F);
                trustELogoHeight = 15;
                foreSeeLogoHeight = 30;
                return;
            }
            if (displaymetrics.densityDpi == 320)
            {
                trustELogoHeight = 37;
                foreSeeLogoHeight = 60;
                return;
            }
            if (displaymetrics.densityDpi == 480)
            {
                trustELogoHeight = 55;
                foreSeeLogoHeight = 100;
                return;
            } else
            {
                trustELogoHeight = 30;
                foreSeeLogoHeight = 50;
                return;
            }

        case 1: // '\001'
            Log.d("ForeSee Trigger Code", "Small");
            defaultOrientationWidth = Math.round((float)resolveDefaultOrientationWidth(display, configuration) * 0.85F);
            alternateOrientationWidth = Math.round((float)resolveDefaultOrientationHeight(display, configuration) * 0.9F);
            inviteButtonTextSize = getSizeAsFractionOfScreen(20, display);
            inviteHeadingTextSize = getSizeAsFractionOfScreen(20, display);
            inviteBodyTextSize = getSizeAsFractionOfScreen(17, display);
            inviteMargin = getSizeAsFractionOfScreen(10, 20, display);
            trustELogoHeight = 15;
            foreSeeLogoHeight = 30;
            return;
        }
    }

    private static int resolveDefaultOrientationHeight(Display display1, Configuration configuration1)
    {
        int i = getDeviceDefaultOrientation(display1, configuration1);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display1.getMetrics(displaymetrics);
        if (configuration1.orientation == i)
        {
            return displaymetrics.heightPixels;
        } else
        {
            return displaymetrics.widthPixels;
        }
    }

    private static int resolveDefaultOrientationWidth(Display display1, Configuration configuration1)
    {
        int i = getDeviceDefaultOrientation(display1, configuration1);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display1.getMetrics(displaymetrics);
        if (configuration1.orientation == i)
        {
            return displaymetrics.widthPixels;
        } else
        {
            return displaymetrics.heightPixels;
        }
    }

    public int getAlternateOrientationWidth()
    {
        return alternateOrientationWidth;
    }

    public int getDefaultOrientationWidth()
    {
        return defaultOrientationWidth;
    }

    public int getForeSeeLogoHeight()
    {
        return foreSeeLogoHeight;
    }

    public int getInviteBodyTextSize()
    {
        return inviteBodyTextSize;
    }

    public int getInviteButtonTextSize()
    {
        return inviteButtonTextSize;
    }

    public int getInviteHeadingTextSize()
    {
        return inviteHeadingTextSize;
    }

    public int getInviteMargin()
    {
        return inviteMargin;
    }

    public int getTrustELogoHeight()
    {
        return trustELogoHeight;
    }
}

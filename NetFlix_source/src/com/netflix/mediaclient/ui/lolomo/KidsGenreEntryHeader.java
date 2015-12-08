// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.netflix.mediaclient.android.widget.PressedStateHandler;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceUtils;

public class KidsGenreEntryHeader extends RelativeLayout
{

    private final PressedStateHandler pressHandler = new PressedStateHandler(this);

    public KidsGenreEntryHeader(Activity activity)
    {
        super(activity);
        boolean flag = DeviceUtils.isPortrait(activity);
        View view;
        int i;
        if (flag)
        {
            i = AndroidUtils.dipToPixels(activity, 180);
        } else
        {
            i = AndroidUtils.dipToPixels(activity, 215);
        }
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i));
        activity.getLayoutInflater().inflate(0x7f030035, this, true);
        view = findViewById(0x7f0700ce);
        if (flag)
        {
            i = 0x7f0200e3;
        } else
        {
            i = 0x7f0200e2;
        }
        view.setBackgroundResource(i);
        setOnClickListener(new com.netflix.mediaclient.ui.kids.KidsUtils.OnSwitchToKidsClickListener(activity, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.genreKidsEntry));
    }

    protected void dispatchSetPressed(boolean flag)
    {
        pressHandler.handleSetPressed(flag);
        super.dispatchSetPressed(flag);
    }
}

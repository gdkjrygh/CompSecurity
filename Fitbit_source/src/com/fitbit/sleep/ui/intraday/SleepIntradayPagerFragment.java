// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.intraday;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.ui.charts.IntradayPagerChartFragment;
import com.fitbit.ui.endless.c;
import java.util.Date;

public class SleepIntradayPagerFragment extends IntradayPagerChartFragment
{

    public SleepIntradayPagerFragment()
    {
    }

    protected c a(Context context, FragmentManager fragmentmanager, Date date)
    {
    /* block-local class not found */
    class a {}

        return new a(getActivity(), fragmentmanager, m());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0400ad, viewgroup, false);
    }
}

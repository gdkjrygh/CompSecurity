// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public final class LeaderboardScoreSpinnerAdapter extends ArrayAdapter
{

    private final Context mContext;
    private TextView mSubtitleView;
    private View mViewContainer;

    public LeaderboardScoreSpinnerAdapter(Context context)
    {
        super(context, 0x1090009, context.getResources().getTextArray(0x7f090000));
        mContext = context;
        mViewContainer = LayoutInflater.from(mContext).inflate(0x7f040095, null);
        mSubtitleView = (TextView)mViewContainer.findViewById(0x7f0d01ea);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        return mViewContainer;
    }

    public final void updateSpinnerTitles(int i)
    {
        Object obj = mContext.getResources();
        i;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 86
    //                   1 76
    //                   2 60;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Invalid TimeSpan ")).append(i).toString());
_L4:
        obj = ((Resources) (obj)).getString(0x7f1001cf);
_L6:
        mSubtitleView.setText(((CharSequence) (obj)));
        return;
_L3:
        obj = ((Resources) (obj)).getString(0x7f1001d1);
        continue; /* Loop/switch isn't completed */
_L2:
        obj = ((Resources) (obj)).getString(0x7f1001d0);
        if (true) goto _L6; else goto _L5
_L5:
    }
}

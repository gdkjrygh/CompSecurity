// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.leaderboards:
//            LeaderboardHeaderAdapter

private static final class mTitleTextView extends com.google.android.gms.games.ui.ardHeaderViewHolder
{

    private final TextView mTitleTextView;

    public (View view)
    {
        super(view);
        mTitleTextView = (TextView)view.findViewById(0x7f0d0075);
        UiUtils.heightAdjustLeftTextViewDrawable(mTitleTextView, 1.0F);
    }
}

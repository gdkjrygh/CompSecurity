// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.common.leaderboards:
//            LeaderboardEmptyAdapter

private static final class mMessageView extends com.google.android.gms.games.ui.oardEmptyViewHolder
{

    private final TextView mMessageView;

    public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
    {
        super.lateViews(gamesrecycleradapter, i);
        gamesrecycleradapter = (LeaderboardEmptyAdapter)mAdapter;
        if (LeaderboardEmptyAdapter.access$000(gamesrecycleradapter))
        {
            mMessageView.setTextAppearance(mContext, 0x7f1100c7);
            mMessageView.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020152, 0, 0);
        } else
        {
            mMessageView.setTextAppearance(mContext, 0x7f1100c6);
            mMessageView.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020153, 0, 0);
        }
        if (LeaderboardEmptyAdapter.access$100(gamesrecycleradapter) != 0) goto _L2; else goto _L1
_L1:
        LeaderboardEmptyAdapter.access$200(gamesrecycleradapter);
        JVM INSTR tableswitch 0 2: default 84
    //                   0 157
    //                   1 151
    //                   2 139;
           goto _L3 _L4 _L5 _L6
_L3:
        throw new IllegalArgumentException((new StringBuilder("Invalid TimeSpan ")).append(LeaderboardEmptyAdapter.access$200(gamesrecycleradapter)).toString());
_L6:
        i = 0x7f1001be;
_L7:
        mMessageView.setText(i);
        return;
_L5:
        i = 0x7f1001c0;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f1001bf;
        if (true) goto _L7; else goto _L2
_L2:
        LeaderboardEmptyAdapter.access$200(gamesrecycleradapter);
        JVM INSTR tableswitch 0 2: default 192
    //                   0 266
    //                   1 260
    //                   2 219;
           goto _L8 _L9 _L10 _L11
_L8:
        throw new IllegalArgumentException((new StringBuilder("Invalid TimeSpan ")).append(LeaderboardEmptyAdapter.access$200(gamesrecycleradapter)).toString());
_L11:
        i = 0x7f1001ca;
_L13:
        String s = LeaderboardEmptyAdapter.access$300(gamesrecycleradapter);
        gamesrecycleradapter = s;
        if (s == null)
        {
            gamesrecycleradapter = "";
        }
        mMessageView.setText(mContext.getString(i, new Object[] {
            gamesrecycleradapter
        }));
        return;
_L10:
        i = 0x7f1001cc;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 0x7f1001cb;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public (View view)
    {
        super(view);
        mMessageView = (TextView)view.findViewById(0x7f0d0167);
    }
}

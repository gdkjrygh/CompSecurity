// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.inbox;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.destination.inbox:
//            DestinationInboxActivity

final class this._cls0
    implements ResultCallback
{

    final this._cls0 this$0;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.ationInboxFragment)result;
        cess._mth000(this._cls0.this)[0] = result.ationInboxFragment("inbox_matches_count");
        cess._mth000(this._cls0.this)[1] = result.ationInboxFragment("inbox_requests_count");
        cess._mth000(this._cls0.this)[2] = result.ationInboxFragment("inbox_quests_count");
        cess._mth100(this._cls0.this).notifyDataSetChanged();
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}

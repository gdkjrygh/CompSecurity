// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.logging.LatencyLogger;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            HomepageRecyclerFragment, ProfileVisibilityButterbarAdapter

private final class <init>
    implements ResultCallback
{

    final HomepageRecyclerFragment this$0;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.itySettingsCallback)result;
        int i = result.itySettingsCallback().mStatusCode;
        if (!canUseResult(result))
        {
            HomepageRecyclerFragment.access$300(HomepageRecyclerFragment.this).logEvents(new int[] {
                7
            });
            return;
        } else
        {
            HomepageRecyclerFragment.access$402(HomepageRecyclerFragment.this, result._mth0());
            HomepageRecyclerFragment.access$500(HomepageRecyclerFragment.this).updateButterBarVisibility(HomepageRecyclerFragment.access$400(HomepageRecyclerFragment.this));
            return;
        }
    }

    private q()
    {
        this$0 = HomepageRecyclerFragment.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}

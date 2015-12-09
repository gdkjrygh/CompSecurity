// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            DestinationFragmentActivity, SideDrawerAdapter

final class this._cls0
    implements ResultCallback
{

    final DestinationFragmentActivity this$0;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.)result;
        Object obj = result.getStatus();
        if (((Status) (obj)).isSuccess())
        {
            if (DestinationFragmentActivity.access$200(DestinationFragmentActivity.this) != null)
            {
                obj = DestinationFragmentActivity.access$200(DestinationFragmentActivity.this);
                int i = result.getTotalCount();
                boolean flag = result.hasNewActivity();
                obj.mInboxCount = i;
                obj.mInboxHasNewActivity = flag;
                ((SideDrawerAdapter) (obj)).notifyDataSetChanged();
            }
            return;
        } else
        {
            GamesLog.e(DestinationFragmentActivity.access$300(), (new StringBuilder("updateInboxCount - failed with status:")).append(((Status) (obj)).mStatusCode).toString());
            return;
        }
    }

    ()
    {
        this$0 = DestinationFragmentActivity.this;
        super();
    }
}

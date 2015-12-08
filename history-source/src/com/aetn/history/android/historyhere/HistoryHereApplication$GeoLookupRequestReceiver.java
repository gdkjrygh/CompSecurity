// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere:
//            HistoryHereApplication

class this._cls0 extends BroadcastReceiver
{

    final HistoryHereApplication this$0;

    public void onReceive(Context context, Intent intent)
    {
        unregisterReceiver(HistoryHereApplication.access$000(HistoryHereApplication.this));
        clearPreviousSearchValues();
        Utils.logger(HistoryHereApplication.access$100(), "GeoLookupRequestReceiver: received");
        context = intent.getExtras();
        HistoryHereApplication.access$202(HistoryHereApplication.this, context.getString("searchString"));
        Utils.logger(HistoryHereApplication.access$100(), (new StringBuilder()).append("The search string is: ").append(HistoryHereApplication.access$200(HistoryHereApplication.this)).toString());
        (new this._cls0(HistoryHereApplication.this))._mth0(new String[] {
            HistoryHereApplication.access$200(HistoryHereApplication.this)
        });
    }

    ()
    {
        this$0 = HistoryHereApplication.this;
        super();
    }
}

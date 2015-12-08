// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment.adapter;

import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.SyncJob;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.offline.OfflineDataRetriever;

// Referenced classes of package com.pinterest.activity.settings.fragment.adapter:
//            OfflineBoardsSettingsAdapter

class val.job extends BackgroundTask
{

    final OfflineBoardsSettingsAdapter this$0;
    final String val$boardUid;
    final SyncJob val$job;

    public void onFinish()
    {
        OfflineDataRetriever.d().a();
    }

    public void run()
    {
        Board board = ModelHelper.getBoard(val$boardUid);
        if (board != null)
        {
            board.setSyncedAt(null);
            ModelHelper.setBoard(board);
        }
        ModelHelper.setSyncJob(val$job);
    }

    ()
    {
        this$0 = final_offlineboardssettingsadapter;
        val$boardUid = s;
        val$job = SyncJob.this;
        super();
    }
}

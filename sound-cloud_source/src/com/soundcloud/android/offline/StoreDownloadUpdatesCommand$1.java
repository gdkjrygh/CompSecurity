// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.propeller.PropellerDatabase;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentUpdates, StoreDownloadUpdatesCommand

class  extends com.soundcloud.propeller.and._cls1
{

    final StoreDownloadUpdatesCommand this$0;
    final OfflineContentUpdates val$requests;

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.bulkUpsert(com.soundcloud.android.storage.step, StoreDownloadUpdatesCommand.access$000(StoreDownloadUpdatesCommand.this, val$requests.newRemovedTracks)));
        step(propellerdatabase.bulkUpsert(com.soundcloud.android.storage.step, StoreDownloadUpdatesCommand.access$100(StoreDownloadUpdatesCommand.this, val$requests.newRestoredRequests)));
        step(propellerdatabase.bulkUpsert(com.soundcloud.android.storage.step, StoreDownloadUpdatesCommand.access$200(StoreDownloadUpdatesCommand.this, val$requests.newDownloadRequests)));
        step(propellerdatabase.bulkUpsert(com.soundcloud.android.storage.step, StoreDownloadUpdatesCommand.access$300(StoreDownloadUpdatesCommand.this, val$requests.creatorOptOutRequests)));
    }

    ()
    {
        this$0 = final_storedownloadupdatescommand;
        val$requests = OfflineContentUpdates.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.Looper;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.utils.DebugUtils;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncAdapterService

class > extends AbstractThreadedSyncAdapter
{

    private Looper looper;
    final SyncAdapterService this$0;

    public void onPerformSync(Account account, Bundle bundle, String s, ContentProviderClient contentproviderclient, SyncResult syncresult)
    {
        PublicApi.setBackgroundMode(true);
        Looper.prepare();
        looper = Looper.myLooper();
        class _cls1
            implements Runnable
        {

            final SyncAdapterService._cls1 this$1;

            public void run()
            {
                String s1 = SyncAdapterService.TAG;
                sendBroadcast(new Intent(SyncAdapterService.SYNC_FINISHED));
                looper.quit();
            }

            _cls1()
            {
                this$1 = SyncAdapterService._cls1.this;
                super();
            }
        }

        if (SyncAdapterService.performSync((SoundCloudApplication)getApplication(), bundle, syncresult, accountOperations.getSoundCloudToken(), new _cls1(), syncServiceResultReceiverFactory, myLikesStateProvider, playlistStorage))
        {
            Looper.loop();
        }
        PublicApi.setBackgroundMode(false);
    }

    public void onSyncCanceled()
    {
        if (SyncAdapterService.access$100())
        {
            String s = SyncAdapterService.TAG;
            DebugUtils.dumpStack(getContext());
            class _cls2 extends Thread
            {

                final SyncAdapterService._cls1 this$1;

                public void run()
                {
                    DebugUtils.dumpLog(getContext());
                }

            _cls2()
            {
                this$1 = SyncAdapterService._cls1.this;
                super();
            }
            }

            (new _cls2()).start();
        }
        if (looper != null)
        {
            looper.quit();
        }
        super.onSyncCanceled();
    }


    _cls2(Context context, boolean flag)
    {
        this$0 = SyncAdapterService.this;
        super(context, flag);
    }
}

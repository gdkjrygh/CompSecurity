// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.content.DialogInterface;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadMonitorPresenter

class this._cls0
    implements android.content.stener
{

    final UploadMonitorPresenter this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (UploadMonitorPresenter.access$200(UploadMonitorPresenter.this))
        {
            UploadMonitorPresenter.access$202(UploadMonitorPresenter.this, false);
            UploadMonitorPresenter.access$900(UploadMonitorPresenter.this);
            UploadMonitorPresenter.access$1100(UploadMonitorPresenter.this).publish(EventQueue.UPLOAD, UploadEvent.cancelled(UploadMonitorPresenter.access$1000(UploadMonitorPresenter.this)));
        }
    }

    ()
    {
        this$0 = UploadMonitorPresenter.this;
        super();
    }
}

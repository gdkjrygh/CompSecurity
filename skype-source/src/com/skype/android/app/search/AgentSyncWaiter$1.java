// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.skype.android.app.ProgressSpinnerDialogFragment;
import com.skype.android.inject.EventSubscriberBinder;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.skype.android.app.search:
//            AgentSyncWaiter

final class val.activity
    implements Runnable
{

    final AgentSyncWaiter this$0;
    final FragmentActivity val$activity;

    public final void run()
    {
        if (AgentSyncWaiter.access$000(AgentSyncWaiter.this).compareAndSet(true, false))
        {
            AgentSyncWaiter.access$100(AgentSyncWaiter.this).unbind();
            AgentSyncWaiter.access$200(AgentSyncWaiter.this).dismiss();
            Toast.makeText(val$activity, 0x7f080364, 1).show();
        }
    }

    ment()
    {
        this$0 = final_agentsyncwaiter;
        val$activity = FragmentActivity.this;
        super();
    }
}

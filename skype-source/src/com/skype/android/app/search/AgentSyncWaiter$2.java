// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.skype.ContactImpl;
import com.skype.SkyLib;
import com.skype.android.app.ProgressSpinnerDialogFragment;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.inject.EventSubscriberBinder;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.skype.android.app.search:
//            AgentSyncWaiter, AgentInfo

final class val.activity
    implements AsyncCallback
{

    final AgentSyncWaiter this$0;
    final FragmentActivity val$activity;
    final AgentInfo val$agent;
    final Runnable val$contactSyncFailedRunnable;

    public final void done(AsyncResult asyncresult)
    {
        if (asyncresult.e() && ((Boolean)asyncresult.a()).booleanValue())
        {
            AgentSyncWaiter.access$000(AgentSyncWaiter.this).set(true);
            AgentSyncWaiter.access$100(AgentSyncWaiter.this).bind();
            AgentSyncWaiter.access$300(AgentSyncWaiter.this).forceEasContactsSync();
            asyncresult = new ContactImpl();
            AgentSyncWaiter.access$300(AgentSyncWaiter.this).getContact(val$agent.getIdentity(), asyncresult);
            asyncresult.setBuddyStatus(true);
            asyncresult.refreshProfile();
            AgentSyncWaiter.access$402(AgentSyncWaiter.this, asyncresult.getObjectID());
            AgentSyncWaiter.access$500(AgentSyncWaiter.this, 5000L, val$contactSyncFailedRunnable);
            return;
        } else
        {
            AgentSyncWaiter.access$200(AgentSyncWaiter.this).dismiss();
            Toast.makeText(val$activity, 0x7f080365, 1).show();
            return;
        }
    }

    ment()
    {
        this$0 = final_agentsyncwaiter;
        val$agent = agentinfo;
        val$contactSyncFailedRunnable = runnable;
        val$activity = FragmentActivity.this;
        super();
    }
}

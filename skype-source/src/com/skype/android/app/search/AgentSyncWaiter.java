// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.skype.ContactImpl;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.app.Navigation;
import com.skype.android.app.ProgressSpinnerDialogFragment;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.util.async.UiCallback;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.skype.android.app.search:
//            AgentProvisioningServiceClient, AgentInfo

public class AgentSyncWaiter
{

    public static final int TIMEOUT_LIMIT = 5000;
    private AgentInfo agent;
    private int agentObjectId;
    private final AgentProvisioningServiceClient agentProvisioningServiceClient;
    private Runnable currentTimeoutRunnable;
    private EventSubscriberBinder eventBinder;
    private Handler handler;
    private final SkyLib lib;
    private final Navigation navigation;
    private ProgressSpinnerDialogFragment spinner;
    private AtomicBoolean waitingForEvent;

    public AgentSyncWaiter(EventBus eventbus, AgentProvisioningServiceClient agentprovisioningserviceclient, SkyLib skylib, Navigation navigation1)
    {
        agentProvisioningServiceClient = agentprovisioningserviceclient;
        lib = skylib;
        navigation = navigation1;
        handler = new Handler();
        waitingForEvent = new AtomicBoolean(false);
        eventBinder = new EventSubscriberBinder(eventbus, this);
    }

    private void startTimer(long l, Runnable runnable)
    {
        if (currentTimeoutRunnable != null)
        {
            handler.removeCallbacks(currentTimeoutRunnable);
        }
        handler.postDelayed(runnable, l);
        currentTimeoutRunnable = runnable;
    }

    private void stopTimer()
    {
        handler.removeCallbacks(currentTimeoutRunnable);
        currentTimeoutRunnable = null;
    }

    public void addAgentAndWaitWithSpinner(final FragmentActivity activity, final AgentInfo agent)
    {
        this.agent = agent;
        spinner = ProgressSpinnerDialogFragment.create(0x7f0300eb, true, new String[] {
            activity.getString(0x7f080363)
        });
        spinner.show(activity.getSupportFragmentManager());
        final Runnable contactSyncFailedRunnable = new Runnable() {

            final AgentSyncWaiter this$0;
            final FragmentActivity val$activity;

            public final void run()
            {
                if (waitingForEvent.compareAndSet(true, false))
                {
                    eventBinder.unbind();
                    spinner.dismiss();
                    Toast.makeText(activity, 0x7f080364, 1).show();
                }
            }

            
            {
                this$0 = AgentSyncWaiter.this;
                activity = fragmentactivity;
                super();
            }
        };
        agentProvisioningServiceClient.put(agent, new UiCallback(activity, new AsyncCallback() {

            final AgentSyncWaiter this$0;
            final FragmentActivity val$activity;
            final AgentInfo val$agent;
            final Runnable val$contactSyncFailedRunnable;

            public final void done(AsyncResult asyncresult)
            {
                if (asyncresult.e() && ((Boolean)asyncresult.a()).booleanValue())
                {
                    waitingForEvent.set(true);
                    eventBinder.bind();
                    lib.forceEasContactsSync();
                    asyncresult = new ContactImpl();
                    lib.getContact(agent.getIdentity(), asyncresult);
                    asyncresult.setBuddyStatus(true);
                    asyncresult.refreshProfile();
                    agentObjectId = asyncresult.getObjectID();
                    startTimer(5000L, contactSyncFailedRunnable);
                    return;
                } else
                {
                    spinner.dismiss();
                    Toast.makeText(activity, 0x7f080365, 1).show();
                    return;
                }
            }

            
            {
                this$0 = AgentSyncWaiter.this;
                agent = agentinfo;
                contactSyncFailedRunnable = runnable;
                activity = fragmentactivity;
                super();
            }
        }));
    }

    boolean onAcceptEvent(com.skype.android.gen.ContactGroupListener.OnChange onchange)
    {
        return onchange.getContactObjectID() == agentObjectId;
    }

    void onEvent(com.skype.android.gen.ContactGroupListener.OnChange onchange)
    {
        if (waitingForEvent.compareAndSet(true, false))
        {
            eventBinder.unbind();
            stopTimer();
            onchange = new ContactImpl();
            lib.getContact(agent.getIdentity(), onchange);
            ConversationImpl conversationimpl = new ConversationImpl();
            onchange.openConversation(conversationimpl);
            navigation.chat(conversationimpl);
            spinner.dismiss();
        }
    }






/*
    static int access$402(AgentSyncWaiter agentsyncwaiter, int i)
    {
        agentsyncwaiter.agentObjectId = i;
        return i;
    }

*/

}

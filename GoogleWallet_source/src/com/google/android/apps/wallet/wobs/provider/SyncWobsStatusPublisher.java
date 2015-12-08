// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;

public class SyncWobsStatusPublisher
    implements InitializedEventPublisher
{
    public static final class SyncWobsStatus extends Enum
    {

        private static final SyncWobsStatus $VALUES[];
        public static final SyncWobsStatus FAIL;
        public static final SyncWobsStatus IN_PROGRESS;
        public static final SyncWobsStatus SUCCESS;

        public static SyncWobsStatus valueOf(String s)
        {
            return (SyncWobsStatus)Enum.valueOf(com/google/android/apps/wallet/wobs/provider/SyncWobsStatusPublisher$SyncWobsStatus, s);
        }

        public static SyncWobsStatus[] values()
        {
            return (SyncWobsStatus[])$VALUES.clone();
        }

        static 
        {
            IN_PROGRESS = new SyncWobsStatus("IN_PROGRESS", 0);
            SUCCESS = new SyncWobsStatus("SUCCESS", 1);
            FAIL = new SyncWobsStatus("FAIL", 2);
            $VALUES = (new SyncWobsStatus[] {
                IN_PROGRESS, SUCCESS, FAIL
            });
        }

        private SyncWobsStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private final EventBus eventBus;
    private volatile SyncWobsStatus status;

    public SyncWobsStatusPublisher(EventBus eventbus)
    {
        status = SyncWobsStatus.SUCCESS;
        eventBus = eventbus;
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/wobs/provider/SyncWobsStatusPublisher$SyncWobsStatus, new RegistrationCallback() {

            final SyncWobsStatusPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                eventBus.post(status);
            }

            
            {
                this$0 = SyncWobsStatusPublisher.this;
                super();
            }
        });
    }


}

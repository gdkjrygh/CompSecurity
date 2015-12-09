// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;


public interface ActionRequest
{
    public static interface FinishedCallback
    {

        public abstract void onFinished();
    }

    public static final class RequestState extends Enum
    {

        private static final RequestState $VALUES[];
        public static final RequestState CANCELLED;
        public static final RequestState COMPLETED;
        public static final RequestState PENDING;
        public static final RequestState RUNNING;

        public static RequestState valueOf(String s)
        {
            return (RequestState)Enum.valueOf(com/google/android/apps/wallet/util/async/ActionRequest$RequestState, s);
        }

        public static RequestState[] values()
        {
            return (RequestState[])$VALUES.clone();
        }

        final boolean isFinished()
        {
            return this == CANCELLED || this == COMPLETED;
        }

        static 
        {
            PENDING = new RequestState("PENDING", 0);
            CANCELLED = new RequestState("CANCELLED", 1);
            RUNNING = new RequestState("RUNNING", 2);
            COMPLETED = new RequestState("COMPLETED", 3);
            $VALUES = (new RequestState[] {
                PENDING, CANCELLED, RUNNING, COMPLETED
            });
        }

        private RequestState(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void cancel();

    public abstract boolean isFinished();
}

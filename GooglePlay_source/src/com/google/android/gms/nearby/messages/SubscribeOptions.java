// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;


// Referenced classes of package com.google.android.gms.nearby.messages:
//            SubscribeCallback, MessageFilter, Strategy

public final class SubscribeOptions
{
    public static final class Builder
    {

        private MessageFilter mFilter;
        public Strategy mStrategy;

        public final SubscribeOptions build()
        {
            return new SubscribeOptions(mStrategy, mFilter, null, (byte)0);
        }

        public Builder()
        {
            mStrategy = Strategy.DEFAULT;
            mFilter = MessageFilter.INCLUDE_ALL_MY_TYPES;
        }
    }


    public static final SubscribeOptions DEFAULT = (new Builder()).build();
    public final SubscribeCallback mCallback;
    public final MessageFilter mFilter;
    public final Strategy mStrategy;

    private SubscribeOptions(Strategy strategy, MessageFilter messagefilter, SubscribeCallback subscribecallback)
    {
        mStrategy = strategy;
        mFilter = messagefilter;
        mCallback = subscribecallback;
    }

    SubscribeOptions(Strategy strategy, MessageFilter messagefilter, SubscribeCallback subscribecallback, byte byte0)
    {
        this(strategy, messagefilter, null);
    }

}

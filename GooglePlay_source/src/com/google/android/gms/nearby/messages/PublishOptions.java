// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;


// Referenced classes of package com.google.android.gms.nearby.messages:
//            PublishCallback, Strategy

public final class PublishOptions
{
    public static final class Builder
    {

        public Strategy mStrategy;

        public final PublishOptions build()
        {
            return new PublishOptions(mStrategy, null, (byte)0);
        }

        public Builder()
        {
            mStrategy = Strategy.DEFAULT;
        }
    }


    public static final PublishOptions DEFAULT = (new Builder()).build();
    public final PublishCallback mCallback;
    public final Strategy mStrategy;

    private PublishOptions(Strategy strategy, PublishCallback publishcallback)
    {
        mStrategy = strategy;
        mCallback = publishcallback;
    }

    PublishOptions(Strategy strategy, PublishCallback publishcallback, byte byte0)
    {
        this(strategy, null);
    }

}

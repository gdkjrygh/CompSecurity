// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;


public final class TransferOptions
{
    public static final class Builder
    {

        private long idleTimeoutSecs;

        public final TransferOptions build()
        {
            return new TransferOptions(this);
        }


        public Builder()
        {
            idleTimeoutSecs = 60L;
        }
    }


    private final long idleTimeoutSecs;

    private TransferOptions(Builder builder)
    {
        idleTimeoutSecs = builder.idleTimeoutSecs;
    }


    public static Builder newBuilder()
    {
        return new Builder();
    }

    public final long getIdleTimeoutSecs()
    {
        return idleTimeoutSecs;
    }
}

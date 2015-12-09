// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.error;


public final class GamesException extends RuntimeException
{
    public static final class Builder
    {

        public int clientStatusCode;
        public int internalStatusCode;
        public String logMessage;

        public final Builder withStatus(int i)
        {
            internalStatusCode = i;
            clientStatusCode = i;
            return this;
        }

        private Builder()
        {
            internalStatusCode = -1;
            clientStatusCode = -1;
            logMessage = "An unexpected error occurred";
        }

        Builder(byte byte0)
        {
            this();
        }
    }


    public final int mClientStatusCode;
    public final int mInternalStatusCode;
    public final String mLogMessage;

    private GamesException(Builder builder1)
    {
        mInternalStatusCode = builder1.internalStatusCode;
        mClientStatusCode = builder1.clientStatusCode;
        mLogMessage = builder1.logMessage;
    }

    public GamesException(Builder builder1, byte byte0)
    {
        this(builder1);
    }

    public static Builder builder()
    {
        return new Builder((byte)0);
    }
}

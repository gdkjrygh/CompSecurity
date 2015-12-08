// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.error;


// Referenced classes of package com.google.android.gms.games.server.error:
//            GamesException

public static final class <init>
{

    public int clientStatusCode;
    public int internalStatusCode;
    public String logMessage;

    public final <init> withStatus(int i)
    {
        internalStatusCode = i;
        clientStatusCode = i;
        return this;
    }

    private ()
    {
        internalStatusCode = -1;
        clientStatusCode = -1;
        logMessage = "An unexpected error occurred";
    }

    logMessage(byte byte0)
    {
        this();
    }
}

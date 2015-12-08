// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine;


// Referenced classes of package com.google.android.gms.games.service.statemachine:
//            StateMachineMessage

public abstract class MessageBase
    implements StateMachineMessage
{

    private final int mMessageId;

    public MessageBase(int i)
    {
        mMessageId = i;
    }

    public final int getMessageId()
    {
        return mMessageId;
    }
}

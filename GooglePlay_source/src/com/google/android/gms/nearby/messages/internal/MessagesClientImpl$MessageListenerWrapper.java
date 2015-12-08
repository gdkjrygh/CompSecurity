// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.nearby.messages.MessageListener;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessagesClientImpl, MessageWrapper

private static final class <init> extends <init>
{

    private final MessageListener mListener;

    public final void onMessageFound(MessageWrapper messagewrapper)
        throws RemoteException
    {
        mListener.onFound(messagewrapper.message);
    }

    public final void onMessageLost(MessageWrapper messagewrapper)
        throws RemoteException
    {
        messagewrapper = messagewrapper.message;
    }

    private (MessageListener messagelistener)
    {
        mListener = messagelistener;
    }

    mListener(MessageListener messagelistener, byte byte0)
    {
        this(messagelistener);
    }
}

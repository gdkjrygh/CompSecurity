// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.util;

import android.content.Context;
import android.content.Intent;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPMessage;

public class MessageEventBroadcaster
{

    private static MessageEventBroadcaster INSTANCE;
    public static final String MESSAGE_ADDED_INTENT = "com.digby.localpoint.MessageAdded";
    public static final String MESSAGE_DELETED_INTENT = "com.digby.localpoint.MessageDeleted";
    public static final String MESSAGE_ID_EXTRA = "messageId";
    public static final String MESSAGE_MODIFIED_INTENT = "com.digby.localpoint.MessageModified";
    private final Context mContext;

    private MessageEventBroadcaster(Context context)
    {
        mContext = context;
    }

    public static MessageEventBroadcaster getInstance(Context context)
    {
        if (INSTANCE == null)
        {
            INSTANCE = new MessageEventBroadcaster(context);
        }
        return INSTANCE;
    }

    public void broadcastMessageAdd(ILPID ilpid)
    {
        Intent intent = new Intent("com.digby.localpoint.MessageAdded");
        intent.putExtra("messageId", ilpid.getValue());
        mContext.sendBroadcast(intent);
    }

    public void broadcastMessageAdd(ILPMessage ilpmessage)
    {
        broadcastMessageAdd(ilpmessage.getID());
    }

    public void broadcastMessageDelete(ILPID ilpid)
    {
        Intent intent = new Intent("com.digby.localpoint.MessageDeleted");
        intent.putExtra("messageId", ilpid.getValue());
        mContext.sendBroadcast(intent);
    }

    public void broadcastMessageDelete(ILPMessage ilpmessage)
    {
        broadcastMessageDelete(ilpmessage.getID());
    }

    public void broadcastMessageModify(ILPID ilpid)
    {
        Intent intent = new Intent("com.digby.localpoint.MessageModified");
        intent.putExtra("messageId", ilpid.getValue());
        mContext.sendBroadcast(intent);
    }

    public void broadcastMessageModify(ILPMessage ilpmessage)
    {
        broadcastMessageAdd(ilpmessage.getID());
    }
}

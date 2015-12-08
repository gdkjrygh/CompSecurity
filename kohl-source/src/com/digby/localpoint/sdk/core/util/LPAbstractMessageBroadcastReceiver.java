// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.digby.localpoint.sdk.core.ILPMessage;
import com.digby.localpoint.sdk.core.ILPMessageListener;
import com.digby.localpoint.sdk.core.impl.LPID;
import com.digby.localpoint.sdk.core.impl.LPLocalpointService;
import com.digby.localpoint.sdk.core.impl.LPMessageProvider;
import com.digby.mm.android.library.utils.Logger;

public abstract class LPAbstractMessageBroadcastReceiver extends BroadcastReceiver
    implements ILPMessageListener
{

    private Context mContext;

    public LPAbstractMessageBroadcastReceiver()
    {
    }

    private ILPMessage getMessage(Intent intent, Context context)
    {
        intent = intent.getExtras().getString("messageId");
        return LPLocalpointService.getInstance(context).getMessageProvider().getMessage(new LPID(intent));
    }

    public Context getContext()
    {
        return mContext;
    }

    public void onReceive(Context context, Intent intent)
    {
        String s;
        try
        {
            mContext = context;
            Logger.Debug("Received broadcast in LPAbstractMessageEventReceiver!", context);
            s = intent.getAction();
            if ("com.digby.localpoint.MessageDeleted".equals(s))
            {
                onDelete(new LPID(intent.getExtras().getString("messageId")));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.Error("MessageBroadcastReceiver.onReceiver", context);
            return;
        }
        context = getMessage(intent, context);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if ("com.digby.localpoint.MessageAdded".equals(s))
        {
            onAdd(context);
            return;
        }
        if ("com.digby.localpoint.MessageModified".equals(s))
        {
            onModify(context);
        }
    }
}

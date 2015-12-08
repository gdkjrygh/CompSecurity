// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;

// Referenced classes of package com.splunk.mint:
//            Mint, Utils, ActionEvent, NetSender

static final class 
    implements Runnable
{

    final Context val$context;

    public void run()
    {
        if (Utils.shouldSendPing(val$context))
        {
            ActionEvent.createPing().send(val$context, new NetSender(), true);
        }
    }

    (Context context1)
    {
        val$context = context1;
        super();
    }
}

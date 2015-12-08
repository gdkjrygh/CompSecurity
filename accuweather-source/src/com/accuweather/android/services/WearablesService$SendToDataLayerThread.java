// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.Wearable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.accuweather.android.services:
//            WearablesService

private class message extends Thread
{

    String message;
    String path;
    final WearablesService this$0;

    public void run()
    {
        for (Iterator iterator = ((com.google.android.gms.wearable.)Wearable.NodeApi.getConnectedNodes(WearablesService.access$200(WearablesService.this)).await()).s().iterator(); iterator.hasNext();)
        {
            Node node = (Node)iterator.next();
            if (((com.google.android.gms.wearable.s)Wearable.MessageApi.sendMessage(WearablesService.access$200(WearablesService.this), node.getId(), path, message.getBytes()).await()).message().isSuccess())
            {
                Log.v("myTag", (new StringBuilder()).append("Message: {").append(message).append("} sent to: ").append(node.getDisplayName()).toString());
            } else
            {
                Log.v("myTag", "ERROR: failed to send Message");
            }
        }

    }

    (String s, String s1)
    {
        this$0 = WearablesService.this;
        super();
        path = s;
        message = s1;
    }
}

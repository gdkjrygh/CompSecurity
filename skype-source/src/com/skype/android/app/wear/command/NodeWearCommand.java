// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.wearable.l;

// Referenced classes of package com.skype.android.app.wear.command:
//            NodeResultCallback

public interface NodeWearCommand
{
    public static class NodeMessageResult
        implements com.google.android.gms.wearable.j.b
    {

        private final com.google.android.gms.wearable.j.b decoratedResult;
        private final l node;

        public l getNode()
        {
            return node;
        }

        public int getRequestId()
        {
            return decoratedResult.getRequestId();
        }

        public Status getStatus()
        {
            return decoratedResult.getStatus();
        }

        public NodeMessageResult(com.google.android.gms.wearable.j.b b, l l)
        {
            decoratedResult = b;
            node = l;
        }
    }


    public abstract void send(c c, NodeResultCallback noderesultcallback);
}

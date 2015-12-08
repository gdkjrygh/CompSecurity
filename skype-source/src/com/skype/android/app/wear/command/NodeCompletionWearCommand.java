// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.wearable.l;

// Referenced classes of package com.skype.android.app.wear.command:
//            NodeWearCommand, NodeResultCallback

public abstract class NodeCompletionWearCommand
    implements NodeWearCommand
{
    public static interface NodeCompletionCallback
        extends CompletionWearCommand.CompletionCallback
    {

        public abstract void onNodeError(NodeWearCommand.NodeMessageResult nodemessageresult, l l);

        public abstract void onNodeResult(NodeWearCommand.NodeMessageResult nodemessageresult, l l);
    }


    public NodeCompletionWearCommand()
    {
    }

    public void send(c c, final NodeCompletionCallback completionCallback)
    {
        send(c, new NodeResultCallback() {

            final NodeCompletionWearCommand this$0;
            final NodeCompletionCallback val$completionCallback;

            public final void onNodeResult(NodeWearCommand.NodeMessageResult nodemessageresult, l l)
            {
                if (nodemessageresult.getStatus().d())
                {
                    completionCallback.onNodeResult(nodemessageresult, l);
                    return;
                } else
                {
                    completionCallback.onNodeError(nodemessageresult, l);
                    return;
                }
            }

            public final volatile void onResult(g g)
            {
                onResult((NodeResultCallback.NodeResult)g);
            }

            public final void onResult(NodeResultCallback.NodeResult noderesult)
            {
                if (noderesult.getStatus().d())
                {
                    completionCallback.onResult(noderesult);
                    return;
                } else
                {
                    completionCallback.onError(noderesult);
                    return;
                }
            }

            
            {
                this$0 = NodeCompletionWearCommand.this;
                completionCallback = nodecompletioncallback;
                super();
            }
        });
    }
}

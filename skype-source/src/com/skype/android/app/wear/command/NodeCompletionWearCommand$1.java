// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.wearable.l;

// Referenced classes of package com.skype.android.app.wear.command:
//            NodeResultCallback, NodeCompletionWearCommand

final class deCompletionCallback
    implements NodeResultCallback
{

    final NodeCompletionWearCommand this$0;
    final deCompletionCallback val$completionCallback;

    public final void onNodeResult(esult esult, l l)
    {
        if (esult.getStatus().d())
        {
            val$completionCallback.onNodeResult(esult, l);
            return;
        } else
        {
            val$completionCallback.onNodeError(esult, l);
            return;
        }
    }

    public final volatile void onResult(g g)
    {
        onResult((t)g);
    }

    public final void onResult(t t)
    {
        if (t.getStatus().d())
        {
            val$completionCallback.onResult(t);
            return;
        } else
        {
            val$completionCallback.onError(t);
            return;
        }
    }

    deCompletionCallback()
    {
        this$0 = final_nodecompletionwearcommand;
        val$completionCallback = deCompletionCallback.this;
        super();
    }
}

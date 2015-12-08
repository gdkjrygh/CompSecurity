// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;

// Referenced classes of package com.skype.android.app.wear.command:
//            CompletionWearCommand

final class mpletionCallback
    implements h
{

    final CompletionWearCommand this$0;
    final mpletionCallback val$completionCallback;

    public final void onResult(g g1)
    {
        if (g1.getStatus().d())
        {
            val$completionCallback.onResult(g1);
            return;
        } else
        {
            val$completionCallback.onError(g1);
            return;
        }
    }

    mpletionCallback()
    {
        this$0 = final_completionwearcommand;
        val$completionCallback = mpletionCallback.this;
        super();
    }
}

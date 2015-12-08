// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;

// Referenced classes of package com.skype.android.app.wear.command:
//            WearCommand

public abstract class CompletionWearCommand
    implements WearCommand
{
    public static interface CompletionCallback
    {

        public abstract void onError(g g);

        public abstract void onResult(g g);
    }


    public CompletionWearCommand()
    {
    }

    public void send(c c, final CompletionCallback completionCallback)
    {
        send(c, new h() {

            final CompletionWearCommand this$0;
            final CompletionCallback val$completionCallback;

            public final void onResult(g g1)
            {
                if (g1.getStatus().d())
                {
                    completionCallback.onResult(g1);
                    return;
                } else
                {
                    completionCallback.onError(g1);
                    return;
                }
            }

            
            {
                this$0 = CompletionWearCommand.this;
                completionCallback = completioncallback;
                super();
            }
        });
    }
}

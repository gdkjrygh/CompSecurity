// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.games.service.statemachine:
//            FutureMessage

private final class  extends FutureTask
{

    final FutureMessage this$0;

    public _cls1.val.this._cls0()
    {
        this.this$0 = FutureMessage.this;
        super(new Callable() {

            final FutureMessage val$this$0;

            public final Object call()
                throws Exception
            {
                return this$0.mResult;
            }

            
            {
                this$0 = futuremessage;
                super();
            }
        });
    }
}

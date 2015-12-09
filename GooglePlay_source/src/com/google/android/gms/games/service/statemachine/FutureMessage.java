// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.games.service.statemachine:
//            MessageBase

public abstract class FutureMessage extends MessageBase
{
    private final class Future extends FutureTask
    {

        final FutureMessage this$0;

        public Future()
        {
            this.this$0 = FutureMessage.this;
            super(new _cls1());
        }
    }


    public final Future mFuture = new Future();
    Object mResult;

    public FutureMessage(int i)
    {
        super(i);
    }

    public final void setResult(Object obj)
    {
        Future future = mFuture;
        future._fld0.mResult = obj;
        future._fld0.mFuture.run();
    }

    // Unreferenced inner class com/google/android/gms/games/service/statemachine/FutureMessage$Future$1

/* anonymous class */
    final class Future._cls1
        implements Callable
    {

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
    }

}

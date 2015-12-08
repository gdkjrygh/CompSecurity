// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OperatorSkipTimed

class val.gate
    implements Action0
{

    final OperatorSkipTimed this$0;
    final AtomicBoolean val$gate;

    public void call()
    {
        val$gate.set(true);
    }

    ()
    {
        this$0 = final_operatorskiptimed;
        val$gate = AtomicBoolean.this;
        super();
    }
}

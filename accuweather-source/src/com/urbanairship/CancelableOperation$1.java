// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;


// Referenced classes of package com.urbanairship:
//            CancelableOperation

class this._cls0
    implements Runnable
{

    final CancelableOperation this$0;

    public void run()
    {
label0:
        {
            synchronized (CancelableOperation.this)
            {
                if (!isDone())
                {
                    break label0;
                }
            }
            return;
        }
        onRun();
        CancelableOperation.access$002(CancelableOperation.this, true);
        cancelableoperation;
        JVM INSTR monitorexit ;
        return;
        exception;
        cancelableoperation;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = CancelableOperation.this;
        super();
    }
}

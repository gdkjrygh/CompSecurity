// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.TimerTask;

final class ng.Object
    implements Runnable
{

    final able this$1;

    public final void run()
    {
        b(null);
    }

    rTask()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class kL$1

/* anonymous class */
    final class kL._cls1 extends TimerTask
    {

        final kL this$0;

        public final void run()
        {
label0:
            {
                synchronized (mMutex)
                {
                    if (!mIsComplete)
                    {
                        break label0;
                    }
                }
                return;
            }
            PG.a(new kL._cls1._cls1());
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                this$0 = kL.this;
                super();
            }
    }

}

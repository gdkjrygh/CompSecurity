// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.util;

import java.util.Iterator;

public class AsyncIterator
{
    public static interface Callback
    {

        public abstract void onDone();

        public abstract void onItem(Object obj, Iteration iteration);
    }

    public static interface Iteration
    {

        public abstract void cancelIteration();

        public abstract void nextElement();

        public abstract void removeItem();
    }


    private boolean isDone;
    private final Iterator iterator;

    public AsyncIterator(Iterator iterator1)
    {
        isDone = false;
        iterator = iterator1;
    }

    public void startIteration(final Callback callback)
    {
        this;
        JVM INSTR monitorenter ;
        Iteration iteration = new Iteration() {

            final AsyncIterator this$0;
            final Callback val$callback;

            public final void cancelIteration()
            {
                synchronized (AsyncIterator.this)
                {
                    isDone = true;
                }
                return;
                exception;
                asynciterator;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public final void nextElement()
            {
                AsyncIterator asynciterator = AsyncIterator.this;
                asynciterator;
                JVM INSTR monitorenter ;
                if (isDone)
                {
                    throw new IllegalStateException("Iteration has finished!");
                }
                break MISSING_BLOCK_LABEL_32;
                Exception exception;
                exception;
                asynciterator;
                JVM INSTR monitorexit ;
                throw exception;
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_72;
                }
                callback.onItem(iterator.next(), this);
_L2:
                asynciterator;
                JVM INSTR monitorexit ;
                return;
                callback.onDone();
                if (true) goto _L2; else goto _L1
_L1:
            }

            public final void removeItem()
            {
                synchronized (AsyncIterator.this)
                {
                    iterator.remove();
                }
                return;
                exception;
                asynciterator;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = AsyncIterator.this;
                callback = callback1;
                super();
            }
        };
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        callback.onItem(iterator.next(), iteration);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        isDone = true;
        callback.onDone();
        if (true) goto _L4; else goto _L3
_L3:
        callback;
        throw callback;
    }



/*
    static boolean access$002(AsyncIterator asynciterator, boolean flag)
    {
        asynciterator.isDone = flag;
        return flag;
    }

*/

}

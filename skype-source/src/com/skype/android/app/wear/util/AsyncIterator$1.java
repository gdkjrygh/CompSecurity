// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.util;

import java.util.Iterator;

// Referenced classes of package com.skype.android.app.wear.util:
//            AsyncIterator

final class llback
    implements eration
{

    final AsyncIterator this$0;
    final llback val$callback;

    public final void cancelIteration()
    {
        synchronized (AsyncIterator.this)
        {
            AsyncIterator.access$002(AsyncIterator.this, true);
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
        if (AsyncIterator.access$000(AsyncIterator.this))
        {
            throw new IllegalStateException("Iteration has finished!");
        }
        break MISSING_BLOCK_LABEL_32;
        Exception exception;
        exception;
        asynciterator;
        JVM INSTR monitorexit ;
        throw exception;
        if (!AsyncIterator.access$100(AsyncIterator.this).hasNext())
        {
            break MISSING_BLOCK_LABEL_72;
        }
        val$callback.onItem(AsyncIterator.access$100(AsyncIterator.this).next(), this);
_L2:
        asynciterator;
        JVM INSTR monitorexit ;
        return;
        val$callback.onDone();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void removeItem()
    {
        synchronized (AsyncIterator.this)
        {
            AsyncIterator.access$100(AsyncIterator.this).remove();
        }
        return;
        exception;
        asynciterator;
        JVM INSTR monitorexit ;
        throw exception;
    }

    llback()
    {
        this$0 = final_asynciterator;
        val$callback = llback.this;
        super();
    }
}

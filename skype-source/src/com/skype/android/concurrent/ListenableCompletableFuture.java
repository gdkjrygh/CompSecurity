// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package com.skype.android.concurrent:
//            CompletableFuture, ListenableFuture, FutureListener

public class ListenableCompletableFuture extends CompletableFuture
    implements ListenableFuture
{

    private Set listeners;

    public ListenableCompletableFuture()
    {
        listeners = new HashSet();
    }

    private void callListener(FutureListener futurelistener, Executor executor)
    {
        if (executor != null)
        {
            executor.execute(new Runnable(futurelistener) {

                final FutureListener a;
                final ListenableCompletableFuture b;

                public final void run()
                {
                    b.invokeListener(a);
                }

            
            {
                b = ListenableCompletableFuture.this;
                a = futurelistener;
                super();
            }
            });
            return;
        } else
        {
            invokeListener(futurelistener);
            return;
        }
    }

    private void callListener(java.util.Map.Entry entry)
    {
        callListener((FutureListener)entry.getKey(), (Executor)entry.getValue());
    }

    private void invokeListener(FutureListener futurelistener)
    {
        try
        {
            futurelistener.onResult(get());
            return;
        }
        catch (Exception exception)
        {
            futurelistener.onError(exception);
        }
    }

    public boolean addListener(FutureListener futurelistener)
    {
        return addListener(futurelistener, null);
    }

    public boolean addListener(FutureListener futurelistener, Executor executor)
    {
        if (futurelistener == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        this;
        JVM INSTR monitorenter ;
        futurelistener = new java.util.AbstractMap.SimpleImmutableEntry(futurelistener, executor);
        if (!isDone())
        {
            break MISSING_BLOCK_LABEL_32;
        }
        callListener(futurelistener);
        this;
        JVM INSTR monitorexit ;
        return true;
        boolean flag = listeners.add(futurelistener);
        this;
        JVM INSTR monitorexit ;
        return flag;
        futurelistener;
        this;
        JVM INSTR monitorexit ;
        throw futurelistener;
        return false;
    }

    protected void complete()
    {
        super.complete();
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); callListener((java.util.Map.Entry)iterator.next())) { }
    }

}

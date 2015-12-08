// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import com.soundcloud.android.utils.InputObject;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;

// Referenced classes of package com.soundcloud.android.view:
//            TouchLayout

private static class <init> extends Thread
{

    private final ArrayBlockingQueue inputQueue;
    private final WeakReference mLayoutRef;
    private boolean stopped;

    public void feedInput(InputObject inputobject)
    {
        this;
        JVM INSTR monitorenter ;
        inputQueue.put(inputobject);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        inputobject;
        getClass().getSimpleName();
        inputobject.getMessage();
        if (true) goto _L2; else goto _L1
_L1:
        inputobject;
        throw inputobject;
    }

    public void run()
    {
_L2:
        Object obj1;
        if (stopped)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = null;
        Object obj = (InputObject)inputQueue.take();
        if (((InputObject) (obj)).eventType != 2)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj1 = (TouchLayout)mLayoutRef.get();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        TouchLayout.access$200(((TouchLayout) (obj1)), ((InputObject) (obj)));
        if (obj != null)
        {
            ((InputObject) (obj)).returnToPool();
        }
        continue; /* Loop/switch isn't completed */
        obj;
        obj = null;
_L5:
        if (obj != null)
        {
            ((InputObject) (obj)).returnToPool();
        }
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
_L4:
        if (obj != null)
        {
            ((InputObject) (obj)).returnToPool();
        }
        throw obj1;
_L1:
        return;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        InterruptedException interruptedexception;
        interruptedexception;
          goto _L5
    }


/*
    static boolean access$102(_cls9 _pcls9, boolean flag)
    {
        _pcls9.stopped = flag;
        return flag;
    }

*/

    private stopped(TouchLayout touchlayout)
    {
        inputQueue = new ArrayBlockingQueue(20);
        stopped = false;
        mLayoutRef = new WeakReference(touchlayout);
    }

    mLayoutRef(TouchLayout touchlayout, mLayoutRef mlayoutref)
    {
        this(touchlayout);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.lang.ref.WeakReference;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.inject.internal.util:
//            $MapMaker

class val.valueReference extends TimerTask
{

    final val.valueReference this$0;
    final WeakReference val$keyReference;
    final WeakReference val$valueReference;

    public void run()
    {
        Object obj = val$keyReference.get();
        if (obj != null)
        {
            p.remove(obj, val$valueReference.get());
        }
    }

    ()
    {
        this$0 = final_;
        val$keyReference = weakreference;
        val$valueReference = WeakReference.this;
        super();
    }
}

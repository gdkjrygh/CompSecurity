// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.collect:
//            MapEvictionListener, EvictionListeners

class val.value
    implements Runnable
{

    final val.value this$0;
    final Object val$key;
    final Object val$value;

    public void run()
    {
        listener.onEviction(val$key, val$value);
    }

    l.listener()
    {
        this$0 = final_listener;
        val$key = obj;
        val$value = Object.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/EvictionListeners$1

/* anonymous class */
    static final class EvictionListeners._cls1
        implements MapEvictionListener
    {

        final Executor val$executor;
        final MapEvictionListener val$listener;

        public void onEviction(final Object key, Object obj)
        {
            executor.execute(((EvictionListeners._cls1._cls1) (obj)). new EvictionListeners._cls1._cls1());
        }

            
            {
                executor = executor1;
                listener = mapevictionlistener;
                super();
            }
    }

}

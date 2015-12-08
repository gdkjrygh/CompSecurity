// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.collect:
//            MapEvictionListener, EvictionListeners

static final class val.listener
    implements MapEvictionListener
{

    final Executor val$executor;
    final MapEvictionListener val$listener;

    public void onEviction(final Object key, final Object value)
    {
        val$executor.execute(new Runnable() {

            final EvictionListeners._cls1 this$0;
            final Object val$key;
            final Object val$value;

            public void run()
            {
                listener.onEviction(key, value);
            }

            
            {
                this$0 = EvictionListeners._cls1.this;
                key = obj;
                value = obj1;
                super();
            }
        });
    }

    _cls1.val.value(Executor executor1, MapEvictionListener mapevictionlistener)
    {
        val$executor = executor1;
        val$listener = mapevictionlistener;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.collect:
//            MapEvictionListener

public final class EvictionListeners
{

    private EvictionListeners()
    {
    }

    public static MapEvictionListener asynchronous(MapEvictionListener mapevictionlistener, Executor executor)
    {
        return new MapEvictionListener(executor, mapevictionlistener) {

            final Executor val$executor;
            final MapEvictionListener val$listener;

            public void onEviction(final Object key, Object obj)
            {
                executor.execute(((_cls1) (obj)). new Runnable() {

                    final _cls1 this$0;
                    final Object val$key;
                    final Object val$value;

                    public void run()
                    {
                        listener.onEviction(key, value);
                    }

            
            {
                this$0 = final__pcls1;
                key = obj;
                value = Object.this;
                super();
            }
                });
            }

            
            {
                executor = executor1;
                listener = mapevictionlistener;
                super();
            }
        };
    }
}

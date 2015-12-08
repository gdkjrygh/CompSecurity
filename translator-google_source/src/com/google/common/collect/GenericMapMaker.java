// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.d;
import com.google.common.base.h;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            bu

abstract class GenericMapMaker
{

    bu a;

    GenericMapMaker()
    {
    }

    final bu a()
    {
        return (bu)h.a(a, NullListener.INSTANCE);
    }

    abstract ConcurrentMap a(d d);

    private class NullListener extends Enum
        implements bu
    {

        public static final NullListener INSTANCE;
        private static final NullListener a[];

        public static NullListener valueOf(String s)
        {
            return (NullListener)Enum.valueOf(com/google/common/collect/GenericMapMaker$NullListener, s);
        }

        public static NullListener[] values()
        {
            return (NullListener[])a.clone();
        }

        public final void onRemoval(MapMaker.RemovalNotification removalnotification)
        {
        }

        static 
        {
            INSTANCE = new NullListener("INSTANCE");
            a = (new NullListener[] {
                INSTANCE
            });
        }

        private NullListener(String s)
        {
            super(s, 0);
        }
    }

}

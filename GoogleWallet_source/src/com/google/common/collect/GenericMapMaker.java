// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;

public abstract class GenericMapMaker
{
    static final class NullListener extends Enum
        implements MapMaker.RemovalListener
    {

        private static final NullListener $VALUES[];
        public static final NullListener INSTANCE;

        public static NullListener valueOf(String s)
        {
            return (NullListener)Enum.valueOf(com/google/common/collect/GenericMapMaker$NullListener, s);
        }

        public static NullListener[] values()
        {
            return (NullListener[])$VALUES.clone();
        }

        static 
        {
            INSTANCE = new NullListener("INSTANCE", 0);
            $VALUES = (new NullListener[] {
                INSTANCE
            });
        }

        private NullListener(String s, int i)
        {
            super(s, i);
        }
    }


    MapMaker.RemovalListener removalListener;

    GenericMapMaker()
    {
    }

    final MapMaker.RemovalListener getRemovalListener()
    {
        return (MapMaker.RemovalListener)Objects.firstNonNull(removalListener, NullListener.INSTANCE);
    }
}

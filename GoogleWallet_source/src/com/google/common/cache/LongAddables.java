// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.common.cache:
//            LongAdder, LongAddable

final class LongAddables
{
    static final class PureJavaLongAddable extends AtomicLong
        implements LongAddable
    {

        public final void add(long l)
        {
            getAndAdd(l);
        }

        public final void increment()
        {
            getAndIncrement();
        }

        private PureJavaLongAddable()
        {
        }

    }


    private static final Supplier SUPPLIER;

    public static LongAddable create()
    {
        return (LongAddable)SUPPLIER.get();
    }

    static 
    {
        Supplier supplier;
        try
        {
            new LongAdder();
            supplier = new Supplier() {

                private static LongAddable get()
                {
                    return new LongAdder();
                }

                public final volatile Object get()
                {
                    return get();
                }

            };
        }
        catch (Throwable throwable)
        {
            throwable = new Supplier() {

                private static LongAddable get()
                {
                    return new PureJavaLongAddable();
                }

                public final volatile Object get()
                {
                    return get();
                }

            };
        }
        SUPPLIER = supplier;
    }
}

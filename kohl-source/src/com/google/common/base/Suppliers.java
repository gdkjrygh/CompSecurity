// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.base:
//            Preconditions, Supplier, Function, Platform

public final class Suppliers
{
    static class ExpiringMemoizingSupplier
        implements Supplier, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Supplier _flddelegate;
        final long durationNanos;
        volatile transient long expirationNanos;
        volatile transient Object value;

        public Object get()
        {
            long l;
            long l1;
            l = expirationNanos;
            l1 = Platform.systemNanoTime();
            if (l != 0L && l1 - l < 0L) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            Object obj;
            if (l != expirationNanos)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            obj = _flddelegate.get();
            value = obj;
            l = l1 + durationNanos;
            if (l == 0L)
            {
                l = 1L;
            }
            expirationNanos = l;
            this;
            JVM INSTR monitorexit ;
            return obj;
            this;
            JVM INSTR monitorexit ;
_L2:
            return value;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        ExpiringMemoizingSupplier(Supplier supplier, long l, TimeUnit timeunit)
        {
            _flddelegate = (Supplier)Preconditions.checkNotNull(supplier);
            durationNanos = timeunit.toNanos(l);
            boolean flag;
            if (l > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
        }
    }

    static class MemoizingSupplier
        implements Supplier, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Supplier _flddelegate;
        volatile transient boolean initialized;
        transient Object value;

        public Object get()
        {
            if (initialized) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            Object obj;
            if (initialized)
            {
                break MISSING_BLOCK_LABEL_40;
            }
            obj = _flddelegate.get();
            value = obj;
            initialized = true;
            this;
            JVM INSTR monitorexit ;
            return obj;
            this;
            JVM INSTR monitorexit ;
_L2:
            return value;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        MemoizingSupplier(Supplier supplier)
        {
            _flddelegate = supplier;
        }
    }

    private static class SupplierComposition
        implements Supplier, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Function function;
        final Supplier supplier;

        public Object get()
        {
            return function.apply(supplier.get());
        }

        SupplierComposition(Function function1, Supplier supplier1)
        {
            function = function1;
            supplier = supplier1;
        }
    }

    private static final class SupplierFunction extends Enum
        implements Function
    {

        private static final SupplierFunction $VALUES[];
        public static final SupplierFunction INSTANCE;

        public static SupplierFunction valueOf(String s)
        {
            return (SupplierFunction)Enum.valueOf(com/google/common/base/Suppliers$SupplierFunction, s);
        }

        public static SupplierFunction[] values()
        {
            return (SupplierFunction[])$VALUES.clone();
        }

        public Object apply(Supplier supplier)
        {
            return supplier.get();
        }

        public volatile Object apply(Object obj)
        {
            return apply((Supplier)obj);
        }

        static 
        {
            INSTANCE = new SupplierFunction("INSTANCE", 0);
            $VALUES = (new SupplierFunction[] {
                INSTANCE
            });
        }

        private SupplierFunction(String s, int i)
        {
            super(s, i);
        }
    }

    private static class SupplierOfInstance
        implements Supplier, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object instance;

        public Object get()
        {
            return instance;
        }

        SupplierOfInstance(Object obj)
        {
            instance = obj;
        }
    }

    private static class ThreadSafeSupplier
        implements Supplier, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Supplier _flddelegate;

        public Object get()
        {
            Object obj;
            synchronized (_flddelegate)
            {
                obj = _flddelegate.get();
            }
            return obj;
            exception;
            supplier;
            JVM INSTR monitorexit ;
            throw exception;
        }

        ThreadSafeSupplier(Supplier supplier)
        {
            _flddelegate = supplier;
        }
    }


    private Suppliers()
    {
    }

    public static Supplier compose(Function function, Supplier supplier)
    {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(supplier);
        return new SupplierComposition(function, supplier);
    }

    public static Supplier memoize(Supplier supplier)
    {
        if (supplier instanceof MemoizingSupplier)
        {
            return supplier;
        } else
        {
            return new MemoizingSupplier((Supplier)Preconditions.checkNotNull(supplier));
        }
    }

    public static Supplier memoizeWithExpiration(Supplier supplier, long l, TimeUnit timeunit)
    {
        return new ExpiringMemoizingSupplier(supplier, l, timeunit);
    }

    public static Supplier ofInstance(Object obj)
    {
        return new SupplierOfInstance(obj);
    }

    public static Function supplierFunction()
    {
        return SupplierFunction.INSTANCE;
    }

    public static Supplier synchronizedSupplier(Supplier supplier)
    {
        return new ThreadSafeSupplier((Supplier)Preconditions.checkNotNull(supplier));
    }
}

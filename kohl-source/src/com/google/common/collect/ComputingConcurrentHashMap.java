// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap, MapMaker, AsynchronousComputationException, MapEvictionListener, 
//            ComputationException

class ComputingConcurrentHashMap extends CustomConcurrentHashMap
    implements MapMaker.Cache
{
    private static class ComputationExceptionReference
        implements CustomConcurrentHashMap.ValueReference
    {

        final Throwable t;

        public void clear()
        {
        }

        public CustomConcurrentHashMap.ValueReference copyFor(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return null;
        }

        public boolean isComputingReference()
        {
            return false;
        }

        public void notifyValueReclaimed()
        {
        }

        public Object waitForValue()
        {
            throw new AsynchronousComputationException(t);
        }

        ComputationExceptionReference(Throwable throwable)
        {
            t = throwable;
        }
    }

    private static class ComputedReference
        implements CustomConcurrentHashMap.ValueReference
    {

        final Object value;

        public void clear()
        {
        }

        public CustomConcurrentHashMap.ValueReference copyFor(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return value;
        }

        public boolean isComputingReference()
        {
            return false;
        }

        public void notifyValueReclaimed()
        {
        }

        public Object waitForValue()
        {
            return get();
        }

        ComputedReference(Object obj)
        {
            value = obj;
        }
    }

    class ComputingSegment extends CustomConcurrentHashMap.Segment
    {

        final ComputingConcurrentHashMap this$0;

        Object compute(Object obj, int i)
        {
_L3:
            Object obj5;
            Object obj7;
            Object obj8;
            obj5 = get(obj, i);
            if (obj5 != null)
            {
                return obj5;
            }
            obj8 = null;
            obj7 = null;
            lock();
            Object obj6;
            AtomicReferenceArray atomicreferencearray;
            int j;
            preWriteCleanup();
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            obj6 = (CustomConcurrentHashMap.ReferenceEntry)atomicreferencearray.get(j);
            Object obj4 = obj6;
_L2:
            Object obj1;
            Object obj3;
            obj3 = obj8;
            obj1 = obj5;
            if (obj4 == null)
            {
                break MISSING_BLOCK_LABEL_171;
            }
            obj1 = ((CustomConcurrentHashMap.ReferenceEntry) (obj4)).getKey();
            if (((CustomConcurrentHashMap.ReferenceEntry) (obj4)).getHash() != i || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_313;
            }
            if (!keyEquivalence.equivalent(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_313;
            }
            obj1 = obj5;
            if (((CustomConcurrentHashMap.ReferenceEntry) (obj4)).getValueReference().isComputingReference())
            {
                break MISSING_BLOCK_LABEL_466;
            }
            obj1 = getLiveValue(((CustomConcurrentHashMap.ReferenceEntry) (obj4)));
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_160;
            }
            recordLockedRead(((CustomConcurrentHashMap.ReferenceEntry) (obj4)));
            unlock();
            postWriteCleanup();
            return obj1;
            unsetLiveEntry(((CustomConcurrentHashMap.ReferenceEntry) (obj4)), i);
            break MISSING_BLOCK_LABEL_466;
            Object obj2;
            ComputingValueReference computingvaluereference;
            Exception exception;
            boolean flag;
            boolean flag1;
            for (; obj3 == null; obj3 = obj4)
            {
                break MISSING_BLOCK_LABEL_196;
            }

            computingvaluereference = obj7;
            obj4 = obj3;
            if (!isUnset(((CustomConcurrentHashMap.ReferenceEntry) (obj3))))
            {
                break MISSING_BLOCK_LABEL_250;
            }
            computingvaluereference = new ComputingValueReference();
            obj4 = obj3;
            if (obj3 != null)
            {
                break MISSING_BLOCK_LABEL_241;
            }
            obj4 = newEntry(obj, i, ((CustomConcurrentHashMap.ReferenceEntry) (obj6)));
            atomicreferencearray.set(j, obj4);
            ((CustomConcurrentHashMap.ReferenceEntry) (obj4)).setValueReference(computingvaluereference);
            unlock();
            postWriteCleanup();
            if (computingvaluereference == null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj3 = obj1;
            obj4;
            JVM INSTR monitorenter ;
            obj6 = computingvaluereference.compute(obj, i);
            obj1 = obj6;
            obj4;
            JVM INSTR monitorexit ;
            obj3 = obj6;
            Preconditions.checkNotNull(obj6, "compute() returned null unexpectedly");
            if (obj6 == null)
            {
                clearValue(obj, i, computingvaluereference);
            }
            return obj6;
            obj4 = ((CustomConcurrentHashMap.ReferenceEntry) (obj4)).getNext();
            if (true) goto _L2; else goto _L1
            obj;
_L5:
            unlock();
            postWriteCleanup();
            throw obj;
            exception;
            obj4;
            JVM INSTR monitorexit ;
            obj3 = obj1;
            throw exception;
            obj2;
            if (obj3 == null)
            {
                clearValue(obj, i, computingvaluereference);
            }
            throw obj2;
_L1:
            flag = false;
_L4:
            if (!Thread.holdsLock(obj4))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Recursive computation");
            obj2 = ((CustomConcurrentHashMap.ReferenceEntry) (obj4)).getValueReference().waitForValue();
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_427;
            }
            recordRead(((CustomConcurrentHashMap.ReferenceEntry) (obj4)));
            if (flag)
            {
                Thread.currentThread().interrupt();
            }
            return obj2;
            if (flag)
            {
                Thread.currentThread().interrupt();
            }
              goto _L3
            obj2;
            flag = true;
              goto _L4
            obj;
            if (flag)
            {
                Thread.currentThread().interrupt();
            }
            throw obj;
            obj;
              goto _L5
        }

        ComputingSegment(int i, int j)
        {
            this$0 = ComputingConcurrentHashMap.this;
            super(ComputingConcurrentHashMap.this, i, j);
        }
    }

    static class ComputingSerializationProxy extends CustomConcurrentHashMap.AbstractSerializationProxy
    {

        private static final long serialVersionUID = 2L;
        transient MapMaker.Cache cache;
        final Function computingFunction;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            cache = readMapMaker(objectinputstream).makeCache(computingFunction);
            _flddelegate = cache.asMap();
            readEntries(objectinputstream);
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            writeMapTo(objectoutputstream);
        }

        public Object apply(Object obj)
        {
            return cache.apply(obj);
        }

        public ConcurrentMap asMap()
        {
            return _flddelegate;
        }

        Object readResolve()
        {
            return cache;
        }

        ComputingSerializationProxy(CustomConcurrentHashMap.Strength strength, CustomConcurrentHashMap.Strength strength1, Equivalence equivalence, Equivalence equivalence1, long l, long l1, int i, int j, MapEvictionListener mapevictionlistener, ConcurrentMap concurrentmap, Function function)
        {
            super(strength, strength1, equivalence, equivalence1, l, l1, i, j, mapevictionlistener, concurrentmap);
            computingFunction = function;
        }
    }

    private class ComputingValueReference
        implements CustomConcurrentHashMap.ValueReference
    {

        CustomConcurrentHashMap.ValueReference computedReference;
        final ComputingConcurrentHashMap this$0;

        public void clear()
        {
            setValueReference(new ComputedReference(null));
        }

        Object compute(Object obj, int i)
        {
            Object obj1;
            try
            {
                obj1 = computingFunction.apply(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                setValueReference(new ComputationExceptionReference(((ComputationException) (obj)).getCause()));
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                setValueReference(new ComputationExceptionReference(((Throwable) (obj))));
                throw new ComputationException(((Throwable) (obj)));
            }
            if (obj1 == null)
            {
                obj = (new StringBuilder()).append(computingFunction).append(" returned null for key ").append(obj).append(".").toString();
                setValueReference(new NullPointerExceptionReference(((String) (obj))));
                throw new NullPointerException(((String) (obj)));
            } else
            {
                setValueReference(new ComputedReference(obj1));
                segmentFor(i).put(obj, i, obj1, true);
                return obj1;
            }
        }

        public CustomConcurrentHashMap.ValueReference copyFor(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return null;
        }

        public boolean isComputingReference()
        {
            return true;
        }

        public void notifyValueReclaimed()
        {
        }

        void setValueReference(CustomConcurrentHashMap.ValueReference valuereference)
        {
            this;
            JVM INSTR monitorenter ;
            if (computedReference == CustomConcurrentHashMap.UNSET)
            {
                computedReference = valuereference;
                notifyAll();
            }
            this;
            JVM INSTR monitorexit ;
            return;
            valuereference;
            this;
            JVM INSTR monitorexit ;
            throw valuereference;
        }

        public Object waitForValue()
            throws InterruptedException
        {
            if (computedReference != CustomConcurrentHashMap.UNSET) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            if (computedReference == CustomConcurrentHashMap.UNSET)
            {
                wait();
            }
            this;
            JVM INSTR monitorexit ;
_L2:
            return computedReference.waitForValue();
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ComputingValueReference()
        {
            this$0 = ComputingConcurrentHashMap.this;
            super();
            computedReference = CustomConcurrentHashMap.unset();
        }

    }

    private static class NullPointerExceptionReference
        implements CustomConcurrentHashMap.ValueReference
    {

        final String message;

        public void clear()
        {
        }

        public CustomConcurrentHashMap.ValueReference copyFor(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return null;
        }

        public boolean isComputingReference()
        {
            return false;
        }

        public void notifyValueReclaimed()
        {
        }

        public Object waitForValue()
        {
            throw new NullPointerException(message);
        }

        NullPointerExceptionReference(String s)
        {
            message = s;
        }
    }


    private static final long serialVersionUID = 2L;
    final Function computingFunction;

    ComputingConcurrentHashMap(MapMaker mapmaker, Function function)
    {
        super(mapmaker);
        computingFunction = (Function)Preconditions.checkNotNull(function);
    }

    public Object apply(Object obj)
    {
        int i = hash(obj);
        return segmentFor(i).compute(obj, i);
    }

    public ConcurrentMap asMap()
    {
        return this;
    }

    CustomConcurrentHashMap.Segment createSegment(int i, int j)
    {
        return new ComputingSegment(i, j);
    }

    ComputingSegment segmentFor(int i)
    {
        return (ComputingSegment)super.segmentFor(i);
    }

    volatile CustomConcurrentHashMap.Segment segmentFor(int i)
    {
        return segmentFor(i);
    }

    Object writeReplace()
    {
        return new ComputingSerializationProxy(keyStrength, valueStrength, keyEquivalence, valueEquivalence, expireAfterWriteNanos, expireAfterAccessNanos, maximumSize, concurrencyLevel, evictionListener, this, computingFunction);
    }
}

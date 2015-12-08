// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.inject.internal.util:
//            $Function, $AsynchronousComputationException, $FinalizableSoftReference, $FinalizableReferenceQueue, 
//            $FinalizableWeakReference, $NullOutputException, $ComputationException, $ExpirationTimer

public final class $MapMaker
{
    private static class ComputationExceptionReference
        implements ValueReference
    {

        final Throwable t;

        public ValueReference copyFor(ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return null;
        }

        public Object waitForValue()
        {
            throw new $AsynchronousComputationException(t);
        }

        ComputationExceptionReference(Throwable throwable)
        {
            t = throwable;
        }
    }

    private static class LinkedSoftEntry extends SoftEntry
    {

        final ReferenceEntry next;

        public ReferenceEntry getNext()
        {
            return next;
        }

        LinkedSoftEntry(.CustomConcurrentHashMap.Internals internals, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(internals, obj, i);
            next = referenceentry;
        }
    }

    private static class LinkedStrongEntry extends StrongEntry
    {

        final ReferenceEntry next;

        public ReferenceEntry getNext()
        {
            return next;
        }

        LinkedStrongEntry(.CustomConcurrentHashMap.Internals internals, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(internals, obj, i);
            next = referenceentry;
        }
    }

    private static class LinkedWeakEntry extends WeakEntry
    {

        final ReferenceEntry next;

        public ReferenceEntry getNext()
        {
            return next;
        }

        LinkedWeakEntry(.CustomConcurrentHashMap.Internals internals, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(internals, obj, i);
            next = referenceentry;
        }
    }

    private static class NullOutputExceptionReference
        implements ValueReference
    {

        final String message;

        public ValueReference copyFor(ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return null;
        }

        public Object waitForValue()
        {
            throw new $NullOutputException(message);
        }

        NullOutputExceptionReference(String s)
        {
            message = s;
        }
    }

    private static class QueueHolder
    {

        static final $FinalizableReferenceQueue queue = new $FinalizableReferenceQueue();


        private QueueHolder()
        {
        }
    }

    private static interface ReferenceEntry
    {

        public abstract int getHash();

        public abstract Object getKey();

        public abstract ReferenceEntry getNext();

        public abstract ValueReference getValueReference();

        public abstract void setValueReference(ValueReference valuereference);

        public abstract void valueReclaimed();
    }

    private static class SoftEntry extends $FinalizableSoftReference
        implements ReferenceEntry
    {

        final int hash;
        final .CustomConcurrentHashMap.Internals internals;
        volatile ValueReference valueReference;

        public void finalizeReferent()
        {
            internals.removeEntry(this);
        }

        public int getHash()
        {
            return hash;
        }

        public Object getKey()
        {
            return get();
        }

        public ReferenceEntry getNext()
        {
            return null;
        }

        public ValueReference getValueReference()
        {
            return valueReference;
        }

        public void setValueReference(ValueReference valuereference)
        {
            valueReference = valuereference;
        }

        public void valueReclaimed()
        {
            internals.removeEntry(this, null);
        }

        SoftEntry(.CustomConcurrentHashMap.Internals internals1, Object obj, int i)
        {
            super(obj, QueueHolder.queue);
            valueReference = $MapMaker.computing();
            internals = internals1;
            hash = i;
        }
    }

    private static class SoftValueReference extends $FinalizableSoftReference
        implements ValueReference
    {

        final ReferenceEntry entry;

        public ValueReference copyFor(ReferenceEntry referenceentry)
        {
            return new SoftValueReference(get(), referenceentry);
        }

        public void finalizeReferent()
        {
            entry.valueReclaimed();
        }

        public Object waitForValue()
        {
            return get();
        }

        SoftValueReference(Object obj, ReferenceEntry referenceentry)
        {
            super(obj, QueueHolder.queue);
            entry = referenceentry;
        }
    }

    private static class StrategyImpl
        implements Serializable, .CustomConcurrentHashMap.ComputingStrategy
    {

        private static final long serialVersionUID = 0L;
        final long expirationNanos;
        .CustomConcurrentHashMap.Internals internals;
        final Strength keyStrength;
        final ConcurrentMap map;
        final Strength valueStrength;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            try
            {
                Fields.keyStrength.set(this, objectinputstream.readObject());
                Fields.valueStrength.set(this, objectinputstream.readObject());
                Fields.expirationNanos.set(this, Long.valueOf(objectinputstream.readLong()));
                Fields.internals.set(this, objectinputstream.readObject());
                Fields.map.set(this, objectinputstream.readObject());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ObjectInputStream objectinputstream)
            {
                throw new AssertionError(objectinputstream);
            }
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.writeObject(keyStrength);
            objectoutputstream.writeObject(valueStrength);
            objectoutputstream.writeLong(expirationNanos);
            objectoutputstream.writeObject(internals);
            objectoutputstream.writeObject(map);
        }

        public Object compute(Object obj, ReferenceEntry referenceentry, $Function $function)
        {
            Object obj1;
            try
            {
                obj1 = $function.apply(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                setValueReference(referenceentry, new ComputationExceptionReference(((Throwable) (obj))));
                throw new $ComputationException(((Throwable) (obj)));
            }
            if (obj1 == null)
            {
                obj = (new StringBuilder()).append($function).append(" returned null for key ").append(obj).append(".").toString();
                setValueReference(referenceentry, new NullOutputExceptionReference(((String) (obj))));
                throw new $NullOutputException(((String) (obj)));
            } else
            {
                setValue(referenceentry, obj1);
                return obj1;
            }
        }

        public volatile Object compute(Object obj, Object obj1, $Function $function)
        {
            return compute(obj, (ReferenceEntry)obj1, $function);
        }

        public ReferenceEntry copyEntry(Object obj, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
        {
            ValueReference valuereference = referenceentry.getValueReference();
            if (valuereference == $MapMaker.COMPUTING)
            {
                obj = newEntry(obj, referenceentry.getHash(), referenceentry1);
                ((ReferenceEntry) (obj)).setValueReference(new FutureValueReference(referenceentry, ((ReferenceEntry) (obj))));
                return ((ReferenceEntry) (obj));
            } else
            {
                obj = newEntry(obj, referenceentry.getHash(), referenceentry1);
                ((ReferenceEntry) (obj)).setValueReference(valuereference.copyFor(((ReferenceEntry) (obj))));
                return ((ReferenceEntry) (obj));
            }
        }

        public volatile Object copyEntry(Object obj, Object obj1, Object obj2)
        {
            return copyEntry(obj, (ReferenceEntry)obj1, (ReferenceEntry)obj2);
        }

        public boolean equalKeys(Object obj, Object obj1)
        {
            return keyStrength.equal(obj, obj1);
        }

        public boolean equalValues(Object obj, Object obj1)
        {
            return valueStrength.equal(obj, obj1);
        }

        public int getHash(ReferenceEntry referenceentry)
        {
            return referenceentry.getHash();
        }

        public volatile int getHash(Object obj)
        {
            return getHash((ReferenceEntry)obj);
        }

        public Object getKey(ReferenceEntry referenceentry)
        {
            return referenceentry.getKey();
        }

        public volatile Object getKey(Object obj)
        {
            return getKey((ReferenceEntry)obj);
        }

        public ReferenceEntry getNext(ReferenceEntry referenceentry)
        {
            return referenceentry.getNext();
        }

        public volatile Object getNext(Object obj)
        {
            return getNext((ReferenceEntry)obj);
        }

        public Object getValue(ReferenceEntry referenceentry)
        {
            return referenceentry.getValueReference().get();
        }

        public volatile Object getValue(Object obj)
        {
            return getValue((ReferenceEntry)obj);
        }

        public int hashKey(Object obj)
        {
            return keyStrength.hash(obj);
        }

        public ReferenceEntry newEntry(Object obj, int i, ReferenceEntry referenceentry)
        {
            return keyStrength.newEntry(internals, obj, i, referenceentry);
        }

        public volatile Object newEntry(Object obj, int i, Object obj1)
        {
            return newEntry(obj, i, (ReferenceEntry)obj1);
        }

        void scheduleRemoval(final Object keyReference, Object obj)
        {
            keyReference = new WeakReference(keyReference);
            obj = new WeakReference(obj);
            $ExpirationTimer.instance.schedule(((_cls1) (obj)). new TimerTask() {

                final StrategyImpl this$0;
                final WeakReference val$keyReference;
                final WeakReference val$valueReference;

                public void run()
                {
                    Object obj = keyReference.get();
                    if (obj != null)
                    {
                        map.remove(obj, valueReference.get());
                    }
                }

            
            {
                this$0 = final_strategyimpl;
                keyReference = weakreference;
                valueReference = WeakReference.this;
                super();
            }
            }, TimeUnit.NANOSECONDS.toMillis(expirationNanos));
        }

        public void setInternals(.CustomConcurrentHashMap.Internals internals1)
        {
            internals = internals1;
        }

        public void setValue(ReferenceEntry referenceentry, Object obj)
        {
            setValueReference(referenceentry, valueStrength.referenceValue(referenceentry, obj));
            if (expirationNanos > 0L)
            {
                scheduleRemoval(referenceentry.getKey(), obj);
            }
        }

        public volatile void setValue(Object obj, Object obj1)
        {
            setValue((ReferenceEntry)obj, obj1);
        }

        void setValueReference(ReferenceEntry referenceentry, ValueReference valuereference)
        {
            boolean flag;
            if (referenceentry.getValueReference() == $MapMaker.COMPUTING)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            referenceentry.setValueReference(valuereference);
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_39;
            }
            referenceentry;
            JVM INSTR monitorenter ;
            referenceentry.notifyAll();
            referenceentry;
            JVM INSTR monitorexit ;
            return;
            valuereference;
            referenceentry;
            JVM INSTR monitorexit ;
            throw valuereference;
        }

        public Object waitForValue(ReferenceEntry referenceentry)
            throws InterruptedException
        {
            Object obj;
            ValueReference valuereference;
            valuereference = referenceentry.getValueReference();
            obj = valuereference;
            if (valuereference != $MapMaker.COMPUTING) goto _L2; else goto _L1
_L1:
            referenceentry;
            JVM INSTR monitorenter ;
            do
            {
                obj = referenceentry.getValueReference();
                if (obj != $MapMaker.COMPUTING)
                {
                    break;
                }
                referenceentry.wait();
            } while (true);
              goto _L3
            obj;
            referenceentry;
            JVM INSTR monitorexit ;
            throw obj;
_L3:
            referenceentry;
            JVM INSTR monitorexit ;
_L2:
            return ((ValueReference) (obj)).waitForValue();
        }

        public volatile Object waitForValue(Object obj)
            throws InterruptedException
        {
            return waitForValue((ReferenceEntry)obj);
        }

        StrategyImpl($MapMaker $mapmaker)
        {
            keyStrength = $mapmaker.keyStrength;
            valueStrength = $mapmaker.valueStrength;
            expirationNanos = $mapmaker.expirationNanos;
            map = $mapmaker.builder.buildMap(this);
        }

        StrategyImpl($MapMaker $mapmaker, $Function $function)
        {
            keyStrength = $mapmaker.keyStrength;
            valueStrength = $mapmaker.valueStrength;
            expirationNanos = $mapmaker.expirationNanos;
            map = $mapmaker.builder.buildComputingMap(this, $function);
        }
    }

    private static class StrategyImpl.Fields
    {

        static final Field expirationNanos = findField("expirationNanos");
        static final Field internals = findField("internals");
        static final Field keyStrength = findField("keyStrength");
        static final Field map = findField("map");
        static final Field valueStrength = findField("valueStrength");

        static Field findField(String s)
        {
            try
            {
                s = com/google/inject/internal/util/$MapMaker$StrategyImpl.getDeclaredField(s);
                s.setAccessible(true);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new AssertionError(s);
            }
            return s;
        }


        private StrategyImpl.Fields()
        {
        }
    }

    private class StrategyImpl.FutureValueReference
        implements ValueReference
    {

        final ReferenceEntry newEntry;
        final ReferenceEntry original;
        final StrategyImpl this$0;

        public ValueReference copyFor(ReferenceEntry referenceentry)
        {
            return new StrategyImpl.FutureValueReference(original, referenceentry);
        }

        public Object get()
        {
            Object obj = original.getValueReference().get();
            if (false)
            {
                removeEntry();
            }
            return obj;
            Exception exception;
            exception;
            if (true)
            {
                removeEntry();
            }
            throw exception;
        }

        void removeEntry()
        {
            internals.removeEntry(newEntry);
        }

        public Object waitForValue()
            throws InterruptedException
        {
            Object obj = StrategyImpl.this.waitForValue(original);
            if (false)
            {
                removeEntry();
            }
            return obj;
            Exception exception;
            exception;
            if (true)
            {
                removeEntry();
            }
            throw exception;
        }

        StrategyImpl.FutureValueReference(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
        {
            this$0 = StrategyImpl.this;
            super();
            original = referenceentry;
            newEntry = referenceentry1;
        }
    }

    private static abstract class Strength extends Enum
    {

        private static final Strength $VALUES[];
        public static final Strength SOFT;
        public static final Strength STRONG;
        public static final Strength WEAK;

        public static Strength valueOf(String s)
        {
            return (Strength)Enum.valueOf(com/google/inject/internal/util/$MapMaker$Strength, s);
        }

        public static Strength[] values()
        {
            return (Strength[])$VALUES.clone();
        }

        abstract ReferenceEntry copyEntry(Object obj, ReferenceEntry referenceentry, ReferenceEntry referenceentry1);

        abstract boolean equal(Object obj, Object obj1);

        abstract int hash(Object obj);

        abstract ReferenceEntry newEntry(.CustomConcurrentHashMap.Internals internals, Object obj, int i, ReferenceEntry referenceentry);

        abstract ValueReference referenceValue(ReferenceEntry referenceentry, Object obj);

        static 
        {
            WEAK = new Strength("WEAK", 0) {

                ReferenceEntry copyEntry(Object obj, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    referenceentry = (WeakEntry)referenceentry;
                    if (referenceentry1 == null)
                    {
                        return new WeakEntry(((WeakEntry) (referenceentry)).internals, obj, ((WeakEntry) (referenceentry)).hash);
                    } else
                    {
                        return new LinkedWeakEntry(((WeakEntry) (referenceentry)).internals, obj, ((WeakEntry) (referenceentry)).hash, referenceentry1);
                    }
                }

                boolean equal(Object obj, Object obj1)
                {
                    return obj == obj1;
                }

                int hash(Object obj)
                {
                    return System.identityHashCode(obj);
                }

                ReferenceEntry newEntry(.CustomConcurrentHashMap.Internals internals, Object obj, int i, ReferenceEntry referenceentry)
                {
                    if (referenceentry == null)
                    {
                        return new WeakEntry(internals, obj, i);
                    } else
                    {
                        return new LinkedWeakEntry(internals, obj, i, referenceentry);
                    }
                }

                ValueReference referenceValue(ReferenceEntry referenceentry, Object obj)
                {
                    return new WeakValueReference(obj, referenceentry);
                }

            };
            SOFT = new Strength("SOFT", 1) {

                ReferenceEntry copyEntry(Object obj, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    referenceentry = (SoftEntry)referenceentry;
                    if (referenceentry1 == null)
                    {
                        return new SoftEntry(((SoftEntry) (referenceentry)).internals, obj, ((SoftEntry) (referenceentry)).hash);
                    } else
                    {
                        return new LinkedSoftEntry(((SoftEntry) (referenceentry)).internals, obj, ((SoftEntry) (referenceentry)).hash, referenceentry1);
                    }
                }

                boolean equal(Object obj, Object obj1)
                {
                    return obj == obj1;
                }

                int hash(Object obj)
                {
                    return System.identityHashCode(obj);
                }

                ReferenceEntry newEntry(.CustomConcurrentHashMap.Internals internals, Object obj, int i, ReferenceEntry referenceentry)
                {
                    if (referenceentry == null)
                    {
                        return new SoftEntry(internals, obj, i);
                    } else
                    {
                        return new LinkedSoftEntry(internals, obj, i, referenceentry);
                    }
                }

                ValueReference referenceValue(ReferenceEntry referenceentry, Object obj)
                {
                    return new SoftValueReference(obj, referenceentry);
                }

            };
            STRONG = new Strength("STRONG", 2) {

                ReferenceEntry copyEntry(Object obj, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    referenceentry = (StrongEntry)referenceentry;
                    if (referenceentry1 == null)
                    {
                        return new StrongEntry(((StrongEntry) (referenceentry)).internals, obj, ((StrongEntry) (referenceentry)).hash);
                    } else
                    {
                        return new LinkedStrongEntry(((StrongEntry) (referenceentry)).internals, obj, ((StrongEntry) (referenceentry)).hash, referenceentry1);
                    }
                }

                boolean equal(Object obj, Object obj1)
                {
                    return obj.equals(obj1);
                }

                int hash(Object obj)
                {
                    return obj.hashCode();
                }

                ReferenceEntry newEntry(.CustomConcurrentHashMap.Internals internals, Object obj, int i, ReferenceEntry referenceentry)
                {
                    if (referenceentry == null)
                    {
                        return new StrongEntry(internals, obj, i);
                    } else
                    {
                        return new LinkedStrongEntry(internals, obj, i, referenceentry);
                    }
                }

                ValueReference referenceValue(ReferenceEntry referenceentry, Object obj)
                {
                    return new StrongValueReference(obj);
                }

            };
            $VALUES = (new Strength[] {
                WEAK, SOFT, STRONG
            });
        }

        private Strength(String s, int i)
        {
            super(s, i);
        }

    }

    private static class StrongEntry
        implements ReferenceEntry
    {

        final int hash;
        final .CustomConcurrentHashMap.Internals internals;
        final Object key;
        volatile ValueReference valueReference;

        public int getHash()
        {
            return hash;
        }

        public Object getKey()
        {
            return key;
        }

        public ReferenceEntry getNext()
        {
            return null;
        }

        public ValueReference getValueReference()
        {
            return valueReference;
        }

        public void setValueReference(ValueReference valuereference)
        {
            valueReference = valuereference;
        }

        public void valueReclaimed()
        {
            internals.removeEntry(this, null);
        }

        StrongEntry(.CustomConcurrentHashMap.Internals internals1, Object obj, int i)
        {
            valueReference = $MapMaker.computing();
            internals = internals1;
            key = obj;
            hash = i;
        }
    }

    private static class StrongValueReference
        implements ValueReference
    {

        final Object referent;

        public ValueReference copyFor(ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return referent;
        }

        public Object waitForValue()
        {
            return get();
        }

        StrongValueReference(Object obj)
        {
            referent = obj;
        }
    }

    private static interface ValueReference
    {

        public abstract ValueReference copyFor(ReferenceEntry referenceentry);

        public abstract Object get();

        public abstract Object waitForValue()
            throws InterruptedException;
    }

    private static class WeakEntry extends $FinalizableWeakReference
        implements ReferenceEntry
    {

        final int hash;
        final .CustomConcurrentHashMap.Internals internals;
        volatile ValueReference valueReference;

        public void finalizeReferent()
        {
            internals.removeEntry(this);
        }

        public int getHash()
        {
            return hash;
        }

        public Object getKey()
        {
            return get();
        }

        public ReferenceEntry getNext()
        {
            return null;
        }

        public ValueReference getValueReference()
        {
            return valueReference;
        }

        public void setValueReference(ValueReference valuereference)
        {
            valueReference = valuereference;
        }

        public void valueReclaimed()
        {
            internals.removeEntry(this, null);
        }

        WeakEntry(.CustomConcurrentHashMap.Internals internals1, Object obj, int i)
        {
            super(obj, QueueHolder.queue);
            valueReference = $MapMaker.computing();
            internals = internals1;
            hash = i;
        }
    }

    private static class WeakValueReference extends $FinalizableWeakReference
        implements ValueReference
    {

        final ReferenceEntry entry;

        public ValueReference copyFor(ReferenceEntry referenceentry)
        {
            return new WeakValueReference(get(), referenceentry);
        }

        public void finalizeReferent()
        {
            entry.valueReclaimed();
        }

        public Object waitForValue()
            throws InterruptedException
        {
            return get();
        }

        WeakValueReference(Object obj, ReferenceEntry referenceentry)
        {
            super(obj, QueueHolder.queue);
            entry = referenceentry;
        }
    }


    private static final ValueReference COMPUTING = new ValueReference() {

        public ValueReference copyFor(ReferenceEntry referenceentry)
        {
            throw new AssertionError();
        }

        public Object get()
        {
            return null;
        }

        public Object waitForValue()
        {
            throw new AssertionError();
        }

    };
    private final .CustomConcurrentHashMap.Builder builder = new .CustomConcurrentHashMap.Builder();
    private long expirationNanos;
    private Strength keyStrength;
    private boolean useCustomMap;
    private Strength valueStrength;

    public $MapMaker()
    {
        keyStrength = Strength.STRONG;
        valueStrength = Strength.STRONG;
        expirationNanos = 0L;
    }

    private static ValueReference computing()
    {
        return COMPUTING;
    }

    private $MapMaker setKeyStrength(Strength strength)
    {
        if (keyStrength != Strength.STRONG)
        {
            throw new IllegalStateException((new StringBuilder()).append("Key strength was already set to ").append(keyStrength).append(".").toString());
        } else
        {
            keyStrength = strength;
            useCustomMap = true;
            return this;
        }
    }

    private $MapMaker setValueStrength(Strength strength)
    {
        if (valueStrength != Strength.STRONG)
        {
            throw new IllegalStateException((new StringBuilder()).append("Value strength was already set to ").append(valueStrength).append(".").toString());
        } else
        {
            valueStrength = strength;
            useCustomMap = true;
            return this;
        }
    }

    public $MapMaker concurrencyLevel(int i)
    {
        builder.concurrencyLevel(i);
        return this;
    }

    public $MapMaker expiration(long l, TimeUnit timeunit)
    {
        if (expirationNanos != 0L)
        {
            throw new IllegalStateException((new StringBuilder()).append("expiration time of ").append(expirationNanos).append(" ns was already set").toString());
        }
        if (l <= 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid duration: ").append(l).toString());
        } else
        {
            expirationNanos = timeunit.toNanos(l);
            useCustomMap = true;
            return this;
        }
    }

    public $MapMaker initialCapacity(int i)
    {
        builder.initialCapacity(i);
        return this;
    }

    public $MapMaker loadFactor(float f)
    {
        builder.loadFactor(f);
        return this;
    }

    public ConcurrentMap makeComputingMap($Function $function)
    {
        return (new StrategyImpl(this, $function)).map;
    }

    public ConcurrentMap makeMap()
    {
        if (useCustomMap)
        {
            return (new StrategyImpl(this)).map;
        } else
        {
            return new ConcurrentHashMap(builder.initialCapacity, builder.loadFactor, builder.concurrencyLevel);
        }
    }

    public $MapMaker softKeys()
    {
        return setKeyStrength(Strength.SOFT);
    }

    public $MapMaker softValues()
    {
        return setValueStrength(Strength.SOFT);
    }

    public $MapMaker weakKeys()
    {
        return setKeyStrength(Strength.WEAK);
    }

    public $MapMaker weakValues()
    {
        return setValueStrength(Strength.WEAK);
    }







}

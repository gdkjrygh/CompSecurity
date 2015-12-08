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
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.inject.internal.util:
//            $MapMaker, $Function, $NullOutputException, $ComputationException, 
//            $ExpirationTimer

private static class p.ComputingStrategy
    implements Serializable, p.ComputingStrategy
{
    private static class Fields
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


        private Fields()
        {
        }
    }

    private class FutureValueReference
        implements .MapMaker.ValueReference
    {

        final .MapMaker.ReferenceEntry newEntry;
        final .MapMaker.ReferenceEntry original;
        final .MapMaker.StrategyImpl this$0;

        public .MapMaker.ValueReference copyFor(.MapMaker.ReferenceEntry referenceentry)
        {
            return new FutureValueReference(original, referenceentry);
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
            Object obj = .MapMaker.StrategyImpl.this.waitForValue(original);
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

        FutureValueReference(.MapMaker.ReferenceEntry referenceentry, .MapMaker.ReferenceEntry referenceentry1)
        {
            this$0 = .MapMaker.StrategyImpl.this;
            super();
            original = referenceentry;
            newEntry = referenceentry1;
        }
    }


    private static final long serialVersionUID = 0L;
    final long expirationNanos;
    p.Internals internals;
    final p.Internals keyStrength;
    final ConcurrentMap map;
    final p.Internals valueStrength;

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

    public Object compute(Object obj, y y, $Function $function)
    {
        Object obj1;
        try
        {
            obj1 = $function.apply(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            setValueReference(y, new ceptionReference(((Throwable) (obj))));
            throw new $ComputationException(((Throwable) (obj)));
        }
        if (obj1 == null)
        {
            obj = (new StringBuilder()).append($function).append(" returned null for key ").append(obj).append(".").toString();
            setValueReference(y, new eptionReference(((String) (obj))));
            throw new $NullOutputException(((String) (obj)));
        } else
        {
            setValue(y, obj1);
            return obj1;
        }
    }

    public volatile Object compute(Object obj, Object obj1, $Function $function)
    {
        return compute(obj, (y)obj1, $function);
    }

    public y copyEntry(Object obj, y y, y y1)
    {
        e e = y.getValueReference();
        if (e == $MapMaker.access$500())
        {
            obj = newEntry(obj, y.getHash(), y1);
            ((y) (obj)).setValueReference(new FutureValueReference(y, ((y) (obj))));
            return ((y) (obj));
        } else
        {
            obj = newEntry(obj, y.getHash(), y1);
            ((y) (obj)).setValueReference(e.copyFor(((y) (obj))));
            return ((y) (obj));
        }
    }

    public volatile Object copyEntry(Object obj, Object obj1, Object obj2)
    {
        return copyEntry(obj, (y)obj1, (y)obj2);
    }

    public boolean equalKeys(Object obj, Object obj1)
    {
        return keyStrength.l(obj, obj1);
    }

    public boolean equalValues(Object obj, Object obj1)
    {
        return valueStrength.l(obj, obj1);
    }

    public int getHash(y y)
    {
        return y.getHash();
    }

    public volatile int getHash(Object obj)
    {
        return getHash((y)obj);
    }

    public Object getKey(y y)
    {
        return y.getKey();
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((y)obj);
    }

    public y getNext(y y)
    {
        return y.getNext();
    }

    public volatile Object getNext(Object obj)
    {
        return getNext((y)obj);
    }

    public Object getValue(y y)
    {
        return y.getValueReference().get();
    }

    public volatile Object getValue(Object obj)
    {
        return getValue((y)obj);
    }

    public int hashKey(Object obj)
    {
        return keyStrength.(obj);
    }

    public y newEntry(Object obj, int i, y y)
    {
        return keyStrength.ntry(internals, obj, i, y);
    }

    public volatile Object newEntry(Object obj, int i, Object obj1)
    {
        return newEntry(obj, i, (y)obj1);
    }

    void scheduleRemoval(final Object keyReference, final Object valueReference)
    {
        keyReference = new WeakReference(keyReference);
        valueReference = new WeakReference(valueReference);
        $ExpirationTimer.instance.schedule(new TimerTask() {

            final .MapMaker.StrategyImpl this$0;
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
                this$0 = .MapMaker.StrategyImpl.this;
                keyReference = weakreference;
                valueReference = weakreference1;
                super();
            }
        }, TimeUnit.NANOSECONDS.toMillis(expirationNanos));
    }

    public void setInternals(p.Internals internals1)
    {
        internals = internals1;
    }

    public void setValue(y y, Object obj)
    {
        setValueReference(y, valueStrength.renceValue(y, obj));
        if (expirationNanos > 0L)
        {
            scheduleRemoval(y.getKey(), obj);
        }
    }

    public volatile void setValue(Object obj, Object obj1)
    {
        setValue((y)obj, obj1);
    }

    void setValueReference(y y, e e)
    {
        boolean flag;
        if (y.getValueReference() == $MapMaker.access$500())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.setValueReference(e);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        y;
        JVM INSTR monitorenter ;
        y.notifyAll();
        y;
        JVM INSTR monitorexit ;
        return;
        e;
        y;
        JVM INSTR monitorexit ;
        throw e;
    }

    public Object waitForValue(y y)
        throws InterruptedException
    {
        Object obj;
        e e;
        e = y.getValueReference();
        obj = e;
        if (e != $MapMaker.access$500()) goto _L2; else goto _L1
_L1:
        y;
        JVM INSTR monitorenter ;
        do
        {
            obj = y.getValueReference();
            if (obj != $MapMaker.access$500())
            {
                break;
            }
            y.wait();
        } while (true);
          goto _L3
        obj;
        y;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        y;
        JVM INSTR monitorexit ;
_L2:
        return ((e) (obj)).waitForValue();
    }

    public volatile Object waitForValue(Object obj)
        throws InterruptedException
    {
        return waitForValue((y)obj);
    }

    p.Strategy($MapMaker $mapmaker)
    {
        keyStrength = $MapMaker.access$100($mapmaker);
        valueStrength = $MapMaker.access$200($mapmaker);
        expirationNanos = $MapMaker.access$300($mapmaker);
        map = $MapMaker.access$400($mapmaker).buildMap(this);
    }

    p.ComputingStrategy($MapMaker $mapmaker, $Function $function)
    {
        keyStrength = $MapMaker.access$100($mapmaker);
        valueStrength = $MapMaker.access$200($mapmaker);
        expirationNanos = $MapMaker.access$300($mapmaker);
        map = $MapMaker.access$400($mapmaker).buildComputingMap(this, $function);
    }
}

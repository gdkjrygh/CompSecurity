// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;

public final class CachedObservable extends Observable
{

    private CacheState state;

    private CachedObservable(rx.Observable.OnSubscribe onsubscribe, CacheState cachestate)
    {
        super(onsubscribe);
        state = cachestate;
    }

    public static CachedObservable from(Observable observable)
    {
        return from(observable, 16);
    }

    public static CachedObservable from(Observable observable, int i)
    {
        if (i < 1)
        {
            throw new IllegalArgumentException("capacityHint > 0 required");
        } else
        {
            observable = new CacheState(observable, i);
            return new CachedObservable(new CachedSubscribe(observable), observable);
        }
    }

    int cachedEventCount()
    {
        return state.size();
    }

    boolean hasObservers()
    {
        return state.producers.length != 0;
    }

    boolean isConnected()
    {
        return state.isConnected;
    }

    private class CacheState extends LinkedArrayList
        implements Observer
    {

        static final ReplayProducer EMPTY[] = new ReplayProducer[0];
        final SerialSubscription connection = new SerialSubscription();
        volatile boolean isConnected;
        final NotificationLite nl = NotificationLite.instance();
        volatile ReplayProducer producers[];
        final Observable source;
        boolean sourceDone;

        public void addProducer(ReplayProducer replayproducer)
        {
            SerialSubscription serialsubscription = connection;
            serialsubscription;
            JVM INSTR monitorenter ;
            ReplayProducer areplayproducer1[];
            int i;
            ReplayProducer areplayproducer[] = producers;
            i = areplayproducer.length;
            areplayproducer1 = new ReplayProducer[i + 1];
            System.arraycopy(areplayproducer, 0, areplayproducer1, 0, i);
            areplayproducer1[i] = replayproducer;
            producers = areplayproducer1;
            serialsubscription;
            JVM INSTR monitorexit ;
            return;
            replayproducer;
            serialsubscription;
            JVM INSTR monitorexit ;
            throw replayproducer;
        }

        public void connect()
        {
            Subscriber subscriber = new Subscriber() {

                final CacheState this$0;

                public void onCompleted()
                {
                    CacheState.this.onCompleted();
                }

                public void onError(Throwable throwable)
                {
                    CacheState.this.onError(throwable);
                }

                public void onNext(Object obj)
                {
                    CacheState.this.onNext(obj);
                }

                
                {
                    this$0 = CacheState.this;
                    super();
                }
            };
            connection.set(subscriber);
            source.unsafeSubscribe(subscriber);
            isConnected = true;
        }

        void dispatch()
        {
            ReplayProducer areplayproducer[] = producers;
            int j = areplayproducer.length;
            for (int i = 0; i < j; i++)
            {
                areplayproducer[i].replay();
            }

        }

        public void onCompleted()
        {
            if (!sourceDone)
            {
                sourceDone = true;
                add(nl.completed());
                connection.unsubscribe();
                dispatch();
            }
        }

        public void onError(Throwable throwable)
        {
            if (!sourceDone)
            {
                sourceDone = true;
                add(nl.error(throwable));
                connection.unsubscribe();
                dispatch();
            }
        }

        public void onNext(Object obj)
        {
            if (!sourceDone)
            {
                add(nl.next(obj));
                dispatch();
            }
        }

        public void removeProducer(ReplayProducer replayproducer)
        {
            int i = 0;
            SerialSubscription serialsubscription = connection;
            serialsubscription;
            JVM INSTR monitorenter ;
            ReplayProducer areplayproducer[];
            int j;
            areplayproducer = producers;
            j = areplayproducer.length;
_L6:
            if (i >= j) goto _L2; else goto _L1
_L1:
            if (!areplayproducer[i].equals(replayproducer)) goto _L4; else goto _L3
_L3:
            if (i >= 0)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            serialsubscription;
            JVM INSTR monitorexit ;
            return;
            if (j != 1)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            producers = EMPTY;
            serialsubscription;
            JVM INSTR monitorexit ;
            return;
            replayproducer;
            serialsubscription;
            JVM INSTR monitorexit ;
            throw replayproducer;
            replayproducer = new ReplayProducer[j - 1];
            System.arraycopy(areplayproducer, 0, replayproducer, 0, i);
            System.arraycopy(areplayproducer, i + 1, replayproducer, i, j - i - 1);
            producers = replayproducer;
            serialsubscription;
            JVM INSTR monitorexit ;
            return;
_L2:
            i = -1;
            if (true) goto _L3; else goto _L4
_L4:
            i++;
            if (true) goto _L6; else goto _L5
_L5:
        }


        public CacheState(Observable observable, int i)
        {
            super(i);
            source = observable;
            producers = EMPTY;
        }

        private class ReplayProducer extends AtomicLong
            implements Producer, Subscription
        {

            private static final long serialVersionUID = 0xdc81b6e2531291e3L;
            final Subscriber child;
            Object currentBuffer[];
            int currentIndexInBuffer;
            boolean emitting;
            int index;
            boolean missed;
            final CacheState state;

            public boolean isUnsubscribed()
            {
                return get() < 0L;
            }

            public long produced(long l)
            {
                return addAndGet(-l);
            }

            public void replay()
            {
                this;
                JVM INSTR monitorenter ;
                if (!emitting)
                {
                    break MISSING_BLOCK_LABEL_17;
                }
                missed = true;
                this;
                JVM INSTR monitorexit ;
                return;
                emitting = true;
                this;
                JVM INSTR monitorexit ;
                int i;
                boolean flag;
                boolean flag1;
                boolean flag2;
                flag1 = false;
                flag2 = false;
                flag = false;
                i = ((flag) ? 1 : 0);
                NotificationLite notificationlite = state.nl;
                i = ((flag) ? 1 : 0);
                Subscriber subscriber = child;
_L14:
                i = ((flag) ? 1 : 0);
                long l1 = get();
                if (l1 < 0L) goto _L2; else goto _L1
_L1:
                i = ((flag) ? 1 : 0);
                int j1 = state.size();
                if (j1 == 0) goto _L4; else goto _L3
_L3:
                i = ((flag) ? 1 : 0);
                Object aobj[] = currentBuffer;
                Object obj;
                obj = ((Object) (aobj));
                if (aobj != null)
                {
                    break MISSING_BLOCK_LABEL_126;
                }
                i = ((flag) ? 1 : 0);
                obj = ((Object) (state.head()));
                i = ((flag) ? 1 : 0);
                currentBuffer = ((Object []) (obj));
                i = ((flag) ? 1 : 0);
                int k1 = obj.length - 1;
                i = ((flag) ? 1 : 0);
                int i1 = index;
                i = ((flag) ? 1 : 0);
                int j = currentIndexInBuffer;
                if (l1 != 0L) goto _L6; else goto _L5
_L5:
                obj = obj[j];
                i = ((flag) ? 1 : 0);
                if (!notificationlite.isCompleted(obj))
                {
                    break MISSING_BLOCK_LABEL_219;
                }
                i = ((flag) ? 1 : 0);
                subscriber.onCompleted();
                i = 1;
                unsubscribe();
                return;
                JVM INSTR monitorenter ;
                emitting = false;
                this;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                this;
                JVM INSTR monitorexit ;
                throw obj;
                i = ((flag) ? 1 : 0);
                if (!notificationlite.isError(obj)) goto _L4; else goto _L7
_L7:
                i = ((flag) ? 1 : 0);
                subscriber.onError(notificationlite.getError(obj));
                i = 1;
                unsubscribe();
                return;
_L16:
                if (i1 >= j1 || l1 <= 0L) goto _L9; else goto _L8
_L8:
                i = ((flag) ? 1 : 0);
                if (subscriber.isUnsubscribed()) goto _L2; else goto _L10
_L10:
                int l;
                l = j;
                obj = ((Object) (aobj));
                if (j != k1)
                {
                    break MISSING_BLOCK_LABEL_310;
                }
                i = ((flag) ? 1 : 0);
                obj = ((Object) ((Object[])(Object[])aobj[k1]));
                l = 0;
                aobj = ((Object []) (obj[l]));
                i = ((flag) ? 1 : 0);
                j = ((flag1) ? 1 : 0);
                if (!notificationlite.accept(subscriber, ((Object) (aobj))))
                {
                    break MISSING_BLOCK_LABEL_536;
                }
                j = 1;
                i = 1;
                try
                {
                    unsubscribe();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    i = j;
                }
                finally
                {
                    if (i != 0) goto _L0; else goto _L0
                }
                Exceptions.throwIfFatal(((Throwable) (obj)));
                j = 1;
                i = j;
                unsubscribe();
                i = j;
                if (notificationlite.isError(((Object) (aobj)))) goto _L2; else goto _L11
_L11:
                i = j;
                if (notificationlite.isCompleted(((Object) (aobj)))) goto _L2; else goto _L12
_L12:
                i = j;
                subscriber.onError(OnErrorThrowable.addValueAsLastCause(((Throwable) (obj)), notificationlite.getValue(((Object) (aobj)))));
                return;
_L9:
                i = ((flag) ? 1 : 0);
                if (subscriber.isUnsubscribed()) goto _L2; else goto _L13
_L13:
                i = ((flag) ? 1 : 0);
                index = i1;
                i = ((flag) ? 1 : 0);
                currentIndexInBuffer = j;
                i = ((flag) ? 1 : 0);
                currentBuffer = aobj;
                i = ((flag) ? 1 : 0);
                int k;
                produced(k);
_L4:
                i = ((flag) ? 1 : 0);
                this;
                JVM INSTR monitorenter ;
                i = ((flag2) ? 1 : 0);
                if (missed)
                {
                    break MISSING_BLOCK_LABEL_497;
                }
                i = ((flag2) ? 1 : 0);
                emitting = false;
                i = 1;
                this;
                JVM INSTR monitorexit ;
                return;
                obj;
                this;
                JVM INSTR monitorexit ;
                throw obj;
                i = ((flag2) ? 1 : 0);
                missed = false;
                i = ((flag2) ? 1 : 0);
                this;
                JVM INSTR monitorexit ;
                  goto _L14
                obj;
                this;
                JVM INSTR monitorexit ;
                throw obj;
_L2:
                return;
_L6:
                if (l1 <= 0L) goto _L4; else goto _L15
_L15:
                k = 0;
                aobj = ((Object []) (obj));
                  goto _L16
                i1++;
                l1--;
                k++;
                j = l + 1;
                aobj = ((Object []) (obj));
                  goto _L16
            }

            public void request(long l)
            {
                long l1;
                long l3;
                do
                {
                    l3 = get();
                    if (l3 < 0L)
                    {
                        return;
                    }
                    long l2 = l3 + l;
                    l1 = l2;
                    if (l2 < 0L)
                    {
                        l1 = 0x7fffffffffffffffL;
                    }
                } while (!compareAndSet(l3, l1));
                replay();
            }

            public void unsubscribe()
            {
                if (get() >= 0L && getAndSet(-1L) >= 0L)
                {
                    state.removeProducer(this);
                }
            }

            public ReplayProducer(Subscriber subscriber, CacheState cachestate)
            {
                child = subscriber;
                state = cachestate;
            }
        }

    }


    private class CachedSubscribe extends AtomicBoolean
        implements rx.Observable.OnSubscribe
    {

        private static final long serialVersionUID = 0xd8e555c98d8dfdb2L;
        final CacheState state;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            ReplayProducer replayproducer = new ReplayProducer(subscriber, state);
            state.addProducer(replayproducer);
            subscriber.add(replayproducer);
            subscriber.setProducer(replayproducer);
            if (!get() && compareAndSet(false, true))
            {
                state.connect();
            }
        }

        public CachedSubscribe(CacheState cachestate)
        {
            state = cachestate;
        }
    }

}

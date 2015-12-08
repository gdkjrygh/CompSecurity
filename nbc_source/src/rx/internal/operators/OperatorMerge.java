// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.ScalarSynchronousObservable;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.operators:
//            BackpressureUtils, NotificationLite

public final class OperatorMerge
    implements rx.Observable.Operator
{
    private static final class HolderDelayErrors
    {

        static final OperatorMerge INSTANCE = new OperatorMerge(true, 0x7fffffff);


        private HolderDelayErrors()
        {
        }
    }

    private static final class HolderNoDelay
    {

        static final OperatorMerge INSTANCE = new OperatorMerge(false, 0x7fffffff);


        private HolderNoDelay()
        {
        }
    }

    static final class InnerSubscriber extends Subscriber
    {

        static final int limit;
        volatile boolean done;
        final long id;
        int outstanding;
        final MergeSubscriber parent;
        volatile RxRingBuffer queue;

        public void onCompleted()
        {
            done = true;
            parent.emit();
        }

        public void onError(Throwable throwable)
        {
            done = true;
            parent.getOrCreateErrorQueue().offer(throwable);
            parent.emit();
        }

        public void onNext(Object obj)
        {
            parent.tryEmit(this, obj);
        }

        public void onStart()
        {
            outstanding = RxRingBuffer.SIZE;
            request(RxRingBuffer.SIZE);
        }

        public void requestMore(long l)
        {
            int i = outstanding - (int)l;
            if (i > limit)
            {
                outstanding = i;
            } else
            {
                outstanding = RxRingBuffer.SIZE;
                i = RxRingBuffer.SIZE - i;
                if (i > 0)
                {
                    request(i);
                    return;
                }
            }
        }

        static 
        {
            limit = RxRingBuffer.SIZE / 4;
        }

        public InnerSubscriber(MergeSubscriber mergesubscriber, long l)
        {
            parent = mergesubscriber;
            id = l;
        }
    }

    static final class MergeProducer extends AtomicLong
        implements Producer
    {

        private static final long serialVersionUID = 0xef25a88f94f52b91L;
        final MergeSubscriber subscriber;

        public long produced(int i)
        {
            return addAndGet(-i);
        }

        public void request(long l)
        {
            if (l <= 0L) goto _L2; else goto _L1
_L1:
            if (get() != 0x7fffffffffffffffL) goto _L4; else goto _L3
_L3:
            return;
_L4:
            BackpressureUtils.getAndAddRequest(this, l);
            subscriber.emit();
            return;
_L2:
            if (l < 0L)
            {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        public MergeProducer(MergeSubscriber mergesubscriber)
        {
            subscriber = mergesubscriber;
        }
    }

    static final class MergeSubscriber extends Subscriber
    {

        static final InnerSubscriber EMPTY[] = new InnerSubscriber[0];
        final Subscriber child;
        final boolean delayErrors;
        volatile boolean done;
        boolean emitting;
        volatile ConcurrentLinkedQueue errors;
        final Object innerGuard = new Object();
        volatile InnerSubscriber innerSubscribers[];
        long lastId;
        int lastIndex;
        final int maxConcurrent;
        boolean missed;
        final NotificationLite nl = NotificationLite.instance();
        MergeProducer producer;
        volatile RxRingBuffer queue;
        volatile CompositeSubscription subscriptions;
        long uniqueId;

        private void reportError()
        {
            ArrayList arraylist = new ArrayList(errors);
            if (arraylist.size() == 1)
            {
                child.onError((Throwable)arraylist.get(0));
                return;
            } else
            {
                child.onError(new CompositeException(arraylist));
                return;
            }
        }

        void addInner(InnerSubscriber innersubscriber)
        {
            getOrCreateComposite().add(innersubscriber);
            Object obj = innerGuard;
            obj;
            JVM INSTR monitorenter ;
            InnerSubscriber ainnersubscriber1[];
            int i;
            InnerSubscriber ainnersubscriber[] = innerSubscribers;
            i = ainnersubscriber.length;
            ainnersubscriber1 = new InnerSubscriber[i + 1];
            System.arraycopy(ainnersubscriber, 0, ainnersubscriber1, 0, i);
            ainnersubscriber1[i] = innersubscriber;
            innerSubscribers = ainnersubscriber1;
            obj;
            JVM INSTR monitorexit ;
            return;
            innersubscriber;
            obj;
            JVM INSTR monitorexit ;
            throw innersubscriber;
        }

        boolean checkTerminate()
        {
            if (child.isUnsubscribed())
            {
                return true;
            }
            ConcurrentLinkedQueue concurrentlinkedqueue = errors;
            if (delayErrors || concurrentlinkedqueue == null || concurrentlinkedqueue.isEmpty())
            {
                break MISSING_BLOCK_LABEL_54;
            }
            reportError();
            unsubscribe();
            return true;
            Exception exception;
            exception;
            unsubscribe();
            throw exception;
            return false;
        }

        void emit()
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
            emitLoop();
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        void emitLoop()
        {
            int j;
            boolean flag2;
            boolean flag3;
            flag3 = false;
            flag2 = false;
            j = ((flag2) ? 1 : 0);
            Subscriber subscriber = child;
_L76:
            j = ((flag2) ? 1 : 0);
            boolean flag5 = checkTerminate();
            if (!flag5) goto _L2; else goto _L1
_L1:
            if (true) goto _L4; else goto _L3
_L3:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
_L2:
            j = ((flag2) ? 1 : 0);
            Object obj1 = queue;
            j = ((flag2) ? 1 : 0);
            long l2 = producer.get();
            Object obj;
            int i;
            int l;
            int i1;
            int j1;
            int k1;
            int l1;
            boolean flag4;
            int i2;
            long l3;
            Object obj2;
            InnerSubscriber innersubscriber;
            boolean flag1;
            boolean flag6;
            if (l2 == 0x7fffffffffffffffL)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            j = 0;
            i = 0;
            l3 = l2;
              goto _L5
_L29:
            if (l2 <= 0L) goto _L7; else goto _L6
_L6:
            j = ((flag2) ? 1 : 0);
            obj = ((RxRingBuffer) (obj1)).poll();
            j = ((flag2) ? 1 : 0);
            flag6 = checkTerminate();
            if (!flag6) goto _L9; else goto _L8
_L8:
            if (true) goto _L4; else goto _L10
_L10:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L9:
            if (obj != null) goto _L11; else goto _L7
_L7:
            if (i <= 0) goto _L13; else goto _L12
_L12:
            if (!flag1) goto _L15; else goto _L14
_L14:
            l2 = 0x7fffffffffffffffL;
_L13:
            i = l;
            l3 = l2;
            if (l2 == 0L) goto _L17; else goto _L16
_L16:
            i = l;
            l3 = l2;
            if (obj != null) goto _L19; else goto _L18
_L18:
            l3 = l2;
            i = l;
_L17:
            j = ((flag2) ? 1 : 0);
            flag6 = done;
            j = ((flag2) ? 1 : 0);
            obj = queue;
            j = ((flag2) ? 1 : 0);
            obj2 = innerSubscribers;
            j = ((flag2) ? 1 : 0);
            i2 = obj2.length;
            if (!flag6) goto _L21; else goto _L20
_L20:
            if (obj == null) goto _L23; else goto _L22
_L22:
            j = ((flag2) ? 1 : 0);
            if (!((RxRingBuffer) (obj)).isEmpty()) goto _L21; else goto _L23
_L23:
            if (i2 != 0) goto _L21; else goto _L24
_L24:
            j = ((flag2) ? 1 : 0);
            obj1 = errors;
            if (obj1 == null) goto _L26; else goto _L25
_L25:
            j = ((flag2) ? 1 : 0);
            if (!((Queue) (obj1)).isEmpty()) goto _L27; else goto _L26
_L26:
            j = ((flag2) ? 1 : 0);
            subscriber.onCompleted();
_L36:
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_305;
            }
            j = ((flag2) ? 1 : 0);
            ((RxRingBuffer) (obj)).release();
            if (true) goto _L4; else goto _L28
_L28:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L11:
            j = ((flag2) ? 1 : 0);
            obj2 = nl.getValue(obj);
            j = ((flag2) ? 1 : 0);
            subscriber.onNext(obj2);
_L33:
            l++;
            i++;
            l2--;
              goto _L29
            obj2;
            j = ((flag2) ? 1 : 0);
            if (delayErrors) goto _L31; else goto _L30
_L30:
            j = ((flag2) ? 1 : 0);
            Exceptions.throwIfFatal(((Throwable) (obj2)));
            i = 1;
            j = i;
            unsubscribe();
            j = i;
            subscriber.onError(((Throwable) (obj2)));
            if (true) goto _L4; else goto _L32
_L32:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L31:
            j = ((flag2) ? 1 : 0);
            getOrCreateErrorQueue().offer(obj2);
              goto _L33
            obj;
            if (j != 0) goto _L35; else goto _L34
_L34:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
_L35:
            throw obj;
_L15:
            j = ((flag2) ? 1 : 0);
            l2 = producer.produced(i);
              goto _L13
_L27:
            j = ((flag2) ? 1 : 0);
            reportError();
              goto _L36
_L21:
            j1 = 0;
            flag4 = false;
            l = i;
            if (i2 <= 0) goto _L38; else goto _L37
_L37:
            j = ((flag2) ? 1 : 0);
            l2 = lastId;
            j = ((flag2) ? 1 : 0);
            i1 = lastIndex;
            if (i2 <= i1) goto _L40; else goto _L39
_L39:
            j = ((flag2) ? 1 : 0);
            l = i1;
            if (obj2[i1].id == l2) goto _L41; else goto _L40
_L50:
            if (i1 >= i2) goto _L43; else goto _L42
_L42:
            j = ((flag2) ? 1 : 0);
            if (obj2[l].id != l2) goto _L44; else goto _L43
_L43:
            i1 = l;
            j = ((flag2) ? 1 : 0);
            lastIndex = l;
            j = ((flag2) ? 1 : 0);
            lastId = obj2[l].id;
            l = i1;
              goto _L41
_L80:
            j1 = l;
            i = i1;
            if (k1 >= i2) goto _L46; else goto _L45
_L45:
            j = ((flag2) ? 1 : 0);
            flag6 = checkTerminate();
            if (!flag6) goto _L48; else goto _L47
_L47:
            if (true) goto _L4; else goto _L49
_L49:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L44:
            j = l + 1;
            l = j;
            if (j == i2)
            {
                l = 0;
            }
            i1++;
              goto _L50
_L48:
            innersubscriber = obj2[l1];
            obj1 = null;
            l3 = l2;
              goto _L51
_L71:
            obj = obj1;
            if (l2 <= 0L) goto _L53; else goto _L52
_L52:
            j = ((flag2) ? 1 : 0);
            flag6 = checkTerminate();
            if (!flag6) goto _L55; else goto _L54
_L54:
            if (true) goto _L4; else goto _L56
_L56:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L55:
            j = ((flag2) ? 1 : 0);
            obj = innersubscriber.queue;
            if (obj != null) goto _L58; else goto _L57
_L57:
            obj = obj1;
_L53:
            if (i <= 0) goto _L60; else goto _L59
_L59:
            if (flag1) goto _L62; else goto _L61
_L61:
            j = ((flag2) ? 1 : 0);
            l2 = producer.produced(i);
_L83:
            j = ((flag2) ? 1 : 0);
            innersubscriber.requestMore(i);
              goto _L60
_L82:
            j = ((flag2) ? 1 : 0);
            flag6 = innersubscriber.done;
            j = ((flag2) ? 1 : 0);
            obj = innersubscriber.queue;
            j1 = l;
            i = i1;
            if (!flag6) goto _L64; else goto _L63
_L63:
            if (obj == null) goto _L66; else goto _L65
_L65:
            j = ((flag2) ? 1 : 0);
            j1 = l;
            i = i1;
            if (!((RxRingBuffer) (obj)).isEmpty()) goto _L64; else goto _L66
_L66:
            j = ((flag2) ? 1 : 0);
            removeInner(innersubscriber);
            j = ((flag2) ? 1 : 0);
            flag6 = checkTerminate();
            if (!flag6) goto _L68; else goto _L67
_L67:
            if (true) goto _L4; else goto _L69
_L69:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L58:
            j = ((flag2) ? 1 : 0);
            obj1 = ((RxRingBuffer) (obj)).poll();
            obj = obj1;
            if (obj1 == null) goto _L53; else goto _L70
_L70:
            j = ((flag2) ? 1 : 0);
            obj = nl.getValue(obj1);
            j = ((flag2) ? 1 : 0);
            subscriber.onNext(obj);
            l2--;
            i++;
              goto _L71
            obj;
            i = 1;
            j = i;
            Exceptions.throwIfFatal(((Throwable) (obj)));
            subscriber.onError(((Throwable) (obj)));
            j = i;
            unsubscribe();
            if (true) goto _L4; else goto _L72
_L72:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            j = i;
            unsubscribe();
            j = i;
            throw obj;
_L46:
            j = ((flag2) ? 1 : 0);
            lastIndex = l1;
            j = ((flag2) ? 1 : 0);
            lastId = obj2[l1].id;
            l = i;
_L38:
            if (l <= 0) goto _L74; else goto _L73
_L73:
            j = ((flag2) ? 1 : 0);
            request(l);
_L74:
            if (j1 != 0) goto _L76; else goto _L75
_L75:
            j = ((flag2) ? 1 : 0);
            this;
            JVM INSTR monitorenter ;
            j = ((flag3) ? 1 : 0);
            if (missed) goto _L78; else goto _L77
_L77:
            i = 1;
            j = i;
            emitting = false;
            j = i;
            this;
            JVM INSTR monitorexit ;
            if (true) goto _L4; else goto _L79
_L79:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L84:
            l = l1 + 1;
            j = l;
            if (l == i2)
            {
                j = 0;
            }
            k1++;
            l = j1;
            l1 = j;
            i1 = i;
              goto _L80
_L78:
            j = ((flag3) ? 1 : 0);
            missed = false;
            j = ((flag3) ? 1 : 0);
            this;
            JVM INSTR monitorexit ;
              goto _L76
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L4:
            return;
_L5:
            if (obj1 == null) goto _L17; else goto _L81
_L81:
            l3 = l2;
            i = j;
_L19:
            boolean flag = false;
            obj = null;
            l = i;
            l2 = l3;
            i = ((flag) ? 1 : 0);
              goto _L29
_L40:
            int k = i1;
            if (i2 <= i1)
            {
                k = 0;
            }
            i1 = 0;
            l = k;
              goto _L50
_L41:
            l1 = l;
            k1 = 0;
            l = ((flag4) ? 1 : 0);
            i1 = i;
            l2 = l3;
              goto _L80
_L51:
            i = 0;
            l2 = l3;
              goto _L71
_L60:
            if (l2 == 0L)
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = obj;
            l3 = l2;
            if (obj != null) goto _L51; else goto _L82
_L62:
            l2 = 0x7fffffffffffffffL;
              goto _L83
_L68:
            i = i1 + 1;
            j1 = 1;
_L64:
            if (l2 != 0L) goto _L84; else goto _L46
        }

        protected void emitScalar(Object obj, long l)
        {
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = flag1;
            child.onNext(obj);
_L5:
            if (l == 0x7fffffffffffffffL)
            {
                break MISSING_BLOCK_LABEL_36;
            }
            flag = flag1;
            producer.produced(1);
            flag = flag1;
            requestMore(1L);
            flag = flag1;
            this;
            JVM INSTR monitorenter ;
            flag = true;
            if (missed)
            {
                break; /* Loop/switch isn't completed */
            }
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            if (true) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
_L2:
            return;
            obj;
            flag = flag1;
            if (delayErrors)
            {
                break MISSING_BLOCK_LABEL_141;
            }
            flag = flag1;
            Exceptions.throwIfFatal(((Throwable) (obj)));
            flag1 = true;
            flag = flag1;
            unsubscribe();
            flag = flag1;
            onError(((Throwable) (obj)));
            if (true) goto _L2; else goto _L3
_L3:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            flag = flag1;
            getOrCreateErrorQueue().offer(obj);
            if (true) goto _L5; else goto _L4
            obj;
            if (flag) goto _L7; else goto _L6
_L6:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
_L7:
            throw obj;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L4:
            missed = false;
            this;
            JVM INSTR monitorexit ;
            if (true) goto _L9; else goto _L8
_L8:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
_L9:
            emitLoop();
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
        }

        protected void emitScalar(InnerSubscriber innersubscriber, Object obj, long l)
        {
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = flag1;
            child.onNext(obj);
_L5:
            if (l == 0x7fffffffffffffffL)
            {
                break MISSING_BLOCK_LABEL_36;
            }
            flag = flag1;
            producer.produced(1);
            flag = flag1;
            innersubscriber.requestMore(1L);
            flag = flag1;
            this;
            JVM INSTR monitorenter ;
            flag = true;
            if (missed)
            {
                break; /* Loop/switch isn't completed */
            }
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            if (true) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
_L2:
            return;
            obj;
            flag = flag1;
            if (delayErrors)
            {
                break MISSING_BLOCK_LABEL_141;
            }
            flag = flag1;
            Exceptions.throwIfFatal(((Throwable) (obj)));
            flag1 = true;
            flag = flag1;
            innersubscriber.unsubscribe();
            flag = flag1;
            innersubscriber.onError(((Throwable) (obj)));
            if (true) goto _L2; else goto _L3
_L3:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
            return;
            innersubscriber;
            this;
            JVM INSTR monitorexit ;
            throw innersubscriber;
            flag = flag1;
            getOrCreateErrorQueue().offer(obj);
            if (true) goto _L5; else goto _L4
            innersubscriber;
            if (flag) goto _L7; else goto _L6
_L6:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
_L7:
            throw innersubscriber;
            innersubscriber;
            this;
            JVM INSTR monitorexit ;
            throw innersubscriber;
_L4:
            missed = false;
            this;
            JVM INSTR monitorexit ;
            if (true) goto _L9; else goto _L8
_L8:
            this;
            JVM INSTR monitorenter ;
            emitting = false;
            this;
            JVM INSTR monitorexit ;
_L9:
            emitLoop();
            return;
            innersubscriber;
            this;
            JVM INSTR monitorexit ;
            throw innersubscriber;
            innersubscriber;
            this;
            JVM INSTR monitorexit ;
            throw innersubscriber;
            innersubscriber;
            this;
            JVM INSTR monitorexit ;
            throw innersubscriber;
        }

        CompositeSubscription getOrCreateComposite()
        {
            CompositeSubscription compositesubscription2;
            CompositeSubscription compositesubscription = subscriptions;
            compositesubscription2 = compositesubscription;
            if (compositesubscription != null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            boolean flag = false;
            this;
            JVM INSTR monitorenter ;
            compositesubscription2 = subscriptions;
            CompositeSubscription compositesubscription1;
            compositesubscription1 = compositesubscription2;
            if (compositesubscription2 != null)
            {
                break MISSING_BLOCK_LABEL_41;
            }
            compositesubscription1 = new CompositeSubscription();
            subscriptions = compositesubscription1;
            flag = true;
            this;
            JVM INSTR monitorexit ;
            compositesubscription2 = compositesubscription1;
            if (flag)
            {
                add(compositesubscription1);
                compositesubscription2 = compositesubscription1;
            }
            return compositesubscription2;
            Exception exception;
            exception;
_L2:
            this;
            JVM INSTR monitorexit ;
            throw exception;
            exception;
            if (true) goto _L2; else goto _L1
_L1:
        }

        Queue getOrCreateErrorQueue()
        {
            Object obj = errors;
            if (obj != null) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            ConcurrentLinkedQueue concurrentlinkedqueue = errors;
            obj = concurrentlinkedqueue;
            if (concurrentlinkedqueue != null)
            {
                break MISSING_BLOCK_LABEL_35;
            }
            obj = new ConcurrentLinkedQueue();
            errors = ((ConcurrentLinkedQueue) (obj));
            this;
            JVM INSTR monitorexit ;
            return ((Queue) (obj));
_L4:
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            continue; /* Loop/switch isn't completed */
_L2:
            return ((Queue) (obj));
            obj;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void onCompleted()
        {
            done = true;
            emit();
        }

        public void onError(Throwable throwable)
        {
            getOrCreateErrorQueue().offer(throwable);
            done = true;
            emit();
        }

        public volatile void onNext(Object obj)
        {
            onNext((Observable)obj);
        }

        public void onNext(Observable observable)
        {
            if (observable == null)
            {
                return;
            }
            if (observable instanceof ScalarSynchronousObservable)
            {
                tryEmit(((ScalarSynchronousObservable)observable).get());
                return;
            } else
            {
                long l = uniqueId;
                uniqueId = 1L + l;
                InnerSubscriber innersubscriber = new InnerSubscriber(this, l);
                addInner(innersubscriber);
                observable.unsafeSubscribe(innersubscriber);
                emit();
                return;
            }
        }

        protected void queueScalar(Object obj)
        {
            RxRingBuffer rxringbuffer;
            RxRingBuffer rxringbuffer1 = queue;
            rxringbuffer = rxringbuffer1;
            if (rxringbuffer1 == null)
            {
                rxringbuffer = RxRingBuffer.getSpscInstance();
                add(rxringbuffer);
                queue = rxringbuffer;
            }
            rxringbuffer.onNext(nl.next(obj));
            emit();
_L2:
            return;
            obj;
            unsubscribe();
            onError(((Throwable) (obj)));
            return;
            obj;
            if (!isUnsubscribed())
            {
                unsubscribe();
                onError(((Throwable) (obj)));
                return;
            }
            if (true) goto _L2; else goto _L1
_L1:
        }

        protected void queueScalar(InnerSubscriber innersubscriber, Object obj)
        {
            RxRingBuffer rxringbuffer;
            RxRingBuffer rxringbuffer1 = innersubscriber.queue;
            rxringbuffer = rxringbuffer1;
            if (rxringbuffer1 == null)
            {
                rxringbuffer = RxRingBuffer.getSpscInstance();
                innersubscriber.add(rxringbuffer);
                innersubscriber.queue = rxringbuffer;
            }
            rxringbuffer.onNext(nl.next(obj));
            emit();
_L2:
            return;
            obj;
            innersubscriber.unsubscribe();
            innersubscriber.onError(((Throwable) (obj)));
            return;
            obj;
            if (!innersubscriber.isUnsubscribed())
            {
                innersubscriber.unsubscribe();
                innersubscriber.onError(((Throwable) (obj)));
                return;
            }
            if (true) goto _L2; else goto _L1
_L1:
        }

        void removeInner(InnerSubscriber innersubscriber)
        {
            RxRingBuffer rxringbuffer = innersubscriber.queue;
            if (rxringbuffer != null)
            {
                rxringbuffer.release();
            }
            subscriptions.remove(innersubscriber);
            Object obj = innerGuard;
            obj;
            JVM INSTR monitorenter ;
            InnerSubscriber ainnersubscriber[];
            int k;
            ainnersubscriber = innerSubscribers;
            k = ainnersubscriber.length;
            int i;
            byte byte0;
            byte0 = -1;
            i = 0;
_L2:
            int j;
            j = byte0;
            if (i >= k)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            if (!innersubscriber.equals(ainnersubscriber[i]))
            {
                break MISSING_BLOCK_LABEL_141;
            }
            j = i;
            if (j >= 0)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            obj;
            JVM INSTR monitorexit ;
            return;
            if (k != 1)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            innerSubscribers = EMPTY;
            obj;
            JVM INSTR monitorexit ;
            return;
            innersubscriber;
            obj;
            JVM INSTR monitorexit ;
            throw innersubscriber;
            innersubscriber = new InnerSubscriber[k - 1];
            System.arraycopy(ainnersubscriber, 0, innersubscriber, 0, j);
            System.arraycopy(ainnersubscriber, j + 1, innersubscriber, j, k - j - 1);
            innerSubscribers = innersubscriber;
            obj;
            JVM INSTR monitorexit ;
            return;
            i++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void requestMore(long l)
        {
            request(l);
        }

        void tryEmit(Object obj)
        {
            boolean flag;
            boolean flag1;
            long l;
            flag = false;
            flag1 = false;
            l = producer.get();
            if (l == 0L) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            flag = flag1;
            if (emitting)
            {
                break MISSING_BLOCK_LABEL_38;
            }
            emitting = true;
            flag = true;
            this;
            JVM INSTR monitorexit ;
_L2:
            if (flag)
            {
                emitScalar(obj, l);
                return;
            } else
            {
                queueScalar(obj);
                return;
            }
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
        }

        void tryEmit(InnerSubscriber innersubscriber, Object obj)
        {
            boolean flag;
            boolean flag1;
            long l;
            flag = false;
            flag1 = false;
            l = producer.get();
            if (l == 0L) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            flag = flag1;
            if (emitting)
            {
                break MISSING_BLOCK_LABEL_40;
            }
            emitting = true;
            flag = true;
            this;
            JVM INSTR monitorexit ;
_L2:
            if (flag)
            {
                emitScalar(innersubscriber, obj, l);
                return;
            } else
            {
                queueScalar(innersubscriber, obj);
                return;
            }
            innersubscriber;
            this;
            JVM INSTR monitorexit ;
            throw innersubscriber;
        }


        public MergeSubscriber(Subscriber subscriber, boolean flag, int i)
        {
            child = subscriber;
            delayErrors = flag;
            maxConcurrent = i;
            innerSubscribers = EMPTY;
            request(Math.min(i, RxRingBuffer.SIZE));
        }
    }


    final boolean delayErrors;
    final int maxConcurrent;

    private OperatorMerge(boolean flag, int i)
    {
        delayErrors = flag;
        maxConcurrent = i;
    }


    public static OperatorMerge instance(boolean flag)
    {
        if (flag)
        {
            return HolderDelayErrors.INSTANCE;
        } else
        {
            return HolderNoDelay.INSTANCE;
        }
    }

    public static OperatorMerge instance(boolean flag, int i)
    {
        if (i == 0x7fffffff)
        {
            return instance(flag);
        } else
        {
            return new OperatorMerge(flag, i);
        }
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        MergeSubscriber mergesubscriber = new MergeSubscriber(subscriber, delayErrors, maxConcurrent);
        MergeProducer mergeproducer = new MergeProducer(mergesubscriber);
        mergesubscriber.producer = mergeproducer;
        subscriber.add(mergesubscriber);
        subscriber.setProducer(mergeproducer);
        return mergesubscriber;
    }
}

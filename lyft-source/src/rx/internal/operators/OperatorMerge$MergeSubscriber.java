// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.ScalarSynchronousObservable;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

final class request extends Subscriber
{

    static final queueScalar EMPTY[] = new queueScalar[0];
    final Subscriber child;
    final boolean delayErrors;
    volatile boolean done;
    boolean emitting;
    volatile ConcurrentLinkedQueue errors;
    final Object innerGuard = new Object();
    volatile queueScalar innerSubscribers[];
    long lastId;
    int lastIndex;
    final int maxConcurrent;
    boolean missed;
    final NotificationLite nl = NotificationLite.instance();
    queueScalar producer;
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

    void addInner(child child1)
    {
        getOrCreateComposite().add(child1);
        Object obj = innerGuard;
        obj;
        JVM INSTR monitorenter ;
        child achild1[];
        int i;
        child achild[] = innerSubscribers;
        i = achild.length;
        achild1 = new innerSubscribers[i + 1];
        System.arraycopy(achild, 0, achild1, 0, i);
        achild1[i] = child1;
        innerSubscribers = achild1;
        obj;
        JVM INSTR monitorexit ;
        return;
        child1;
        obj;
        JVM INSTR monitorexit ;
        throw child1;
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
        int i;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        i = ((flag1) ? 1 : 0);
        Subscriber subscriber = child;
_L48:
        i = ((flag1) ? 1 : 0);
        if (checkTerminate())
        {
            return;
        }
        i = ((flag1) ? 1 : 0);
        Object obj1 = queue;
        i = ((flag1) ? 1 : 0);
        long l2 = producer.t();
        Object obj;
        int k;
        int l;
        int i1;
        int j1;
        boolean flag;
        int k1;
        int l1;
        int i2;
        long l3;
        Object obj2;
        emitLoop emitloop;
        boolean flag3;
        if (l2 == 0x7fffffffffffffffL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = 0;
        i = 0;
        l3 = l2;
          goto _L1
_L18:
        if (l2 <= 0L) goto _L3; else goto _L2
_L2:
        i = ((flag1) ? 1 : 0);
        obj = ((RxRingBuffer) (obj1)).poll();
        i = ((flag1) ? 1 : 0);
        if (checkTerminate()) goto _L5; else goto _L4
_L4:
        if (obj != null) goto _L6; else goto _L3
_L56:
        i = ((flag1) ? 1 : 0);
        flag3 = done;
        i = ((flag1) ? 1 : 0);
        obj = queue;
        i = ((flag1) ? 1 : 0);
        obj2 = innerSubscribers;
        i = ((flag1) ? 1 : 0);
        i2 = obj2.length;
        if (!flag3) goto _L8; else goto _L7
_L7:
        if (obj == null) goto _L10; else goto _L9
_L9:
        i = ((flag1) ? 1 : 0);
        if (!((RxRingBuffer) (obj)).isEmpty()) goto _L8; else goto _L10
_L10:
        if (i2 != 0) goto _L8; else goto _L11
_L11:
        i = ((flag1) ? 1 : 0);
        obj1 = errors;
        if (obj1 == null) goto _L13; else goto _L12
_L12:
        i = ((flag1) ? 1 : 0);
        if (!((Queue) (obj1)).isEmpty()) goto _L14; else goto _L13
_L13:
        i = ((flag1) ? 1 : 0);
        subscriber.onCompleted();
_L21:
        if (obj == null) goto _L5; else goto _L15
_L15:
        i = ((flag1) ? 1 : 0);
        ((RxRingBuffer) (obj)).release();
        return;
        obj;
        if (i != 0) goto _L17; else goto _L16
_L16:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
_L17:
        throw obj;
_L6:
        i = ((flag1) ? 1 : 0);
        obj2 = nl.getValue(obj);
        i = ((flag1) ? 1 : 0);
        subscriber.onNext(obj2);
_L19:
        l2--;
        l++;
        k++;
          goto _L18
        obj2;
        i = ((flag1) ? 1 : 0);
        if (delayErrors)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        i = ((flag1) ? 1 : 0);
        Exceptions.throwIfFatal(((Throwable) (obj2)));
        k = 1;
        i = k;
        unsubscribe();
        i = k;
        subscriber.onError(((Throwable) (obj2)));
        return;
        i = ((flag1) ? 1 : 0);
        getOrCreateErrorQueue().offer(obj2);
          goto _L19
_L61:
        i = ((flag1) ? 1 : 0);
        l2 = producer.oduced(l);
          goto _L20
_L14:
        i = ((flag1) ? 1 : 0);
        reportError();
          goto _L21
_L8:
        if (i2 <= 0) goto _L23; else goto _L22
_L22:
        i = ((flag1) ? 1 : 0);
        l3 = lastId;
        i = ((flag1) ? 1 : 0);
        i1 = lastIndex;
        if (i2 <= i1) goto _L25; else goto _L24
_L24:
        i = ((flag1) ? 1 : 0);
        l = i1;
        if (((lastIndex) (obj2[i1])).id == l3) goto _L26; else goto _L25
_L64:
        if (i1 >= i2)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        i = ((flag1) ? 1 : 0);
        if (((id) (obj2[l])).id != l3)
        {
            break MISSING_BLOCK_LABEL_1129;
        }
        i = ((flag1) ? 1 : 0);
        lastIndex = l;
        i = ((flag1) ? 1 : 0);
        lastId = ((lastId) (obj2[l])).id;
          goto _L26
_L54:
        if (l1 >= i2) goto _L28; else goto _L27
_L27:
        i = ((flag1) ? 1 : 0);
        if (checkTerminate()) goto _L5; else goto _L29
_L29:
        emitloop = obj2[k1];
        obj1 = null;
        l3 = l2;
          goto _L30
_L52:
        obj = obj1;
        if (l2 <= 0L) goto _L32; else goto _L31
_L31:
        i = ((flag1) ? 1 : 0);
        if (checkTerminate()) goto _L5; else goto _L33
_L33:
        i = ((flag1) ? 1 : 0);
        obj = emitloop.queue;
        if (obj != null) goto _L35; else goto _L34
_L34:
        obj = obj1;
_L32:
        if (i1 <= 0) goto _L37; else goto _L36
_L36:
        if (flag) goto _L39; else goto _L38
_L38:
        i = ((flag1) ? 1 : 0);
        l2 = producer.oduced(i1);
_L53:
        i = ((flag1) ? 1 : 0);
        emitloop.requestMore(i1);
          goto _L37
_L65:
        i = ((flag1) ? 1 : 0);
        flag3 = emitloop.done;
        i = ((flag1) ? 1 : 0);
        obj = emitloop.queue;
        i1 = k;
        j1 = l;
        if (!flag3) goto _L41; else goto _L40
_L40:
        if (obj == null) goto _L43; else goto _L42
_L42:
        i = ((flag1) ? 1 : 0);
        i1 = k;
        j1 = l;
        if (!((RxRingBuffer) (obj)).isEmpty()) goto _L41; else goto _L43
_L43:
        i = ((flag1) ? 1 : 0);
        removeInner(emitloop);
        i = ((flag1) ? 1 : 0);
        if (checkTerminate()) goto _L5; else goto _L44
_L44:
        j1 = l + 1;
        i1 = 1;
          goto _L41
_L28:
        i = ((flag1) ? 1 : 0);
        lastIndex = k1;
        i = ((flag1) ? 1 : 0);
        lastId = ((lastId) (obj2[k1])).id;
_L55:
        if (l <= 0) goto _L46; else goto _L45
_L45:
        i = ((flag1) ? 1 : 0);
        request(l);
_L46:
        if (k != 0) goto _L48; else goto _L47
_L47:
        i = ((flag1) ? 1 : 0);
        this;
        JVM INSTR monitorenter ;
        i = ((flag2) ? 1 : 0);
        if (missed) goto _L50; else goto _L49
_L49:
        k = 1;
        i = k;
        emitting = false;
        i = k;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L35:
        i = ((flag1) ? 1 : 0);
        obj1 = ((RxRingBuffer) (obj)).poll();
        obj = obj1;
        if (obj1 == null) goto _L32; else goto _L51
_L51:
        i = ((flag1) ? 1 : 0);
        obj = nl.getValue(obj1);
        i = ((flag1) ? 1 : 0);
        subscriber.onNext(obj);
        i1++;
        l2--;
          goto _L52
        obj;
        k = 1;
        i = k;
        Exceptions.throwIfFatal(((Throwable) (obj)));
        subscriber.onError(((Throwable) (obj)));
        i = k;
        unsubscribe();
        return;
        obj;
        i = k;
        unsubscribe();
        i = k;
        throw obj;
_L39:
        l2 = 0x7fffffffffffffffL;
          goto _L53
_L67:
        k = k1 + 1;
        i = k;
        if (k == i2)
        {
            i = 0;
        }
        l1++;
        k = i1;
        l = j1;
        k1 = i;
          goto _L54
_L50:
        i = ((flag2) ? 1 : 0);
        missed = false;
        i = ((flag2) ? 1 : 0);
        this;
        JVM INSTR monitorexit ;
          goto _L48
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L23:
        i = 0;
        l = k;
        k = i;
          goto _L55
_L58:
        l2 = l3;
        k = i;
          goto _L56
_L5:
        return;
_L1:
        if (obj1 == null) goto _L58; else goto _L57
_L57:
        l3 = l2;
        i = k;
_L63:
        l = 0;
        obj = null;
        k = i;
        l2 = l3;
          goto _L18
_L3:
        if (l <= 0) goto _L20; else goto _L59
_L59:
        if (!flag) goto _L61; else goto _L60
_L60:
        l2 = 0x7fffffffffffffffL;
_L20:
        i = k;
        l3 = l2;
        if (l2 == 0L) goto _L58; else goto _L62
_L62:
        i = k;
        l3 = l2;
        if (obj != null) goto _L63; else goto _L56
_L25:
        l = i1;
        if (i2 <= i1)
        {
            l = 0;
        }
        i1 = 0;
          goto _L64
_L26:
        k1 = l;
        l = k;
        l1 = 0;
        k = 0;
          goto _L54
_L30:
        i1 = 0;
        l2 = l3;
          goto _L52
_L37:
        if (l2 == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        l3 = l2;
        if (obj != null) goto _L30; else goto _L65
_L41:
        if (l2 != 0L) goto _L67; else goto _L66
_L66:
        k = i1;
        l = j1;
          goto _L28
        int j = l + 1;
        l = j;
        if (j == i2)
        {
            l = 0;
        }
        i1++;
          goto _L64
    }

    protected void emitScalar(Object obj, long l)
    {
        boolean flag = false;
        child.onNext(obj);
_L9:
        if (l == 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        producer.oduced(1);
        requestMore(1L);
        this;
        JVM INSTR monitorenter ;
        if (missed) goto _L2; else goto _L1
_L1:
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        if (delayErrors) goto _L4; else goto _L3
_L3:
        Exceptions.throwIfFatal(((Throwable) (obj)));
        unsubscribe();
        onError(((Throwable) (obj)));
        return;
        obj;
        flag = true;
_L7:
        if (flag) goto _L6; else goto _L5
_L5:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
_L6:
        throw obj;
_L4:
        getOrCreateErrorQueue().offer(obj);
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L7; else goto _L2
_L2:
        missed = false;
        this;
        JVM INSTR monitorexit ;
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
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected void emitScalar(emitLoop emitloop, Object obj, long l)
    {
        boolean flag = false;
        child.onNext(obj);
_L9:
        if (l == 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        producer.oduced(1);
        emitloop.requestMore(1L);
        this;
        JVM INSTR monitorenter ;
        if (missed) goto _L2; else goto _L1
_L1:
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        if (delayErrors) goto _L4; else goto _L3
_L3:
        Exceptions.throwIfFatal(((Throwable) (obj)));
        emitloop.unsubscribe();
        emitloop.onError(((Throwable) (obj)));
        return;
        emitloop;
        flag = true;
_L7:
        if (flag) goto _L6; else goto _L5
_L5:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
_L6:
        throw emitloop;
_L4:
        getOrCreateErrorQueue().offer(obj);
        continue; /* Loop/switch isn't completed */
        emitloop;
        if (true) goto _L7; else goto _L2
_L2:
        missed = false;
        this;
        JVM INSTR monitorexit ;
        emitLoop();
        return;
        emitloop;
        this;
        JVM INSTR monitorexit ;
        throw emitloop;
        emitloop;
        this;
        JVM INSTR monitorexit ;
        throw emitloop;
        if (true) goto _L9; else goto _L8
_L8:
    }

    CompositeSubscription getOrCreateComposite()
    {
        CompositeSubscription compositesubscription;
        CompositeSubscription compositesubscription1;
        compositesubscription = subscriptions;
        compositesubscription1 = compositesubscription;
        if (compositesubscription != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        compositesubscription = subscriptions;
        if (compositesubscription != null) goto _L4; else goto _L3
_L3:
        compositesubscription = new CompositeSubscription();
        subscriptions = compositesubscription;
        boolean flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        compositesubscription1 = compositesubscription;
        if (flag)
        {
            add(compositesubscription);
            compositesubscription1 = compositesubscription;
        }
_L2:
        return compositesubscription1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    Queue getOrCreateErrorQueue()
    {
        Object obj;
        obj = errors;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
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
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        return ((Queue) (obj));
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
            onNext onnext = new <init>(this, l);
            addInner(onnext);
            observable.unsafeSubscribe(onnext);
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

    protected void queueScalar(onError onerror, Object obj)
    {
        RxRingBuffer rxringbuffer;
        RxRingBuffer rxringbuffer1 = onerror.queue;
        rxringbuffer = rxringbuffer1;
        if (rxringbuffer1 == null)
        {
            rxringbuffer = RxRingBuffer.getSpscInstance();
            onerror.add(rxringbuffer);
            onerror.queue = rxringbuffer;
        }
        rxringbuffer.onNext(nl.next(obj));
        emit();
_L2:
        return;
        obj;
        onerror.unsubscribe();
        onerror.onError(((Throwable) (obj)));
        return;
        obj;
        if (!onerror.isUnsubscribed())
        {
            onerror.unsubscribe();
            onerror.onError(((Throwable) (obj)));
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    void removeInner(onError onerror)
    {
        int i;
        i = 0;
        RxRingBuffer rxringbuffer = onerror.queue;
        if (rxringbuffer != null)
        {
            rxringbuffer.release();
        }
        subscriptions.remove(onerror);
        Object obj = innerGuard;
        obj;
        JVM INSTR monitorenter ;
        onError aonerror[];
        int j;
        aonerror = innerSubscribers;
        j = aonerror.length;
_L6:
        if (i >= j) goto _L2; else goto _L1
_L1:
        if (!onerror.equals(aonerror[i])) goto _L4; else goto _L3
_L3:
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        innerSubscribers = EMPTY;
        obj;
        JVM INSTR monitorexit ;
        return;
        onerror;
        obj;
        JVM INSTR monitorexit ;
        throw onerror;
        onerror = new EMPTY[j - 1];
        System.arraycopy(aonerror, 0, onerror, 0, i);
        System.arraycopy(aonerror, i + 1, onerror, i, j - i - 1);
        innerSubscribers = onerror;
        obj;
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

    public void requestMore(long l)
    {
        request(l);
    }

    void tryEmit(Object obj)
    {
        boolean flag;
        boolean flag1;
        long l;
        long l1;
        flag = false;
        flag1 = false;
        l1 = producer.t();
        l = l1;
        if (l1 == 0L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        l = producer.t();
        flag = flag1;
        if (emitting)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        flag = flag1;
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_60;
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

    void tryEmit(queueScalar queuescalar, Object obj)
    {
        boolean flag;
        boolean flag1;
        long l;
        long l1;
        flag = false;
        flag1 = false;
        l1 = producer.t();
        l = l1;
        if (l1 == 0L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        l = producer.t();
        flag = flag1;
        if (emitting)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        flag = flag1;
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        emitting = true;
        flag = true;
        this;
        JVM INSTR monitorexit ;
_L2:
        if (flag)
        {
            emitScalar(queuescalar, obj, l);
            return;
        } else
        {
            queueScalar(queuescalar, obj);
            return;
        }
        queuescalar;
        this;
        JVM INSTR monitorexit ;
        throw queuescalar;
    }


    public _cls9(Subscriber subscriber, boolean flag, int i)
    {
        child = subscriber;
        delayErrors = flag;
        maxConcurrent = i;
        innerSubscribers = EMPTY;
        request(Math.min(i, RxRingBuffer.SIZE));
    }
}

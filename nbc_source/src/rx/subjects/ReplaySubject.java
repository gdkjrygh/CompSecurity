// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Observer;
import rx.Scheduler;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.internal.operators.NotificationLite;
import rx.internal.util.UtilityFunctions;
import rx.schedulers.Timestamped;

// Referenced classes of package rx.subjects:
//            Subject, SubjectSubscriptionManager

public final class ReplaySubject extends Subject
{
    static final class AddTimestamped
        implements Func1
    {

        final Scheduler scheduler;

        public Object call(Object obj)
        {
            return new Timestamped(scheduler.now(), obj);
        }

        public AddTimestamped(Scheduler scheduler1)
        {
            scheduler = scheduler1;
        }
    }

    static final class BoundedState
        implements ReplayState
    {

        final Func1 enterTransform;
        final EvictionPolicy evictionPolicy;
        final Func1 leaveTransform;
        final NodeList list = new NodeList();
        final NotificationLite nl = NotificationLite.instance();
        volatile NodeList.Node tail;
        volatile boolean terminated;

        public void accept(Observer observer, NodeList.Node node)
        {
            nl.accept(observer, leaveTransform.call(node.value));
        }

        public void acceptTest(Observer observer, NodeList.Node node, long l)
        {
            node = ((NodeList.Node) (node.value));
            if (!evictionPolicy.test(node, l))
            {
                nl.accept(observer, leaveTransform.call(node));
            }
        }

        public void complete()
        {
            if (!terminated)
            {
                terminated = true;
                list.addLast(enterTransform.call(nl.completed()));
                evictionPolicy.evictFinal(list);
                tail = list.tail;
            }
        }

        public void error(Throwable throwable)
        {
            if (!terminated)
            {
                terminated = true;
                list.addLast(enterTransform.call(nl.error(throwable)));
                evictionPolicy.evictFinal(list);
                tail = list.tail;
            }
        }

        public NodeList.Node head()
        {
            return list.head;
        }

        public boolean isEmpty()
        {
            Object obj = head().next;
            if (obj != null)
            {
                if (!nl.isError(obj = leaveTransform.call(((NodeList.Node) (obj)).value)) && !nl.isCompleted(obj))
                {
                    return false;
                }
            }
            return true;
        }

        public Object latest()
        {
            Object obj = head().next;
            if (obj != null)
            {
                NodeList.Node node = null;
                for (; obj != tail(); obj = ((NodeList.Node) (obj)).next)
                {
                    node = ((NodeList.Node) (obj));
                }

                obj = leaveTransform.call(((NodeList.Node) (obj)).value);
                if (nl.isError(obj) || nl.isCompleted(obj))
                {
                    if (node != null)
                    {
                        obj = leaveTransform.call(node.value);
                        return nl.getValue(obj);
                    }
                } else
                {
                    return nl.getValue(obj);
                }
            }
            return null;
        }

        public void next(Object obj)
        {
            if (!terminated)
            {
                list.addLast(enterTransform.call(nl.next(obj)));
                evictionPolicy.evict(list);
                tail = list.tail;
            }
        }

        public boolean replayObserver(SubjectSubscriptionManager.SubjectObserver subjectobserver)
        {
            subjectobserver;
            JVM INSTR monitorenter ;
            subjectobserver.first = false;
            if (!subjectobserver.emitting)
            {
                break MISSING_BLOCK_LABEL_18;
            }
            subjectobserver;
            JVM INSTR monitorexit ;
            return false;
            subjectobserver;
            JVM INSTR monitorexit ;
            subjectobserver.index(replayObserverFromIndex((NodeList.Node)subjectobserver.index(), subjectobserver));
            return true;
            Exception exception;
            exception;
            subjectobserver;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public volatile Object replayObserverFromIndex(Object obj, SubjectSubscriptionManager.SubjectObserver subjectobserver)
        {
            return replayObserverFromIndex((NodeList.Node)obj, subjectobserver);
        }

        public NodeList.Node replayObserverFromIndex(NodeList.Node node, SubjectSubscriptionManager.SubjectObserver subjectobserver)
        {
            for (; node != tail(); node = node.next)
            {
                accept(subjectobserver, node.next);
            }

            return node;
        }

        public volatile Object replayObserverFromIndexTest(Object obj, SubjectSubscriptionManager.SubjectObserver subjectobserver, long l)
        {
            return replayObserverFromIndexTest((NodeList.Node)obj, subjectobserver, l);
        }

        public NodeList.Node replayObserverFromIndexTest(NodeList.Node node, SubjectSubscriptionManager.SubjectObserver subjectobserver, long l)
        {
            for (; node != tail(); node = node.next)
            {
                acceptTest(subjectobserver, node.next, l);
            }

            return node;
        }

        public int size()
        {
            int j;
label0:
            {
                int i = 0;
                NodeList.Node node1 = head();
                for (NodeList.Node node = node1.next; node != null; node = node.next)
                {
                    i++;
                    node1 = node;
                }

                j = i;
                if (node1.value == null)
                {
                    break label0;
                }
                Object obj = leaveTransform.call(node1.value);
                j = i;
                if (obj == null)
                {
                    break label0;
                }
                if (!nl.isError(obj))
                {
                    j = i;
                    if (!nl.isCompleted(obj))
                    {
                        break label0;
                    }
                }
                j = i - 1;
            }
            return j;
        }

        public NodeList.Node tail()
        {
            return tail;
        }

        public boolean terminated()
        {
            return terminated;
        }

        public Object[] toArray(Object aobj[])
        {
            ArrayList arraylist = new ArrayList();
            NodeList.Node node = head().next;
            do
            {
                Object obj;
label0:
                {
                    if (node != null)
                    {
                        obj = leaveTransform.call(node.value);
                        if (node.next != null || !nl.isError(obj) && !nl.isCompleted(obj))
                        {
                            break label0;
                        }
                    }
                    return arraylist.toArray(aobj);
                }
                arraylist.add(obj);
                node = node.next;
            } while (true);
        }

        public BoundedState(EvictionPolicy evictionpolicy, Func1 func1, Func1 func1_1)
        {
            tail = list.tail;
            evictionPolicy = evictionpolicy;
            enterTransform = func1;
            leaveTransform = func1_1;
        }
    }

    static final class DefaultOnAdd
        implements Action1
    {

        final BoundedState state;

        public volatile void call(Object obj)
        {
            call((SubjectSubscriptionManager.SubjectObserver)obj);
        }

        public void call(SubjectSubscriptionManager.SubjectObserver subjectobserver)
        {
            subjectobserver.index(state.replayObserverFromIndex(state.head(), subjectobserver));
        }

        public DefaultOnAdd(BoundedState boundedstate)
        {
            state = boundedstate;
        }
    }

    static final class EmptyEvictionPolicy
        implements EvictionPolicy
    {

        public void evict(NodeList nodelist)
        {
        }

        public void evictFinal(NodeList nodelist)
        {
        }

        public boolean test(Object obj, long l)
        {
            return true;
        }

        EmptyEvictionPolicy()
        {
        }
    }

    static interface EvictionPolicy
    {

        public abstract void evict(NodeList nodelist);

        public abstract void evictFinal(NodeList nodelist);

        public abstract boolean test(Object obj, long l);
    }

    static final class NodeList
    {

        final Node head = new Node(null);
        int size;
        Node tail;

        public void addLast(Object obj)
        {
            Node node = tail;
            obj = new Node(obj);
            node.next = ((Node) (obj));
            tail = ((Node) (obj));
            size = size + 1;
        }

        public void clear()
        {
            tail = head;
            size = 0;
        }

        public boolean isEmpty()
        {
            return size == 0;
        }

        public Object removeFirst()
        {
            if (head.next == null)
            {
                throw new IllegalStateException("Empty!");
            }
            Node node = head.next;
            head.next = node.next;
            if (head.next == null)
            {
                tail = head;
            }
            size = size - 1;
            return node.value;
        }

        public int size()
        {
            return size;
        }

        NodeList()
        {
            tail = head;
        }
    }

    static final class NodeList.Node
    {

        volatile NodeList.Node next;
        final Object value;

        NodeList.Node(Object obj)
        {
            value = obj;
        }
    }

    static final class PairEvictionPolicy
        implements EvictionPolicy
    {

        final EvictionPolicy first;
        final EvictionPolicy second;

        public void evict(NodeList nodelist)
        {
            first.evict(nodelist);
            second.evict(nodelist);
        }

        public void evictFinal(NodeList nodelist)
        {
            first.evictFinal(nodelist);
            second.evictFinal(nodelist);
        }

        public boolean test(Object obj, long l)
        {
            return first.test(obj, l) || second.test(obj, l);
        }

        public PairEvictionPolicy(EvictionPolicy evictionpolicy, EvictionPolicy evictionpolicy1)
        {
            first = evictionpolicy;
            second = evictionpolicy1;
        }
    }

    static final class RemoveTimestamped
        implements Func1
    {

        public Object call(Object obj)
        {
            return ((Timestamped)obj).getValue();
        }

        RemoveTimestamped()
        {
        }
    }

    static interface ReplayState
    {

        public abstract void complete();

        public abstract void error(Throwable throwable);

        public abstract boolean isEmpty();

        public abstract Object latest();

        public abstract void next(Object obj);

        public abstract boolean replayObserver(SubjectSubscriptionManager.SubjectObserver subjectobserver);

        public abstract Object replayObserverFromIndex(Object obj, SubjectSubscriptionManager.SubjectObserver subjectobserver);

        public abstract Object replayObserverFromIndexTest(Object obj, SubjectSubscriptionManager.SubjectObserver subjectobserver, long l);

        public abstract int size();

        public abstract boolean terminated();

        public abstract Object[] toArray(Object aobj[]);
    }

    static final class SizeEvictionPolicy
        implements EvictionPolicy
    {

        final int maxSize;

        public void evict(NodeList nodelist)
        {
            for (; nodelist.size() > maxSize; nodelist.removeFirst()) { }
        }

        public void evictFinal(NodeList nodelist)
        {
            for (; nodelist.size() > maxSize + 1; nodelist.removeFirst()) { }
        }

        public boolean test(Object obj, long l)
        {
            return false;
        }

        public SizeEvictionPolicy(int i)
        {
            maxSize = i;
        }
    }

    static final class TimeEvictionPolicy
        implements EvictionPolicy
    {

        final long maxAgeMillis;
        final Scheduler scheduler;

        public void evict(NodeList nodelist)
        {
            for (long l = scheduler.now(); !nodelist.isEmpty() && test(nodelist.head.next.value, l); nodelist.removeFirst()) { }
        }

        public void evictFinal(NodeList nodelist)
        {
            for (long l = scheduler.now(); nodelist.size > 1 && test(nodelist.head.next.value, l); nodelist.removeFirst()) { }
        }

        public boolean test(Object obj, long l)
        {
            return ((Timestamped)obj).getTimestampMillis() <= l - maxAgeMillis;
        }

        public TimeEvictionPolicy(long l, Scheduler scheduler1)
        {
            maxAgeMillis = l;
            scheduler = scheduler1;
        }
    }

    static final class TimedOnAdd
        implements Action1
    {

        final Scheduler scheduler;
        final BoundedState state;

        public volatile void call(Object obj)
        {
            call((SubjectSubscriptionManager.SubjectObserver)obj);
        }

        public void call(SubjectSubscriptionManager.SubjectObserver subjectobserver)
        {
            NodeList.Node node;
            if (!state.terminated)
            {
                node = state.replayObserverFromIndexTest(state.head(), subjectobserver, scheduler.now());
            } else
            {
                node = state.replayObserverFromIndex(state.head(), subjectobserver);
            }
            subjectobserver.index(node);
        }

        public TimedOnAdd(BoundedState boundedstate, Scheduler scheduler1)
        {
            state = boundedstate;
            scheduler = scheduler1;
        }
    }

    static final class UnboundedReplayState
        implements ReplayState
    {

        static final AtomicIntegerFieldUpdater INDEX_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/subjects/ReplaySubject$UnboundedReplayState, "index");
        volatile int index;
        private final ArrayList list;
        private final NotificationLite nl = NotificationLite.instance();
        private volatile boolean terminated;

        public void accept(Observer observer, int i)
        {
            nl.accept(observer, list.get(i));
        }

        public void complete()
        {
            if (!terminated)
            {
                terminated = true;
                list.add(nl.completed());
                INDEX_UPDATER.getAndIncrement(this);
            }
        }

        public void error(Throwable throwable)
        {
            if (!terminated)
            {
                terminated = true;
                list.add(nl.error(throwable));
                INDEX_UPDATER.getAndIncrement(this);
            }
        }

        public boolean isEmpty()
        {
            return size() == 0;
        }

        public Object latest()
        {
            Object obj;
label0:
            {
                Object obj1 = null;
                int i = index;
                obj = obj1;
                if (i > 0)
                {
                    obj = list.get(i - 1);
                    if (!nl.isCompleted(obj) && !nl.isError(obj))
                    {
                        break label0;
                    }
                    obj = obj1;
                    if (i > 1)
                    {
                        obj = nl.getValue(list.get(i - 2));
                    }
                }
                return obj;
            }
            return nl.getValue(obj);
        }

        public void next(Object obj)
        {
            if (!terminated)
            {
                list.add(nl.next(obj));
                INDEX_UPDATER.getAndIncrement(this);
            }
        }

        public boolean replayObserver(SubjectSubscriptionManager.SubjectObserver subjectobserver)
        {
            subjectobserver;
            JVM INSTR monitorenter ;
            subjectobserver.first = false;
            if (!subjectobserver.emitting)
            {
                break MISSING_BLOCK_LABEL_18;
            }
            subjectobserver;
            JVM INSTR monitorexit ;
            return false;
            subjectobserver;
            JVM INSTR monitorexit ;
            Integer integer = (Integer)subjectobserver.index();
            Exception exception;
            if (integer != null)
            {
                subjectobserver.index(Integer.valueOf(replayObserverFromIndex(integer, subjectobserver).intValue()));
                return true;
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("failed to find lastEmittedLink for: ").append(subjectobserver).toString());
            }
            exception;
            subjectobserver;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Integer replayObserverFromIndex(Integer integer, SubjectSubscriptionManager.SubjectObserver subjectobserver)
        {
            int i;
            for (i = integer.intValue(); i < index; i++)
            {
                accept(subjectobserver, i);
            }

            return Integer.valueOf(i);
        }

        public volatile Object replayObserverFromIndex(Object obj, SubjectSubscriptionManager.SubjectObserver subjectobserver)
        {
            return replayObserverFromIndex((Integer)obj, subjectobserver);
        }

        public Integer replayObserverFromIndexTest(Integer integer, SubjectSubscriptionManager.SubjectObserver subjectobserver, long l)
        {
            return replayObserverFromIndex(integer, subjectobserver);
        }

        public volatile Object replayObserverFromIndexTest(Object obj, SubjectSubscriptionManager.SubjectObserver subjectobserver, long l)
        {
            return replayObserverFromIndexTest((Integer)obj, subjectobserver, l);
        }

        public int size()
        {
            int i;
label0:
            {
                int j = index;
                i = j;
                if (j <= 0)
                {
                    break label0;
                }
                Object obj = list.get(j - 1);
                if (!nl.isCompleted(obj))
                {
                    i = j;
                    if (!nl.isError(obj))
                    {
                        break label0;
                    }
                }
                i = j - 1;
            }
            return i;
        }

        public boolean terminated()
        {
            return terminated;
        }

        public Object[] toArray(Object aobj[])
        {
            int j = size();
            Object aobj2[];
            if (j > 0)
            {
                Object aobj1[] = aobj;
                if (j > aobj.length)
                {
                    aobj1 = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j);
                }
                for (int i = 0; i < j; i++)
                {
                    aobj1[i] = list.get(i);
                }

                aobj2 = aobj1;
                if (aobj1.length > j)
                {
                    aobj1[j] = null;
                    aobj2 = aobj1;
                }
            } else
            {
                aobj2 = aobj;
                if (aobj.length > 0)
                {
                    aobj[0] = null;
                    return aobj;
                }
            }
            return aobj2;
        }


        public UnboundedReplayState(int i)
        {
            list = new ArrayList(i);
        }
    }


    final SubjectSubscriptionManager ssm;
    final ReplayState state;

    ReplaySubject(rx.Observable.OnSubscribe onsubscribe, SubjectSubscriptionManager subjectsubscriptionmanager, ReplayState replaystate)
    {
        super(onsubscribe);
        ssm = subjectsubscriptionmanager;
        state = replaystate;
    }

    private boolean caughtUp(SubjectSubscriptionManager.SubjectObserver subjectobserver)
    {
        boolean flag = true;
        if (!subjectobserver.caughtUp)
        {
            if (state.replayObserver(subjectobserver))
            {
                subjectobserver.caughtUp = true;
                subjectobserver.index(null);
            }
            flag = false;
        }
        return flag;
    }

    public static ReplaySubject create()
    {
        return create(16);
    }

    public static ReplaySubject create(int i)
    {
        UnboundedReplayState unboundedreplaystate = new UnboundedReplayState(i);
        SubjectSubscriptionManager subjectsubscriptionmanager = new SubjectSubscriptionManager();
        subjectsubscriptionmanager.onStart = new Action1(unboundedreplaystate) {

            final UnboundedReplayState val$state;

            public volatile void call(Object obj)
            {
                call((SubjectSubscriptionManager.SubjectObserver)obj);
            }

            public void call(SubjectSubscriptionManager.SubjectObserver subjectobserver)
            {
                subjectobserver.index(Integer.valueOf(state.replayObserverFromIndex(Integer.valueOf(0), subjectobserver).intValue()));
            }

            
            {
                state = unboundedreplaystate;
                super();
            }
        };
        subjectsubscriptionmanager.onAdded = new Action1(unboundedreplaystate) {

            final UnboundedReplayState val$state;

            public volatile void call(Object obj)
            {
                call((SubjectSubscriptionManager.SubjectObserver)obj);
            }

            public void call(SubjectSubscriptionManager.SubjectObserver subjectobserver)
            {
                subjectobserver;
                JVM INSTR monitorenter ;
                if (subjectobserver.first && !subjectobserver.emitting)
                {
                    break MISSING_BLOCK_LABEL_19;
                }
                subjectobserver;
                JVM INSTR monitorexit ;
                return;
                subjectobserver.first = false;
                subjectobserver.emitting = true;
                subjectobserver;
                JVM INSTR monitorexit ;
                boolean flag1;
                boolean flag2;
                flag2 = false;
                flag1 = false;
_L2:
                boolean flag = flag2;
                int k = ((Integer)subjectobserver.index()).intValue();
                flag = flag2;
                int j = state.index;
                if (k == j)
                {
                    break MISSING_BLOCK_LABEL_91;
                }
                flag = flag2;
                subjectobserver.index(state.replayObserverFromIndex(Integer.valueOf(k), subjectobserver));
                flag = flag2;
                subjectobserver;
                JVM INSTR monitorenter ;
                flag = flag1;
                if (j != state.index)
                {
                    break MISSING_BLOCK_LABEL_147;
                }
                flag = flag1;
                subjectobserver.emitting = false;
                flag = true;
                subjectobserver;
                JVM INSTR monitorexit ;
                if (true)
                {
                    break; /* Loop/switch isn't completed */
                }
                subjectobserver;
                JVM INSTR monitorenter ;
                subjectobserver.emitting = false;
                subjectobserver;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                subjectobserver;
                JVM INSTR monitorexit ;
                throw exception;
                exception;
                subjectobserver;
                JVM INSTR monitorexit ;
                throw exception;
                flag = flag1;
                subjectobserver;
                JVM INSTR monitorexit ;
                if (true) goto _L2; else goto _L1
                exception;
                subjectobserver;
                JVM INSTR monitorexit ;
                throw exception;
                exception;
                if (flag) goto _L4; else goto _L3
_L3:
                subjectobserver;
                JVM INSTR monitorenter ;
                subjectobserver.emitting = false;
                subjectobserver;
                JVM INSTR monitorexit ;
_L4:
                throw exception;
                exception;
                subjectobserver;
                JVM INSTR monitorexit ;
                throw exception;
_L1:
            }

            
            {
                state = unboundedreplaystate;
                super();
            }
        };
        subjectsubscriptionmanager.onTerminated = new Action1(unboundedreplaystate) {

            final UnboundedReplayState val$state;

            public volatile void call(Object obj)
            {
                call((SubjectSubscriptionManager.SubjectObserver)obj);
            }

            public void call(SubjectSubscriptionManager.SubjectObserver subjectobserver)
            {
                Integer integer1 = (Integer)subjectobserver.index();
                Integer integer = integer1;
                if (integer1 == null)
                {
                    integer = Integer.valueOf(0);
                }
                state.replayObserverFromIndex(integer, subjectobserver);
            }

            
            {
                state = unboundedreplaystate;
                super();
            }
        };
        return new ReplaySubject(subjectsubscriptionmanager, subjectsubscriptionmanager, unboundedreplaystate);
    }

    static ReplaySubject createUnbounded()
    {
        BoundedState boundedstate = new BoundedState(new EmptyEvictionPolicy(), UtilityFunctions.identity(), UtilityFunctions.identity());
        return createWithState(boundedstate, new DefaultOnAdd(boundedstate));
    }

    public static ReplaySubject createWithSize(int i)
    {
        BoundedState boundedstate = new BoundedState(new SizeEvictionPolicy(i), UtilityFunctions.identity(), UtilityFunctions.identity());
        return createWithState(boundedstate, new DefaultOnAdd(boundedstate));
    }

    static final ReplaySubject createWithState(BoundedState boundedstate, Action1 action1)
    {
        SubjectSubscriptionManager subjectsubscriptionmanager = new SubjectSubscriptionManager();
        subjectsubscriptionmanager.onStart = action1;
        subjectsubscriptionmanager.onAdded = new Action1(boundedstate) {

            final BoundedState val$state;

            public volatile void call(Object obj)
            {
                call((SubjectSubscriptionManager.SubjectObserver)obj);
            }

            public void call(SubjectSubscriptionManager.SubjectObserver subjectobserver)
            {
                subjectobserver;
                JVM INSTR monitorenter ;
                if (subjectobserver.first && !subjectobserver.emitting)
                {
                    break MISSING_BLOCK_LABEL_19;
                }
                subjectobserver;
                JVM INSTR monitorexit ;
                return;
                subjectobserver.first = false;
                subjectobserver.emitting = true;
                subjectobserver;
                JVM INSTR monitorexit ;
                boolean flag1;
                boolean flag2;
                flag2 = false;
                flag1 = false;
_L2:
                boolean flag = flag2;
                NodeList.Node node = (NodeList.Node)subjectobserver.index();
                flag = flag2;
                NodeList.Node node1 = state.tail();
                if (node == node1)
                {
                    break MISSING_BLOCK_LABEL_83;
                }
                flag = flag2;
                subjectobserver.index(state.replayObserverFromIndex(node, subjectobserver));
                flag = flag2;
                subjectobserver;
                JVM INSTR monitorenter ;
                flag = flag1;
                if (node1 != state.tail())
                {
                    break MISSING_BLOCK_LABEL_142;
                }
                flag = flag1;
                subjectobserver.emitting = false;
                flag = true;
                subjectobserver;
                JVM INSTR monitorexit ;
                if (true)
                {
                    break; /* Loop/switch isn't completed */
                }
                subjectobserver;
                JVM INSTR monitorenter ;
                subjectobserver.emitting = false;
                subjectobserver;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                subjectobserver;
                JVM INSTR monitorexit ;
                throw exception;
                exception;
                subjectobserver;
                JVM INSTR monitorexit ;
                throw exception;
                flag = flag1;
                subjectobserver;
                JVM INSTR monitorexit ;
                if (true) goto _L2; else goto _L1
                exception;
                subjectobserver;
                JVM INSTR monitorexit ;
                throw exception;
                exception;
                if (flag) goto _L4; else goto _L3
_L3:
                subjectobserver;
                JVM INSTR monitorenter ;
                subjectobserver.emitting = false;
                subjectobserver;
                JVM INSTR monitorexit ;
_L4:
                throw exception;
                exception;
                subjectobserver;
                JVM INSTR monitorexit ;
                throw exception;
_L1:
            }

            
            {
                state = boundedstate;
                super();
            }
        };
        subjectsubscriptionmanager.onTerminated = new Action1(boundedstate) {

            final BoundedState val$state;

            public volatile void call(Object obj)
            {
                call((SubjectSubscriptionManager.SubjectObserver)obj);
            }

            public void call(SubjectSubscriptionManager.SubjectObserver subjectobserver)
            {
                NodeList.Node node1 = (NodeList.Node)subjectobserver.index();
                NodeList.Node node = node1;
                if (node1 == null)
                {
                    node = state.head();
                }
                state.replayObserverFromIndex(node, subjectobserver);
            }

            
            {
                state = boundedstate;
                super();
            }
        };
        return new ReplaySubject(subjectsubscriptionmanager, subjectsubscriptionmanager, boundedstate);
    }

    public static ReplaySubject createWithTime(long l, TimeUnit timeunit, Scheduler scheduler)
    {
        timeunit = new BoundedState(new TimeEvictionPolicy(timeunit.toMillis(l), scheduler), new AddTimestamped(scheduler), new RemoveTimestamped());
        return createWithState(timeunit, new TimedOnAdd(timeunit, scheduler));
    }

    public static ReplaySubject createWithTimeAndSize(long l, TimeUnit timeunit, int i, Scheduler scheduler)
    {
        timeunit = new BoundedState(new PairEvictionPolicy(new SizeEvictionPolicy(i), new TimeEvictionPolicy(timeunit.toMillis(l), scheduler)), new AddTimestamped(scheduler), new RemoveTimestamped());
        return createWithState(timeunit, new TimedOnAdd(timeunit, scheduler));
    }

    public Throwable getThrowable()
    {
        NotificationLite notificationlite = ssm.nl;
        Object obj = ssm.get();
        if (notificationlite.isError(obj))
        {
            return notificationlite.getError(obj);
        } else
        {
            return null;
        }
    }

    public Object getValue()
    {
        return state.latest();
    }

    public Object[] getValues(Object aobj[])
    {
        return state.toArray(aobj);
    }

    public boolean hasAnyValue()
    {
        return !state.isEmpty();
    }

    public boolean hasCompleted()
    {
        NotificationLite notificationlite = ssm.nl;
        Object obj = ssm.get();
        return obj != null && !notificationlite.isError(obj);
    }

    public boolean hasObservers()
    {
        return ssm.observers().length > 0;
    }

    public boolean hasThrowable()
    {
        return ssm.nl.isError(ssm.get());
    }

    public boolean hasValue()
    {
        return hasAnyValue();
    }

    public void onCompleted()
    {
        if (ssm.active)
        {
            state.complete();
            SubjectSubscriptionManager.SubjectObserver asubjectobserver[] = ssm.terminate(NotificationLite.instance().completed());
            int j = asubjectobserver.length;
            for (int i = 0; i < j; i++)
            {
                SubjectSubscriptionManager.SubjectObserver subjectobserver = asubjectobserver[i];
                if (caughtUp(subjectobserver))
                {
                    subjectobserver.onCompleted();
                }
            }

        }
    }

    public void onError(Throwable throwable)
    {
        Object obj;
        SubjectSubscriptionManager.SubjectObserver asubjectobserver[];
        int i;
        int j;
        if (!ssm.active)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        state.error(throwable);
        obj = null;
        asubjectobserver = ssm.terminate(NotificationLite.instance().error(throwable));
        j = asubjectobserver.length;
        i = 0;
_L2:
        Object obj1;
        SubjectSubscriptionManager.SubjectObserver subjectobserver;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        subjectobserver = asubjectobserver[i];
        obj1 = obj;
        if (!caughtUp(subjectobserver))
        {
            break MISSING_BLOCK_LABEL_79;
        }
        subjectobserver.onError(throwable);
        obj1 = obj;
_L3:
        i++;
        obj = obj1;
        if (true) goto _L2; else goto _L1
        Throwable throwable1;
        throwable1;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new ArrayList();
        }
        ((List) (obj1)).add(throwable1);
          goto _L3
_L1:
        Exceptions.throwIfAny(((List) (obj)));
    }

    public void onNext(Object obj)
    {
        if (ssm.active)
        {
            state.next(obj);
            SubjectSubscriptionManager.SubjectObserver asubjectobserver[] = ssm.observers();
            int j = asubjectobserver.length;
            for (int i = 0; i < j; i++)
            {
                SubjectSubscriptionManager.SubjectObserver subjectobserver = asubjectobserver[i];
                if (caughtUp(subjectobserver))
                {
                    subjectobserver.onNext(obj);
                }
            }

        }
    }

    public int size()
    {
        return state.size();
    }

    int subscriberCount()
    {
        return ssm.state.observers.length;
    }
}

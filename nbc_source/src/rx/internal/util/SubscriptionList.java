// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Subscription;
import rx.exceptions.Exceptions;

public final class SubscriptionList
    implements Subscription
{

    private LinkedList subscriptions;
    private volatile boolean unsubscribed;

    public SubscriptionList()
    {
    }

    public SubscriptionList(Subscription subscription)
    {
        subscriptions = new LinkedList();
        subscriptions.add(subscription);
    }

    public transient SubscriptionList(Subscription asubscription[])
    {
        subscriptions = new LinkedList(Arrays.asList(asubscription));
    }

    private static void unsubscribeFromAll(Collection collection)
    {
        if (collection == null)
        {
            return;
        }
        Object obj = null;
        Iterator iterator = collection.iterator();
        collection = obj;
        while (iterator.hasNext()) 
        {
            Subscription subscription = (Subscription)iterator.next();
            try
            {
                subscription.unsubscribe();
            }
            catch (Throwable throwable)
            {
                Object obj1 = collection;
                if (collection == null)
                {
                    obj1 = new ArrayList();
                }
                ((List) (obj1)).add(throwable);
                collection = ((Collection) (obj1));
            }
        }
        Exceptions.throwIfAny(collection);
    }

    public void add(Subscription subscription)
    {
        if (subscription.isUnsubscribed())
        {
            return;
        }
        if (unsubscribed) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        LinkedList linkedlist1;
        if (unsubscribed)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        linkedlist1 = subscriptions;
        LinkedList linkedlist;
        linkedlist = linkedlist1;
        if (linkedlist1 != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        linkedlist = new LinkedList();
        subscriptions = linkedlist;
        linkedlist.add(subscription);
        this;
        JVM INSTR monitorexit ;
        return;
        subscription;
        this;
        JVM INSTR monitorexit ;
        throw subscription;
        this;
        JVM INSTR monitorexit ;
_L2:
        subscription.unsubscribe();
        return;
    }

    public void clear()
    {
        if (unsubscribed)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        this;
        JVM INSTR monitorenter ;
        LinkedList linkedlist;
        linkedlist = subscriptions;
        subscriptions = null;
        this;
        JVM INSTR monitorexit ;
        unsubscribeFromAll(linkedlist);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean hasSubscriptions()
    {
        boolean flag1;
        flag1 = false;
        if (unsubscribed)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        this;
        JVM INSTR monitorenter ;
        boolean flag = flag1;
        if (unsubscribed)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        flag = flag1;
        if (subscriptions == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        flag = flag1;
        if (!subscriptions.isEmpty())
        {
            flag = true;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        return false;
    }

    public boolean isUnsubscribed()
    {
        return unsubscribed;
    }

    public void remove(Subscription subscription)
    {
        if (unsubscribed)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        this;
        JVM INSTR monitorenter ;
        LinkedList linkedlist = subscriptions;
        if (!unsubscribed && linkedlist != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag = linkedlist.remove(subscription);
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            subscription.unsubscribe();
            return;
        }
        break MISSING_BLOCK_LABEL_52;
        subscription;
        this;
        JVM INSTR monitorexit ;
        throw subscription;
    }

    public void unsubscribe()
    {
        if (unsubscribed)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        this;
        JVM INSTR monitorenter ;
        if (!unsubscribed)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        LinkedList linkedlist;
        unsubscribed = true;
        linkedlist = subscriptions;
        subscriptions = null;
        this;
        JVM INSTR monitorexit ;
        unsubscribeFromAll(linkedlist);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}

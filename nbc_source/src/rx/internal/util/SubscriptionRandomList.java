// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action1;

public final class SubscriptionRandomList
    implements Subscription
{

    private Set subscriptions;
    private boolean unsubscribed;

    public SubscriptionRandomList()
    {
        unsubscribed = false;
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
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        if (!unsubscribed) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        if (subscription != null)
        {
            subscription.unsubscribe();
        }
        return;
_L2:
        if (subscriptions == null)
        {
            subscriptions = new HashSet(4);
        }
        subscriptions.add(subscription);
        subscription = obj;
          goto _L1
        subscription;
        this;
        JVM INSTR monitorexit ;
        throw subscription;
    }

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        if (!unsubscribed && subscriptions != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Set set;
        set = subscriptions;
        subscriptions = null;
        this;
        JVM INSTR monitorexit ;
        unsubscribeFromAll(set);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void forEach(Action1 action1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!unsubscribed && subscriptions != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Subscription asubscription[] = (Subscription[])subscriptions.toArray(null);
        this;
        JVM INSTR monitorexit ;
        int j = asubscription.length;
        for (int i = 0; i < j; i++)
        {
            action1.call(asubscription[i]);
        }

        break MISSING_BLOCK_LABEL_68;
        action1;
        this;
        JVM INSTR monitorexit ;
        throw action1;
    }

    public boolean isUnsubscribed()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = unsubscribed;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void remove(Subscription subscription)
    {
        this;
        JVM INSTR monitorenter ;
        if (!unsubscribed && subscriptions != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag = subscriptions.remove(subscription);
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            subscription.unsubscribe();
            return;
        } else
        {
            return;
        }
        subscription;
        this;
        JVM INSTR monitorexit ;
        throw subscription;
    }

    public void unsubscribe()
    {
        this;
        JVM INSTR monitorenter ;
        if (!unsubscribed)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Set set;
        unsubscribed = true;
        set = subscriptions;
        subscriptions = null;
        this;
        JVM INSTR monitorexit ;
        unsubscribeFromAll(set);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}

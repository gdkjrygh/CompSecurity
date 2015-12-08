// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.app.Activity;
import com.appboy.Constants;
import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//            az, ax, ay

public final class aw
    implements az
{

    private static final String g;
    public final ConcurrentMap a = new ConcurrentHashMap();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final ConcurrentMap c = new ConcurrentHashMap();
    public final Object d = new Object();
    public final Object e = new Object();
    public final Object f = new Object();
    private final Executor h;

    public aw(Executor executor)
    {
        h = executor;
    }

    static CopyOnWriteArraySet a(Class class1, CopyOnWriteArraySet copyonwritearrayset)
    {
        return b(class1, copyonwritearrayset);
    }

    private static CopyOnWriteArraySet b(Class class1, CopyOnWriteArraySet copyonwritearrayset)
    {
        CopyOnWriteArraySet copyonwritearrayset1 = (CopyOnWriteArraySet)copyonwritearrayset;
        (new StringBuilder("Triggering ")).append(class1.getName()).append(" on ").append(copyonwritearrayset.size()).append(" subscribers.");
        return copyonwritearrayset1;
    }

    public final void a(Object obj, Class class1)
    {
        (new StringBuilder()).append(class1.getName()).append(" fired: ").append(obj.toString());
        Object obj1 = a.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
            CopyOnWriteArraySet copyonwritearrayset = (CopyOnWriteArraySet)((ConcurrentMap)entry.getValue()).get(class1);
            if (copyonwritearrayset != null && !copyonwritearrayset.isEmpty())
            {
                ((Activity)entry.getKey()).runOnUiThread(new ax(this, class1, copyonwritearrayset, obj));
            }
        } while (true);
        obj1 = (CopyOnWriteArraySet)b.get(class1);
        if (obj1 != null)
        {
            IEventSubscriber ieventsubscriber;
            for (obj1 = b(class1, ((CopyOnWriteArraySet) (obj1))).iterator(); ((Iterator) (obj1)).hasNext(); h.execute(new ay(this, ieventsubscriber, obj)))
            {
                ieventsubscriber = (IEventSubscriber)((Iterator) (obj1)).next();
            }

        }
        obj1 = (CopyOnWriteArraySet)c.get(class1);
        if (obj1 != null)
        {
            for (class1 = b(class1, ((CopyOnWriteArraySet) (obj1))).iterator(); class1.hasNext(); ((IEventSubscriber)class1.next()).trigger(obj)) { }
        }
    }

    public final boolean a(IEventSubscriber ieventsubscriber, Class class1)
    {
        boolean flag = false;
        Object obj1 = e;
        obj1;
        JVM INSTR monitorenter ;
        ConcurrentMap concurrentmap = b;
        if (ieventsubscriber != null) goto _L2; else goto _L1
_L1:
        ieventsubscriber = class1.getName();
        AppboyLogger.e(g, String.format("Error: Attempted to add a null subscriber for eventClass %s. This subscriber is being ignored. Please check your calling code to ensure that all potential subscriptions are valid.", new Object[] {
            ieventsubscriber
        }));
_L3:
        obj1;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        CopyOnWriteArraySet copyonwritearrayset = (CopyOnWriteArraySet)concurrentmap.get(class1);
        Object obj;
        obj = copyonwritearrayset;
        if (copyonwritearrayset != null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        obj = new CopyOnWriteArraySet();
        class1 = (CopyOnWriteArraySet)concurrentmap.putIfAbsent(class1, obj);
        if (class1 != null)
        {
            obj = class1;
        }
        flag = ((CopyOnWriteArraySet) (obj)).add(ieventsubscriber);
          goto _L3
        ieventsubscriber;
        throw ieventsubscriber;
    }

    public final boolean b(IEventSubscriber ieventsubscriber, Class class1)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        class1 = (CopyOnWriteArraySet)b.get(class1);
        if (class1 == null || ieventsubscriber == null) goto _L2; else goto _L1
_L1:
        if (!class1.remove(ieventsubscriber)) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        ieventsubscriber;
        throw ieventsubscriber;
    }

    static 
    {
        g = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/aw.getName()
        });
    }
}

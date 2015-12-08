// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.quantcast.measurement.service:
//            QCNotificationListener

final class QCNotificationCenter extends Enum
{

    private static final QCNotificationCenter $VALUES[];
    public static final QCNotificationCenter INSTANCE;
    private final Map m_bus = new HashMap();

    private QCNotificationCenter(String s, int i)
    {
        super(s, i);
    }

    public static QCNotificationCenter valueOf(String s)
    {
        return (QCNotificationCenter)Enum.valueOf(com/quantcast/measurement/service/QCNotificationCenter, s);
    }

    public static QCNotificationCenter[] values()
    {
        return (QCNotificationCenter[])$VALUES.clone();
    }

    protected void addListener(String s, QCNotificationListener qcnotificationlistener)
    {
        List list = (List)m_bus.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        ((List) (obj)).add(new WeakReference(qcnotificationlistener));
        m_bus.put(s, obj);
    }

    protected void postNotification(String s, Object obj)
    {
        Object obj1 = (List)m_bus.get(s);
        if (obj1 != null)
        {
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
            {
                QCNotificationListener qcnotificationlistener = (QCNotificationListener)((WeakReference)((Iterator) (obj1)).next()).get();
                if (qcnotificationlistener != null)
                {
                    qcnotificationlistener.notificationCallback(s, obj);
                } else
                {
                    ((Iterator) (obj1)).remove();
                }
            }

        }
    }

    protected void removeAllListeners(String s)
    {
        m_bus.remove(s);
    }

    protected void removeListener(String s, QCNotificationListener qcnotificationlistener)
    {
        s = (List)m_bus.get(s);
        if (s != null)
        {
            s = s.iterator();
            do
            {
                if (!s.hasNext())
                {
                    break;
                }
                WeakReference weakreference = (WeakReference)s.next();
                if (weakreference.get() == null || weakreference.get() == qcnotificationlistener)
                {
                    s.remove();
                }
            } while (true);
        }
    }

    static 
    {
        INSTANCE = new QCNotificationCenter("INSTANCE", 0);
        $VALUES = (new QCNotificationCenter[] {
            INSTANCE
        });
    }
}

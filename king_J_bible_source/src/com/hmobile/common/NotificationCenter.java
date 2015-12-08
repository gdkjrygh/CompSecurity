// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class NotificationCenter
{
    class Observer
    {

        public Object Clazz;
        public String MethodName;
        public String NotificationType;
        public Object Params[];
        final NotificationCenter this$0;

        public boolean equals(Object obj)
        {
            if (obj.getClass() == com/hmobile/common/NotificationCenter$Observer)
            {
                obj = (Observer)obj;
                break MISSING_BLOCK_LABEL_14;
            }
            do
            {
                return false;
            } while (!((Observer) (obj)).NotificationType.equalsIgnoreCase(NotificationType) || ((Observer) (obj)).Clazz.getClass() != Clazz.getClass() || !((Observer) (obj)).MethodName.equalsIgnoreCase(MethodName) || Params != ((Observer) (obj)).Params);
            return true;
        }

        public Observer(Object obj, String s, String s1, Object aobj[])
        {
            this$0 = NotificationCenter.this;
            super();
            Clazz = obj;
            MethodName = s1;
            NotificationType = s;
            Params = aobj;
        }
    }


    private static volatile NotificationCenter _instance = null;
    ConcurrentLinkedQueue m_observerCollection;

    private NotificationCenter()
    {
        m_observerCollection = null;
        m_observerCollection = new ConcurrentLinkedQueue();
    }

    public static NotificationCenter Instance()
    {
        com/hmobile/common/NotificationCenter;
        JVM INSTR monitorenter ;
        if (_instance != null) goto _L2; else goto _L1
_L1:
        com/hmobile/common/NotificationCenter;
        JVM INSTR monitorenter ;
        if (_instance == null)
        {
            _instance = new NotificationCenter();
        }
        com/hmobile/common/NotificationCenter;
        JVM INSTR monitorexit ;
_L2:
        com/hmobile/common/NotificationCenter;
        JVM INSTR monitorexit ;
        return _instance;
        Exception exception;
        exception;
        com/hmobile/common/NotificationCenter;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        com/hmobile/common/NotificationCenter;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void callMethod(Observer observer)
    {
        int i = 0;
        if (observer.Clazz != null) goto _L2; else goto _L1
_L1:
        removeObserver(observer.Clazz);
_L8:
        return;
_L2:
        Object obj = new ArrayList();
        if (observer.Params == null) goto _L4; else goto _L3
_L3:
        Object aobj[];
        int j;
        aobj = observer.Params;
        j = aobj.length;
_L9:
        if (i < j) goto _L5; else goto _L4
_L4:
        if (((ArrayList) (obj)).size() > 0) goto _L7; else goto _L6
_L6:
        obj = observer.Clazz.getClass().getMethod(observer.MethodName, new Class[0]);
_L10:
        if (obj != null)
        {
            try
            {
                ((Method) (obj)).invoke(observer.Clazz, observer.Params);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Observer observer)
            {
                observer.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Observer observer)
            {
                observer.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Observer observer)
            {
                observer.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Observer observer)
            {
                observer.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_167;
        }
          goto _L8
_L5:
        ((ArrayList) (obj)).add(aobj[i].getClass());
        i++;
          goto _L9
_L7:
        obj = observer.Clazz.getClass().getMethod(observer.MethodName, (Class[])((ArrayList) (obj)).toArray(new Class[0]));
          goto _L10
          goto _L9
    }

    public void addObserver(Object obj, String s, String s1, Object aobj[])
    {
        obj = new Observer(obj, s, s1, aobj);
        s = m_observerCollection.iterator();
        do
        {
            if (!s.hasNext())
            {
                m_observerCollection.add(obj);
                return;
            }
        } while (!((Observer)s.next()).equals(obj));
    }

    public void postNotification(String s)
    {
        Iterator iterator = m_observerCollection.iterator();
        do
        {
            Observer observer;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                observer = (Observer)iterator.next();
            } while (!observer.NotificationType.equalsIgnoreCase(s));
            callMethod(observer);
        } while (true);
    }

    public void removeObserver(Object obj)
    {
        Iterator iterator = m_observerCollection.iterator();
        do
        {
            Observer observer;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                observer = (Observer)iterator.next();
            } while (observer.Clazz.getClass() != obj.getClass());
            m_observerCollection.remove(observer);
        } while (true);
    }

}

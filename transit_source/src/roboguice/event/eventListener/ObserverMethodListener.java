// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event.eventListener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import roboguice.event.EventListener;
import roboguice.event.eventListener.javaassist.RuntimeSupport;
import roboguice.util.Ln;

public class ObserverMethodListener
    implements EventListener
{

    protected String descriptor;
    protected Object instance;
    protected Method method;

    public ObserverMethodListener(Object obj, Method method1)
    {
        instance = obj;
        method = method1;
        descriptor = (new StringBuilder()).append(method1.getName()).append(':').append(RuntimeSupport.makeDescriptor(method1)).toString();
        method1.setAccessible(true);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (ObserverMethodListener)obj;
        if (descriptor == null ? ((ObserverMethodListener) (obj)).descriptor != null : !descriptor.equals(((ObserverMethodListener) (obj)).descriptor))
        {
            return false;
        }
        if (instance == null) goto _L4; else goto _L3
_L3:
        if (instance.equals(((ObserverMethodListener) (obj)).instance)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((ObserverMethodListener) (obj)).instance == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public Object getInstance()
    {
        return instance;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (descriptor != null)
        {
            i = descriptor.hashCode();
        } else
        {
            i = 0;
        }
        if (instance != null)
        {
            j = instance.hashCode();
        }
        return i * 31 + j;
    }

    public void onEvent(Object obj)
    {
        try
        {
            method.invoke(instance, new Object[] {
                obj
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Ln.e(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
    }
}

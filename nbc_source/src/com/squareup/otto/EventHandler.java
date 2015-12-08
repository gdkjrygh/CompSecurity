// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.otto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class EventHandler
{

    private final int hashCode;
    private final Method method;
    private final Object target;
    private boolean valid;

    EventHandler(Object obj, Method method1)
    {
        valid = true;
        if (obj == null)
        {
            throw new NullPointerException("EventHandler target cannot be null.");
        }
        if (method1 == null)
        {
            throw new NullPointerException("EventHandler method cannot be null.");
        } else
        {
            target = obj;
            method = method1;
            method1.setAccessible(true);
            hashCode = (method1.hashCode() + 31) * 31 + obj.hashCode();
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (EventHandler)obj;
            if (!method.equals(((EventHandler) (obj)).method) || target != ((EventHandler) (obj)).target)
            {
                return false;
            }
        }
        return true;
    }

    public void handleEvent(Object obj)
        throws InvocationTargetException
    {
        if (!valid)
        {
            throw new IllegalStateException((new StringBuilder()).append(toString()).append(" has been invalidated and can no longer handle events.").toString());
        }
        try
        {
            method.invoke(target, new Object[] {
                obj
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (((InvocationTargetException) (obj)).getCause() instanceof Error)
        {
            throw (Error)((InvocationTargetException) (obj)).getCause();
        } else
        {
            throw obj;
        }
    }

    public int hashCode()
    {
        return hashCode;
    }

    public void invalidate()
    {
        valid = false;
    }

    public boolean isValid()
    {
        return valid;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[EventHandler ").append(method).append("]").toString();
    }
}

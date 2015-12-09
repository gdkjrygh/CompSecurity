// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class e
{

    private final Object a;
    private final Method b;
    private final int c;
    private boolean d;

    e(Object obj, Method method)
    {
        d = true;
        if (obj == null)
        {
            throw new NullPointerException("EventHandler target cannot be null.");
        }
        if (method == null)
        {
            throw new NullPointerException("EventHandler method cannot be null.");
        } else
        {
            a = obj;
            b = method;
            method.setAccessible(true);
            c = (method.hashCode() + 31) * 31 + obj.hashCode();
            return;
        }
    }

    public void a(Object obj)
        throws InvocationTargetException
    {
        if (!d)
        {
            throw new IllegalStateException((new StringBuilder()).append(toString()).append(" has been invalidated and can no longer handle events.").toString());
        }
        try
        {
            b.invoke(a, new Object[] {
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

    public boolean a()
    {
        return d;
    }

    public void b()
    {
        d = false;
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
            obj = (e)obj;
            if (!b.equals(((e) (obj)).b) || a != ((e) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return c;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[EventHandler ").append(b).append("]").toString();
    }
}

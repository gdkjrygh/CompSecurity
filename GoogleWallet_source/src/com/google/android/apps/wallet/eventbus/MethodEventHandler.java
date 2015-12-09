// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            EventHandler

final class MethodEventHandler
    implements EventHandler
{

    private final int hashCode;
    private final Method method;
    private final Object target;

    MethodEventHandler(Object obj, Method method1)
    {
        target = Preconditions.checkNotNull(obj);
        method = (Method)Preconditions.checkNotNull(method1);
        method.setAccessible(true);
        hashCode = Objects.hashCode(new Object[] {
            target, method
        });
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof MethodEventHandler)
            {
                if (target != ((MethodEventHandler) (obj = (MethodEventHandler)obj)).target || !method.equals(((MethodEventHandler) (obj)).method))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final void handleEvent(Object obj)
    {
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
            Throwables.propagate(((Throwable) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Throwables.propagate(((Throwable) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Throwables.propagate(((InvocationTargetException) (obj)).getCause());
        }
    }

    public final int hashCode()
    {
        return hashCode;
    }
}

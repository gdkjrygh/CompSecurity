// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.event;

import java.lang.reflect.Method;

// Referenced classes of package com.skype.android.event:
//            EventListener, EventFilter

public class MethodInvocationEventListener
    implements EventListener
{

    private Object a;
    private Method b;
    private EventFilter c;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof MethodInvocationEventListener)
        {
            obj = (MethodInvocationEventListener)obj;
            flag = flag1;
            if (((MethodInvocationEventListener) (obj)).a.equals(a))
            {
                flag = flag1;
                if (((MethodInvocationEventListener) (obj)).b.equals(b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public EventFilter getFilter()
    {
        return c;
    }

    public int hashCode()
    {
        return a.hashCode() & b.hashCode();
    }

    public void onEvent(Object obj)
    {
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
            throw new RuntimeException(((Throwable) (obj)));
        }
    }
}

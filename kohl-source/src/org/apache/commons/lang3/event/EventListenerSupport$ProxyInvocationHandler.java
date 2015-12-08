// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.event;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.apache.commons.lang3.event:
//            EventListenerSupport

protected class this._cls0
    implements InvocationHandler
{

    private static final long serialVersionUID = 1L;
    final EventListenerSupport this$0;

    public Object invoke(Object obj, Method method, Object aobj[])
        throws Throwable
    {
        for (obj = EventListenerSupport.access$000(EventListenerSupport.this).iterator(); ((Iterator) (obj)).hasNext(); method.invoke(((Iterator) (obj)).next(), aobj)) { }
        return null;
    }

    protected ()
    {
        this$0 = EventListenerSupport.this;
        super();
    }
}

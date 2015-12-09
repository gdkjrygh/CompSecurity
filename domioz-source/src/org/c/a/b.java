// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.a;

import java.beans.PropertyChangeEvent;

// Referenced classes of package org.c.a:
//            a

public abstract class b extends a
{

    private transient PropertyChangeEvent a;

    public b(PropertyChangeEvent propertychangeevent, String s, Throwable throwable)
    {
        super(s, throwable);
        a = propertychangeevent;
    }

    public b(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public PropertyChangeEvent getPropertyChangeEvent()
    {
        return a;
    }

    public String getPropertyName()
    {
        if (a != null)
        {
            return a.getPropertyName();
        } else
        {
            return null;
        }
    }

    public Object getValue()
    {
        if (a != null)
        {
            return a.getNewValue();
        } else
        {
            return null;
        }
    }
}

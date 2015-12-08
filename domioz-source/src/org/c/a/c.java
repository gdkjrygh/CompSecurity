// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.a;

import java.beans.PropertyChangeEvent;

// Referenced classes of package org.c.a:
//            b

public final class c extends b
{

    public static final String ERROR_CODE = "typeMismatch";
    private transient Object a;
    private Class b;

    public c(PropertyChangeEvent propertychangeevent, Class class1)
    {
        this(propertychangeevent, class1, null);
    }

    public c(PropertyChangeEvent propertychangeevent, Class class1, Throwable throwable)
    {
        StringBuilder stringbuilder = (new StringBuilder("Failed to convert property value of type '")).append(org.c.d.c.getDescriptiveType(propertychangeevent.getNewValue())).append("'");
        String s;
        if (class1 != null)
        {
            s = (new StringBuilder(" to required type '")).append(org.c.d.c.getQualifiedName(class1)).append("'").toString();
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (propertychangeevent.getPropertyName() != null)
        {
            s = (new StringBuilder(" for property '")).append(propertychangeevent.getPropertyName()).append("'").toString();
        } else
        {
            s = "";
        }
        super(propertychangeevent, stringbuilder.append(s).toString(), throwable);
        a = propertychangeevent.getNewValue();
        b = class1;
    }

    public c(Object obj, Class class1)
    {
        this(obj, class1, null);
    }

    public c(Object obj, Class class1, Throwable throwable)
    {
        StringBuilder stringbuilder = (new StringBuilder("Failed to convert value of type '")).append(org.c.d.c.getDescriptiveType(obj)).append("'");
        String s;
        if (class1 != null)
        {
            s = (new StringBuilder(" to required type '")).append(org.c.d.c.getQualifiedName(class1)).append("'").toString();
        } else
        {
            s = "";
        }
        super(stringbuilder.append(s).toString(), throwable);
        a = obj;
        b = class1;
    }

    public final String getErrorCode()
    {
        return "typeMismatch";
    }

    public final Class getRequiredType()
    {
        return b;
    }

    public final Object getValue()
    {
        return a;
    }
}

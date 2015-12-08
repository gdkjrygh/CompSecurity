// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.annotation:
//            ObjectIdGenerator

public static final class hashCode
    implements Serializable
{

    private final int hashCode;
    public final Object key;
    public final Class scope;
    public final Class type;

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            obj = (hashCode)obj;
            if (!((hashCode) (obj)).key.equals(key) || ((key) (obj)).type != type || ((type) (obj)).scope != scope)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return hashCode;
    }

    public (Class class1, Class class2, Object obj)
    {
        type = class1;
        scope = class2;
        key = obj;
        int j = obj.hashCode() + class1.getName().hashCode();
        int i = j;
        if (class2 != null)
        {
            i = j ^ class2.getName().hashCode();
        }
        hashCode = i;
    }
}

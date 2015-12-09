// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import ctz;
import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Present, Absent

public abstract class Optional
    implements Serializable
{

    private static final long serialVersionUID = 0L;

    Optional()
    {
    }

    public static Optional b(Object obj)
    {
        return new Present(ctz.a(obj));
    }

    public static Optional c(Object obj)
    {
        if (obj == null)
        {
            return Absent.a();
        } else
        {
            return new Present(obj);
        }
    }

    public static Optional e()
    {
        return Absent.a();
    }

    public abstract Object a(Object obj);

    public abstract boolean b();

    public abstract Object c();

    public abstract Object d();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}

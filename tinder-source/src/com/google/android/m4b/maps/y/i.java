// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.y:
//            m, j, a

public abstract class i
    implements Serializable
{

    private static final long serialVersionUID = 0L;

    i()
    {
    }

    public static i b(Object obj)
    {
        return new m(j.a(obj));
    }

    public static i c()
    {
        return com.google.android.m4b.maps.y.a.a();
    }

    public static i c(Object obj)
    {
        if (obj == null)
        {
            return com.google.android.m4b.maps.y.a.a();
        } else
        {
            return new m(obj);
        }
    }

    public abstract Object a(Object obj);

    public abstract boolean b();
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.y:
//            e

public static final class  extends e
    implements Serializable
{

    public static final a a = new <init>();
    private static final long serialVersionUID = 1L;

    private Object readResolve()
    {
        return a;
    }

    public final int b(Object obj)
    {
        return obj.hashCode();
    }

    protected final boolean b(Object obj, Object obj1)
    {
        return obj.equals(obj1);
    }


    ()
    {
    }
}

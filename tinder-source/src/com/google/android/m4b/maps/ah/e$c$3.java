// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.y.j;
import java.lang.reflect.Type;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            e

static final class nit> extends nit>
{

    final Type a(Type type)
    {
        if (type instanceof Class)
        {
            return e.a((Class)type);
        } else
        {
            return new nit>(type);
        }
    }

    final Type b(Type type)
    {
        return (Type)j.a(type);
    }

    (String s)
    {
        super(s, 1, (byte)0);
    }
}

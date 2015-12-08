// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.b.a;
import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.s;
import java.lang.reflect.GenericArrayType;

// Referenced classes of package com.google.gson.internal.a:
//            a

static final class Types
    implements s
{

    public final r a(e e1, a a1)
    {
        a1 = a1.b;
        if (!(a1 instanceof GenericArrayType) && (!(a1 instanceof Class) || !((Class)a1).isArray()))
        {
            return null;
        } else
        {
            a1 = com.google.gson.internal.n.Types.d(a1);
            return new com.google.gson.internal.a.a(e1, e1.a(com.google.gson.b.a.a(a1)), com.google.gson.internal.n.Types.b(a1));
        }
    }

    Types()
    {
    }
}

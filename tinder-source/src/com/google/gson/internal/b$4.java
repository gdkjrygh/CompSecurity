// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.lang.reflect.Type;

// Referenced classes of package com.google.gson.internal:
//            e, b, h

final class b
    implements e
{

    final Class a;
    final Type b;
    final b c;
    private final h d = h.a();

    public final Object a()
    {
        Object obj;
        try
        {
            obj = d.a(a);
        }
        catch (Exception exception)
        {
            throw new RuntimeException((new StringBuilder("Unable to invoke no-args constructor for ")).append(b).append(". Register an InstanceCreator with Gson for this type may fix this problem.").toString(), exception);
        }
        return obj;
    }

    (b b1, Class class1, Type type)
    {
        c = b1;
        a = class1;
        b = type;
        super();
    }
}

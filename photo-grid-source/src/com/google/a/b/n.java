// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.lang.reflect.Type;

// Referenced classes of package com.google.a.b:
//            s, ae, f

final class n
    implements s
{

    final Class a;
    final Type b;
    final f c;
    private final ae d = ae.a();

    n(f f, Class class1, Type type)
    {
        c = f;
        a = class1;
        b = type;
        super();
    }

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
}

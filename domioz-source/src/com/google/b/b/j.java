// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import java.lang.reflect.Type;

// Referenced classes of package com.google.b.b:
//            ae, aj, f

final class j
    implements ae
{

    final Class a;
    final Type b;
    final f c;
    private final aj d = aj.a();

    j(f f, Class class1, Type type)
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

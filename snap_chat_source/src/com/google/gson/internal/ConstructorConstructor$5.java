// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;

// Referenced classes of package com.google.gson.internal:
//            ObjectConstructor, ConstructorConstructor

final class b
    implements ObjectConstructor
{

    private InstanceCreator a;
    private Type b;

    public final Object construct()
    {
        return a.createInstance(b);
    }

    (InstanceCreator instancecreator, Type type)
    {
        a = instancecreator;
        b = type;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.lang.reflect.Type;

// Referenced classes of package com.google.gson.internal:
//            ObjectConstructor, ConstructorConstructor, UnsafeAllocator

class val.type
    implements ObjectConstructor
{

    final ConstructorConstructor this$0;
    private final UnsafeAllocator unsafeAllocator = UnsafeAllocator.create();
    final Class val$rawType;
    final Type val$type;

    public Object construct()
    {
        Object obj;
        try
        {
            obj = unsafeAllocator.newInstance(val$rawType);
        }
        catch (Exception exception)
        {
            throw new RuntimeException((new StringBuilder()).append("Unable to invoke no-args constructor for ").append(val$type).append(". ").append("Register an InstanceCreator with Gson for this type may fix this problem.").toString(), exception);
        }
        return obj;
    }

    ()
    {
        this$0 = final_constructorconstructor;
        val$rawType = class1;
        val$type = Type.this;
        super();
    }
}

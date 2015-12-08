// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.lang.reflect.Field;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            s

static final class <init>
{

    final Field a;

    final void a(Object obj, Object obj1)
    {
        try
        {
            a.set(obj, obj1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
    }

    private (Field field)
    {
        a = field;
        field.setAccessible(true);
    }

    le(Field field, byte byte0)
    {
        this(field);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

// Referenced classes of package com.google.android.m4b.maps.z:
//            n

static final class ction
    implements PrivilegedExceptionAction
{

    public final Object run()
    {
        Field afield[] = sun/misc/Unsafe.getDeclaredFields();
        int j = afield.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = afield[i];
            ((Field) (obj)).setAccessible(true);
            obj = ((Field) (obj)).get(null);
            if (sun/misc/Unsafe.isInstance(obj))
            {
                return (Unsafe)sun/misc/Unsafe.cast(obj);
            }
        }

        throw new NoSuchFieldError("the Unsafe");
    }

    ction()
    {
    }
}

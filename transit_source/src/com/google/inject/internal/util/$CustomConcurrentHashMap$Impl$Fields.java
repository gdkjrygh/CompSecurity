// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.lang.reflect.Field;

// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap

static class 
{

    static final Field loadFactor = findField("loadFactor");
    static final Field segmentMask = findField("segmentMask");
    static final Field segmentShift = findField("segmentShift");
    static final Field segments = findField("segments");
    static final Field strategy = findField("strategy");

    static Field findField(String s)
    {
        try
        {
            s = com/google/inject/internal/util/$CustomConcurrentHashMap$Impl.getDeclaredField(s);
            s.setAccessible(true);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }


    ()
    {
    }
}

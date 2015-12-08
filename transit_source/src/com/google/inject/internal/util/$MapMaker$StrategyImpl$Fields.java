// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.lang.reflect.Field;

// Referenced classes of package com.google.inject.internal.util:
//            $MapMaker

private static class 
{

    static final Field expirationNanos = findField("expirationNanos");
    static final Field internals = findField("internals");
    static final Field keyStrength = findField("keyStrength");
    static final Field map = findField("map");
    static final Field valueStrength = findField("valueStrength");

    static Field findField(String s)
    {
        try
        {
            s = com/google/inject/internal/util/$MapMaker$StrategyImpl.getDeclaredField(s);
            s.setAccessible(true);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }


    private ()
    {
    }
}

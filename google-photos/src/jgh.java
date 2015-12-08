// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class jgh
{

    private static Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Float[] {
        Float.valueOf(120F), Float.valueOf(240F)
    })));

    public static boolean a(jgi jgi1)
    {
        if (jgi1.r() == 0.0F || jgi1.s() == 0.0F)
        {
            return false;
        } else
        {
            return a.contains(Float.valueOf(jgi1.r()));
        }
    }

}

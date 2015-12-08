// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Map;

public final class lft
{

    public final Map a;
    public final ksp b;

    public lft(Map map, ksp ksp)
    {
        a = map;
        b = ksp;
    }

    public final String toString()
    {
        return (new StringBuilder("Properties: ")).append(Collections.unmodifiableMap(a)).append(" pushAfterEvaluate: ").append(b).toString();
    }
}

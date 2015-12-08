// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class nmx
{

    private static final ThreadLocal a = new nmy();

    public static void a(long l)
    {
        Object obj = (ArrayList)a.get();
        int i = ((ArrayList) (obj)).size();
        if (i > 0)
        {
            obj = (nmz)((ArrayList) (obj)).get(i - 1);
            obj.a = ((nmz) (obj)).a + l;
        }
    }

    public static void b(long l)
    {
        Object obj = (ArrayList)a.get();
        int i = ((ArrayList) (obj)).size();
        if (i > 0)
        {
            obj = (nmz)((ArrayList) (obj)).get(i - 1);
            obj.b = (int)((long)((nmz) (obj)).b + 1L);
        }
    }

    static 
    {
        oqv.a("picasasync.metrics.time", 100L);
    }
}

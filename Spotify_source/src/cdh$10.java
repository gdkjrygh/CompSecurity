// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class il.Map
    implements cdi
{

    public final void a(ckw ckw, Map map)
    {
        bka.c((new StringBuilder("Received log message: ")).append((String)map.get("string")).toString());
    }

    il.Map()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class bjo
    implements cdi
{

    public bjo()
    {
    }

    public final void a(ckw ckw, Map map)
    {
        ckw = (String)map.get("request_id");
        map = (String)map.get("errors");
        bka.e((new StringBuilder("Invalid request: ")).append(map).toString());
        bjl.h_().a(ckw);
    }
}

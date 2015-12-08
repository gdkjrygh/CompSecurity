// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class cdd
    implements cdi
{

    private final cde a;

    public cdd(cde cde1)
    {
        a = cde1;
    }

    public final void a(ckw ckw, Map map)
    {
        ckw = (String)map.get("name");
        if (ckw == null)
        {
            bka.e("App event with no name parameter.");
            return;
        } else
        {
            a.a(ckw, (String)map.get("info"));
            return;
        }
    }
}

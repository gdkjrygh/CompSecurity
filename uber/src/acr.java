// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class acr
    implements acu
{

    private final acs a;

    public acr(acs acs1)
    {
        a = acs1;
    }

    public final void a(akk akk, Map map)
    {
        akk = (String)map.get("name");
        if (akk == null)
        {
            of.e("App event with no name parameter.");
            return;
        } else
        {
            a.a(akk, (String)map.get("info"));
            return;
        }
    }
}

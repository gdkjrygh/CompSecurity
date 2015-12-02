// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class afc
{

    private final akk a;
    private final boolean b;
    private final String c;

    public afc(akk akk1, Map map)
    {
        a = akk1;
        c = (String)map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange"))
        {
            b = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
            return;
        } else
        {
            b = true;
            return;
        }
    }

    public final void a()
    {
        if (a == null)
        {
            of.e("AdWebView is null");
            return;
        }
        int i;
        if ("portrait".equalsIgnoreCase(c))
        {
            i = ot.g().b();
        } else
        if ("landscape".equalsIgnoreCase(c))
        {
            i = ot.g().a();
        } else
        if (b)
        {
            i = -1;
        } else
        {
            i = ot.g().c();
        }
        a.b(i);
    }
}

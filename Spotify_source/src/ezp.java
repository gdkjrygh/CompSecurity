// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class ezp
    implements epc
{

    private final String a;
    private final ezo b;

    private ezp(String s, ezo ezo1)
    {
        a = s;
        b = ezo1;
    }

    public ezp(String s, ezo ezo1, byte byte0)
    {
        this(s, ezo1);
    }

    public final void a(Throwable throwable)
    {
    }

    public final void a(Map map)
    {
        map = (fio)map.get(a);
        ezo ezo1 = b;
        String s = a;
        if (map == null)
        {
            map = "";
        } else
        {
            map = map.e();
        }
        ezo1.a(s, map);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class ang.String extends byq
{

    private Map j;

    public final Map a()
    {
        if (j == null)
        {
            return super.a();
        } else
        {
            return j;
        }
    }

    (String s, cnd cnd, cnc cnc, Map map)
    {
        j = map;
        super(s, cnd, cnc, (byte)0);
    }
}

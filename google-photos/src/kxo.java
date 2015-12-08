// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class kxo extends krq
{

    private Map k;

    kxo(kxm kxm, String s, lac lac, lab lab, Map map)
    {
        k = map;
        super(s, lac, lab);
    }

    public final Map a()
    {
        if (k == null)
        {
            return super.a();
        } else
        {
            return k;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import java.util.TreeMap;

public final class mwh
{

    private static final onh a = new onh("debug.social.rpc.datamixer_urls");
    private static Map b;

    public static Map a()
    {
        if (b == null)
        {
            b = new TreeMap();
        }
        return b;
    }

}

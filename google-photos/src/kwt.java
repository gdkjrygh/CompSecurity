// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class kwt
{

    public final byte a[];
    public final Map b;
    public final boolean c;

    public kwt(int i, byte abyte0[], Map map, boolean flag, long l)
    {
        a = abyte0;
        b = map;
        c = flag;
    }

    public kwt(byte abyte0[], Map map)
    {
        this(200, abyte0, map, false, 0L);
    }
}

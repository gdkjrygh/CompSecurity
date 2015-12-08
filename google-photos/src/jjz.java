// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class jjz extends jjy
{

    private final Map a = new HashMap();

    public jjz(String s)
    {
        super(s);
    }

    public final void a(UUID uuid, byte abyte0[])
    {
        a.put(uuid, abyte0);
    }
}

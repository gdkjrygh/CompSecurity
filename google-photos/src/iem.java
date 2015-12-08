// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

final class iem
{

    final HashMap a = new HashMap();

    iem()
    {
    }

    public final iem a(String s, int i)
    {
        a.put(s, Integer.valueOf(i));
        return this;
    }
}

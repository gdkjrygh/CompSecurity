// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public final class cuk
{

    public static final ctw a = ctw.a(", ").b("null");

    public static StringBuilder a(int i)
    {
        cuj.a(i, "size");
        return new StringBuilder((int)Math.min((long)i << 3, 0x40000000L));
    }

    public static Collection a(Iterable iterable)
    {
        return (Collection)iterable;
    }

}

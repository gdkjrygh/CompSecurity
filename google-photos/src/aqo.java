// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class aqo
    implements aqg
{

    public aqo()
    {
    }

    public final int a(Object obj)
    {
        return ((byte[])obj).length;
    }

    public final Object a(int i)
    {
        return new byte[i];
    }

    public final String a()
    {
        return "ByteArrayPool";
    }

    public final int b()
    {
        return 1;
    }

    public final void b(Object obj)
    {
        Arrays.fill((byte[])obj, (byte)0);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class and extends IOException
{

    public final int a;

    public and(int i)
    {
        this((new StringBuilder(49)).append("Http request failed with status code: ").append(i).toString(), i);
    }

    public and(String s)
    {
        this(s, -1);
    }

    public and(String s, int i)
    {
        this(s, i, null);
    }

    private and(String s, int i, Throwable throwable)
    {
        super(s, null);
        a = i;
    }
}

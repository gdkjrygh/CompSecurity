// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class cfu extends IOException
{

    final boolean a;
    final int b;

    public cfu(String s, int i, int j)
    {
        super(s);
        a = cgd.c(i);
        b = j;
    }
}

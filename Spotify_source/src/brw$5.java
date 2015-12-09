// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class nit> extends brw
{

    private char b[];

    public final boolean a(char c)
    {
        return Arrays.binarySearch(b, c) >= 0;
    }

    (char ac[])
    {
        b = ac;
        super();
    }
}

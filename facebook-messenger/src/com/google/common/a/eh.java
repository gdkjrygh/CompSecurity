// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


final class eh
{

    private eh()
    {
    }

    static int a(int i)
    {
        i = i >>> 20 ^ i >>> 12 ^ i;
        return i >>> 4 ^ (i >>> 7 ^ i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;


final class ai
    implements CharSequence
{

    char a[];

    ai()
    {
    }

    public final char charAt(int i)
    {
        return a[i];
    }

    public final int length()
    {
        return a.length;
    }

    public final CharSequence subSequence(int i, int j)
    {
        return new String(a, i, j - i);
    }
}

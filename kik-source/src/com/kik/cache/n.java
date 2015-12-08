// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;


final class n extends SimpleLruBitmapCache.a
{

    final String a;

    n(String s)
    {
        a = s;
        super();
    }

    public final boolean a(String s)
    {
        while (s == null || !s.endsWith(a)) 
        {
            return false;
        }
        return true;
    }
}

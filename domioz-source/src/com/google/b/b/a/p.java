// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.d.c;

final class p
{

    static final int a[];

    static 
    {
        a = new int[c.values().length];
        try
        {
            a[c.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[c.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[c.f.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[c.g.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[c.h.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[c.i.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

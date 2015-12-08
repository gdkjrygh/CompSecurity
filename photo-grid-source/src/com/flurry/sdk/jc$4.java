// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


class dError
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[values().length];
        try
        {
            b[a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            b[d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            b[e.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        a = new int[values().length];
        try
        {
            a[a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

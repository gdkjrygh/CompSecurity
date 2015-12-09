// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import com.nuance.b.b.a.d;
import com.nuance.b.b.a.y;

final class e
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[y.values().length];
        try
        {
            b[y.g.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            b[y.i.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        a = new int[d.values().length];
        try
        {
            a[d.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[d.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

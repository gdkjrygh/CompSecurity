// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ac;

// Referenced classes of package com.nuance.b.b:
//            z

final class w
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[ac.values().length];
        try
        {
            b[ac.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            b[ac.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            b[ac.b.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[ac.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[ac.f.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[ac.g.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[ac.e.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        a = new int[z.a().length];
        try
        {
            a[z.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[z.c - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[z.d - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[z.b - 1] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

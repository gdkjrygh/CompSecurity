// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import com.roidapp.cloudlib.sns.b.c;
import com.roidapp.cloudlib.sns.b.g;

final class bi
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[g.values().length];
        try
        {
            b[g.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[g.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[g.a.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[c.values().length];
        try
        {
            a[c.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[c.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[c.a.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

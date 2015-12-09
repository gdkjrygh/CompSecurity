// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs.util;

import com.afollestad.materialdialogs.e;

// Referenced classes of package com.afollestad.materialdialogs.util:
//            a

static class 
{

    static final int a[];

    static 
    {
        a = new int[e.values().length];
        try
        {
            a[e.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[e.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

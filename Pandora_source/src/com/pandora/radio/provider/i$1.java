// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import com.pandora.radio.data.ac;

// Referenced classes of package com.pandora.radio.provider:
//            i

static class 
{

    static final int a[];

    static 
    {
        a = new int[ac.values().length];
        try
        {
            a[ac.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ac.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

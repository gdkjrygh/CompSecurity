// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import com.b.a.b.a.h;

// Referenced classes of package com.b.a.c:
//            a

static final class chFieldError
{

    static final int a[];

    static 
    {
        a = new int[h.a().length];
        try
        {
            a[h.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[h.b - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

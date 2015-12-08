// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;


// Referenced classes of package com.c.a.a:
//            a

static final class chFieldError
{

    static final int a[];

    static 
    {
        a = new int[a().length];
        try
        {
            a[c - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[a - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

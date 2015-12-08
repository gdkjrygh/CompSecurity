// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//            e

public static final class 
{

    public static final int a[];

    static 
    {
        a = new int[com.facebook.bookRequestError.Category.values().length];
        try
        {
            a[com.facebook.bookRequestError.Category.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.facebook.bookRequestError.Category.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.facebook.bookRequestError.Category.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

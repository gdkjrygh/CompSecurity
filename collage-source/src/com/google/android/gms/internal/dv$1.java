// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            dv

static class 
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.google.ads.uest.ErrorCode.values().length];
        try
        {
            b[com.google.ads.uest.ErrorCode.d.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[com.google.ads.uest.ErrorCode.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[com.google.ads.uest.ErrorCode.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[com.google.ads.uest.ErrorCode.b.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[com.google.ads.uest.Gender.values().length];
        try
        {
            a[com.google.ads.uest.Gender.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.ads.uest.Gender.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.ads.uest.Gender.a.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

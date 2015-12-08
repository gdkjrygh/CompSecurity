// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.utils;


// Referenced classes of package com.aviary.android.feather.sdk.utils:
//            a

static class 
{

    static final int a[];

    static 
    {
        a = new int[com.aviary.android.feather.cds.values().length];
        try
        {
            a[com.aviary.android.feather.cds.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.aviary.android.feather.cds.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.aviary.android.feather.cds.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

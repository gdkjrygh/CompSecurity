// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.cache;


// Referenced classes of package com.facebook.analytics.cache:
//            g

class f
{

    static final int a[];

    static 
    {
        a = new int[g.values().length];
        try
        {
            a[g.CACHE_FULL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[g.CONTENT_STALE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

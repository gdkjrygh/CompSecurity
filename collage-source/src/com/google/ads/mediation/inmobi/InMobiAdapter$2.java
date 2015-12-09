// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.inmobi;

import com.inmobi.monetization.IMErrorCode;

// Referenced classes of package com.google.ads.mediation.inmobi:
//            InMobiAdapter

static class 
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[IMErrorCode.values().length];
        try
        {
            b[IMErrorCode.INTERNAL_ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[IMErrorCode.INVALID_REQUEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[IMErrorCode.NETWORK_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            b[IMErrorCode.NO_FILL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        a = new int[com.google.ads..values().length];
        try
        {
            a[com.google.ads..b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.ads..c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

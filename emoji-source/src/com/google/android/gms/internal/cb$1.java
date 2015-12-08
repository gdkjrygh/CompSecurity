// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            cb

static class 
{

    static final int nY[];
    static final int nZ[];

    static 
    {
        nZ = new int[com.google.ads.uest.ErrorCode.values().length];
        try
        {
            nZ[com.google.ads.uest.ErrorCode.INTERNAL_ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            nZ[com.google.ads.uest.ErrorCode.INVALID_REQUEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            nZ[com.google.ads.uest.ErrorCode.NETWORK_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            nZ[com.google.ads.uest.ErrorCode.NO_FILL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        nY = new int[com.google.ads.uest.Gender.values().length];
        try
        {
            nY[com.google.ads.uest.Gender.FEMALE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            nY[com.google.ads.uest.Gender.MALE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            nY[com.google.ads.uest.Gender.UNKNOWN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

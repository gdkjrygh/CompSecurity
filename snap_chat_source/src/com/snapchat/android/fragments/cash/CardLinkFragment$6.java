// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import com.snapchat.android.api2.cash.blockers.CardInputError;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CardLinkFragment

static final class 
{

    static final int a[];

    static 
    {
        a = new int[CardInputError.values().length];
        try
        {
            a[CardInputError.INVALID_CARD_NUMBER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[CardInputError.BLOCKED_CARD.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[CardInputError.INVALID_EXPIRATION.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[CardInputError.INVALID_SECURITY_CODE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[CardInputError.INVALID_POSTAL_CODE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[CardInputError.CARD_TYPE_UNSUPPORTED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[CardInputError.UNSUPPORTED_REGION.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[CardInputError.TOO_MANY_ATTEMPTS.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[CardInputError.NETWORK_FAILURE.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import com.snapchat.android.api2.cash.square.data.ErrorType;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            SecurityCodeFragment

static final class 
{

    static final int a[];

    static 
    {
        a = new int[ErrorType.values().length];
        try
        {
            a[ErrorType.INVALID_PASSCODE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ErrorType.TOO_MANY_ATTEMPTS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ErrorType.BLOCKED_CARD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

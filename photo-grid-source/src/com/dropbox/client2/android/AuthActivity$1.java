// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.android;

import java.security.SecureRandom;

final class curityProvider
    implements curityProvider
{

    public final SecureRandom getSecureRandom()
    {
        return new SecureRandom();
    }

    curityProvider()
    {
    }
}

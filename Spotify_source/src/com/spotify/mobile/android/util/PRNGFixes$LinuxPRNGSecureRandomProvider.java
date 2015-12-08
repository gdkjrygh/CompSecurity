// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import java.security.Provider;

class put extends Provider
{

    private static final long serialVersionUID = 1L;

    public ()
    {
        super("LinuxPRNG", 1.0D, "A Linux-specific random number provider that uses /dev/urandom");
        put("SecureRandom.SHA1PRNG", com/spotify/mobile/android/util/PRNGFixes$LinuxPRNGSecureRandom.getName());
        put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
    }
}

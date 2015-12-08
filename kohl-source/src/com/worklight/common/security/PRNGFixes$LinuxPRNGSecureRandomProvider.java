// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import java.security.Provider;

// Referenced classes of package com.worklight.common.security:
//            PRNGFixes

private static class put extends Provider
{

    public ()
    {
        super("LinuxPRNG", 1.0D, "A Linux-specific random number provider that uses /dev/urandom");
        put("SecureRandom.SHA1PRNG", com/worklight/common/security/PRNGFixes$LinuxPRNGSecureRandom.getName());
        put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
    }
}

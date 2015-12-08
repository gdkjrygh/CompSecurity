// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.PrivilegedAction;

// Referenced classes of package org.spongycastle.jce.provider:
//            BouncyCastleProvider

final class a
    implements PrivilegedAction
{

    final BouncyCastleProvider a;

    a(BouncyCastleProvider bouncycastleprovider)
    {
        a = bouncycastleprovider;
        super();
    }

    public final Object run()
    {
        BouncyCastleProvider.a(a);
        return null;
    }
}

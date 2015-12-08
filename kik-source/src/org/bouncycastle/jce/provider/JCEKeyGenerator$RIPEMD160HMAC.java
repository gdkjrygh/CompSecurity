// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.CipherKeyGenerator;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEKeyGenerator

public static class A extends JCEKeyGenerator
{

    public A()
    {
        super("HMACRIPEMD160", 160, new CipherKeyGenerator());
    }
}

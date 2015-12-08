// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.engines.RC2Engine;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEMac

public static class it> extends JCEMac
{

    public c()
    {
        super(new CFBBlockCipherMac(new RC2Engine()));
    }
}

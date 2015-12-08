// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.engines.RC2Engine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEMac

public static class  extends JCEMac
{

    public ()
    {
        super(new CBCBlockCipherMac(new RC2Engine()));
    }
}

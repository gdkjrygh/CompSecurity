// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.macs.CBCBlockCipherMac;

// Referenced classes of package org.spongycastle.jce.provider:
//            JCEMac

public static class init> extends JCEMac
{

    public Mac()
    {
        super(new CBCBlockCipherMac(new DESEngine(), 64));
    }
}

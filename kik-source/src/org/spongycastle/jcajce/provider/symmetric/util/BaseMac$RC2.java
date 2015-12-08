// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import org.spongycastle.crypto.engines.RC2Engine;
import org.spongycastle.crypto.macs.CBCBlockCipherMac;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseMac

public static class t> extends BaseMac
{

    public A()
    {
        super(new CBCBlockCipherMac(new RC2Engine()));
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.VMPCEngine;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            VMPC

public static class treamCipher extends BaseStreamCipher
{

    public treamCipher()
    {
        super(new VMPCEngine(), 16);
    }
}

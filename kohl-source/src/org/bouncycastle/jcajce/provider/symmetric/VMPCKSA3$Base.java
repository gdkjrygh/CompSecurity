// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.engines.VMPCKSA3Engine;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            VMPCKSA3

public static class mCipher extends BaseStreamCipher
{

    public mCipher()
    {
        super(new VMPCKSA3Engine(), 16);
    }
}

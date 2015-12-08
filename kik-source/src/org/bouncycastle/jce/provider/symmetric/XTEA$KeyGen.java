// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.jce.provider.JCEKeyGenerator;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            XTEA

public static class  extends JCEKeyGenerator
{

    public _cls9()
    {
        super("XTEA", 128, new CipherKeyGenerator());
    }
}

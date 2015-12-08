// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.engines.RC2Engine;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEBlockCipher

public static class t> extends JCEBlockCipher
{

    public ()
    {
        super(new RC2Engine());
    }
}

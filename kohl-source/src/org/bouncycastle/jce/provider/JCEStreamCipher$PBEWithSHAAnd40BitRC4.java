// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.engines.RC4Engine;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEStreamCipher

public static class I extends JCEStreamCipher
{

    public I()
    {
        super(new RC4Engine(), 0);
    }
}

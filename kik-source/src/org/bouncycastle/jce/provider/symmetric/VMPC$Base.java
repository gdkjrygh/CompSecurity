// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import org.bouncycastle.crypto.engines.VMPCEngine;
import org.bouncycastle.jce.provider.JCEStreamCipher;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            VMPC

public static class t> extends JCEStreamCipher
{

    public ()
    {
        super(new VMPCEngine(), 16);
    }
}

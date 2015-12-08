// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import org.spongycastle.crypto.engines.BlowfishEngine;
import org.spongycastle.crypto.modes.OFBBlockCipher;

// Referenced classes of package org.spongycastle.jce.provider:
//            JCEStreamCipher

public static class A extends JCEStreamCipher
{

    public A()
    {
        super(new OFBBlockCipher(new BlowfishEngine(), 8), 64);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import org.spongycastle.crypto.engines.TwofishEngine;
import org.spongycastle.crypto.modes.CFBBlockCipher;

// Referenced classes of package org.spongycastle.jce.provider:
//            JCEStreamCipher

public static class  extends JCEStreamCipher
{

    public ()
    {
        super(new CFBBlockCipher(new TwofishEngine(), 8), 128);
    }
}

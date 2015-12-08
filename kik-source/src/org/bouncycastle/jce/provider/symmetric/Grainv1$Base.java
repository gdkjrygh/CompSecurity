// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import org.bouncycastle.crypto.engines.Grainv1Engine;
import org.bouncycastle.jce.provider.JCEStreamCipher;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            Grainv1

public static class  extends JCEStreamCipher
{

    public ()
    {
        super(new Grainv1Engine(), 8);
    }
}

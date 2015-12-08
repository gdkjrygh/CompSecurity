// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.spongycastle.crypto.engines.RSABlindedEngine;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.rsa:
//            PSSSignatureSpi

public static class  extends PSSSignatureSpi
{

    public ()
    {
        super(new RSABlindedEngine(), new PSSParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), 28, 1));
    }
}

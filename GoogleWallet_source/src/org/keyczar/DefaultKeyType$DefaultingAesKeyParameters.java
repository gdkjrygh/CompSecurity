// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import org.keyczar.exceptions.KeyczarException;
import org.keyczar.keyparams.AesKeyParameters;
import org.keyczar.keyparams.KeyParameters;

// Referenced classes of package org.keyczar:
//            DefaultKeyType, HmacKey

final class it> extends it>
    implements AesKeyParameters
{

    final DefaultKeyType this$0;

    public final HmacKey getHmacKey()
        throws KeyczarException
    {
        return HmacKey.generate(DefaultKeyType.HMAC_SHA1.applyDefaultParameters(null));
    }

    public (KeyParameters keyparameters)
    {
        this$0 = DefaultKeyType.this;
        super(DefaultKeyType.this, keyparameters);
    }
}

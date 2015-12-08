// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.keyparams;

import org.keyczar.HmacKey;
import org.keyczar.exceptions.KeyczarException;

// Referenced classes of package org.keyczar.keyparams:
//            KeyParameters

public interface AesKeyParameters
    extends KeyParameters
{

    public abstract HmacKey getHmacKey()
        throws KeyczarException;
}

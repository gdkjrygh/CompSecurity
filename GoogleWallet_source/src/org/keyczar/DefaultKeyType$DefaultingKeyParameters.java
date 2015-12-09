// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.util.List;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.keyparams.KeyParameters;

// Referenced classes of package org.keyczar:
//            DefaultKeyType

class baseParameters
    implements KeyParameters
{

    protected final KeyParameters baseParameters;
    final DefaultKeyType this$0;

    public final int getKeySize()
        throws KeyczarException
    {
        if (baseParameters == null || baseParameters.getKeySize() == -1)
        {
            return ((Integer)DefaultKeyType.access$100(DefaultKeyType.this).get(0)).intValue();
        } else
        {
            return baseParameters.getKeySize();
        }
    }

    public (KeyParameters keyparameters)
    {
        this$0 = DefaultKeyType.this;
        super();
        baseParameters = keyparameters;
    }
}

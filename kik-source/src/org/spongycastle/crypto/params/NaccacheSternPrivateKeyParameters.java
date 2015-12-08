// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import java.util.Vector;

// Referenced classes of package org.spongycastle.crypto.params:
//            NaccacheSternKeyParameters

public class NaccacheSternPrivateKeyParameters extends NaccacheSternKeyParameters
{

    private BigInteger c;
    private Vector d;

    public final BigInteger e()
    {
        return c;
    }

    public final Vector f()
    {
        return d;
    }
}

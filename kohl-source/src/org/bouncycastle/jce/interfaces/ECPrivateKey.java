// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

// Referenced classes of package org.bouncycastle.jce.interfaces:
//            ECKey

public interface ECPrivateKey
    extends ECKey, PrivateKey
{

    public abstract BigInteger getD();
}

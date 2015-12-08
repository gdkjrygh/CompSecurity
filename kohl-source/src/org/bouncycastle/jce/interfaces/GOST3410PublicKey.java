// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

// Referenced classes of package org.bouncycastle.jce.interfaces:
//            GOST3410Key

public interface GOST3410PublicKey
    extends GOST3410Key, PublicKey
{

    public abstract BigInteger getY();
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.interfaces;

import java.security.PublicKey;
import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.jce.interfaces:
//            ECKey

public interface ECPublicKey
    extends ECKey, PublicKey
{

    public abstract ECPoint getQ();
}

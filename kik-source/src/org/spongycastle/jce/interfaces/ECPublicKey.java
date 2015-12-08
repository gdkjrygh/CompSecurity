// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.interfaces;

import java.security.PublicKey;
import org.spongycastle.math.ec.ECPoint;

// Referenced classes of package org.spongycastle.jce.interfaces:
//            ECKey

public interface ECPublicKey
    extends PublicKey, ECKey
{

    public abstract ECPoint a();
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.digests.MD2Digest;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest, MD2

public static class gest extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
        throws CloneNotSupportedException
    {
        gest gest = (gest)super.clone();
        gest.digest = new MD2Digest((MD2Digest)digest);
        return gest;
    }

    public gest()
    {
        super(new MD2Digest());
    }
}

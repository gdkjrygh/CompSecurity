// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.digests.MD2Digest;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKMessageDigest

public static class t> extends JDKMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        t> t> = (t>)super.clone();
        t>.a = new MD2Digest((MD2Digest)a);
        return t>;
    }

    public ()
    {
        super(new MD2Digest());
    }
}

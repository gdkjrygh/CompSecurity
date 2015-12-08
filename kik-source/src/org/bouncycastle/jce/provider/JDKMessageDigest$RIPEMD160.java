// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.digests.RIPEMD160Digest;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKMessageDigest

public static class  extends JDKMessageDigest
    implements Cloneable
{

    public Object clone()
    {
          = ()super.clone();
        .a = new RIPEMD160Digest((RIPEMD160Digest)a);
        return ;
    }

    public ()
    {
        super(new RIPEMD160Digest());
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.MD4Digest;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, MD4

public static class gest extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        gest gest = (gest)super.clone();
        gest.a = new MD4Digest((MD4Digest)a);
        return gest;
    }

    public gest()
    {
        super(new MD4Digest());
    }
}

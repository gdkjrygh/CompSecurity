// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.GOST3411Digest;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, GOST3411

public static class <init> extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        <init> <init>1 = (<init>)super.clone();
        <init>1.a = new GOST3411Digest((GOST3411Digest)a);
        return <init>1;
    }

    public ()
    {
        super(new GOST3411Digest());
    }
}

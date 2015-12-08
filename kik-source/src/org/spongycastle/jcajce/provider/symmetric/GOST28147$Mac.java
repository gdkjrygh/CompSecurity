// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.macs.GOST28147Mac;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            GOST28147

public static class init> extends BaseMac
{

    public ()
    {
        super(new GOST28147Mac());
    }
}

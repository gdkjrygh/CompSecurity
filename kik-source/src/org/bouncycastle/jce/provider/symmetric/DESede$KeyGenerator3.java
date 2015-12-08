// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.jce.provider.JCEKeyGenerator;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            DESede

public static class  extends JCEKeyGenerator
{

    public ()
    {
        super("DESede3", 192, new DESedeKeyGenerator());
    }
}

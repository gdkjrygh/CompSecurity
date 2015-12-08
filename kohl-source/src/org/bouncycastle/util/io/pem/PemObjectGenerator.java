// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.io.pem;


// Referenced classes of package org.bouncycastle.util.io.pem:
//            PemGenerationException, PemObject

public interface PemObjectGenerator
{

    public abstract PemObject generate()
        throws PemGenerationException;
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

// Referenced classes of package org.spongycastle.crypto.params:
//            KeyParameter

public class AEADParameters
    implements CipherParameters
{

    private byte a[];
    private byte b[];
    private KeyParameter c;
    private int d;

    public final KeyParameter a()
    {
        return c;
    }

    public final int b()
    {
        return d;
    }

    public final byte[] c()
    {
        return a;
    }

    public final byte[] d()
    {
        return b;
    }
}

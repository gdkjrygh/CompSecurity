// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            KeyParameter

public class AEADParameters
    implements CipherParameters
{

    private byte a[];
    private byte b[];
    private KeyParameter c;
    private int d;

    public AEADParameters(KeyParameter keyparameter, int i, byte abyte0[], byte abyte1[])
    {
        c = keyparameter;
        b = abyte0;
        d = i;
        a = abyte1;
    }

    public byte[] getAssociatedText()
    {
        return a;
    }

    public KeyParameter getKey()
    {
        return c;
    }

    public int getMacSize()
    {
        return d;
    }

    public byte[] getNonce()
    {
        return b;
    }
}

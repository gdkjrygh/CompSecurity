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

    private byte associatedText[];
    private KeyParameter key;
    private int macSize;
    private byte nonce[];

    public AEADParameters(KeyParameter keyparameter, int i, byte abyte0[], byte abyte1[])
    {
        key = keyparameter;
        nonce = abyte0;
        macSize = i;
        associatedText = abyte1;
    }

    public byte[] getAssociatedText()
    {
        return associatedText;
    }

    public KeyParameter getKey()
    {
        return key;
    }

    public int getMacSize()
    {
        return macSize;
    }

    public byte[] getNonce()
    {
        return nonce;
    }
}

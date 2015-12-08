// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;


// Referenced classes of package org.bouncycastle.crypto.params:
//            DESParameters

public class DESedeParameters extends DESParameters
{

    public static final int DES_EDE_KEY_LENGTH = 24;

    public DESedeParameters(byte abyte0[])
    {
        super(abyte0);
        if (isWeakKey(abyte0, 0, abyte0.length))
        {
            throw new IllegalArgumentException("attempt to create weak DESede key");
        } else
        {
            return;
        }
    }

    public static boolean isWeakKey(byte abyte0[], int i)
    {
        return isWeakKey(abyte0, i, abyte0.length - i);
    }

    public static boolean isWeakKey(byte abyte0[], int i, int j)
    {
        for (; i < j; i += 8)
        {
            if (DESParameters.isWeakKey(abyte0, i))
            {
                return true;
            }
        }

        return false;
    }
}

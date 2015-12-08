// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.common.hce.emv.paypass;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Bytes;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.wallet.common.hce.emv.paypass:
//            CryptoUtils

public final class PayPassCrypto
{

    private static final byte DEFAULT_IV[] = new byte[8];
    private final Cipher mDesEdeCipher;
    private final SecretKey mDesEdeKdCvc3;
    private final byte mIvCvc3Track1[];
    private final byte mIvCvc3Track2[];
    private final byte mKdCvc3[];
    private final byte mPinIvCvc3Track1[];
    private final byte mPinIvCvc3Track2[];

    private PayPassCrypto(byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[], byte abyte4[], SecretKey secretkey, Cipher cipher)
    {
        mKdCvc3 = abyte0;
        mIvCvc3Track1 = abyte1;
        mIvCvc3Track2 = abyte2;
        mPinIvCvc3Track1 = abyte3;
        mPinIvCvc3Track2 = abyte4;
        mDesEdeKdCvc3 = secretkey;
        mDesEdeCipher = cipher;
    }

    private byte[] des3Encrypt(SecretKey secretkey, byte abyte0[])
        throws GeneralSecurityException
    {
        boolean flag;
        if (abyte0.length == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        mDesEdeCipher.init(1, secretkey);
        return mDesEdeCipher.doFinal(abyte0);
    }

    private byte[] getCvc3(byte abyte0[], int i, byte abyte1[])
        throws GeneralSecurityException
    {
        abyte0 = ByteBuffer.allocate(8).put(abyte1).put(abyte0).putShort((short)i);
        abyte0 = des3Encrypt(mDesEdeKdCvc3, abyte0.array());
        return Arrays.copyOfRange(abyte0, abyte0.length - 2, abyte0.length);
    }

    public static PayPassCrypto makeWithIvs(byte abyte0[], byte abyte1[], byte abyte2[])
        throws GeneralSecurityException
    {
        boolean flag;
        if (abyte0.length == 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (abyte1.length == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (abyte2.length == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new PayPassCrypto(abyte0, abyte1, abyte2, abyte1, abyte2, new SecretKeySpec(CryptoUtils.adjustParity(Bytes.concat(new byte[][] {
            abyte0, Arrays.copyOf(abyte0, 8)
        })), "DESede"), Cipher.getInstance("DESede/ECB/NoPadding"));
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof PayPassCrypto)
        {
            obj = (PayPassCrypto)obj;
            flag = flag1;
            if (Arrays.equals(mKdCvc3, ((PayPassCrypto) (obj)).mKdCvc3))
            {
                flag = flag1;
                if (Arrays.equals(mIvCvc3Track1, ((PayPassCrypto) (obj)).mIvCvc3Track1))
                {
                    flag = flag1;
                    if (Arrays.equals(mIvCvc3Track2, ((PayPassCrypto) (obj)).mIvCvc3Track2))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final byte[] getCvc3Track1(byte abyte0[], int i)
        throws GeneralSecurityException
    {
        return getCvc3(abyte0, i, mIvCvc3Track1);
    }

    public final byte[] getCvc3Track2(byte abyte0[], int i)
        throws GeneralSecurityException
    {
        return getCvc3(abyte0, i, mIvCvc3Track2);
    }

    public final byte[] getIvCvc3Track1()
    {
        return mIvCvc3Track1;
    }

    public final byte[] getIvCvc3Track2()
    {
        return mIvCvc3Track2;
    }

    public final byte[] getKdCvc3()
    {
        return mKdCvc3;
    }

    public final byte[] getPinCvc3Track1(byte abyte0[], int i)
        throws GeneralSecurityException
    {
        return getCvc3(abyte0, i, mPinIvCvc3Track1);
    }

    public final byte[] getPinCvc3Track2(byte abyte0[], int i)
        throws GeneralSecurityException
    {
        return getCvc3(abyte0, i, mPinIvCvc3Track2);
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Integer.valueOf(Arrays.hashCode(mKdCvc3)), Integer.valueOf(Arrays.hashCode(mIvCvc3Track1)), Integer.valueOf(Arrays.hashCode(mIvCvc3Track2))
        });
    }

}

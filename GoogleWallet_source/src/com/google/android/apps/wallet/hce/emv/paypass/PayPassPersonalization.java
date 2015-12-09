// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.emv.paypass;

import com.google.android.apps.wallet.hce.util.Hex;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.wallet.common.hce.emv.paypass.PayPassCrypto;
import java.util.Arrays;

public final class PayPassPersonalization
{
    public static final class Builder
    {

        private byte mAfl[];
        private byte mAip[];
        private byte mApplicationPriorityIndicator;
        private short mAvn;
        private boolean mHaveApplicationPriorityIndicator;
        private boolean mHaveAvn;
        private boolean mHaveIssuerCodeTableIndex;
        private boolean mHaveNatcTrack1;
        private boolean mHaveNatcTrack2;
        private byte mIssuerCodeTableIndex;
        private byte mNatcTrack1;
        private byte mNatcTrack2;
        private PayPassCrypto mPayPassCrypto;
        private byte mPcvc3Track1[];
        private byte mPcvc3Track2[];
        private byte mPunatcTrack1[];
        private byte mPunatcTrack2[];
        private byte mTrack1Data[];
        private byte mTrack2Data[];
        private byte mUdol[];

        public final PayPassPersonalization build()
        {
            Preconditions.checkState(mHaveApplicationPriorityIndicator);
            Preconditions.checkState(mHaveIssuerCodeTableIndex);
            Preconditions.checkNotNull(mAip);
            Preconditions.checkNotNull(mAfl);
            Preconditions.checkState(mHaveAvn);
            Preconditions.checkNotNull(mPcvc3Track1);
            Preconditions.checkNotNull(mPunatcTrack1);
            Preconditions.checkNotNull(mTrack1Data);
            Preconditions.checkState(mHaveNatcTrack1);
            Preconditions.checkNotNull(mPcvc3Track2);
            Preconditions.checkNotNull(mPunatcTrack2);
            Preconditions.checkNotNull(mTrack2Data);
            Preconditions.checkState(mHaveNatcTrack2);
            Preconditions.checkNotNull(mPayPassCrypto);
            return new PayPassPersonalization(mApplicationPriorityIndicator, mIssuerCodeTableIndex, mAip, mAfl, mAvn, mPcvc3Track1, mPunatcTrack1, mTrack1Data, mNatcTrack1, mPcvc3Track2, mPunatcTrack2, mTrack2Data, mNatcTrack2, mUdol, mPayPassCrypto);
        }

        public final Builder setAfl(byte abyte0[])
        {
            boolean flag;
            if (abyte0.length <= 252)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Unexpected AFL length: %s", new Object[] {
                Integer.valueOf(abyte0.length)
            });
            mAfl = abyte0;
            return this;
        }

        public final Builder setAip(byte abyte0[])
        {
            boolean flag;
            if (abyte0.length == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Unexpected AIP length: %s", new Object[] {
                Integer.valueOf(abyte0.length)
            });
            mAip = abyte0;
            return this;
        }

        public final Builder setApplicationPriorityIndicator(byte byte0)
        {
            mHaveApplicationPriorityIndicator = true;
            mApplicationPriorityIndicator = byte0;
            return this;
        }

        public final Builder setAvn(short word0)
        {
            mHaveAvn = true;
            mAvn = word0;
            return this;
        }

        public final Builder setIssuerCodeTableIndex(byte byte0)
        {
            mHaveIssuerCodeTableIndex = true;
            mIssuerCodeTableIndex = byte0;
            return this;
        }

        public final Builder setNatcTrack1(byte byte0)
        {
            mHaveNatcTrack1 = true;
            mNatcTrack1 = byte0;
            return this;
        }

        public final Builder setNatcTrack2(byte byte0)
        {
            mHaveNatcTrack2 = true;
            mNatcTrack2 = byte0;
            return this;
        }

        public final Builder setPayPassCrypto(PayPassCrypto paypasscrypto)
        {
            mPayPassCrypto = paypasscrypto;
            return this;
        }

        public final Builder setPcvc3Track1(byte abyte0[])
        {
            boolean flag;
            if (abyte0.length == 6)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Unexpected PCVC3(track1) length: %s", new Object[] {
                Integer.valueOf(abyte0.length)
            });
            mPcvc3Track1 = abyte0;
            return this;
        }

        public final Builder setPcvc3Track2(byte abyte0[])
        {
            boolean flag;
            if (abyte0.length == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Unexpected PCVC3(track2) length: %s", new Object[] {
                Integer.valueOf(abyte0.length)
            });
            mPcvc3Track2 = abyte0;
            return this;
        }

        public final Builder setPunatcTrack1(byte abyte0[])
        {
            boolean flag;
            if (abyte0.length == 6)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Unexpected PUNATC(track1) length: %s", new Object[] {
                Integer.valueOf(abyte0.length)
            });
            mPunatcTrack1 = abyte0;
            return this;
        }

        public final Builder setPunatcTrack2(byte abyte0[])
        {
            boolean flag;
            if (abyte0.length == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Unexpected PUNATC(track2) length: %s", new Object[] {
                Integer.valueOf(abyte0.length)
            });
            mPunatcTrack2 = abyte0;
            return this;
        }

        public final Builder setTrack1Data(byte abyte0[])
        {
            boolean flag;
            if (abyte0.length <= 76)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Unexpected track1 length: %s", new Object[] {
                Integer.valueOf(abyte0.length)
            });
            mTrack1Data = abyte0;
            return this;
        }

        public final Builder setTrack2Data(byte abyte0[])
        {
            boolean flag;
            if (abyte0.length <= 19)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Unexpected track2 length: %s", new Object[] {
                Integer.valueOf(abyte0.length)
            });
            mTrack2Data = abyte0;
            return this;
        }

        public final Builder setUdol(byte abyte0[])
        {
            boolean flag;
            if (abyte0.length <= 252)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Unexpected UDOL length: %s", new Object[] {
                Integer.valueOf(abyte0.length)
            });
            mUdol = abyte0;
            return this;
        }

        private Builder()
        {
        }

    }


    private final byte mAfl[];
    private final byte mAip[];
    private final byte mApplicationPriorityIndicator;
    private final short mAvn;
    private final byte mIssuerCodeTableIndex;
    private final byte mNatcTrack1;
    private final byte mNatcTrack2;
    private final PayPassCrypto mPayPassCrypto;
    private final byte mPcvc3Track1[];
    private final byte mPcvc3Track2[];
    private final byte mPunatcTrack1[];
    private final byte mPunatcTrack2[];
    private final byte mTrack1Data[];
    private final byte mTrack2Data[];
    private final byte mUdol[];

    private PayPassPersonalization(byte byte0, byte byte1, byte abyte0[], byte abyte1[], short word0, byte abyte2[], byte abyte3[], 
            byte abyte4[], byte byte2, byte abyte5[], byte abyte6[], byte abyte7[], byte byte3, byte abyte8[], 
            PayPassCrypto paypasscrypto)
    {
        mApplicationPriorityIndicator = byte0;
        mIssuerCodeTableIndex = byte1;
        mAip = abyte0;
        mAfl = abyte1;
        mAvn = word0;
        mPcvc3Track1 = abyte2;
        mPunatcTrack1 = abyte3;
        mTrack1Data = abyte4;
        mNatcTrack1 = byte2;
        mPcvc3Track2 = abyte5;
        mPunatcTrack2 = abyte6;
        mTrack2Data = abyte7;
        mNatcTrack2 = byte3;
        mUdol = abyte8;
        mPayPassCrypto = paypasscrypto;
    }


    private com.google.common.base.Objects.ToStringHelper allNonSensitiveFields()
    {
        return Objects.toStringHelper(this).add("applicationPriorityIndicator", mApplicationPriorityIndicator).add("issuerCodeTableIndex", mIssuerCodeTableIndex).add("aip", Hex.encode(mAip)).add("afl", Hex.encode(mAfl)).add("avn", mAvn).add("pcvc3Track1", Hex.encode(mPcvc3Track1)).add("punatcTrack1", Hex.encode(mPunatcTrack1)).add("natcTrack1", mNatcTrack1).add("pcvc3Track2", Hex.encode(mPcvc3Track2)).add("punatcTrack2", Hex.encode(mPunatcTrack2)).add("natcTrack2", mNatcTrack2).add("udol", Hex.encode(mUdol));
    }

    public static Builder newBuilder()
    {
        return new Builder();
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof PayPassPersonalization)
        {
            obj = (PayPassPersonalization)obj;
            flag = flag1;
            if (mApplicationPriorityIndicator == ((PayPassPersonalization) (obj)).mApplicationPriorityIndicator)
            {
                flag = flag1;
                if (mIssuerCodeTableIndex == ((PayPassPersonalization) (obj)).mIssuerCodeTableIndex)
                {
                    flag = flag1;
                    if (Arrays.equals(mAip, ((PayPassPersonalization) (obj)).mAip))
                    {
                        flag = flag1;
                        if (Arrays.equals(mAfl, ((PayPassPersonalization) (obj)).mAfl))
                        {
                            flag = flag1;
                            if (mAvn == ((PayPassPersonalization) (obj)).mAvn)
                            {
                                flag = flag1;
                                if (Arrays.equals(mPcvc3Track1, ((PayPassPersonalization) (obj)).mPcvc3Track1))
                                {
                                    flag = flag1;
                                    if (Arrays.equals(mPunatcTrack1, ((PayPassPersonalization) (obj)).mPunatcTrack1))
                                    {
                                        flag = flag1;
                                        if (Arrays.equals(mTrack1Data, ((PayPassPersonalization) (obj)).mTrack1Data))
                                        {
                                            flag = flag1;
                                            if (mNatcTrack1 == ((PayPassPersonalization) (obj)).mNatcTrack1)
                                            {
                                                flag = flag1;
                                                if (Arrays.equals(mPcvc3Track2, ((PayPassPersonalization) (obj)).mPcvc3Track2))
                                                {
                                                    flag = flag1;
                                                    if (Arrays.equals(mPunatcTrack2, ((PayPassPersonalization) (obj)).mPunatcTrack2))
                                                    {
                                                        flag = flag1;
                                                        if (Arrays.equals(mTrack2Data, ((PayPassPersonalization) (obj)).mTrack2Data))
                                                        {
                                                            flag = flag1;
                                                            if (mNatcTrack2 == ((PayPassPersonalization) (obj)).mNatcTrack2)
                                                            {
                                                                flag = flag1;
                                                                if (Arrays.equals(mUdol, ((PayPassPersonalization) (obj)).mUdol))
                                                                {
                                                                    flag = flag1;
                                                                    if (Objects.equal(mPayPassCrypto, ((PayPassPersonalization) (obj)).mPayPassCrypto))
                                                                    {
                                                                        flag = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final byte[] getAfl()
    {
        return mAfl;
    }

    public final byte[] getAip()
    {
        return mAip;
    }

    public final byte getApplicationPriorityIndicator()
    {
        return mApplicationPriorityIndicator;
    }

    public final short getAvn()
    {
        return mAvn;
    }

    public final byte getIssuerCodeTableIndex()
    {
        return mIssuerCodeTableIndex;
    }

    public final byte getNatcTrack1()
    {
        return mNatcTrack1;
    }

    public final byte getNatcTrack2()
    {
        return mNatcTrack2;
    }

    public final PayPassCrypto getPayPassCrypto()
    {
        return mPayPassCrypto;
    }

    public final byte[] getPcvc3Track1()
    {
        return mPcvc3Track1;
    }

    public final byte[] getPcvc3Track2()
    {
        return mPcvc3Track2;
    }

    public final byte[] getPunatcTrack1()
    {
        return mPunatcTrack1;
    }

    public final byte[] getPunatcTrack2()
    {
        return mPunatcTrack2;
    }

    public final byte[] getTrack1Data()
    {
        return mTrack1Data;
    }

    public final byte[] getTrack2Data()
    {
        return mTrack2Data;
    }

    public final byte[] getUdol()
    {
        return mUdol;
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Byte.valueOf(mApplicationPriorityIndicator), Byte.valueOf(mIssuerCodeTableIndex), Integer.valueOf(Arrays.hashCode(mAip)), Integer.valueOf(Arrays.hashCode(mAfl)), Short.valueOf(mAvn), Integer.valueOf(Arrays.hashCode(mPcvc3Track1)), Integer.valueOf(Arrays.hashCode(mPunatcTrack1)), Integer.valueOf(Arrays.hashCode(mTrack1Data)), Byte.valueOf(mNatcTrack1), Integer.valueOf(Arrays.hashCode(mPcvc3Track2)), 
            Integer.valueOf(Arrays.hashCode(mPunatcTrack2)), Integer.valueOf(Arrays.hashCode(mTrack2Data)), Byte.valueOf(mNatcTrack2), Integer.valueOf(Arrays.hashCode(mUdol)), mPayPassCrypto
        });
    }

    public final String toString()
    {
        return allNonSensitiveFields().add("track1Data", Hex.encode(mTrack1Data)).add("track2Data", Hex.encode(mTrack2Data)).add("kdcvc3", Hex.encode(mPayPassCrypto.getKdCvc3())).add("ivcvc3_track1", Hex.encode(mPayPassCrypto.getIvCvc3Track1())).add("ivcvc3_track2", Hex.encode(mPayPassCrypto.getIvCvc3Track2())).toString();
    }

    public final String toStringForLogging()
    {
        return allNonSensitiveFields().toString();
    }
}

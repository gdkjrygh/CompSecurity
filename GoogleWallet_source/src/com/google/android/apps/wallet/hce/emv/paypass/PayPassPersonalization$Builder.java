// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.emv.paypass;

import com.google.common.base.Preconditions;
import com.google.wallet.common.hce.emv.paypass.PayPassCrypto;

// Referenced classes of package com.google.android.apps.wallet.hce.emv.paypass:
//            PayPassPersonalization

public static final class <init>
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
        return new PayPassPersonalization(mApplicationPriorityIndicator, mIssuerCodeTableIndex, mAip, mAfl, mAvn, mPcvc3Track1, mPunatcTrack1, mTrack1Data, mNatcTrack1, mPcvc3Track2, mPunatcTrack2, mTrack2Data, mNatcTrack2, mUdol, mPayPassCrypto, null);
    }

    public final mPayPassCrypto setAfl(byte abyte0[])
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

    public final mAfl setAip(byte abyte0[])
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

    public final mAip setApplicationPriorityIndicator(byte byte0)
    {
        mHaveApplicationPriorityIndicator = true;
        mApplicationPriorityIndicator = byte0;
        return this;
    }

    public final mApplicationPriorityIndicator setAvn(short word0)
    {
        mHaveAvn = true;
        mAvn = word0;
        return this;
    }

    public final mAvn setIssuerCodeTableIndex(byte byte0)
    {
        mHaveIssuerCodeTableIndex = true;
        mIssuerCodeTableIndex = byte0;
        return this;
    }

    public final mIssuerCodeTableIndex setNatcTrack1(byte byte0)
    {
        mHaveNatcTrack1 = true;
        mNatcTrack1 = byte0;
        return this;
    }

    public final mNatcTrack1 setNatcTrack2(byte byte0)
    {
        mHaveNatcTrack2 = true;
        mNatcTrack2 = byte0;
        return this;
    }

    public final mNatcTrack2 setPayPassCrypto(PayPassCrypto paypasscrypto)
    {
        mPayPassCrypto = paypasscrypto;
        return this;
    }

    public final mPayPassCrypto setPcvc3Track1(byte abyte0[])
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

    public final mPcvc3Track1 setPcvc3Track2(byte abyte0[])
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

    public final mPcvc3Track2 setPunatcTrack1(byte abyte0[])
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

    public final mPunatcTrack1 setPunatcTrack2(byte abyte0[])
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

    public final mPunatcTrack2 setTrack1Data(byte abyte0[])
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

    public final mTrack1Data setTrack2Data(byte abyte0[])
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

    public final mTrack2Data setUdol(byte abyte0[])
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

    private ()
    {
    }

    ( )
    {
        this();
    }
}

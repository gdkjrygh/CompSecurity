// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.api;

import com.google.common.base.Objects;

public final class CdpId
{

    private final String mSubId;

    private CdpId(com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata)
    {
        mSubId = cdpiddata.subId;
    }

    public static boolean equals(com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata, com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata1)
    {
        return (new CdpId(cdpiddata)).equals(new CdpId(cdpiddata1));
    }

    public static com.google.wallet.proto.NanoWalletEntities.CdpIdData newCdpIdData(String s)
    {
        com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
        cdpiddata.subId = s;
        return cdpiddata;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof CdpId))
        {
            return false;
        } else
        {
            obj = (CdpId)obj;
            return Objects.equal(mSubId, ((CdpId) (obj)).mSubId);
        }
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            mSubId
        });
    }
}

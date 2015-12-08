// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.encryption.EncryptionService;
import com.google.android.apps.wallet.kyc.api.KycClient;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycEnterPersonalInfoFragment, KycUiModel

final class this._cls0
    implements Callable
{

    final KycEnterPersonalInfoFragment this$0;

    private com.google.wallet.proto.api.ponse call()
        throws Exception
    {
        com.google.wallet.proto.Fragment fragment;
        com.google.wallet.proto.api.uest uest;
        boolean flag;
        com.google.android.apps.wallet.encryption.sion sion = encryptionService.newSession();
        if (KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).hasMultipleAddresses())
        {
            fragment = (com.google.wallet.proto.leAddresses)KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getAddressList().get(KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getSelectedAddressIndex());
        } else
        {
            fragment = KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getAddress();
        }
        if (fragment._fld2 != null && fragment._fld2.isEmpty())
        {
            fragment._fld2 = null;
        }
        flag = KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).isRetryMode();
        uest = new com.google.wallet.proto.api.uest();
        if (!"US".equals(fragment.tryCode)) goto _L2; else goto _L1
_L1:
        uest.country = Integer.valueOf(1);
        uest.usKycData = createUsKycData(sion, fragment, flag);
_L4:
        return kycClient.verifyIdentity(uest);
_L2:
        if ("GB".equals(fragment.tryCode))
        {
            uest.country = Integer.valueOf(1);
            uest.gbKycData = createGbKycData(fragment, flag);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private com.google.wallet.proto.api.uest.GbKycData createGbKycData(com.google.wallet.proto.Fragment._cls7 _pcls7, boolean flag)
    {
        com.google.wallet.proto.api.uest.GbKycData gbkycdata = new com.google.wallet.proto.api.uest.GbKycData();
        gbkycdata.firstName = KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getFirstName();
        gbkycdata.lastName = KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getLastName();
        gbkycdata.address = _pcls7;
        gbkycdata.dateOfBirth = KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getDateOfBirth();
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        gbkycdata.kycStep = Integer.valueOf(byte0);
        return gbkycdata;
    }

    private com.google.wallet.proto.api.uest.UsKycData createUsKycData(com.google.android.apps.wallet.encryption.sion sion, com.google.wallet.proto.vice.EncryptionSession encryptionsession, boolean flag)
    {
        com.google.wallet.proto.api.uest.UsKycData uskycdata = new com.google.wallet.proto.api.uest.UsKycData();
        uskycdata.firstName = KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getFirstName();
        uskycdata.lastName = KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getLastName();
        uskycdata.address = encryptionsession;
        uskycdata.dateOfBirth = KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getDateOfBirth();
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        uskycdata.kycStep = Integer.valueOf(byte0);
        encryptionsession = new com.google.wallet.proto.dData();
        encryptionsession.sessionMaterial = (String)sion.getSessionMaterial();
        if (flag)
        {
            encryptionsession.payload = (String)sion.encrypt(KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getSsnFull9());
            uskycdata.fullSsn = encryptionsession;
            return uskycdata;
        } else
        {
            encryptionsession.payload = (String)sion.encrypt(KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).getSsnLast4());
            uskycdata.lastFourSsn = encryptionsession;
            return uskycdata;
        }
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    KycData()
    {
        this$0 = KycEnterPersonalInfoFragment.this;
        super();
    }
}

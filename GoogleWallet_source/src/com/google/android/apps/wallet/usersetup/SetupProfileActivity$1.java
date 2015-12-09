// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.config.cloudconfig.CloudServiceSpec;
import com.google.android.apps.wallet.globalresources.GlobalResourceManager;
import com.google.android.apps.wallet.usersetup.service.SetupWalletServiceClient;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SetupProfileActivity

final class this._cls0
    implements Callable
{

    final SetupProfileActivity this$0;

    private Boolean call()
        throws Exception
    {
        com.google.wallet.proto.api.pWalletResponse pwalletresponse;
        com.google.wallet.proto.api.pConfigurationResponse pconfigurationresponse;
        boolean flag;
        try
        {
            authUtil.getToken(accountName, serviceSpec.getOauthScope());
        }
        catch (UserRecoverableAuthException userrecoverableauthexception)
        {
            android.content.Intent intent = userrecoverableauthexception.getIntent();
            startActivityForResult(intent, 2);
            throw userrecoverableauthexception;
        }
        pwalletresponse = setupWalletServiceClient.preSetup(new com.google.wallet.proto.api.pWalletRequest());
        pconfigurationresponse = setupWalletServiceClient.getSetupConfiguration(new com.google.wallet.proto.api.pConfigurationRequest());
        SetupProfileActivity.access$002(SetupProfileActivity.this, SetupProfileActivity.access$100(SetupProfileActivity.this, pconfigurationresponse));
        SetupProfileActivity.access$202(SetupProfileActivity.this, SetupProfileActivity.access$300(SetupProfileActivity.this, pconfigurationresponse));
        globalResourceManager.update(pwalletresponse.globalResources, pwalletresponse.globalResourcesFingerprint.longValue());
        if (pwalletresponse.hasCdpProfile != null && pwalletresponse.hasCdpProfile.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ager()
    {
        this$0 = SetupProfileActivity.this;
        super();
    }
}

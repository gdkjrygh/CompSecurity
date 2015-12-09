// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.extension.shoprunner;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.data.http.shoprunner.ShopRunnerRestClient;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.android.sdk.extension.model.Partners;
import com.dominos.android.sdk.extension.model.ShopRunnerTag;
import com.dominos.android.sdk.extension.model.Shoprunner;
import org.a.a.a.l;
import org.androidannotations.api.c.p;

public class ShoprunnerManager extends Manager
{

    private ConfigurationManager mConfigurationManager;
    DominosPrefs_ mPrefs;
    ShopRunnerRestClient mShopRunnerAPI;
    private boolean mSrSessionStatus;
    private String mSrToken;

    public ShoprunnerManager()
    {
    }

    public String getName()
    {
        return "shoprunner_manager";
    }

    public String getSrToken()
    {
        return mSrToken;
    }

    public boolean isShopRunnerSession()
    {
        return mConfigurationManager.getApplicationConfiguration() != null && mConfigurationManager.getApplicationConfiguration().isShopRunnerEnabled() && mSrSessionStatus;
    }

    public void loadShopRunnerMember(LabsOrder labsorder)
    {
label0:
        {
label1:
            {
                if (!((String)mPrefs.shopRunnerMemberToken().c()).isEmpty() && mConfigurationManager.getApplicationConfiguration() != null)
                {
                    if (!mConfigurationManager.getApplicationConfiguration().isShopRunnerEnabled())
                    {
                        break label0;
                    }
                    String s = mShopRunnerAPI.validateMemberToken(mConfigurationManager.getApplicationConfiguration().getShopRunnerValidateMemberTokenUrl(), (String)mPrefs.shopRunnerMemberToken().c());
                    if (!l.b(s))
                    {
                        break label1;
                    }
                    setSrToken(s);
                    setShopRunnerSession(true, labsorder);
                }
                return;
            }
            mPrefs.shopRunnerMemberToken().d();
            setShopRunnerSession(false, labsorder);
            return;
        }
        mPrefs.shopRunnerMemberToken().d();
    }

    protected void onSessionSet()
    {
        mConfigurationManager = (ConfigurationManager)getSession().getManager("configuration_manager");
    }

    public void setShopRunnerSession(boolean flag, LabsOrder labsorder)
    {
        if (!flag)
        {
            labsorder.setPartner(null);
            setSrToken(null);
        } else
        {
            labsorder.setPartner(new Partners(new Shoprunner(new ShopRunnerTag(mSrToken))));
        }
        labsorder.clearPrices();
        mSrSessionStatus = flag;
    }

    public void setSrToken(String s)
    {
        mSrToken = s;
    }
}

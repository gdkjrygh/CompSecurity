// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.Activity;
import com.kohls.mcommerce.opal.common.po.CMSAdapterPO;
import com.kohls.mcommerce.opal.framework.vo.HelpContactUsVO;
import com.kohls.mcommerce.opal.framework.vo.LoyaltyHelpVO;
import com.kohls.mcommerce.opal.helper.adapter.AdapterHelper;
import com.kohls.mcommerce.opal.helper.adapter.AdapterProcedure;
import java.util.List;

public class CMSDataRetriver
{

    public static final int RESULT_OK = -1;
    private boolean isCMSAdapterAlreadyCalled;
    private Activity mContext;
    private HelpContactUsVO mHelpContactUsVO;
    private LoyaltyHelpVO mLoyaltyHelpVO;

    public CMSDataRetriver(Activity activity)
    {
        isCMSAdapterAlreadyCalled = false;
        mContext = activity;
    }

    public void getCMSAdapterValues()
    {
        if (isCMSAdapterAlreadyCalled)
        {
            return;
        } else
        {
            CMSAdapterPO cmsadapterpo = new CMSAdapterPO();
            cmsadapterpo.setCampaignName("miscCampaign");
            cmsadapterpo.setPageName("loyaltyhelp");
    /* block-local class not found */
    class CMSAdapterListener {}

            (new AdapterHelper(AdapterProcedure.CMS_LOYALTY_HELP, cmsadapterpo, new CMSAdapterListener(null))).performTask();
            cmsadapterpo = new CMSAdapterPO();
            cmsadapterpo.setCampaignName("miscCampaign");
            cmsadapterpo.setPageName("helpcontactus");
            (new AdapterHelper(AdapterProcedure.CMS_HELP_AND_CONTACT_US, cmsadapterpo, new CMSAdapterListener(null))).performTask();
            return;
        }
    }

    public HelpContactUsVO getHelpContactUsVO()
    {
        return mHelpContactUsVO;
    }

    public LoyaltyHelpVO getLoyaltyHelpVO(LoyaltyHelpVO loyaltyhelpvo)
    {
        return loyaltyhelpvo;
    }

    public com.kohls.mcommerce.opal.framework.vo.LoyaltyHelpVO.Properties getPropertiesFromLoyaltyHelpVO()
    {
        Object obj;
        Object obj1;
        if (mLoyaltyHelpVO == null)
        {
            return null;
        }
        obj1 = null;
        obj = obj1;
        if (mLoyaltyHelpVO.getPayload() == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        Object obj2 = mLoyaltyHelpVO.getPayload().getEntryResponse();
        obj = obj1;
        if (((List) (obj2)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj2 = (com.kohls.mcommerce.opal.framework.vo.LoyaltyHelpVO.EntryResponse)((List) (obj2)).get(0);
        obj = obj1;
        if (((com.kohls.mcommerce.opal.framework.vo.LoyaltyHelpVO.EntryResponse) (obj2)).getEntries() != null)
        {
            obj = obj1;
            try
            {
                if (((com.kohls.mcommerce.opal.framework.vo.LoyaltyHelpVO.EntryResponse) (obj2)).getEntries().size() > 0)
                {
                    obj = (com.kohls.mcommerce.opal.framework.vo.LoyaltyHelpVO.Entry)((com.kohls.mcommerce.opal.framework.vo.LoyaltyHelpVO.EntryResponse) (obj2)).getEntries().get(0);
                }
            }
            catch (NullPointerException nullpointerexception)
            {
                nullpointerexception.printStackTrace();
                nullpointerexception = obj1;
            }
        }
        if (obj != null)
        {
            return ((com.kohls.mcommerce.opal.framework.vo.LoyaltyHelpVO.Entry) (obj)).getProperties();
        } else
        {
            return null;
        }
    }

    public void setHelpContactUsVO(HelpContactUsVO helpcontactusvo)
    {
        mHelpContactUsVO = helpcontactusvo;
    }

    public void setLoyaltyHelpVO(LoyaltyHelpVO loyaltyhelpvo)
    {
        mLoyaltyHelpVO = loyaltyhelpvo;
    }



/*
    static boolean access$202(CMSDataRetriver cmsdataretriver, boolean flag)
    {
        cmsdataretriver.isCMSAdapterAlreadyCalled = flag;
        return flag;
    }

*/
}

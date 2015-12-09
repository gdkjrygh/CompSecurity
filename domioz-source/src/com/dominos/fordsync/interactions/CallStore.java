// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.locator.LocatorStore;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.fordsync.FordSyncSession;
import com.dominos.fordsync.StreetAbbreviationSanitizer;
import com.dominos.fordsync.service.AppLinkManager;
import com.dominos.fordsync.service.SyncPowerAPI;
import com.dominos.utils.AnalyticsUtil;
import java.util.List;
import org.c.d.d;

// Referenced classes of package com.dominos.fordsync.interactions:
//            YesNoInteraction

public class CallStore extends YesNoInteraction
{

    AnalyticsUtil mAnalyticsUtil;
    private UserProfileManager mProfileManager;

    public CallStore()
    {
    }

    private void callStore(String s)
    {
        if (StringHelper.isBlank(s))
        {
            mAppLinkManager.prompt(prompts.getPrompter("choice_yes").getPrompt("store_phone_not_set"), new Object[0]);
            return;
        } else
        {
            mAnalyticsUtil.postFordSyncCallStore();
            mAppLinkManager.callStore(s);
            return;
        }
    }

    private String findStoreId()
    {
        Object obj = mProfileManager.getEasyOrder();
        if (obj != null)
        {
            return ((LabsOrder) (obj)).getStoreId();
        }
        obj = mProfileManager.getOrderHistoryList();
        if (!d.isEmpty(((java.util.Collection) (obj))))
        {
            return ((LabsOrder)((List) (obj)).get(0)).getStoreId();
        }
        obj = mProfileManager.getCurrentUser().getAddressList();
        if (!d.isEmpty(((java.util.Collection) (obj))))
        {
            obj = (LabsAddress)((List) (obj)).get(0);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            obj = restApi.locateStore(((LabsAddress) (obj)).getStreetLine(), ((LabsAddress) (obj)).getCityRegionLine());
            if (obj != null)
            {
                return ((LocatorStore) (obj)).getStoreId();
            }
        }
        return null;
    }

    private String sanitizeStoreAddress(String s)
    {
        return StreetAbbreviationSanitizer.sanitize(StringHelper.substringBefore(s, ",").replace("\n", " in "));
    }

    void afterInject()
    {
        mProfileManager = (UserProfileManager)mFordSyncSession.getManager("user_manager");
    }

    public PromptModel getInitialPrompt()
    {
        if (mProfileManager.isAuthorizedUser())
        {
            mAnalyticsUtil.postFordSyncCallStoreInitialPrompt();
            return prompts.getPrompter("initial_prompt").getPrompt("no_saved_store");
        } else
        {
            return prompts.getPrompter("initial_prompt").getPrompt("no_remember_me");
        }
    }

    protected void no()
    {
        mAnalyticsUtil.postFordSyncCallStoreNo();
        super.no();
    }

    public void start()
    {
        if (mProfileManager.isAuthorizedUser())
        {
            Object obj = findStoreId();
            if (StringHelper.isNotBlank(((String) (obj))))
            {
                mAppLinkManager.show(prompts.getPrompter("lookup_store"), new Object[] {
                    obj
                });
                obj = restApi.getStoreProfile(((String) (obj)));
                if (obj != null)
                {
                    String s = sanitizeStoreAddress(((StoreProfile) (obj)).getAddressDescription());
                    mAppLinkManager.prompt(prompts.getPrompter("initial_prompt").getPrompt("saved_store"), new Object[] {
                        s
                    });
                    callStore(((StoreProfile) (obj)).getPhone());
                    return;
                }
            }
        }
        super.start();
    }

    protected void yes()
    {
        mAnalyticsUtil.postFordSyncCallStoreYes();
        if (!mAppLinkManager.canUseLocationServices())
        {
            mAppLinkManager.prompt(prompts.getPrompter("choice_yes").getPrompt("need_location_services"), new Object[0]);
            return;
        }
        mAppLinkManager.prompt(prompts.getPrompter("choice_yes").getPrompt("store_locator"), new Object[0]);
        LocatorStore locatorstore = restApi.locateNearestStore();
        if (locatorstore != null)
        {
            mAnalyticsUtil.postFordSyncCallStoreYesResponse();
            String s = sanitizeStoreAddress(locatorstore.getAddressDescription());
            mAppLinkManager.prompt(prompts.getPrompter("choice_yes").getPrompt("store_found"), new Object[] {
                s
            });
            callStore(locatorstore.getPhone());
            return;
        } else
        {
            mAppLinkManager.prompt(prompts.getPrompter("choice_yes").getPrompt("store_not_found"), new Object[0]);
            return;
        }
    }
}

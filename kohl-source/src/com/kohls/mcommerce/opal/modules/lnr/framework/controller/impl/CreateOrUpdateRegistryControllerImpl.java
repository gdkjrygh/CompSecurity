// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl;

import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.controller.impl.BaseControllerImpl;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithoutSlider;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.framework.vo.IValueObject;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.json.JSONParsingHelper;
import com.kohls.mcommerce.opal.helper.rest.RestHelper;
import com.kohls.mcommerce.opal.helper.rest.listener.IRestListener;
import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPO;
import com.kohls.mcommerce.opal.modules.lnr.common.util.LnRUtility;
import com.kohls.mcommerce.opal.modules.lnr.common.value.LnRConstantValues;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.ICreateOrUpdateRegistryController;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO;
import com.kohls.mcommerce.opal.modules.lnr.helper.list.listener.SkavaCallbackListener;
import com.kohls.mcommerce.opal.modules.lnr.helper.registry.RegistryCreateOrGetUserHelper;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class CreateOrUpdateRegistryControllerImpl extends BaseControllerImpl
    implements ICreateOrUpdateRegistryController, IRestListener
{

    private static final String IS_PUBLIC_REGISTRY = "isPublic";
    private static final String LOGGED_IN_USER = "loggedInUser";
    private static final String REGISTRY_BUDGET = "budget";
    private static final String REGISTRY_EVENT_DATE = "eventDate";
    private static final String REGISTRY_LIST_ID = "listId";
    private static final String REGISTRY_NAME = "registryName";
    private static final String REGISTRY_PROMO_CODE = "promoCode";
    private static final String REGISTRY_PROPERTIES = "registryProperties";
    private WeakReference mActivity;
    private WeakReference mFragment;
    private String mJSessionId;
    private long mListId;
    private SkavaCallbackListener mListener;
    private RegistryPO mRegistryPO;

    public CreateOrUpdateRegistryControllerImpl(WeakReference weakreference)
    {
        mFragment = weakreference;
    }

    public CreateOrUpdateRegistryControllerImpl(WeakReference weakreference, WeakReference weakreference1)
    {
        mFragment = weakreference;
        mActivity = weakreference1;
    }

    private void createOrUpdateRegistry(boolean flag)
    {
        (new RestHelper(this, com.kohls.mcommerce.opal.helper.rest.RestHelper.Method.GET, getCreateOrUpdateRegistryUrl(mRegistryPO, flag), null, null)).performTask();
    }

    private String getCreateOrUpdateRegistryUrl(RegistryPO registrypo, boolean flag)
    {
        com.kohls.mcommerce.opal.modules.lnr.common.po.LoggedInUser loggedinuser = LnRUtility.getLoggedInUser();
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(new BasicNameValuePair("registryName", registrypo.getRegistryName()));
        linkedlist.add(new BasicNameValuePair("isPublic", Boolean.toString(registrypo.isPublic())));
        linkedlist.add(new BasicNameValuePair("budget", (new StringBuilder()).append("").append(registrypo.getBudget()).toString()));
        linkedlist.add(new BasicNameValuePair("eventDate", registrypo.getEventDate()));
        linkedlist.add(new BasicNameValuePair("promoCode", registrypo.getPromoCode()));
        linkedlist.add(new BasicNameValuePair("registryProperties", UtilityMethods.createJsonFromModel(registrypo.getRegistryProperties())));
        linkedlist.add(new BasicNameValuePair("loggedInUser", UtilityMethods.createJsonFromModel(loggedinuser)));
        if (!flag)
        {
            linkedlist.add(new BasicNameValuePair("listId", (new StringBuilder()).append("").append(mListId).toString()));
        }
        registrypo = URLEncodedUtils.format(linkedlist, "utf-8");
        Logger.debug("paramString", registrypo);
        if (flag)
        {
            return (new StringBuilder()).append(LnRConstantValues.SKAVA_API_URL_REGISTRY).append("createRegistry").append(";jsessionId=").append(mJSessionId).append("?").append(registrypo).toString();
        } else
        {
            return (new StringBuilder()).append(LnRConstantValues.SKAVA_API_URL_REGISTRY).append("updateRegistrySettings").append(";jsessionId=").append(mJSessionId).append("?").append(registrypo).toString();
        }
    }

    private void updateFragmentUIOnFailure(Error error)
    {
        if (mFragment != null && mFragment.get() != null && ((BaseFragment)mFragment.get()).isVisible() && !((BaseFragment)mFragment.get()).isRemoving())
        {
            ((BaseFragment)mFragment.get()).notifyViewOnFailure(error);
        } else
        if (mActivity != null)
        {
            ((BaseActivityWithoutSlider)mActivity.get()).notifyViewOnFailure(error);
            return;
        }
    }

    public void createRegistry(RegistryPO registrypo)
    {
        mRegistryPO = registrypo;
    /* block-local class not found */
    class CallBackListener {}

        mListener = new CallBackListener(true);
        mJSessionId = LnRUtility.getRegistryJsessionId();
        registrypo = LnRUtility.getCreateOrUserDetailsForRegistry();
        if (mJSessionId != null && registrypo != null)
        {
            createOrUpdateRegistry(true);
            return;
        } else
        {
            (new RegistryCreateOrGetUserHelper(mListener)).execute();
            return;
        }
    }

    public Error getPayloadError(IValueObject ivalueobject)
    {
        return null;
    }

    public void onFailure(Error error)
    {
    }

    public void onSuccess(IValueObject ivalueobject)
    {
    }

    public void onSuccess(Object obj)
    {
        Logger.debug("CreateRegistryControllerImpl", (new StringBuilder()).append("data ==").append(obj).toString());
        if (obj == null || obj.equals("") || obj.toString().contains("<html>"))
        {
            updateFragmentUIOnFailure(new Error("-400", "Error retrieving information from server. Please try again after sometime.", null));
        } else
        {
    /* block-local class not found */
    class JSONParsingListener {}

            JSONParsingHelper jsonparsinghelper = new JSONParsingHelper(com/kohls/mcommerce/opal/modules/lnr/framework/vo/MyRegistryVO, new JSONParsingListener());
            if (jsonparsinghelper != null)
            {
                jsonparsinghelper.execute(new String[] {
                    obj.toString()
                });
                return;
            }
        }
    }

    public void updateRegistry(RegistryPO registrypo, long l)
    {
        mRegistryPO = registrypo;
        mListId = l;
        mListener = new CallBackListener(false);
        mJSessionId = LnRUtility.getRegistryJsessionId();
        registrypo = LnRUtility.getCreateOrUserDetailsForRegistry();
        if (mJSessionId != null && registrypo != null)
        {
            createOrUpdateRegistry(false);
            return;
        } else
        {
            (new RegistryCreateOrGetUserHelper(mListener)).execute();
            return;
        }
    }






/*
    static String access$402(CreateOrUpdateRegistryControllerImpl createorupdateregistrycontrollerimpl, String s)
    {
        createorupdateregistrycontrollerimpl.mJSessionId = s;
        return s;
    }

*/

}

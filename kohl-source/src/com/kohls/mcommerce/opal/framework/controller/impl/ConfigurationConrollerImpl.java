// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.controller.impl;

import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.framework.vo.ConfigurationVO;
import com.kohls.mcommerce.opal.framework.vo.IValueObject;
import com.kohls.mcommerce.opal.helper.adapter.listener.IAdapterListener;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;

// Referenced classes of package com.kohls.mcommerce.opal.framework.controller.impl:
//            BaseControllerImpl

public class ConfigurationConrollerImpl extends BaseControllerImpl
    implements IAdapterListener
{

    public ConfigurationConrollerImpl()
    {
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
        if (ivalueobject instanceof ConfigurationVO)
        {
            ivalueobject = (ConfigurationVO)ivalueobject;
            if (ivalueobject.getPayload() != null && ivalueobject.getPayload().getConfig() != null)
            {
                KohlsPhoneApplication.getInstance().getConfigurationUtils().updateConfigVOInPreferences(ivalueobject);
                ListenerManager.getInstance().broadcastListener("onlyreward");
            }
        }
    }
}

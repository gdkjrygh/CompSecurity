// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Partner;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.SignupFormUtils;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            OneFieldSettingBaseDialog

public class BusinessNameSettingDialog extends OneFieldSettingBaseDialog
{

    private static final String API_FIELD = "business_name";

    public BusinessNameSettingDialog()
    {
    }

    private Partner getPartner()
    {
        User user = MyUser.get();
        if (user == null)
        {
            return null;
        } else
        {
            return user.getPartner();
        }
    }

    protected String getDialogTitle()
    {
        return Resources.string(0x7f07021e);
    }

    protected String getFieldApiKey()
    {
        return "business_name";
    }

    protected String getHint()
    {
        return Resources.string(0x7f0700a6);
    }

    protected String getInitialValue()
    {
        Partner partner = getPartner();
        if (partner == null)
        {
            return "";
        } else
        {
            return partner.getBusinessName();
        }
    }

    protected String getInvalidToast()
    {
        return Resources.string(0x7f0700a7);
    }

    protected String getSuccessToast(String s)
    {
        return Resources.string(0x7f07021f, new Object[] {
            s
        });
    }

    protected boolean isValid(String s)
    {
        return SignupFormUtils.isBusinessNameValid(s);
    }

    protected void setModelValue(String s)
    {
        Partner partner = getPartner();
        if (partner == null)
        {
            return;
        } else
        {
            partner.setBusinessName(s);
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Partner;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            OneFieldSettingBaseDialog

public class ContactNameSettingDialog extends OneFieldSettingBaseDialog
{

    private static final String API_FIELD = "contact_name";

    public ContactNameSettingDialog()
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
        return Resources.string(0x7f070220);
    }

    protected String getFieldApiKey()
    {
        return "contact_name";
    }

    protected String getHint()
    {
        return Resources.string(0x7f070177);
    }

    protected String getInitialValue()
    {
        Partner partner = getPartner();
        if (partner == null)
        {
            return "";
        } else
        {
            return partner.getContactName();
        }
    }

    protected String getSuccessToast(String s)
    {
        return Resources.string(0x7f070221, new Object[] {
            s
        });
    }

    protected void setModelValue(String s)
    {
        Partner partner = getPartner();
        if (partner == null)
        {
            return;
        } else
        {
            partner.setContactName(s);
            return;
        }
    }
}

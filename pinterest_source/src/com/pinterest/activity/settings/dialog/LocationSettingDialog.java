// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            OneFieldSettingBaseDialog

public class LocationSettingDialog extends OneFieldSettingBaseDialog
{

    private static final String API_FIELD = "location";

    public LocationSettingDialog()
    {
    }

    protected String getDialogTitle()
    {
        return Resources.string(0x7f070344);
    }

    protected String getFieldApiKey()
    {
        return "location";
    }

    protected String getHint()
    {
        return Resources.string(0x7f070213);
    }

    protected String getInitialValue()
    {
        User user = MyUser.get();
        if (user == null)
        {
            return "";
        } else
        {
            return user.getLocation();
        }
    }

    protected String getSuccessToast(String s)
    {
        return Resources.string(0x7f0702f5);
    }

    protected void setModelValue(String s)
    {
        User user = MyUser.get();
        if (user == null)
        {
            return;
        } else
        {
            user.setLocation(s);
            return;
        }
    }
}

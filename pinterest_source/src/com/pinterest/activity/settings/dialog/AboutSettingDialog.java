// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            OneFieldSettingBaseDialog

public class AboutSettingDialog extends OneFieldSettingBaseDialog
{

    private static final int ABOUT_MAX_LENGTH = 160;
    private static final String API_FIELD = "about";

    public AboutSettingDialog()
    {
    }

    protected String getDialogTitle()
    {
        return Resources.string(0x7f070032);
    }

    protected String getFieldApiKey()
    {
        return "about";
    }

    protected String getHint()
    {
        return Resources.string(0x7f07060d);
    }

    protected String getInitialValue()
    {
        User user = MyUser.get();
        if (user == null)
        {
            return "";
        } else
        {
            return user.getAbout();
        }
    }

    protected String getInvalidToast()
    {
        return Resources.string(0x7f07002d);
    }

    protected String getSuccessToast(String s)
    {
        return Resources.string(0x7f0702f5);
    }

    protected boolean isValid(String s)
    {
        return s.length() <= 160;
    }

    protected void setModelValue(String s)
    {
        User user = MyUser.get();
        if (user == null)
        {
            return;
        } else
        {
            user.setAbout(s);
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.EditText;
import com.pinterest.activity.settings.dialog.OneFieldSettingBaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ElementType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEditWebsiteDialog extends OneFieldSettingBaseDialog
{

    private static final String API_FIELD = "website_url";

    public UserEditWebsiteDialog()
    {
    }

    protected String getDialogTitle()
    {
        if (Experiments.x())
        {
            return Resources.string(0x7f0705ee);
        } else
        {
            return Resources.string(0x7f07061f);
        }
    }

    protected String getFieldApiKey()
    {
        return "website_url";
    }

    protected String getHint()
    {
        return Resources.string(0x7f070041);
    }

    protected String getInitialValue()
    {
        User user = MyUser.get();
        if (user == null)
        {
            return "";
        } else
        {
            return user.getWebsite();
        }
    }

    protected String getInvalidToast()
    {
        return Resources.string(0x7f0702fb);
    }

    protected String getSuccessToast(String s)
    {
        return Resources.string(0x7f0702f5);
    }

    protected boolean isValid(String s)
    {
        return s != null && (Patterns.WEB_URL.matcher(s).matches() || s.isEmpty());
    }

    protected void logSubmitAction()
    {
        Pinalytics.a(ElementType.USER_URL_EDIT_BUTTON);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        _et.setInputType(16);
    }

    protected void setModelValue(String s)
    {
        User user = MyUser.get();
        if (user == null)
        {
            return;
        } else
        {
            user.setWebsite(s);
            return;
        }
    }
}

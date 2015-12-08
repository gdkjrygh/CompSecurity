// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.res.Resources;
import me.lyft.android.common.Strings;
import me.lyft.android.ui.Dialogs;

public class LandingDialogs extends Dialogs
{

    public LandingDialogs()
    {
    }

    public static me.lyft.android.ui.Dialogs.AlertDialog createDuplicateAccountErrorDialog(Resources resources, String s)
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("duplicate_account_error_dialog")).setTitle(resources.getString(0x7f0702fa));
        String s1 = s;
        if (Strings.isNullOrEmpty(s))
        {
            s1 = resources.getString(0x7f0702f9);
        }
        return alertdialog.setMessage(s1).addPositiveButton(resources.getString(0x7f0702f8));
    }

    public static me.lyft.android.ui.Dialogs.AlertDialog createDuplicatePhoneNumberErrorDialog(Resources resources, String s)
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("duplicate_phone_number_error_dialog")).setTitle(resources.getString(0x7f0702fc));
        String s1 = s;
        if (Strings.isNullOrEmpty(s))
        {
            s1 = resources.getString(0x7f0702fb);
        }
        return alertdialog.setMessage(s1).addPositiveButton(resources.getString(0x7f070212));
    }

    public static me.lyft.android.ui.Dialogs.AlertDialog createFacebookLoginErrorDialog(Resources resources)
    {
        return (new me.lyft.android.ui.Dialogs.AlertDialog("facebook_login_error_dialog")).setTitle(resources.getString(0x7f070181)).setMessage(resources.getString(0x7f0701fb)).addPositiveButton(resources.getString(0x7f070212));
    }

    public static me.lyft.android.ui.Dialogs.AlertDialog createSuspendedErrorDialog(Resources resources, String s)
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("suspended_error_dialog")).setTitle(resources.getString(0x7f070181));
        String s1 = s;
        if (Strings.isNullOrEmpty(s))
        {
            s1 = resources.getString(0x7f0702fd);
        }
        return alertdialog.setMessage(s1).addPositiveButton(resources.getString(0x7f070212));
    }
}

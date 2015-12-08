// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.ui.dialog.alert;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package com.google.android.apps.wallet.ui.dialog.alert:
//            AlertDialogFragment

public static class setIcon
{

    private final Bundle arguments = new Bundle();
    private final Class clazz;

    private setIcon setIcon(int i)
    {
        arguments.putInt("KEY_ICON_RES_ID", i);
        return this;
    }

    public final AlertDialogFragment build()
    {
        AlertDialogFragment alertdialogfragment;
        try
        {
            alertdialogfragment = (AlertDialogFragment)clazz.newInstance();
            alertdialogfragment.setArguments(arguments);
        }
        catch (Exception exception)
        {
            throw new RuntimeException("unable to instantiate, do you have a public empty constructor in your dialog fragment?", exception);
        }
        return alertdialogfragment;
    }

    public final Bundle getArguments()
    {
        return arguments;
    }

    public final arguments setCancelable(boolean flag)
    {
        arguments.putBoolean("KEY_CANCELABLE_BOOL", flag);
        return this;
    }

    public final arguments setDismissDialogOnClickNegativeButton()
    {
        arguments.putBoolean("KEY_DISMISS_DIALOG_ON_CLICK_NEGATIVE_BUTTON", true);
        return this;
    }

    public final arguments setDismissDialogOnClickPositiveButton()
    {
        arguments.putBoolean("KEY_DISMISS_DIALOG_ON_CLICK_POSITIVE_BUTTON", true);
        return this;
    }

    public final arguments setFinishActivityOnClick()
    {
        arguments.putBoolean("KEY_FINISH_ACTIVITY_ON_CLICK", true);
        return this;
    }

    public final arguments setFinishActivityOnDismiss()
    {
        arguments.putBoolean("KEY_FINISH_ACTIVITY_ON_DISMISS", true);
        return this;
    }

    public final arguments setLayout(int i)
    {
        arguments.putInt("KEY_LAYOUT_RES_ID", i);
        return this;
    }

    public final arguments setMessage(int i)
    {
        arguments.putInt("KEY_MESSAGE_RES_ID", i);
        return this;
    }

    public final arguments setMessage(String s)
    {
        arguments.putString("KEY_MESSAGE_STRING", s);
        return this;
    }

    public final arguments setNegativeButton(int i)
    {
        arguments.putInt("KEY_NEGATIVE_BUTTON_RES_ID", i);
        return this;
    }

    public final arguments setNegativeButton(String s)
    {
        arguments.putString("KEY_NEGATIVE_BUTTON_STRING", s);
        return this;
    }

    public final arguments setNegativeButtonActionUri(Uri uri)
    {
        arguments.putString("KEY_NEGATIVE_ACTION_URI", uri.toString());
        return this;
    }

    public final arguments setPositiveButton(int i)
    {
        if (i == 0)
        {
            arguments.remove("KEY_POSITIVE_BUTTON_RES_ID");
            return this;
        } else
        {
            arguments.putInt("KEY_POSITIVE_BUTTON_RES_ID", i);
            return this;
        }
    }

    public final arguments setPositiveButton(String s)
    {
        arguments.putString("KEY_POSITIVE_BUTTON_STRING", s);
        return this;
    }

    public final arguments setPositiveButtonActionUri(Uri uri)
    {
        arguments.putString("KEY_POSITIVE_ACTION_URI", uri.toString());
        return this;
    }

    public final arguments setPositiveButtonAnalyticsLinkTapField(String s)
    {
        arguments.putString("KEY_POSITIVE_ACTION_ANALYTICS_LINKTAP_FIELD", s);
        return this;
    }

    public final arguments setSingleChoiceItems(String as[], int i)
    {
        arguments.putStringArray("KEY_STRING_ARRAY", as);
        arguments.putInt("KEY_STRING_ARRAY_SELECTED", i);
        return this;
    }

    public final arguments setTitle(int i)
    {
        arguments.putInt("KEY_TITLE_RES_ID", i);
        return this;
    }

    public final arguments setTitle(String s)
    {
        arguments.putString("KEY_TITLE_STRING", s);
        return this;
    }

    public final arguments setTitleLayout(int i)
    {
        arguments.putInt("KEY_TITLE_LAYOUT_RES_ID", i);
        return this;
    }

    protected (Class class1)
    {
        clazz = class1;
        setPositiveButton(AlertDialogFragment.access$000());
        setDismissDialogOnClickPositiveButton();
        setIcon(0);
    }
}

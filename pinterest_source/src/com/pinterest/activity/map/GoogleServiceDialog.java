// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.map;

import com.google.android.gms.common.GooglePlayServicesUtil;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;

public class GoogleServiceDialog extends BaseDialog
{

    public static final String PLAY_PACKAGE = "com.google.android.gms";
    public static final String PLAY_SERVICE_URL = "market://details?id=com.google.android.gms";
    public static final String PLAY_STORE_DOMAIN = "http://play.google.com/store/apps/";
    private static Boolean _isPlayServiceDialogShown = null;

    public GoogleServiceDialog()
    {
        if (isPlayServicesSupportedButFailed())
        {
            setTitle(0x7f0702da);
            setMessage(0x7f0702db);
            setPositiveButton(0x7f0705c9, new _cls1());
            setNegativeButton(0x7f0703a9, new _cls2());
            return;
        } else
        {
            setTitle(0x7f0702dc);
            setMessage(0x7f0702dd);
            setPositiveButton(0x7f0703d3, new _cls3());
            return;
        }
    }

    public static boolean isPlayServiceDialogShown()
    {
        if (_isPlayServiceDialogShown == null)
        {
            _isPlayServiceDialogShown = Boolean.valueOf(Preferences.persisted().getBoolean("PREF_PLAY_SERVICE_DIALOG_SHOWN", false));
        }
        return _isPlayServiceDialogShown.booleanValue();
    }

    public static boolean isPlayServicesAvailable()
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(Application.context());
        return i == 0 || i == 2;
    }

    public static boolean isPlayServicesSupportedButFailed()
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(Application.context());
        return i == 2 || i == 4 || i == 3;
    }

    public static void setPlayServiceDialogShown()
    {
        _isPlayServiceDialogShown = Boolean.valueOf(true);
        Preferences.persisted().set("PREF_PLAY_SERVICE_DIALOG_SHOWN", true);
    }

    public static void show()
    {
        if (isPlayServiceDialogShown())
        {
            return;
        } else
        {
            Events.post(new DialogEvent(new GoogleServiceDialog()));
            return;
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final GoogleServiceDialog this$0;

        public void onClick(View view)
        {
            view = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms"));
            try
            {
                getActivity().startActivity(view);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.gms")));
            }
            dismiss();
        }

        _cls1()
        {
            this$0 = GoogleServiceDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final GoogleServiceDialog this$0;

        public void onClick(View view)
        {
            GoogleServiceDialog.setPlayServiceDialogShown();
            dismiss();
        }

        _cls2()
        {
            this$0 = GoogleServiceDialog.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final GoogleServiceDialog this$0;

        public void onClick(View view)
        {
            GoogleServiceDialog.setPlayServiceDialogShown();
            dismiss();
        }

        _cls3()
        {
            this$0 = GoogleServiceDialog.this;
            super();
        }
    }

}

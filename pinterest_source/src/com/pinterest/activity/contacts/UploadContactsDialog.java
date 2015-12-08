// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Colors;

public class UploadContactsDialog extends BaseDialog
{

    public static final String KEY = "upload_contact";
    public static final String SHOULD_SHOW_FB_DIALOG_NEXT = "shouldShowFbDialogNext";
    private boolean shouldShowFbDialogNext;

    public UploadContactsDialog()
    {
        shouldShowFbDialogNext = false;
        _key = "upload_contact";
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            shouldShowFbDialogNext = bundle.getBoolean("shouldShowFbDialogNext");
        }
    }

    private boolean isNextFBDialog()
    {
        return !shouldShowFbDialogNext && !MyUser.isConnectedToFacebook();
    }

    public void make(LayoutInflater layoutinflater)
    {
        setTitle(0x7f0705e4);
        setMessage(0x7f0705cf);
        setCancelable(false);
        setNegativeButton(0x7f0703a9, new _cls1());
        setPositiveButton(0x7f07057c, new _cls2());
        super.make(layoutinflater);
        positiveBt.setTextColor(Colors.RED);
        AnalyticsApi.b("permissions_contact_popup");
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UploadContactsDialog this$0;

        public void onClick(View view)
        {
            if (isNextFBDialog())
            {
                Events.post(new DialogEvent(new UploadFacebookFriendsDialog()));
            }
            Events.post(new UploadContactsUtil.UploadContactsCancelledEvent());
            AnalyticsApi.b("permissions_contact_reject");
            dismiss();
        }

        _cls1()
        {
            this$0 = UploadContactsDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final UploadContactsDialog this$0;

        public void onClick(final View baseActivity)
        {
            baseActivity = (BaseActivity)getActivity();
            class _cls1
                implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
            {

                final _cls2 this$1;
                final BaseActivity val$baseActivity;

                public void onRequestPermissionsResult(int i, String as[], int ai[])
                {
                    if (PermissionUtil.checkPermission(baseActivity, "android.permission.READ_CONTACTS"))
                    {
                        AnalyticsApi.b("permissions_contact_accept");
                        UploadContactsUtil.setStoreContacts(true);
                        if (isNextFBDialog())
                        {
                            Events.post(new DialogEvent(new UploadFacebookFriendsDialog()));
                        }
                        return;
                    } else
                    {
                        Events.post(new UploadContactsUtil.UploadContactsCancelledEvent());
                        return;
                    }
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    baseActivity = baseactivity;
                    super();
                }
            }

            _cls1 _lcls1 = new _cls1();
            PermissionUtil.checkPermissionAsync(baseActivity, new String[] {
                "android.permission.READ_CONTACTS"
            }, null, _lcls1);
            dismiss();
        }

        _cls2()
        {
            this$0 = UploadContactsDialog.this;
            super();
        }
    }

}

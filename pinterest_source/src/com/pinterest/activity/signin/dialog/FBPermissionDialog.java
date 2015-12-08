// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.os.Bundle;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.kit.application.Resources;
import java.util.ArrayList;

public class FBPermissionDialog extends BaseDialog
{

    public static final String KEY = "facebook_permission";
    public ArrayList missingPermissions;

    public FBPermissionDialog()
    {
    }

    public static FBPermissionDialog newInstance(ArrayList arraylist)
    {
        FBPermissionDialog fbpermissiondialog = new FBPermissionDialog();
        fbpermissiondialog.missingPermissions = arraylist;
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("com.pinterest.EXTRA_FB_PERMISSIONS", arraylist);
        fbpermissiondialog.setArguments(bundle);
        return fbpermissiondialog;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            missingPermissions = bundle.getStringArrayList("com.pinterest.EXTRA_FB_PERMISSIONS");
        }
        if (missingPermissions == null)
        {
            return;
        } else
        {
            setTitle(0x7f070288);
            setMessage(Resources.string(0x7f070289));
            setPositiveButton(0x7f070397, new _cls1());
            setNegativeButton(0x7f0700af, null);
            return;
        }
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final FBPermissionDialog this$0;

        public void onClick(View view)
        {
            view = Session.getActiveSession();
            if (view == null || !view.isOpened())
            {
                return;
            } else
            {
                view.requestNewReadPermissions(new com.facebook.Session.NewPermissionsRequest(getActivity(), view.getDeclinedPermissions()));
                dismiss();
                return;
            }
        }

        _cls1()
        {
            this$0 = FBPermissionDialog.this;
            super();
        }
    }

}

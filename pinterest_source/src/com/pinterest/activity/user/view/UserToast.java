// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.net.Uri;
import android.view.View;
import com.pinterest.activity.task.toast.BaseToast;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.kit.application.Resources;

public class UserToast extends BaseToast
{

    private String _fullName;
    private final String _imageUri;
    private final String _toastTitle;

    public UserToast(String s, String s1, String s2)
    {
        _toastTitle = s;
        _fullName = s1;
        _imageUri = s2;
    }

    public View getView(ToastContainer toastcontainer)
    {
        setMessage(_toastTitle);
        setSecondaryMessage(Resources.string(0x7f070599, new Object[] {
            _fullName
        }));
        if (_imageUri != null)
        {
            setImageUri(Uri.parse(_imageUri));
        } else
        {
            setImageResource(0x7f020182);
        }
        setLayoutGravity(81);
        return super.getView(toastcontainer);
    }
}

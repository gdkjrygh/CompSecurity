// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;

public class RemoveCollaboratorDialog extends BaseDialog
{

    CheckBox _blockCb;
    TextView _blockDesc;
    private View _container;
    private User _invitedUser;

    public RemoveCollaboratorDialog()
    {
    }

    public static RemoveCollaboratorDialog newInstance(String s)
    {
        RemoveCollaboratorDialog removecollaboratordialog = new RemoveCollaboratorDialog();
        if (!TextUtils.isEmpty(s))
        {
            Bundle bundle = new Bundle();
            bundle.putString("com.pinterest.EXTRA_USER_ID", s);
            removecollaboratordialog.setArguments(bundle);
        }
        return removecollaboratordialog;
    }

    public void init()
    {
        ButterKnife.a(this, _container);
    }

    public boolean isBlockedCbChecked()
    {
        return _blockCb.isChecked();
    }

    public void make(LayoutInflater layoutinflater)
    {
        if (getContext() == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(getActivity()).inflate(0x7f030069, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (_invitedUser == null)
        {
            dismiss();
            return;
        } else
        {
            bundle = _invitedUser.getFirstName();
            setTitle(Resources.string(0x7f070496, new Object[] {
                _invitedUser.getFullName()
            }));
            setSubTitle(0x7f070495);
            _blockCb.setText(Resources.string(0x7f070073, new Object[] {
                bundle
            }));
            _blockDesc.setText(Resources.string(0x7f070074, new Object[] {
                bundle
            }));
            setNegativeButton(0x7f0700af, null);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null && bundle.getString("com.pinterest.EXTRA_USER_ID") != null)
        {
            _invitedUser = ModelHelper.getUser(bundle.getString("com.pinterest.EXTRA_USER_ID"));
        }
    }
}

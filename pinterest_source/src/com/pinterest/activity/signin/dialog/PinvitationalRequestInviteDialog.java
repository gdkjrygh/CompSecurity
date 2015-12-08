// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.pinterest.activity.task.dialog.BaseDialog;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            PinvitationalRequestInviteDialogView

public class PinvitationalRequestInviteDialog extends BaseDialog
{

    public static final String KEY = "pinvitational_request_invite";
    private PinvitationalRequestInviteDialogView _contentVw;
    private String _prefilledEmailAddress;

    public PinvitationalRequestInviteDialog(String s)
    {
        _key = "pinvitational_request_invite";
        _prefilledEmailAddress = s;
    }

    public void make(LayoutInflater layoutinflater)
    {
        _contentVw = new PinvitationalRequestInviteDialogView(getContext(), this, _prefilledEmailAddress);
        _contentVw.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        setContent(_contentVw, 0);
        super.make(layoutinflater);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }
}

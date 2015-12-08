// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.ApiResponse;
import com.pinterest.kit.application.Resources;
import org.apache.commons.lang3.StringUtils;

public class PinvitationalRequestInviteFailureDialog extends BaseDialog
{

    public PinvitationalRequestInviteFailureDialog()
    {
    }

    public PinvitationalRequestInviteFailureDialog(final String attemptedEmailAddress, ApiResponse apiresponse)
    {
        final boolean emailConflicted;
        switch (apiresponse.getCode())
        {
        default:
            emailConflicted = false;
            break;

        case 31: // '\037'
            break MISSING_BLOCK_LABEL_101;
        }
_L1:
        int i;
        if (emailConflicted)
        {
            apiresponse = Resources.string(0x7f07042a);
        } else
        {
            apiresponse = apiresponse.getMessageDisplay();
        }
        if (StringUtils.isEmpty(apiresponse))
        {
            apiresponse = Resources.string(0x7f070350);
        }
        if (emailConflicted)
        {
            i = 0x7f070563;
        } else
        {
            i = 0x7f0703d7;
        }
        setTitle(Resources.string(i));
        setMessage(apiresponse);
        setPositiveButton(0x7f0705a1, new _cls1());
        setNegativeButton(0x7f0700af, null);
        return;
        emailConflicted = true;
          goto _L1
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinvitationalRequestInviteFailureDialog this$0;
        final String val$attemptedEmailAddress;
        final boolean val$emailConflicted;

        public void onClick(View view)
        {
            if (emailConflicted)
            {
                view = null;
            } else
            {
                view = attemptedEmailAddress;
            }
            DialogHelper.goPinvitationalRequestInvite(view);
        }

        _cls1()
        {
            this$0 = PinvitationalRequestInviteFailureDialog.this;
            emailConflicted = flag;
            attemptedEmailAddress = s;
            super();
        }
    }

}

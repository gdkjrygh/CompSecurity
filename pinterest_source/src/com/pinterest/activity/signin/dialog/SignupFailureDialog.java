// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.ApiResponse;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonObject;
import org.apache.commons.lang3.StringUtils;

public class SignupFailureDialog extends BaseDialog
{

    public SignupFailureDialog()
    {
    }

    public SignupFailureDialog(Throwable throwable, ApiResponse apiresponse, final int type, final String inviteCode)
    {
        final boolean goRequestInvite;
        goRequestInvite = false;
        super();
        throwable = apiresponse.getMessageDisplay();
        apiresponse.getCode();
        JVM INSTR lookupswitch 6: default 76
    //                   1: 172
    //                   90: 164
    //                   91: 146
    //                   92: 155
    //                   802: 279
    //                   804: 279;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_279;
_L7:
        if (StringUtils.isEmpty(throwable))
        {
            throwable = Resources.string(0x7f070350);
        }
        int i;
        if (goRequestInvite)
        {
            i = 0x7f0703d7;
        } else
        {
            i = 0x7f07004d;
        }
        setTitle(i);
        setMessage(throwable);
        if (goRequestInvite)
        {
            i = 0x7f07042f;
        } else
        {
            i = 0x7f0705a1;
        }
        setPositiveButton(i, new _cls1());
        setNegativeButton(0x7f0700af, null);
        return;
_L4:
        throwable = Resources.string(0x7f070532);
          goto _L7
_L5:
        throwable = Resources.string(0x7f070550);
          goto _L7
_L3:
        throwable = apiresponse.getMessageDetail();
          goto _L7
_L2:
        if (apiresponse.getData() instanceof PinterestJsonObject)
        {
            apiresponse = (PinterestJsonObject)apiresponse.getData();
            try
            {
                apiresponse = apiresponse.a("param_name", "");
            }
            // Misplaced declaration of an exception variable
            catch (ApiResponse apiresponse)
            {
                PLog.error(apiresponse, "exception occurred", new Object[0]);
                apiresponse = null;
            }
            if (StringUtils.isNotEmpty(apiresponse))
            {
                if (apiresponse.equals("email"))
                {
                    throwable = Resources.string(0x7f070531);
                } else
                if (apiresponse.equals("username"))
                {
                    throwable = Resources.string(0x7f07054e);
                } else
                if (apiresponse.equals("password"))
                {
                    throwable = Resources.string(0x7f070541);
                }
            }
        }
          goto _L7
        goRequestInvite = true;
          goto _L7
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SignupFailureDialog this$0;
        final BaseDialog val$dialog;
        final boolean val$goRequestInvite;
        final String val$inviteCode;
        final int val$type;

        public void onClick(View view)
        {
            if (goRequestInvite)
            {
                dialog.dismiss();
                FragmentHelper.replaceFragment(getActivity(), new PinvitationalInviteRequestFragment(), false, com.pinterest.activity.FragmentHelper.Animation.SLIDE);
                return;
            }
            if (type == 1)
            {
                Events.post(new DialogEvent(new EmailSignupDialog(inviteCode)));
                return;
            }
            if (type == 6)
            {
                Events.post(new DialogEvent(new BusinessSignupDialog(null, inviteCode)));
                return;
            } else
            {
                Events.post(new DialogEvent(new SignupDialog()));
                return;
            }
        }

        _cls1()
        {
            this$0 = SignupFailureDialog.this;
            goRequestInvite = flag;
            dialog = basedialog;
            type = i;
            inviteCode = s;
            super();
        }
    }

}

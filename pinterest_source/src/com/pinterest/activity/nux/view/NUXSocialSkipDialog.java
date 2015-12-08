// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.os.Bundle;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.kit.application.Resources;

public class NUXSocialSkipDialog extends BaseDialog
{

    private int _currentFragmentType;

    public NUXSocialSkipDialog()
    {
        _currentFragmentType = 2;
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            _currentFragmentType = bundle.getInt("socialType", 2);
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        String s1 = Resources.string(0x7f0703ca);
        String s;
        if (_currentFragmentType == 0)
        {
            s = Resources.string(0x7f0705a4);
        } else
        {
            s = Resources.string(0x7f070280);
        }
        setTitle(String.format(s1, new Object[] {
            s
        }));
        s1 = Resources.string(0x7f0703c8);
        if (_currentFragmentType == 0)
        {
            s = Resources.string(0x7f0705a4);
        } else
        {
            s = Resources.string(0x7f070280);
        }
        setMessage(String.format(s1, new Object[] {
            s
        }));
        s1 = Resources.string(0x7f0703c9);
        if (_currentFragmentType == 0)
        {
            s = Resources.string(0x7f0705a4);
        } else
        {
            s = Resources.string(0x7f070280);
        }
        setPositiveButton(String.format(s1, new Object[] {
            s
        }), new _cls1());
        super.onActivityCreated(bundle);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final NUXSocialSkipDialog this$0;

        public void onClick(View view)
        {
            if (_currentFragmentType != 0) goto _L2; else goto _L1
_L1:
            if (MyUser.isConnectedToTwitter()) goto _L4; else goto _L3
_L3:
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.TWITTER));
_L6:
            return;
_L4:
            Events.post(new com.pinterest.activity.nux.fragment.NUXSocialPickerFragment.SocialConnectedEvent(1));
            return;
_L2:
            if (_currentFragmentType == 1)
            {
                if (!MyUser.isConnectedToFacebook())
                {
                    Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK));
                    return;
                } else
                {
                    Events.post(new com.pinterest.activity.nux.fragment.NUXSocialPickerFragment.SocialConnectedEvent(0));
                    return;
                }
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        _cls1()
        {
            this$0 = NUXSocialSkipDialog.this;
            super();
        }
    }

}

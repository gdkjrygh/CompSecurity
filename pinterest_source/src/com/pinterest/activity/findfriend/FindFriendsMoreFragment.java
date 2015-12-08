// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.findfriend.util.InviteButtonDecorator;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.ui.text.PButton;

public class FindFriendsMoreFragment extends BaseFragment
{

    PButton _emailBtn;
    PButton _facebookBtn;
    PButton _lineBtn;
    PButton _smsBtn;
    PButton _whatsappBtn;

    public FindFriendsMoreFragment()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300c7;
    }

    public void onViewCreated(View view, final Bundle apiTag)
    {
        super.onViewCreated(view, apiTag);
        ButterKnife.a(this, view);
        apiTag = getApiTag();
        (new InviteButtonDecorator(view.getContext(), apiTag)).setIconId(0x7f0201b5).setOnClickListener(new _cls1()).decorate(_smsBtn);
        (new InviteButtonDecorator(view.getContext(), apiTag)).forPackage("com.google.android.gm").setInviteCodeType("register_invite_email_app").setIconId(0x7f0201af).setShowInviteTitle(true).useDefaultOnClickListener().decorate(_emailBtn);
        (new InviteButtonDecorator(view.getContext(), apiTag)).forPackage("com.facebook.orca").setInviteCodeType("register_invite_fb_messenger").setIconId(0x7f0201b1).useDefaultOnClickListener().decorate(_facebookBtn);
        (new InviteButtonDecorator(view.getContext(), apiTag)).forPackage("com.whatsapp").setInviteCodeType("register_invite_whatsapp").setIconId(0x7f0201b8).useDefaultOnClickListener().decorate(_whatsappBtn);
        (new InviteButtonDecorator(view.getContext(), apiTag)).forPackage("jp.naver.line.android").setInviteCodeType("register_invite_line").setIconId(0x7f0201b3).useDefaultOnClickListener().decorate(_lineBtn);
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final FindFriendsMoreFragment this$0;
        final String val$apiTag;

        public void onClick(View view)
        {
            _smsBtn.disableUntilAfter(500);
            InviteUtil.inviteUserSMS(getActivity(), "", "", apiTag);
        }

        _cls1()
        {
            this$0 = FindFriendsMoreFragment.this;
            apiTag = s;
            super();
        }
    }

}

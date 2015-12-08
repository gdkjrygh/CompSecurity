// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.util;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.pinterest.base.SocialUtils;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PButton;

public class InviteButtonDecorator
{

    public static final int CLICK_COOLDOWN_IN_MILLIS = 500;
    private String _apiTag;
    private Context _context;
    private int _iconId;
    private String _inviteCodeType;
    private String _inviteMessage;
    private android.view.View.OnClickListener _onClickListener;
    private String _packageName;
    private boolean _showInviteTitle;

    public InviteButtonDecorator(Context context, String s)
    {
        _context = context;
        _apiTag = s;
        _inviteMessage = _context.getString(0x7f070304);
    }

    private Intent getInviteIntent()
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        if (_showInviteTitle)
        {
            intent.putExtra("android.intent.extra.SUBJECT", _context.getString(0x7f070305));
        }
        intent.putExtra("android.intent.extra.TEXT", _inviteMessage);
        intent.setPackage(_packageName);
        return intent;
    }

    private boolean isAppInstalled()
    {
        return _packageName == null || SocialUtils.isAppInstalled(_packageName);
    }

    public void decorate(PButton pbutton)
    {
        ViewHelper.setVisibility(pbutton, isAppInstalled());
        if (!isAppInstalled())
        {
            return;
        } else
        {
            pbutton.setIconTint(0x7f0e00bf);
            pbutton.setCompoundDrawablesWithIntrinsicBounds(_context.getResources().getDrawable(_iconId), null, null, null);
            pbutton.setOnClickListener(_onClickListener);
            return;
        }
    }

    public InviteButtonDecorator forPackage(String s)
    {
        _packageName = s;
        return this;
    }

    public InviteButtonDecorator setIconId(int i)
    {
        _iconId = i;
        return this;
    }

    public InviteButtonDecorator setInviteCodeType(String s)
    {
        _inviteCodeType = s;
        return this;
    }

    public InviteButtonDecorator setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        _onClickListener = onclicklistener;
        return this;
    }

    public InviteButtonDecorator setShowInviteTitle(boolean flag)
    {
        _showInviteTitle = flag;
        return this;
    }

    public InviteButtonDecorator useDefaultOnClickListener()
    {
        _onClickListener = new _cls1();
        return this;
    }


/*
    static String access$002(InviteButtonDecorator invitebuttondecorator, String s)
    {
        invitebuttondecorator._inviteMessage = s;
        return s;
    }

*/





    private class _cls1
        implements android.view.View.OnClickListener
    {

        final InviteButtonDecorator this$0;

        public void onClick(View view)
        {
            ((PButton)view).disableUntilAfter(500);
            class _cls1 extends BaseApiResponseHandler
            {

                final _cls1 this$1;

                public void onFailure(Throwable throwable, ApiResponse apiresponse)
                {
                    Application.showToast(apiresponse.getMessage());
                    _context.startActivity(getInviteIntent());
                }

                public void onSuccess(ApiResponse apiresponse)
                {
                    apiresponse = ((ApiResponse) (apiresponse.getData()));
                    if (!(apiresponse instanceof PinterestJsonObject))
                    {
                        break MISSING_BLOCK_LABEL_95;
                    }
                    apiresponse = (PinterestJsonObject)apiresponse;
                    _inviteMessage = apiresponse.a("message", "");
                    apiresponse = apiresponse.a("invite_code", "");
                    _context.startActivity(getInviteIntent());
                    UserApi.a(_inviteCodeType, apiresponse, InviteUtil.getInviteSource(), _apiTag);
                    return;
                    apiresponse;
                    PLog.error(apiresponse, "app not existed", new Object[0]);
                    return;
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            UserApi.k("", new _cls1(), _apiTag);
        }

        _cls1()
        {
            this$0 = InviteButtonDecorator.this;
            super();
        }
    }

}

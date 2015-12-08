// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.widget.Button;
import com.dominos.MobileSession_;
import com.dominos.activities.UserLoginActivity_;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.core.user.UserProfileManager;

public class LoginButton extends Button
{

    private Context mContext;

    public LoginButton(Context context)
    {
        super(context);
        mContext = context;
    }

    public LoginButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mContext = context;
    }

    public LoginButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mContext = context;
    }

    private Session getSession()
    {
        return MobileSession_.getInstance_(mContext);
    }

    private void routeToLogin()
    {
        UserProfileManager userprofilemanager = (UserProfileManager)getSession().getManager("user_manager");
        Intent intent = new Intent(getContext(), com/dominos/activities/UserLoginActivity_);
        if (userprofilemanager.isRemembered())
        {
            intent.putExtra("confirm-login", true);
        } else
        {
            intent.putExtra("return-to-caller", true);
        }
        getContext().startActivity(intent);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        setBackgroundResource(0x7f020073);
        if (!isInEditMode())
        {
            updateButton();
        }
    }

    public void updateButton()
    {
        final UserProfileManager profileManager = (UserProfileManager)getSession().getManager("user_manager");
        if (profileManager.getCurrentUser() != null || profileManager.isRemembered())
        {
            setText(getContext().getString(0x7f080196));
        } else
        {
            setText(getContext().getString(0x7f080197));
        }
        if (profileManager.getAuthorizationCode() != null)
        {
            setText(getContext().getString(0x7f080196));
            setOnClickListener(new _cls1());
            return;
        } else
        {
            setOnClickListener(new _cls2());
            return;
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoginButton this$0;
        final UserProfileManager val$profileManager;

        public void onClick(View view)
        {
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
            if (profileManager.isSessionTimedOut())
            {
                profileManager.clearCurrentUser();
                routeToLogin();
                return;
            } else
            {
                view = new Intent(getContext(), com/dominos/activities/PizzaProfileActivity_);
                getContext().startActivity(view);
                return;
            }
        }

        _cls1()
        {
            this$0 = LoginButton.this;
            profileManager = userprofilemanager;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LoginButton this$0;

        public void onClick(View view)
        {
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
            routeToLogin();
        }

        _cls2()
        {
            this$0 = LoginButton.this;
            super();
        }
    }

}

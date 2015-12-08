// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.pinterest.activity.report.ReportHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import org.apache.commons.lang3.BooleanUtils;

public class UserAboutFlagView extends RelativeLayout
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private android.view.View.OnClickListener _onClick;
    private Button _reportBt;
    private User _user;

    public UserAboutFlagView(Context context)
    {
        this(context, null);
    }

    public UserAboutFlagView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _onClick = new _cls1();
        _eventsSubscriber = new _cls2();
        init();
    }

    public UserAboutFlagView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _onClick = new _cls1();
        _eventsSubscriber = new _cls2();
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f030207, this);
        _reportBt = (Button)findViewById(0x7f0f04d4);
        _reportBt.setOnClickListener(_onClick);
    }

    private void showBlockDialog()
    {
        if (_user == null)
        {
            return;
        } else
        {
            ReportHelper.showBlockDialog((Activity)getContext(), _user);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/api/model/User$UpdateEvent, new Class[0]);
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber);
        super.onDetachedFromWindow();
    }

    public void updateUi(User user)
    {
        _user = user;
        if (_user != null)
        {
            if (MyUser.isUserMe(user))
            {
                _reportBt.setVisibility(8);
                return;
            }
            if (user.getFirstName() != null)
            {
                int i;
                if (BooleanUtils.isTrue(_user.getBlocked()))
                {
                    i = 0x7f0705aa;
                } else
                {
                    i = 0x7f070077;
                }
                user = String.format(getContext().getString(i), new Object[] {
                    _user.getFirstName()
                });
                _reportBt.setText(user);
                _reportBt.setVisibility(0);
                return;
            }
        }
    }




/*
    static User access$102(UserAboutFlagView useraboutflagview, User user)
    {
        useraboutflagview._user = user;
        return user;
    }

*/

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UserAboutFlagView this$0;

        public void onClick(View view)
        {
            showBlockDialog();
        }

        _cls1()
        {
            this$0 = UserAboutFlagView.this;
            super();
        }
    }


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final UserAboutFlagView this$0;

        public void onEventMainThread(com.pinterest.api.model.User.UpdateEvent updateevent)
        {
            if (updateevent.getUser().equals(_user))
            {
                _user = updateevent.getUser();
                updateUi(_user);
            }
        }

        _cls2()
        {
            this$0 = UserAboutFlagView.this;
            super();
        }
    }

}

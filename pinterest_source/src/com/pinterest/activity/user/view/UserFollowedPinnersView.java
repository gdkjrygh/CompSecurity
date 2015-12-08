// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.layout.AdapterLinearLayout;

public class UserFollowedPinnersView extends AdapterLinearLayout
{

    private User _user;

    public UserFollowedPinnersView(Context context)
    {
        this(context, null);
    }

    public UserFollowedPinnersView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UserFollowedPinnersView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void setUser(User user)
    {
        _user = user;
    }

    protected void updateView()
    {
        super.updateView();
        if (getChildCount() > 0 || _user == null)
        {
            setBackgroundColor(-1);
            return;
        }
        setBackgroundDrawable(null);
        Object obj;
        TextView textview;
        if (MyUser.isUserMe(_user))
        {
            obj = Resources.string(0x7f070262);
        } else
        {
            obj = Resources.string(0x7f070250, new Object[] {
                _user.getFirstName()
            });
        }
        textview = new TextView(getContext());
        textview.setText(((CharSequence) (obj)));
        obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(Constants.MARGIN, 0, Constants.MARGIN, 0);
        textview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        addView(textview);
    }
}

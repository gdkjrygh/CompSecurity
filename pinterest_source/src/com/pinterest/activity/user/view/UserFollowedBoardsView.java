// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.ui.layout.AdapterLinearLayout;

public class UserFollowedBoardsView extends AdapterLinearLayout
{

    private User _user;

    public UserFollowedBoardsView(Context context)
    {
        this(context, null);
    }

    public UserFollowedBoardsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UserFollowedBoardsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected android.widget.LinearLayout.LayoutParams createChildViewLayoutParams(View view, int i)
    {
        view = new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F);
        if (i == 0)
        {
            i = 0;
        } else
        {
            i = (int)getResources().getDimension(0x7f0a0013);
        }
        view.setMargins(i, 0, 0, 0);
        return view;
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
            return;
        }
        String s;
        TextView textview;
        if (MyUser.isUserMe(_user))
        {
            s = com.pinterest.kit.application.Resources.string(0x7f07025d);
        } else
        {
            s = com.pinterest.kit.application.Resources.string(0x7f07024a, new Object[] {
                _user.getFirstName()
            });
        }
        textview = new TextView(getContext());
        textview.setText(s);
        addView(textview);
    }
}

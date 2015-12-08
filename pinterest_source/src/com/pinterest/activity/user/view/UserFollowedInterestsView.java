// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.AddGridCell;
import com.pinterest.ui.layout.AdapterLinearLayout;

public class UserFollowedInterestsView extends AdapterLinearLayout
{

    private User _user;

    public UserFollowedInterestsView(Context context)
    {
        this(context, null);
    }

    public UserFollowedInterestsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UserFollowedInterestsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected android.widget.LinearLayout.LayoutParams createChildViewLayoutParams(View view, int i)
    {
        int j = (int)Resources.dimension(0x7f0a0013);
        if (view instanceof AddGridCell)
        {
            i = (int)getWeightSum();
            return new android.widget.LinearLayout.LayoutParams(0, (getWidth() - j * (i - 1)) / i, 1.0F);
        }
        view = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
        if (i == 0)
        {
            j = 0;
        }
        view.setMargins(j, 0, 0, 0);
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
            s = Resources.string(0x7f07025e);
        } else
        {
            s = Resources.string(0x7f07024b, new Object[] {
                _user.getFirstName()
            });
        }
        textview = new TextView(getContext());
        textview.setText(s);
        addView(textview);
    }
}

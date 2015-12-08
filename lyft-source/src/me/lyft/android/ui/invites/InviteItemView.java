// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import me.lyft.android.common.Strings;
import me.lyft.android.providers.ContactPhone;
import me.lyft.android.providers.UserContact;

public class InviteItemView extends LinearLayout
{

    TextView categoryText;
    CheckBox checkBox;
    View dividerView;
    TextView inviteLabel;
    TextView inviteName;

    public InviteItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void setItemLabels(UserContact usercontact, boolean flag)
    {
        String s = usercontact.getName();
        if (usercontact.getPhoneNumber() != null)
        {
            usercontact = usercontact.getPhoneNumber().getPhoneNumber();
        } else
        {
            usercontact = usercontact.getEmail();
        }
        if (!Strings.isNullOrEmpty(s))
        {
            inviteLabel.setVisibility(0);
            inviteLabel.setText(usercontact);
            inviteName.setText(s);
            return;
        }
        inviteLabel.setVisibility(8);
        if (!flag)
        {
            usercontact = getResources().getString(0x7f0701b0, new Object[] {
                usercontact
            });
        }
        inviteName.setText(usercontact);
    }

    private void setItemState(boolean flag, boolean flag1)
    {
        float f;
        if (flag1)
        {
            f = 0.3F;
            flag1 = false;
        } else
        {
            f = 1.0F;
            flag1 = true;
        }
        checkBox.setChecked(flag);
        checkBox.setAlpha(f);
        inviteLabel.setAlpha(f);
        inviteName.setAlpha(f);
        inviteLabel.setEnabled(flag1);
        inviteName.setEnabled(flag1);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void showWithCategories(UserContact usercontact, boolean flag, boolean flag1, String s)
    {
        setItemState(flag, flag1);
        setItemLabels(usercontact, true);
        if (!Strings.isNullOrEmpty(s))
        {
            categoryText.setText(s);
            categoryText.setVisibility(0);
            dividerView.setVisibility(8);
            return;
        } else
        {
            categoryText.setVisibility(8);
            dividerView.setVisibility(0);
            return;
        }
    }

    public void showWithoutCategories(UserContact usercontact, boolean flag, boolean flag1)
    {
        setItemState(flag, flag1);
        setItemLabels(usercontact, false);
        categoryText.setVisibility(8);
        dividerView.setVisibility(8);
    }
}

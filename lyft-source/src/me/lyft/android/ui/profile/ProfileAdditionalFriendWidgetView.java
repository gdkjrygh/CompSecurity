// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;

public class ProfileAdditionalFriendWidgetView extends LinearLayout
{

    TextView additionalFriendsView;

    public ProfileAdditionalFriendWidgetView(Context context)
    {
        super(context);
        setBackgroundResource(0x7f02021c);
        setOrientation(1);
        Scoop scoop = Scoop.a(this);
        scoop.b(this);
        scoop.a(context).inflate(0x7f030004, this, true);
        ButterKnife.a(this);
    }

    public void setMoreFriendInfo(String s)
    {
        additionalFriendsView.setText(s);
    }
}

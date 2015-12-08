// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.profile.MutualFriend;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileFriendsItemWidgetView, ProfileAdditionalFriendWidgetView

public class ProfileFriendsWidgetView extends LinearLayout
{

    TextView profileFriendTitle;
    GridLayout profileMutualFriends;

    public ProfileFriendsWidgetView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = Scoop.a(this);
        attributeset.b(this);
        setOrientation(1);
        attributeset.a(context).inflate(0x7f030108, this, true);
        ButterKnife.a(this);
    }

    private static android.widget.GridLayout.LayoutParams createItemLayoutParams(int i)
    {
        android.widget.GridLayout.LayoutParams layoutparams = new android.widget.GridLayout.LayoutParams();
        layoutparams.setMargins(i, i, i, i);
        return layoutparams;
    }

    public void loadUserFriends(List list, String s)
    {
        profileMutualFriends.removeAllViews();
        TextView textview = profileFriendTitle;
        int i;
        if (list.size() > 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        i = getResources().getDimensionPixelOffset(0x7f080076);
        ProfileFriendsItemWidgetView profilefriendsitemwidgetview;
        for (list = list.iterator(); list.hasNext(); profileMutualFriends.addView(profilefriendsitemwidgetview, createItemLayoutParams(i)))
        {
            MutualFriend mutualfriend = (MutualFriend)list.next();
            profilefriendsitemwidgetview = new ProfileFriendsItemWidgetView(getContext());
            profilefriendsitemwidgetview.setUserInfo(mutualfriend.getName(), mutualfriend.getPhoto());
        }

        if (!Strings.isNullOrEmpty(s))
        {
            list = new ProfileAdditionalFriendWidgetView(getContext());
            list.setMoreFriendInfo(s);
            profileMutualFriends.addView(list, createItemLayoutParams(i));
        }
    }
}

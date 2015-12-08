// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileFriendsWidgetView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ProfileFriendsWidgetView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, ProfileFriendsWidgetView profilefriendswidgetview, Object obj)
    {
        profilefriendswidgetview.profileMutualFriends = (GridLayout)viewinjector.profileMutualFriends((View)viewinjector.profileMutualFriends(obj, 0x7f0d0377, "field 'profileMutualFriends'"), 0x7f0d0377, "field 'profileMutualFriends'");
        profilefriendswidgetview.profileFriendTitle = (TextView)viewinjector.profileFriendTitle((View)viewinjector.profileFriendTitle(obj, 0x7f0d036f, "field 'profileFriendTitle'"), 0x7f0d036f, "field 'profileFriendTitle'");
    }

    public volatile void reset(Object obj)
    {
        reset((ProfileFriendsWidgetView)obj);
    }

    public void reset(ProfileFriendsWidgetView profilefriendswidgetview)
    {
        profilefriendswidgetview.profileMutualFriends = null;
        profilefriendswidgetview.profileFriendTitle = null;
    }

    public ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileAdditionalFriendWidgetView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ProfileAdditionalFriendWidgetView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, ProfileAdditionalFriendWidgetView profileadditionalfriendwidgetview, Object obj)
    {
        profileadditionalfriendwidgetview.additionalFriendsView = (TextView)viewinjector.additionalFriendsView((View)viewinjector.additionalFriendsView(obj, 0x7f0d0070, "field 'additionalFriendsView'"), 0x7f0d0070, "field 'additionalFriendsView'");
    }

    public volatile void reset(Object obj)
    {
        reset((ProfileAdditionalFriendWidgetView)obj);
    }

    public void reset(ProfileAdditionalFriendWidgetView profileadditionalfriendwidgetview)
    {
        profileadditionalfriendwidgetview.additionalFriendsView = null;
    }

    public ()
    {
    }
}

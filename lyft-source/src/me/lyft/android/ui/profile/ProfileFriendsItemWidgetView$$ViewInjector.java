// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileFriendsItemWidgetView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ProfileFriendsItemWidgetView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, ProfileFriendsItemWidgetView profilefriendsitemwidgetview, Object obj)
    {
        profilefriendsitemwidgetview.friendPhotoImageView = (ImageView)viewinjector.friendPhotoImageView((View)viewinjector.friendPhotoImageView(obj, 0x7f0d0375, "field 'friendPhotoImageView'"), 0x7f0d0375, "field 'friendPhotoImageView'");
        profilefriendsitemwidgetview.friendNameTextView = (TextView)viewinjector.friendNameTextView((View)viewinjector.friendNameTextView(obj, 0x7f0d0376, "field 'friendNameTextView'"), 0x7f0d0376, "field 'friendNameTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((ProfileFriendsItemWidgetView)obj);
    }

    public void reset(ProfileFriendsItemWidgetView profilefriendsitemwidgetview)
    {
        profilefriendsitemwidgetview.friendPhotoImageView = null;
        profilefriendsitemwidgetview.friendNameTextView = null;
    }

    public ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileBioWidgetView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ProfileBioWidgetView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, ProfileBioWidgetView profilebiowidgetview, Object obj)
    {
        profilebiowidgetview.homeTownTextView = (TextView)viewinjector.homeTownTextView((View)viewinjector.homeTownTextView(obj, 0x7f0d035e, "field 'homeTownTextView'"), 0x7f0d035e, "field 'homeTownTextView'");
        profilebiowidgetview.musicTextView = (TextView)viewinjector.musicTextView((View)viewinjector.musicTextView(obj, 0x7f0d035f, "field 'musicTextView'"), 0x7f0d035f, "field 'musicTextView'");
        profilebiowidgetview.aboutTextView = (TextView)viewinjector.aboutTextView((View)viewinjector.aboutTextView(obj, 0x7f0d0360, "field 'aboutTextView'"), 0x7f0d0360, "field 'aboutTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((ProfileBioWidgetView)obj);
    }

    public void reset(ProfileBioWidgetView profilebiowidgetview)
    {
        profilebiowidgetview.homeTownTextView = null;
        profilebiowidgetview.musicTextView = null;
        profilebiowidgetview.aboutTextView = null;
    }

    public ()
    {
    }
}

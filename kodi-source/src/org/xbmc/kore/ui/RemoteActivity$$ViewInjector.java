// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import org.xbmc.kore.ui.views.CirclePageIndicator;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteActivity

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (RemoteActivity)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, RemoteActivity remoteactivity, Object obj)
    {
        remoteactivity.backgroundImage = (ImageView)ctor.dImage((View)ctor.edView(obj, 0x7f0e0056, "field 'backgroundImage'"), 0x7f0e0056, "field 'backgroundImage'");
        remoteactivity.pageIndicator = (CirclePageIndicator)ctor.r((View)ctor.edView(obj, 0x7f0e0058, "field 'pageIndicator'"), 0x7f0e0058, "field 'pageIndicator'");
        remoteactivity.viewPager = (ViewPager)ctor.((View)ctor.edView(obj, 0x7f0e0057, "field 'viewPager'"), 0x7f0e0057, "field 'viewPager'");
        remoteactivity.toolbar = (Toolbar)ctor.edView((View)ctor.edView(obj, 0x7f0e00d8, "field 'toolbar'"), 0x7f0e00d8, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((RemoteActivity)obj);
    }

    public void reset(RemoteActivity remoteactivity)
    {
        remoteactivity.backgroundImage = null;
        remoteactivity.pageIndicator = null;
        remoteactivity.viewPager = null;
        remoteactivity.toolbar = null;
    }

    public ()
    {
    }
}

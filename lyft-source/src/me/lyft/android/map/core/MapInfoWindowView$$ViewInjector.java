// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.map.core:
//            MapInfoWindowView

public class 
    implements butterknife.ViewInjector
{

    public volatile void inject(butterknife.ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (MapInfoWindowView)obj, obj1);
    }

    public void inject(butterknife.ViewInjector viewinjector, MapInfoWindowView mapinfowindowview, Object obj)
    {
        mapinfowindowview.titleTextView = (TextView)viewinjector.itleTextView((View)viewinjector.itleTextView(obj, 0x7f0d0061, "field 'titleTextView'"), 0x7f0d0061, "field 'titleTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((MapInfoWindowView)obj);
    }

    public void reset(MapInfoWindowView mapinfowindowview)
    {
        mapinfowindowview.titleTextView = null;
    }

    public ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.controls:
//            Toolbar

public class 
    implements butterknife.ViewInjector
{

    public volatile void inject(butterknife.ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (Toolbar)obj, obj1);
    }

    public void inject(butterknife.ViewInjector viewinjector, Toolbar toolbar, Object obj)
    {
        toolbar.homeView = (View)viewinjector.omeView(obj, 0x7f0d0405, "field 'homeView'");
        toolbar.homeImageView = (ImageView)viewinjector.omeImageView((View)viewinjector.omeImageView(obj, 0x7f0d0406, "field 'homeImageView'"), 0x7f0d0406, "field 'homeImageView'");
        toolbar.logoImageView = (ImageView)viewinjector.ogoImageView((View)viewinjector.ogoImageView(obj, 0x7f0d0407, "field 'logoImageView'"), 0x7f0d0407, "field 'logoImageView'");
        toolbar.driverModeToggleView = (View)viewinjector.riverModeToggleView(obj, 0x7f0d0408, "field 'driverModeToggleView'");
        toolbar.dividerView = (View)viewinjector.ividerView(obj, 0x7f0d0143, "field 'dividerView'");
        toolbar.titleTextView = (TextView)viewinjector.itleTextView((View)viewinjector.itleTextView(obj, 0x7f0d0061, "field 'titleTextView'"), 0x7f0d0061, "field 'titleTextView'");
        toolbar.itemsContainerView = (LinearLayout)viewinjector.temsContainerView((View)viewinjector.temsContainerView(obj, 0x7f0d0409, "field 'itemsContainerView'"), 0x7f0d0409, "field 'itemsContainerView'");
    }

    public volatile void reset(Object obj)
    {
        reset((Toolbar)obj);
    }

    public void reset(Toolbar toolbar)
    {
        toolbar.homeView = null;
        toolbar.homeImageView = null;
        toolbar.logoImageView = null;
        toolbar.driverModeToggleView = null;
        toolbar.dividerView = null;
        toolbar.titleTextView = null;
        toolbar.itemsContainerView = null;
    }

    public ()
    {
    }
}

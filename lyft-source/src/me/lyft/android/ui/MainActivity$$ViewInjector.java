// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package me.lyft.android.ui:
//            MainActivity

public class 
    implements butterknife.jector
{

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (MainActivity)obj, obj1);
    }

    public void inject(butterknife.jector jector, MainActivity mainactivity, Object obj)
    {
        mainactivity.rootView = (ViewGroup)jector.w((View)jector.w(obj, 0x7f0d03b5, "field 'rootView'"), 0x7f0d03b5, "field 'rootView'");
        mainactivity.screensPlaceholder = (ViewGroup)jector.Placeholder((View)jector.Placeholder(obj, 0x7f0d03b7, "field 'screensPlaceholder'"), 0x7f0d03b7, "field 'screensPlaceholder'");
        mainactivity.menuPlaceholder = (ViewGroup)jector.ceholder((View)jector.ceholder(obj, 0x7f0d03b8, "field 'menuPlaceholder'"), 0x7f0d03b8, "field 'menuPlaceholder'");
        mainactivity.menuDrawer = (DrawerLayout)jector.wer((View)jector.wer(obj, 0x7f0d03b6, "field 'menuDrawer'"), 0x7f0d03b6, "field 'menuDrawer'");
    }

    public volatile void reset(Object obj)
    {
        reset((MainActivity)obj);
    }

    public void reset(MainActivity mainactivity)
    {
        mainactivity.rootView = null;
        mainactivity.screensPlaceholder = null;
        mainactivity.menuPlaceholder = null;
        mainactivity.menuDrawer = null;
    }

    public ()
    {
    }
}

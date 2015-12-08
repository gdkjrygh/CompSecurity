// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;

// Referenced classes of package me.lyft.android.ui.driver:
//            LastRideExitDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (LastRideExitDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, LastRideExitDialogView lastrideexitdialogview, Object obj)
    {
        lastrideexitdialogview.exitLastRideButton = (Button)viewinjector.exitLastRideButton((View)viewinjector.exitLastRideButton(obj, 0x7f0d0271, "field 'exitLastRideButton'"), 0x7f0d0271, "field 'exitLastRideButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((LastRideExitDialogView)obj);
    }

    public void reset(LastRideExitDialogView lastrideexitdialogview)
    {
        lastrideexitdialogview.exitLastRideButton = null;
    }

    public ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.view.View;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksInviteCoworkersScreenView

public class 
    implements butterknife.iew..ViewInjector
{

    public volatile void inject(butterknife.iew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (WorkPerksInviteCoworkersScreenView)obj, obj1);
    }

    public void inject(butterknife.iew..ViewInjector viewinjector, WorkPerksInviteCoworkersScreenView workperksinvitecoworkersscreenview, Object obj)
    {
        workperksinvitecoworkersscreenview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((WorkPerksInviteCoworkersScreenView)obj);
    }

    public void reset(WorkPerksInviteCoworkersScreenView workperksinvitecoworkersscreenview)
    {
        workperksinvitecoworkersscreenview.toolbar = null;
    }

    public ()
    {
    }
}

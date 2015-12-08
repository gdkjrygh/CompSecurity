// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.view.View;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksInviteCoworkersSelectScreenView

public class 
    implements butterknife.iew..ViewInjector
{

    public volatile void inject(butterknife.iew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (WorkPerksInviteCoworkersSelectScreenView)obj, obj1);
    }

    public void inject(butterknife.iew..ViewInjector viewinjector, WorkPerksInviteCoworkersSelectScreenView workperksinvitecoworkersselectscreenview, Object obj)
    {
        workperksinvitecoworkersselectscreenview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((WorkPerksInviteCoworkersSelectScreenView)obj);
    }

    public void reset(WorkPerksInviteCoworkersSelectScreenView workperksinvitecoworkersselectscreenview)
    {
        workperksinvitecoworkersselectscreenview.toolbar = null;
    }

    public ()
    {
    }
}

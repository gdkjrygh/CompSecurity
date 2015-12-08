// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package me.lyft.android.ui.driver:
//            QueuedRideDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (QueuedRideDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, QueuedRideDialogView queuedridedialogview, Object obj)
    {
        queuedridedialogview.containerView = (ViewGroup)viewinjector.containerView((View)viewinjector.containerView(obj, 0x7f0d0387, "field 'containerView'"), 0x7f0d0387, "field 'containerView'");
    }

    public volatile void reset(Object obj)
    {
        reset((QueuedRideDialogView)obj);
    }

    public void reset(QueuedRideDialogView queuedridedialogview)
    {
        queuedridedialogview.containerView = null;
    }

    public ()
    {
    }
}

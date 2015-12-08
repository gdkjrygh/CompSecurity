// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import com.makeramen.roundedimageview.RoundedImageView;

// Referenced classes of package me.lyft.android.ui.driver:
//            TrainingRideCompletedDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (TrainingRideCompletedDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, TrainingRideCompletedDialogView trainingridecompleteddialogview, Object obj)
    {
        trainingridecompleteddialogview.replayWalkthroughButton = (Button)viewinjector.replayWalkthroughButton((View)viewinjector.replayWalkthroughButton(obj, 0x7f0d040e, "field 'replayWalkthroughButton'"), 0x7f0d040e, "field 'replayWalkthroughButton'");
        trainingridecompleteddialogview.dismissButton = (Button)viewinjector.dismissButton((View)viewinjector.dismissButton(obj, 0x7f0d0141, "field 'dismissButton'"), 0x7f0d0141, "field 'dismissButton'");
        trainingridecompleteddialogview.userImageView = (RoundedImageView)viewinjector.userImageView((View)viewinjector.userImageView(obj, 0x7f0d01bc, "field 'userImageView'"), 0x7f0d01bc, "field 'userImageView'");
    }

    public volatile void reset(Object obj)
    {
        reset((TrainingRideCompletedDialogView)obj);
    }

    public void reset(TrainingRideCompletedDialogView trainingridecompleteddialogview)
    {
        trainingridecompleteddialogview.replayWalkthroughButton = null;
        trainingridecompleteddialogview.dismissButton = null;
        trainingridecompleteddialogview.userImageView = null;
    }

    public ()
    {
    }
}

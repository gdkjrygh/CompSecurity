// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.driver:
//            TrainingRideNavigationDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (TrainingRideNavigationDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, TrainingRideNavigationDialogView trainingridenavigationdialogview, Object obj)
    {
        trainingridenavigationdialogview.dialogImageView = (ImageView)viewinjector.dialogImageView((View)viewinjector.dialogImageView(obj, 0x7f0d040f, "field 'dialogImageView'"), 0x7f0d040f, "field 'dialogImageView'");
        trainingridenavigationdialogview.dialogTitleTextView = (TextView)viewinjector.dialogTitleTextView((View)viewinjector.dialogTitleTextView(obj, 0x7f0d0410, "field 'dialogTitleTextView'"), 0x7f0d0410, "field 'dialogTitleTextView'");
        trainingridenavigationdialogview.dialogMessageTextView = (TextView)viewinjector.dialogMessageTextView((View)viewinjector.dialogMessageTextView(obj, 0x7f0d0411, "field 'dialogMessageTextView'"), 0x7f0d0411, "field 'dialogMessageTextView'");
        trainingridenavigationdialogview.gotItButton = (Button)viewinjector.gotItButton((View)viewinjector.gotItButton(obj, 0x7f0d0412, "field 'gotItButton'"), 0x7f0d0412, "field 'gotItButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((TrainingRideNavigationDialogView)obj);
    }

    public void reset(TrainingRideNavigationDialogView trainingridenavigationdialogview)
    {
        trainingridenavigationdialogview.dialogImageView = null;
        trainingridenavigationdialogview.dialogTitleTextView = null;
        trainingridenavigationdialogview.dialogMessageTextView = null;
        trainingridenavigationdialogview.gotItButton = null;
    }

    public ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.controls.TimedProgressBar;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerMatchingBottomView

public class 
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PassengerMatchingBottomView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, PassengerMatchingBottomView passengermatchingbottomview, Object obj)
    {
        passengermatchingbottomview.emptyPassengerView = (View)viewinjector.emptyPassengerView(obj, 0x7f0d02ae, "field 'emptyPassengerView'");
        passengermatchingbottomview.messageTextView = (TextView)viewinjector.messageTextView((View)viewinjector.messageTextView(obj, 0x7f0d02af, "field 'messageTextView'"), 0x7f0d02af, "field 'messageTextView'");
        passengermatchingbottomview.progressBar = (TimedProgressBar)viewinjector.progressBar((View)viewinjector.progressBar(obj, 0x7f0d0194, "field 'progressBar'"), 0x7f0d0194, "field 'progressBar'");
    }

    public volatile void reset(Object obj)
    {
        reset((PassengerMatchingBottomView)obj);
    }

    public void reset(PassengerMatchingBottomView passengermatchingbottomview)
    {
        passengermatchingbottomview.emptyPassengerView = null;
        passengermatchingbottomview.messageTextView = null;
        passengermatchingbottomview.progressBar = null;
    }

    public ()
    {
    }
}

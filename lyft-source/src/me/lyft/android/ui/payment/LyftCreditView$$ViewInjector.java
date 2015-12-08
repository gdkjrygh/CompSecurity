// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            LyftCreditView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (LyftCreditView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, LyftCreditView lyftcreditview, Object obj)
    {
        lyftcreditview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        lyftcreditview.creditHeader = (TextView)viewinjector.creditHeader((View)viewinjector.creditHeader(obj, 0x7f0d0274, "field 'creditHeader'"), 0x7f0d0274, "field 'creditHeader'");
        lyftcreditview.creditRestrictions = (LinearLayout)viewinjector.creditRestrictions((View)viewinjector.creditRestrictions(obj, 0x7f0d0275, "field 'creditRestrictions'"), 0x7f0d0275, "field 'creditRestrictions'");
    }

    public volatile void reset(Object obj)
    {
        reset((LyftCreditView)obj);
    }

    public void reset(LyftCreditView lyftcreditview)
    {
        lyftcreditview.toolbar = null;
        lyftcreditview.creditHeader = null;
        lyftcreditview.creditRestrictions = null;
    }

    public ()
    {
    }
}

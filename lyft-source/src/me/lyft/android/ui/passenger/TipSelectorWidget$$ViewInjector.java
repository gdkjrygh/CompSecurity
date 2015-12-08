// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.RadioGroup;

// Referenced classes of package me.lyft.android.ui.passenger:
//            TipSelectorWidget

public class 
    implements butterknife.et..ViewInjector
{

    public volatile void inject(butterknife.et..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (TipSelectorWidget)obj, obj1);
    }

    public void inject(butterknife.et..ViewInjector viewinjector, TipSelectorWidget tipselectorwidget, Object obj)
    {
        tipselectorwidget.tipAmountRadioGroup = (RadioGroup)viewinjector.tipAmountRadioGroup((View)viewinjector.tipAmountRadioGroup(obj, 0x7f0d03fe, "field 'tipAmountRadioGroup'"), 0x7f0d03fe, "field 'tipAmountRadioGroup'");
    }

    public volatile void reset(Object obj)
    {
        reset((TipSelectorWidget)obj);
    }

    public void reset(TipSelectorWidget tipselectorwidget)
    {
        tipselectorwidget.tipAmountRadioGroup = null;
    }

    public ()
    {
    }
}

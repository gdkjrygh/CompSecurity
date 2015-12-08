// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            EditCreditLineView

public class A
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (EditCreditLineView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, EditCreditLineView editcreditlineview, Object obj)
    {
        editcreditlineview.cardTitleTextView = (TextView)viewinjector.cardTitleTextView((View)viewinjector.cardTitleTextView(obj, 0x7f0d0335, "field 'cardTitleTextView'"), 0x7f0d0335, "field 'cardTitleTextView'");
        editcreditlineview.makeDefaultButton = (View)viewinjector.makeDefaultButton(obj, 0x7f0d01fc, "field 'makeDefaultButton'");
        editcreditlineview.isDefaultTextView = (View)viewinjector.isDefaultTextView(obj, 0x7f0d01fa, "field 'isDefaultTextView'");
        editcreditlineview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((EditCreditLineView)obj);
    }

    public void reset(EditCreditLineView editcreditlineview)
    {
        editcreditlineview.cardTitleTextView = null;
        editcreditlineview.makeDefaultButton = null;
        editcreditlineview.isDefaultTextView = null;
        editcreditlineview.toolbar = null;
    }

    public A()
    {
    }
}

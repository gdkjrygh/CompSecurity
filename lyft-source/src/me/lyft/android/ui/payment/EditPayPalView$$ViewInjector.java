// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            EditPayPalView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (EditPayPalView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, EditPayPalView editpaypalview, Object obj)
    {
        editpaypalview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        editpaypalview.emailTextView = (TextView)viewinjector.emailTextView((View)viewinjector.emailTextView(obj, 0x7f0d0200, "field 'emailTextView'"), 0x7f0d0200, "field 'emailTextView'");
        editpaypalview.defaultCardView = (View)viewinjector.defaultCardView(obj, 0x7f0d01fa, "field 'defaultCardView'");
        editpaypalview.makeDefaultButton = (Button)viewinjector.makeDefaultButton((View)viewinjector.makeDefaultButton(obj, 0x7f0d01fc, "field 'makeDefaultButton'"), 0x7f0d01fc, "field 'makeDefaultButton'");
        editpaypalview.deleteButton = (Button)viewinjector.deleteButton((View)viewinjector.deleteButton(obj, 0x7f0d01ff, "field 'deleteButton'"), 0x7f0d01ff, "field 'deleteButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((EditPayPalView)obj);
    }

    public void reset(EditPayPalView editpaypalview)
    {
        editpaypalview.toolbar = null;
        editpaypalview.emailTextView = null;
        editpaypalview.defaultCardView = null;
        editpaypalview.makeDefaultButton = null;
        editpaypalview.deleteButton = null;
    }

    public ()
    {
    }
}

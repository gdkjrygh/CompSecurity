// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.settings:
//            EditPhoneView

public class 
    implements butterknife.w..ViewInjector
{

    public volatile void inject(butterknife.w..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (EditPhoneView)obj, obj1);
    }

    public void inject(butterknife.w..ViewInjector viewinjector, EditPhoneView editphoneview, Object obj)
    {
        editphoneview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        editphoneview.phoneEditText = (AdvancedEditText)viewinjector.t((View)viewinjector.t(obj, 0x7f0d0201, "field 'phoneEditText'"), 0x7f0d0201, "field 'phoneEditText'");
        editphoneview.inlineErrorTxt = (TextView)viewinjector.inlineErrorTxt((View)viewinjector.inlineErrorTxt(obj, 0x7f0d006d, "field 'inlineErrorTxt'"), 0x7f0d006d, "field 'inlineErrorTxt'");
    }

    public volatile void reset(Object obj)
    {
        reset((EditPhoneView)obj);
    }

    public void reset(EditPhoneView editphoneview)
    {
        editphoneview.toolbar = null;
        editphoneview.phoneEditText = null;
        editphoneview.inlineErrorTxt = null;
    }

    public ()
    {
    }
}

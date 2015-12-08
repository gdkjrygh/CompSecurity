// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.settings:
//            EditEmailView

public class 
    implements butterknife.w..ViewInjector
{

    public volatile void inject(butterknife.w..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (EditEmailView)obj, obj1);
    }

    public void inject(butterknife.w..ViewInjector viewinjector, EditEmailView editemailview, Object obj)
    {
        editemailview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        editemailview.emailEditText = (AdvancedEditText)viewinjector.t((View)viewinjector.t(obj, 0x7f0d01f8, "field 'emailEditText'"), 0x7f0d01f8, "field 'emailEditText'");
        editemailview.inlineErrorTxt = (TextView)viewinjector.inlineErrorTxt((View)viewinjector.inlineErrorTxt(obj, 0x7f0d006d, "field 'inlineErrorTxt'"), 0x7f0d006d, "field 'inlineErrorTxt'");
    }

    public volatile void reset(Object obj)
    {
        reset((EditEmailView)obj);
    }

    public void reset(EditEmailView editemailview)
    {
        editemailview.toolbar = null;
        editemailview.emailEditText = null;
        editemailview.inlineErrorTxt = null;
    }

    public ()
    {
    }
}

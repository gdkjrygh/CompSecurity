// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEditEmailView

public class 
    implements butterknife.iew..ViewInjector
{

    public volatile void inject(butterknife.iew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (WorkPerksEditEmailView)obj, obj1);
    }

    public void inject(butterknife.iew..ViewInjector viewinjector, WorkPerksEditEmailView workperkseditemailview, Object obj)
    {
        workperkseditemailview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        workperkseditemailview.emailEditText = (AdvancedEditText)viewinjector.emailEditText((View)viewinjector.emailEditText(obj, 0x7f0d0421, "field 'emailEditText'"), 0x7f0d0421, "field 'emailEditText'");
        workperkseditemailview.inlineErrorTxt = (TextView)viewinjector.inlineErrorTxt((View)viewinjector.inlineErrorTxt(obj, 0x7f0d006d, "field 'inlineErrorTxt'"), 0x7f0d006d, "field 'inlineErrorTxt'");
    }

    public volatile void reset(Object obj)
    {
        reset((WorkPerksEditEmailView)obj);
    }

    public void reset(WorkPerksEditEmailView workperkseditemailview)
    {
        workperkseditemailview.toolbar = null;
        workperkseditemailview.emailEditText = null;
        workperkseditemailview.inlineErrorTxt = null;
    }

    public ()
    {
    }
}

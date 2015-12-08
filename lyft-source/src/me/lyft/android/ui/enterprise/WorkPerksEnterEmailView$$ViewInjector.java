// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEnterEmailView

public class I
    implements butterknife.iew..ViewInjector
{

    public volatile void inject(butterknife.iew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (WorkPerksEnterEmailView)obj, obj1);
    }

    public void inject(butterknife.iew..ViewInjector viewinjector, WorkPerksEnterEmailView workperksenteremailview, Object obj)
    {
        workperksenteremailview.workPerksSubmitButton = (Button)viewinjector.workPerksSubmitButton((View)viewinjector.workPerksSubmitButton(obj, 0x7f0d0427, "field 'workPerksSubmitButton'"), 0x7f0d0427, "field 'workPerksSubmitButton'");
        workperksenteremailview.emailEditText = (AdvancedEditText)viewinjector.emailEditText((View)viewinjector.emailEditText(obj, 0x7f0d0426, "field 'emailEditText'"), 0x7f0d0426, "field 'emailEditText'");
        workperksenteremailview.workPerksTitle = (TextView)viewinjector.workPerksTitle((View)viewinjector.workPerksTitle(obj, 0x7f0d0424, "field 'workPerksTitle'"), 0x7f0d0424, "field 'workPerksTitle'");
        workperksenteremailview.workPerksDescription = (TextView)viewinjector.workPerksDescription((View)viewinjector.workPerksDescription(obj, 0x7f0d0425, "field 'workPerksDescription'"), 0x7f0d0425, "field 'workPerksDescription'");
        workperksenteremailview.inlineErrorTxt = (TextView)viewinjector.inlineErrorTxt((View)viewinjector.inlineErrorTxt(obj, 0x7f0d006d, "field 'inlineErrorTxt'"), 0x7f0d006d, "field 'inlineErrorTxt'");
        workperksenteremailview.workPerksScrollView = (ScrollView)viewinjector.workPerksScrollView((View)viewinjector.workPerksScrollView(obj, 0x7f0d0423, "field 'workPerksScrollView'"), 0x7f0d0423, "field 'workPerksScrollView'");
        workperksenteremailview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((WorkPerksEnterEmailView)obj);
    }

    public void reset(WorkPerksEnterEmailView workperksenteremailview)
    {
        workperksenteremailview.workPerksSubmitButton = null;
        workperksenteremailview.emailEditText = null;
        workperksenteremailview.workPerksTitle = null;
        workperksenteremailview.workPerksDescription = null;
        workperksenteremailview.inlineErrorTxt = null;
        workperksenteremailview.workPerksScrollView = null;
        workperksenteremailview.toolbar = null;
    }

    public I()
    {
    }
}

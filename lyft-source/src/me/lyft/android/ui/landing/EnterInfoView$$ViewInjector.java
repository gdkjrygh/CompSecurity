// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.EmailAutoFillEditText;

// Referenced classes of package me.lyft.android.ui.landing:
//            EnterInfoView, TermsOfServiceView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (EnterInfoView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, EnterInfoView enterinfoview, Object obj)
    {
        enterinfoview.firstNameEdit = (AdvancedEditText)viewinjector.t((View)viewinjector.t(obj, 0x7f0d0253, "field 'firstNameEdit'"), 0x7f0d0253, "field 'firstNameEdit'");
        enterinfoview.errorFistNameTextView = (TextView)viewinjector.errorFistNameTextView((View)viewinjector.errorFistNameTextView(obj, 0x7f0d0255, "field 'errorFistNameTextView'"), 0x7f0d0255, "field 'errorFistNameTextView'");
        enterinfoview.lastNameEdit = (AdvancedEditText)viewinjector.t((View)viewinjector.t(obj, 0x7f0d0254, "field 'lastNameEdit'"), 0x7f0d0254, "field 'lastNameEdit'");
        enterinfoview.errorLastNameTextView = (TextView)viewinjector.errorLastNameTextView((View)viewinjector.errorLastNameTextView(obj, 0x7f0d0257, "field 'errorLastNameTextView'"), 0x7f0d0257, "field 'errorLastNameTextView'");
        enterinfoview.emailEdit = (EmailAutoFillEditText)viewinjector.itText((View)viewinjector.itText(obj, 0x7f0d0256, "field 'emailEdit'"), 0x7f0d0256, "field 'emailEdit'");
        enterinfoview.errorEmailTextView = (TextView)viewinjector.errorEmailTextView((View)viewinjector.errorEmailTextView(obj, 0x7f0d0258, "field 'errorEmailTextView'"), 0x7f0d0258, "field 'errorEmailTextView'");
        enterinfoview.nextButton = (Button)viewinjector.nextButton((View)viewinjector.nextButton(obj, 0x7f0d025a, "field 'nextButton'"), 0x7f0d025a, "field 'nextButton'");
        enterinfoview.tosCheckBox = (TermsOfServiceView)viewinjector.eView((View)viewinjector.eView(obj, 0x7f0d0259, "field 'tosCheckBox'"), 0x7f0d0259, "field 'tosCheckBox'");
    }

    public volatile void reset(Object obj)
    {
        reset((EnterInfoView)obj);
    }

    public void reset(EnterInfoView enterinfoview)
    {
        enterinfoview.firstNameEdit = null;
        enterinfoview.errorFistNameTextView = null;
        enterinfoview.lastNameEdit = null;
        enterinfoview.errorLastNameTextView = null;
        enterinfoview.emailEdit = null;
        enterinfoview.errorEmailTextView = null;
        enterinfoview.nextButton = null;
        enterinfoview.tosCheckBox = null;
    }

    public ()
    {
    }
}

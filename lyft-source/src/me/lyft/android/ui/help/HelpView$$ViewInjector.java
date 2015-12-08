// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.help;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.help:
//            HelpView

public class 
    implements butterknife.iewInjector
{

    public volatile void inject(butterknife.iewInjector iewinjector, Object obj, Object obj1)
    {
        inject(iewinjector, (HelpView)obj, obj1);
    }

    public void inject(butterknife.iewInjector iewinjector, HelpView helpview, Object obj)
    {
        helpview.roadsideAssistanceButton = (Button)iewinjector.adsideAssistanceButton((View)iewinjector.adsideAssistanceButton(obj, 0x7f0d022e, "field 'roadsideAssistanceButton'"), 0x7f0d022e, "field 'roadsideAssistanceButton'");
        helpview.faqSectionButton = (Button)iewinjector.qSectionButton((View)iewinjector.qSectionButton(obj, 0x7f0d022d, "field 'faqSectionButton'"), 0x7f0d022d, "field 'faqSectionButton'");
        helpview.jobsSectionButton = (Button)iewinjector.bsSectionButton((View)iewinjector.bsSectionButton(obj, 0x7f0d0230, "field 'jobsSectionButton'"), 0x7f0d0230, "field 'jobsSectionButton'");
        helpview.legalSectionButton = (Button)iewinjector.galSectionButton((View)iewinjector.galSectionButton(obj, 0x7f0d022f, "field 'legalSectionButton'"), 0x7f0d022f, "field 'legalSectionButton'");
        helpview.appVersionText = (TextView)iewinjector.pVersionText((View)iewinjector.pVersionText(obj, 0x7f0d0232, "field 'appVersionText'"), 0x7f0d0232, "field 'appVersionText'");
        helpview.developerModeTitle = (TextView)iewinjector.veloperModeTitle((View)iewinjector.veloperModeTitle(obj, 0x7f0d0233, "field 'developerModeTitle'"), 0x7f0d0233, "field 'developerModeTitle'");
        helpview.toolbar = (Toolbar)iewinjector.olbar((View)iewinjector.olbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((HelpView)obj);
    }

    public void reset(HelpView helpview)
    {
        helpview.roadsideAssistanceButton = null;
        helpview.faqSectionButton = null;
        helpview.jobsSectionButton = null;
        helpview.legalSectionButton = null;
        helpview.appVersionText = null;
        helpview.developerModeTitle = null;
        helpview.toolbar = null;
    }

    public ()
    {
    }
}

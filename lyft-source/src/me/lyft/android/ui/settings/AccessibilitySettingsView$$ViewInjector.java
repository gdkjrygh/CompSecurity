// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.view.View;
import android.widget.CheckedTextView;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.settings:
//            AccessibilitySettingsView

public class I
    implements butterknife.w..ViewInjector
{

    public volatile void inject(butterknife.w..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (AccessibilitySettingsView)obj, obj1);
    }

    public void inject(butterknife.w..ViewInjector viewinjector, AccessibilitySettingsView accessibilitysettingsview, Object obj)
    {
        accessibilitysettingsview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        accessibilitysettingsview.servicesOptionNone = (CheckedTextView)viewinjector.servicesOptionNone((View)viewinjector.servicesOptionNone(obj, 0x7f0d036d, "field 'servicesOptionNone'"), 0x7f0d036d, "field 'servicesOptionNone'");
        accessibilitysettingsview.servicesOptionAccess = (CheckedTextView)viewinjector.servicesOptionAccess((View)viewinjector.servicesOptionAccess(obj, 0x7f0d036e, "field 'servicesOptionAccess'"), 0x7f0d036e, "field 'servicesOptionAccess'");
    }

    public volatile void reset(Object obj)
    {
        reset((AccessibilitySettingsView)obj);
    }

    public void reset(AccessibilitySettingsView accessibilitysettingsview)
    {
        accessibilitysettingsview.toolbar = null;
        accessibilitysettingsview.servicesOptionNone = null;
        accessibilitysettingsview.servicesOptionAccess = null;
    }

    public I()
    {
    }
}

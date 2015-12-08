// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostFragmentManualConfiguration

public class 
    implements butterknife.ewInjector
{

    public volatile void inject(butterknife.ewInjector ewinjector, Object obj, Object obj1)
    {
        inject(ewinjector, (HostFragmentManualConfiguration)obj, obj1);
    }

    public void inject(butterknife.ewInjector ewinjector, HostFragmentManualConfiguration hostfragmentmanualconfiguration, Object obj)
    {
        hostfragmentmanualconfiguration.xbmcNameEditText = (EditText)ewinjector.cNameEditText((View)ewinjector.cNameEditText(obj, 0x7f0e005e, "field 'xbmcNameEditText'"), 0x7f0e005e, "field 'xbmcNameEditText'");
        hostfragmentmanualconfiguration.xbmcIpAddressEditText = (EditText)ewinjector.cIpAddressEditText((View)ewinjector.cIpAddressEditText(obj, 0x7f0e0060, "field 'xbmcIpAddressEditText'"), 0x7f0e0060, "field 'xbmcIpAddressEditText'");
        hostfragmentmanualconfiguration.xbmcHttpPortEditText = (EditText)ewinjector.cHttpPortEditText((View)ewinjector.cHttpPortEditText(obj, 0x7f0e005f, "field 'xbmcHttpPortEditText'"), 0x7f0e005f, "field 'xbmcHttpPortEditText'");
        hostfragmentmanualconfiguration.xbmcTcpPortEditText = (EditText)ewinjector.cTcpPortEditText((View)ewinjector.cTcpPortEditText(obj, 0x7f0e0063, "field 'xbmcTcpPortEditText'"), 0x7f0e0063, "field 'xbmcTcpPortEditText'");
        hostfragmentmanualconfiguration.xbmcUsernameEditText = (EditText)ewinjector.cUsernameEditText((View)ewinjector.cUsernameEditText(obj, 0x7f0e0061, "field 'xbmcUsernameEditText'"), 0x7f0e0061, "field 'xbmcUsernameEditText'");
        hostfragmentmanualconfiguration.xbmcPasswordEditText = (EditText)ewinjector.cPasswordEditText((View)ewinjector.cPasswordEditText(obj, 0x7f0e0062, "field 'xbmcPasswordEditText'"), 0x7f0e0062, "field 'xbmcPasswordEditText'");
        hostfragmentmanualconfiguration.xbmcMacAddressEditText = (EditText)ewinjector.cMacAddressEditText((View)ewinjector.cMacAddressEditText(obj, 0x7f0e0068, "field 'xbmcMacAddressEditText'"), 0x7f0e0068, "field 'xbmcMacAddressEditText'");
        hostfragmentmanualconfiguration.xbmcWolPortEditText = (EditText)ewinjector.cWolPortEditText((View)ewinjector.cWolPortEditText(obj, 0x7f0e0067, "field 'xbmcWolPortEditText'"), 0x7f0e0067, "field 'xbmcWolPortEditText'");
        hostfragmentmanualconfiguration.xbmcUseTcpCheckbox = (CheckBox)ewinjector.cUseTcpCheckbox((View)ewinjector.cUseTcpCheckbox(obj, 0x7f0e0064, "field 'xbmcUseTcpCheckbox'"), 0x7f0e0064, "field 'xbmcUseTcpCheckbox'");
        hostfragmentmanualconfiguration.xbmcUseEventServerCheckbox = (CheckBox)ewinjector.cUseEventServerCheckbox((View)ewinjector.cUseEventServerCheckbox(obj, 0x7f0e0066, "field 'xbmcUseEventServerCheckbox'"), 0x7f0e0066, "field 'xbmcUseEventServerCheckbox'");
        hostfragmentmanualconfiguration.xbmcEventServerPortEditText = (EditText)ewinjector.cEventServerPortEditText((View)ewinjector.cEventServerPortEditText(obj, 0x7f0e0065, "field 'xbmcEventServerPortEditText'"), 0x7f0e0065, "field 'xbmcEventServerPortEditText'");
    }

    public volatile void reset(Object obj)
    {
        reset((HostFragmentManualConfiguration)obj);
    }

    public void reset(HostFragmentManualConfiguration hostfragmentmanualconfiguration)
    {
        hostfragmentmanualconfiguration.xbmcNameEditText = null;
        hostfragmentmanualconfiguration.xbmcIpAddressEditText = null;
        hostfragmentmanualconfiguration.xbmcHttpPortEditText = null;
        hostfragmentmanualconfiguration.xbmcTcpPortEditText = null;
        hostfragmentmanualconfiguration.xbmcUsernameEditText = null;
        hostfragmentmanualconfiguration.xbmcPasswordEditText = null;
        hostfragmentmanualconfiguration.xbmcMacAddressEditText = null;
        hostfragmentmanualconfiguration.xbmcWolPortEditText = null;
        hostfragmentmanualconfiguration.xbmcUseTcpCheckbox = null;
        hostfragmentmanualconfiguration.xbmcUseEventServerCheckbox = null;
        hostfragmentmanualconfiguration.xbmcEventServerPortEditText = null;
    }

    public ()
    {
    }
}

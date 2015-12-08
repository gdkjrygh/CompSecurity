// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

// Referenced classes of package com.jcp.activities:
//            DebugSettingsActivity, h, i, j, 
//            k, l

public class 
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, DebugSettingsActivity debugsettingsactivity, Object obj)
    {
        View view = (View)jector.jector(obj, 0x7f0e0137, "field 'enableFutureDate' and method 'onEnableFutureDate'");
        debugsettingsactivity.enableFutureDate = (CheckBox)jector.utureDate(view, 0x7f0e0137, "field 'enableFutureDate'");
        view.setOnClickListener(new h(this, debugsettingsactivity));
        debugsettingsactivity.domainView = (EditText)jector.iew((View)jector.iew(obj, 0x7f0e0138, "field 'domainView'"), 0x7f0e0138, "field 'domainView'");
        debugsettingsactivity.urlView = (EditText)jector.((View)jector.(obj, 0x7f0e0139, "field 'urlView'"), 0x7f0e0139, "field 'urlView'");
        debugsettingsactivity.secureUrlView = (EditText)jector.rlView((View)jector.rlView(obj, 0x7f0e013a, "field 'secureUrlView'"), 0x7f0e013a, "field 'secureUrlView'");
        debugsettingsactivity.dpAkaMaiView = (EditText)jector.iView((View)jector.iView(obj, 0x7f0e013b, "field 'dpAkaMaiView'"), 0x7f0e013b, "field 'dpAkaMaiView'");
        debugsettingsactivity.dpAkaMaiOneView = (EditText)jector.iOneView((View)jector.iOneView(obj, 0x7f0e013c, "field 'dpAkaMaiOneView'"), 0x7f0e013c, "field 'dpAkaMaiOneView'");
        debugsettingsactivity.qaView = (CheckBox)jector.iOneView((View)jector.iOneView(obj, 0x7f0e013d, "field 'qaView'"), 0x7f0e013d, "field 'qaView'");
        view = (View)jector.iOneView(obj, 0x7f0e013e, "field 'clusterCheckbox' and method 'onClusterCheckbox'");
        debugsettingsactivity.clusterCheckbox = (CheckBox)jector.Checkbox(view, 0x7f0e013e, "field 'clusterCheckbox'");
        view.setOnClickListener(new i(this, debugsettingsactivity));
        debugsettingsactivity.clusterValue = (EditText)jector.Value((View)jector.Value(obj, 0x7f0e013f, "field 'clusterValue'"), 0x7f0e013f, "field 'clusterValue'");
        view = (View)jector.Value(obj, 0x7f0e0140, "field 'alphaCheckbox' and method 'onAlphaCheckbox'");
        debugsettingsactivity.alphaCheckbox = (CheckBox)jector.eckbox(view, 0x7f0e0140, "field 'alphaCheckbox'");
        view.setOnClickListener(new j(this, debugsettingsactivity));
        debugsettingsactivity.alphaValue = (EditText)jector.lue((View)jector.lue(obj, 0x7f0e0141, "field 'alphaValue'"), 0x7f0e0141, "field 'alphaValue'");
        debugsettingsactivity.radioView = (RadioGroup)jector.ew((View)jector.ew(obj, 0x7f0e0068, "field 'radioView'"), 0x7f0e0068, "field 'radioView'");
        debugsettingsactivity.apiVersionValue = (Spinner)jector.ionValue((View)jector.ionValue(obj, 0x7f0e0143, "field 'apiVersionValue'"), 0x7f0e0143, "field 'apiVersionValue'");
        ((View)jector.ionValue(obj, 0x7f0e0144, "method 'onCancel'")).setOnClickListener(new k(this, debugsettingsactivity));
        ((View)jector.jector(obj, 0x7f0e0145, "method 'onOk'")).setOnClickListener(new l(this, debugsettingsactivity));
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (DebugSettingsActivity)obj, obj1);
    }

    public void reset(DebugSettingsActivity debugsettingsactivity)
    {
        debugsettingsactivity.enableFutureDate = null;
        debugsettingsactivity.domainView = null;
        debugsettingsactivity.urlView = null;
        debugsettingsactivity.secureUrlView = null;
        debugsettingsactivity.dpAkaMaiView = null;
        debugsettingsactivity.dpAkaMaiOneView = null;
        debugsettingsactivity.qaView = null;
        debugsettingsactivity.clusterCheckbox = null;
        debugsettingsactivity.clusterValue = null;
        debugsettingsactivity.alphaCheckbox = null;
        debugsettingsactivity.alphaValue = null;
        debugsettingsactivity.radioView = null;
        debugsettingsactivity.apiVersionValue = null;
    }

    public volatile void reset(Object obj)
    {
        reset((DebugSettingsActivity)obj);
    }

    public ()
    {
    }
}

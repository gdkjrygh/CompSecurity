// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.content.DialogInterface;
import android.preference.Preference;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.worklight.common:
//            WLPreferences, WLUtils

class this._cls0
    implements android.preference.ferenceChangeListener
{

    final WLPreferences this$0;

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        WLPreferences.access$1(WLPreferences.this, (String)obj);
        try
        {
            new URL(WLPreferences.access$2(WLPreferences.this));
        }
        // Misplaced declaration of an exception variable
        catch (Preference preference)
        {
            (new android.app.der(WLPreferences.this)).setTitle(WLUtils.getResourceString("titleInvalidWLServerUrl", WLPreferences.this)).setMessage((new StringBuilder(String.valueOf(WLPreferences.access$2(WLPreferences.this)))).append(" ").append(WLUtils.getResourceString("errorInvalidWLServerUrl", WLPreferences.this)).toString()).setNeutralButton(WLUtils.getResourceString("OKTitleWLServerUrl", WLPreferences.this), new android.content.DialogInterface.OnClickListener() {

                final WLPreferences._cls2 this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$1 = WLPreferences._cls2.this;
                super();
            }
            }).show();
            return false;
        }
        WLUtils.writeWLPref(getApplicationContext(), "WLServerURL", WLPreferences.access$2(WLPreferences.this));
        WLUtils.writeWLPref(getApplicationContext(), "lastSettingsUrlStatePref", WLPreferences.access$2(WLPreferences.this));
        WLPreferences.access$4(WLPreferences.this);
        return true;
    }

    _cls1.this._cls1()
    {
        this$0 = WLPreferences.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.content.Intent;
import android.preference.Preference;

// Referenced classes of package com.accuweather.android.preferences:
//            AbstractPreferenceActivity

class val.intentClassToLaunch
    implements android.preference.istener
{

    final AbstractPreferenceActivity this$0;
    final Class val$intentClassToLaunch;

    public boolean onPreferenceClick(Preference preference)
    {
        startActivity(new Intent(AbstractPreferenceActivity.this, val$intentClassToLaunch));
        return true;
    }

    ()
    {
        this$0 = final_abstractpreferenceactivity;
        val$intentClassToLaunch = Class.this;
        super();
    }
}

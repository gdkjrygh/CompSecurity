// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.preference.Preference;

// Referenced classes of package com.soundcloud.android.settings:
//            GeneralSettings

class this._cls0
    implements android.preference.renceClickListener
{

    final GeneralSettings this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        int _tmp = GeneralSettings.access$210(GeneralSettings.this);
        if (GeneralSettings.access$200(GeneralSettings.this) == 0)
        {
            GeneralSettings.access$300(GeneralSettings.this);
            GeneralSettings.access$202(GeneralSettings.this, 5);
        }
        return true;
    }

    tener()
    {
        this$0 = GeneralSettings.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.widget.CompoundButton;
import com.pandora.radio.data.o;

// Referenced classes of package com.pandora.android.daydream:
//            SettingsActivity

class a
    implements android.widget.eckedChangeListener
{

    final SettingsActivity a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        SettingsActivity.a(a).c(flag);
    }

    tener(SettingsActivity settingsactivity)
    {
        a = settingsactivity;
        super();
    }
}

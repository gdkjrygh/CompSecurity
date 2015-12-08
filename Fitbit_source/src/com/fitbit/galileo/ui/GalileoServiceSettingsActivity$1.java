// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui;

import android.widget.CompoundButton;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;

// Referenced classes of package com.fitbit.galileo.ui:
//            GalileoServiceSettingsActivity

class a
    implements android.widget.tener
{

    final GalileoServiceSettingsActivity a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        TrackerSyncPreferencesSavedState.e(flag);
    }

    (GalileoServiceSettingsActivity galileoservicesettingsactivity)
    {
        a = galileoservicesettingsactivity;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.content.SharedPreferences;
import android.widget.SeekBar;
import android.widget.TextView;
import com.snapchat.android.database.SharedPreferenceKey;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            DeveloperSettingsFragment

final class b
    implements android.widget.er
{

    private TextView a;
    private SharedPreferences b;

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        i *= 100;
        a.setText((new StringBuilder()).append(i).append("ms").toString());
        seekbar = b.edit();
        seekbar.nt(SharedPreferenceKey.DEVELOPER_OPTIONS_RELEASE_DELAY_TIMER.getKey(), i);
        seekbar.y();
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
    }

    (TextView textview, SharedPreferences sharedpreferences)
    {
        a = textview;
        b = sharedpreferences;
        super();
    }
}

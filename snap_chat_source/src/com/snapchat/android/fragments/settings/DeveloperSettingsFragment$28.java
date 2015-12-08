// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.view.View;
import android.widget.AdapterView;
import com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            DeveloperSettingsFragment

final class a
    implements android.widget.tener
{

    private DeveloperSettingsFragment a;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (i < com.snapchat.android.camera.transcoding..OverwrittenTranscodingState.values().length)
        {
            DeveloperSettingsFragment.d(a);
            TranscodingPreferencesWrapper.a(com.snapchat.android.camera.transcoding..OverwrittenTranscodingState.values()[i]);
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    (DeveloperSettingsFragment developersettingsfragment)
    {
        a = developersettingsfragment;
        super();
    }
}

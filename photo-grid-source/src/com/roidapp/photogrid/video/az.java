// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector

final class az
    implements android.view.View.OnClickListener
{

    final TrackSelector a;

    az(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void onClick(View view)
    {
        view = PreferenceManager.getDefaultSharedPreferences(TrackSelector.b(a));
        if (view != null)
        {
            TrackSelector.a(a, view.getBoolean("music_policy", true));
        }
        if (TrackSelector.n(a))
        {
            TrackSelector.o(a);
            return;
        } else
        {
            TrackSelector.p(a);
            return;
        }
    }
}

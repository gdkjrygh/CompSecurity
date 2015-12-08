// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector

final class ax
    implements android.content.DialogInterface.OnClickListener
{

    final TrackSelector a;

    ax(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PreferenceManager.getDefaultSharedPreferences(TrackSelector.b(a)).edit().putBoolean("music_policy", false).apply();
        dialoginterface.dismiss();
        TrackSelector.a(a, false);
        TrackSelector.p(a);
        TrackSelector.J(a);
    }
}

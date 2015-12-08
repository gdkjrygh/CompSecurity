// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import android.widget.CompoundButton;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            LastFmSettingsCell

final class a
    implements android.widget.kedChangeListener
{

    private LastFmSettingsCell a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            LastFmSettingsCell.b(a);
            return;
        } else
        {
            LastFmSettingsCell.a(a.getContext(), LastFmSettingsCell.c(a), "");
            return;
        }
    }

    (LastFmSettingsCell lastfmsettingscell)
    {
        a = lastfmsettingscell;
        super();
    }
}

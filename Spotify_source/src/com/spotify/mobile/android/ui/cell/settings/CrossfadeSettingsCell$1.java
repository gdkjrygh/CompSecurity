// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import android.graphics.Point;
import android.widget.PopupWindow;
import android.widget.SeekBar;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            CrossfadeSettingsCell

final class a
    implements android.widget.istener
{

    private CrossfadeSettingsCell a;

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (!flag)
        {
            return;
        } else
        {
            CrossfadeSettingsCell.c(a, i);
            Point point = CrossfadeSettingsCell.d(a, i);
            CrossfadeSettingsCell.a(a).update(seekbar, point.x, point.y, -1, -1);
            return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        CrossfadeSettingsCell.a(a, ((seekbar.getWidth() - seekbar.getPaddingLeft() - seekbar.getPaddingRight()) + seekbar.getThumbOffset() * 2) - CrossfadeSettingsCell.b(a));
        CrossfadeSettingsCell.b(a, (seekbar.getPaddingLeft() - seekbar.getThumbOffset()) + CrossfadeSettingsCell.b(a) / 2);
        int i = seekbar.getProgress();
        CrossfadeSettingsCell.c(a, seekbar.getProgress());
        Point point = CrossfadeSettingsCell.d(a, i);
        CrossfadeSettingsCell.a(a).showAsDropDown(seekbar, point.x, point.y);
        a.d = true;
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        a.a();
        CrossfadeSettingsCell.a(a).dismiss();
        a.d = false;
    }

    I(CrossfadeSettingsCell crossfadesettingscell)
    {
        a = crossfadesettingscell;
        super();
    }
}

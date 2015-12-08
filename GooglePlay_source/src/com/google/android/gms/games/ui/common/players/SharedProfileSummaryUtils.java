// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.players;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.HexagonShape;
import java.text.NumberFormat;
import java.util.Locale;

public final class SharedProfileSummaryUtils
{

    public static void addLevelUpCongrats(Resources resources, TextView textview, TextView textview1, int i)
    {
        ShapeDrawable shapedrawable = new ShapeDrawable(new HexagonShape());
        shapedrawable.getPaint().setColor(UiUtils.getLevelColor(resources, i));
        if (PlatformVersion.checkVersion(16))
        {
            textview.setBackground(shapedrawable);
        } else
        {
            textview.setBackgroundDrawable(shapedrawable);
        }
        textview.setText(String.valueOf(i));
        textview1.setText(0x7f1002a8);
        textview.setVisibility(0);
        textview1.setVisibility(0);
    }

    public static void addLevelUpCongrats(Resources resources, PlayerLevelInfo playerlevelinfo, TextView textview, TextView textview1)
    {
        int i;
        if (playerlevelinfo == null)
        {
            i = 1;
        } else
        {
            i = playerlevelinfo.mCurrentLevel.mLevelNumber;
        }
        addLevelUpCongrats(resources, textview, textview1, i);
    }

    public static void displayLevelInformation(PlayerLevelInfo playerlevelinfo, Resources resources, ProgressBar progressbar, TextView textview)
    {
        PlayerLevel playerlevel = playerlevelinfo.mCurrentLevel;
        PlayerLevel playerlevel1 = playerlevelinfo.mNextLevel;
        int i;
        if (playerlevelinfo == null)
        {
            i = 1;
        } else
        {
            i = playerlevelinfo.mCurrentLevel.mLevelNumber;
        }
        i = UiUtils.getLevelColor(resources, i);
        if (playerlevel1.equals(playerlevel))
        {
            displayMaxLevelInformation(resources, progressbar, textview, (int)playerlevelinfo.mCurrentXpTotal, i);
            return;
        } else
        {
            int j = (int)(playerlevel.mMaxXp - playerlevel.mMinXp);
            displayNextLevelInformation(resources, progressbar, textview, (int)(playerlevelinfo.mCurrentXpTotal - playerlevel.mMinXp), j, i);
            return;
        }
    }

    public static void displayMaxLevelInformation(Resources resources, ProgressBar progressbar, TextView textview, int i, int j)
    {
        textview.setText(resources.getString(0x7f1002a6, new Object[] {
            NumberFormat.getInstance(Locale.getDefault()).format(i)
        }));
        textview.setTextColor(j);
        textview.setVisibility(0);
        progressbar.setVisibility(8);
    }

    public static void displayNextLevelInformation(Resources resources, ProgressBar progressbar, TextView textview, int i, int j, int k)
    {
        if (j <= 0)
        {
            textview.setVisibility(8);
            progressbar.setVisibility(8);
            return;
        }
        NumberFormat numberformat = NumberFormat.getInstance(Locale.getDefault());
        Object obj = new ShapeDrawable();
        ((ShapeDrawable) (obj)).getPaint().setColor(k);
        obj = new ClipDrawable(((android.graphics.drawable.Drawable) (obj)), 3, 1);
        int l = 0;
        if (j > 0)
        {
            l = (int)(10000D * ((double)i / (double)j));
        }
        ((ClipDrawable) (obj)).setLevel(l);
        progressbar.setProgressDrawable(((android.graphics.drawable.Drawable) (obj)));
        progressbar.setMax(j);
        progressbar.setProgress(0);
        progressbar.setProgress(i);
        textview.setText(resources.getString(0x7f1002a9, new Object[] {
            numberformat.format(j - i)
        }));
        textview.setTextColor(k);
        textview.setVisibility(0);
        progressbar.setVisibility(0);
    }

    public static boolean shouldDisplayLevelUpCongrats(PlayerLevelInfo playerlevelinfo)
    {
        long l = playerlevelinfo.mLastLevelUpTimestamp;
        return playerlevelinfo.mLastLevelUpTimestamp > 0L && System.currentTimeMillis() - l <= ((Long)G.maxLevelUpCongratsTime.get()).longValue();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.card;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package me.lyft.android.ui.driver.achievements.card:
//            AchievementCardView

public class DarkAchievementCardView extends AchievementCardView
{

    public DarkAchievementCardView(Context context)
    {
        super(context);
    }

    int getBackgroundColor()
    {
        return getResources().getColor(0x7f0c0025);
    }

    int getBackgroundDialColor()
    {
        return getResources().getColor(0x7f0c0021);
    }

    int getDialColor()
    {
        return getResources().getColor(0x7f0c0082);
    }

    Drawable getGoalMetIcon()
    {
        return getResources().getDrawable(0x7f02001a);
    }

    Drawable getInfoIcon()
    {
        return getResources().getDrawable(0x7f020169);
    }

    int getSubtitleColor()
    {
        return getResources().getColor(0x7f0c006b);
    }

    int getTitleColor()
    {
        return getResources().getColor(0x7f0c00a4);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.achievements;

import android.os.Bundle;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;

public final class ClientAchievementListActivity extends ClientFragmentActivity
{

    public ClientAchievementListActivity()
    {
        super(0x7f040044, 0x7f12000d);
    }

    protected final int getLogEventType()
    {
        return 1;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mShowGameNameAsTitle = false;
        setTitle(0x7f100095);
        mShowTitleInActionBar = false;
    }

    protected final boolean useGameThemeColorAsBackground()
    {
        return true;
    }
}

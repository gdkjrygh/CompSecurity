// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

private final class mTitle extends mTitle
{

    private int mTitle;
    final GamesSettingsFragment this$0;

    public final void onBindView(View view)
    {
        ((TextView)view).setText(mTitle);
    }

    public (int i)
    {
        this$0 = GamesSettingsFragment.this;
        super(GamesSettingsFragment.this, 0, 0, false);
        mTitle = i;
    }
}

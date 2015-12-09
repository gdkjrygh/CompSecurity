// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

private final class mSize extends mSize
{

    private int mSize;
    final GamesSettingsFragment this$0;

    public final void onBindView(View view)
    {
        view = view.getLayoutParams();
        view.SpacerListItem = -1;
        view.SpacerListItem = mSize;
    }

    public (int i)
    {
        this$0 = GamesSettingsFragment.this;
        super(GamesSettingsFragment.this, 11, 4, false);
        mSize = i;
    }
}

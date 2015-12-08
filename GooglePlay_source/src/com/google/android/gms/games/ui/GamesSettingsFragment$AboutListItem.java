// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

private final class > extends >
{

    final GamesSettingsFragment this$0;

    public final void onBindView(View view)
    {
        ((TextView)view.findViewById(0x7f0d0075)).setText(getString(0x7f100169, new Object[] {
            getString(0x7f100030)
        }));
        ((TextView)view.findViewById(0x7f0d024a)).setText(GamesSettingsFragment.access$600(GamesSettingsFragment.this));
    }

    public I()
    {
        this$0 = GamesSettingsFragment.this;
        super(GamesSettingsFragment.this, 6, 1, false);
    }
}

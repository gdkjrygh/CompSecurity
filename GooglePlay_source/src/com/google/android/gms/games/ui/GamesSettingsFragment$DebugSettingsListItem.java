// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

private final class this._cls0 extends this._cls0
{

    final GamesSettingsFragment this$0;

    public final void onBindView(View view)
    {
        ((TextView)view.findViewById(0x7f0d0075)).setText(0x7f100282);
        ((TextView)view.findViewById(0x7f0d024a)).setText("");
        view.findViewById(0x7f0d0292).setVisibility(8);
    }

    public Q()
    {
        this$0 = GamesSettingsFragment.this;
        super(GamesSettingsFragment.this, 5, 1, true);
    }
}

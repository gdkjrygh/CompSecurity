// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import com.google.android.gms.common.internal.Asserts;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            TabSpec

public final class TabConfig
{

    public final int defaultTabIndex;
    public final TabSpec tabSpecs[];

    public TabConfig()
    {
        tabSpecs = new TabSpec[0];
        defaultTabIndex = -1;
    }

    public TabConfig(TabSpec atabspec[])
    {
        Asserts.checkNotNull(atabspec);
        tabSpecs = atabspec;
        defaultTabIndex = 0;
    }
}

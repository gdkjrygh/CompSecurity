// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;

import fua;

// Referenced classes of package com.spotify.mobile.android.ui.adapter:
//            SettingsAdapter

final class 
    implements fua
{

    private int a[] = {
        2, 3, 4
    };

    public final int a(int i)
    {
        return a[i];
    }

    public final int b(int i)
    {
        if (i > 2)
        {
            if (i <= 3)
            {
                return 1;
            }
            if (i <= 4)
            {
                return 2;
            }
        }
        return 0;
    }

    ()
    {
    }
}

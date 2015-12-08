// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import Br;
import Bs;

// Referenced classes of package com.snapchat.android:
//            LandingPageActivity

final class a
    implements Runnable
{

    private Br a;
    private LandingPageActivity b;

    public final void run()
    {
        Bs bs = b.e;
        Br br = a;
        if (bs.mLateLoading)
        {
            com.snapchat.android.database.table.roup aroup[] = com.snapchat.android.database.table.roup.values();
            int j = aroup.length;
            for (int i = 0; i < j; i++)
            {
                com.snapchat.android.database.table.roup roup = aroup[i];
                if (roup.isLateLoading())
                {
                    bs.a(roup, br);
                }
            }

        }
    }

    .DatabaseTableGroup(LandingPageActivity landingpageactivity, Br br)
    {
        b = landingpageactivity;
        a = br;
        super();
    }
}

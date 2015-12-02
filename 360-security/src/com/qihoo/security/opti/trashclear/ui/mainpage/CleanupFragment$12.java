// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class a extends BroadcastReceiver
{

    final CleanupFragment a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            if ("action_get_data_size".equals(intent.getAction()))
            {
                if (CleanupFragment.c(a))
                {
                    CleanupFragment.a(a, intent.getLongExtra("size", 0L));
                }
            } else
            if ("action_get_pre_data_size".equals(intent.getAction()) && CleanupFragment.d(a))
            {
                CleanupFragment.b(a, intent.getLongExtra("size", 0L));
                return;
            }
        }
    }

    (CleanupFragment cleanupfragment)
    {
        a = cleanupfragment;
        super();
    }
}

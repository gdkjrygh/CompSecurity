// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.mobvista.sdk.m.core.entity.CampaignEx;
import java.util.HashMap;

// Referenced classes of package com.mobvista.sdk.m.core:
//            MobvistaAdWall, ac

final class ab extends BroadcastReceiver
{

    final MobvistaAdWall a;

    ab(MobvistaAdWall mobvistaadwall)
    {
        a = mobvistaadwall;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (TextUtils.isEmpty(intent.getAction())) goto _L2; else goto _L1
_L1:
        context = intent.getStringExtra("ORDER");
        if (!context.equals("REFRESH")) goto _L4; else goto _L3
_L3:
        int i = intent.getIntExtra("WHICH", 0);
        MobvistaAdWall.a(a, i);
_L2:
        return;
_L4:
        if (!context.equals("INSTALL"))
        {
            break; /* Loop/switch isn't completed */
        }
        context = (CampaignEx)intent.getSerializableExtra("CAMPAIGN");
        if (context != null)
        {
            MobvistaAdWall.a(a).a(true);
            MobvistaAdWall.a(a).b(context);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if ("CLICK_CANCEL".equals(context))
        {
            MobvistaAdWall.a(a).b();
            return;
        }
        if ("UNREGIST".equals(context))
        {
            int j = intent.getIntExtra("UNREGIST_KEY", 0);
            if (MobvistaAdWall.d(a) != null && MobvistaAdWall.e(a).containsKey(Integer.valueOf(j)))
            {
                Log.e("", (new StringBuilder("mAdWallReceiver 3 = ")).append(MobvistaAdWall.e(a).get(Integer.valueOf(j))).toString());
                MobvistaAdWall.d(a).getApplicationContext().unregisterReceiver((BroadcastReceiver)MobvistaAdWall.e(a).get(Integer.valueOf(j)));
                MobvistaAdWall.e(a).remove(Integer.valueOf(j));
                a.release();
                return;
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }
}

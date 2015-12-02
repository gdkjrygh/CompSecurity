// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.Context;
import android.content.Intent;
import com.mobvista.sdk.m.core.entity.CampaignEx;
import com.mobvista.sdk.m.core.loader.g;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.mobvista.sdk.m.core:
//            MobvistaAdWall, ac

final class w
    implements g
{

    final int a;
    final MobvistaAdWall b;

    w(MobvistaAdWall mobvistaadwall, int i)
    {
        b = mobvistaadwall;
        a = i;
        super();
    }

    public final void a(Object obj)
    {
        Intent intent;
        obj = (List)obj;
        if (obj != null && ((List) (obj)).size() > 0)
        {
            Iterator iterator = ((List) (obj)).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                CampaignEx campaignex = (CampaignEx)iterator.next();
                if (campaignex.isPreClick())
                {
                    MobvistaAdWall.a(b).a(campaignex, false);
                }
            } while (true);
        }
        if (!MobvistaAdWall.b(b))
        {
            return;
        }
        intent = new Intent();
        intent.setAction((new StringBuilder("com.mobvista.sdk.m.ACTION_LOAD_DATA")).append(MobvistaAdWall.c(b)).toString());
        if (a != 0) goto _L2; else goto _L1
_L1:
        intent.putExtra("ORDER", "MV_TOP_FINISH");
_L4:
        intent.putExtra("RESULT", "LOADED");
        intent.putExtra("NUM", ((List) (obj)).size());
        MobvistaAdWall.d(b).sendBroadcast(intent);
        return;
_L2:
        if (a == 1)
        {
            intent.putExtra("ORDER", "MV_GAME_FINISH");
        } else
        if (a == 2)
        {
            intent.putExtra("ORDER", "MV_UTILITY_FINISH");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(String s)
    {
        Intent intent;
        if (!MobvistaAdWall.b(b))
        {
            return;
        }
        intent = new Intent();
        intent.setAction((new StringBuilder("com.mobvista.sdk.m.ACTION_LOAD_DATA")).append(MobvistaAdWall.c(b)).toString());
        if (a != 0) goto _L2; else goto _L1
_L1:
        intent.putExtra("ORDER", "MV_TOP_FINISH");
_L4:
        intent.putExtra("RESULT", "ERROR");
        intent.putExtra("MSG", s);
        MobvistaAdWall.d(b).sendBroadcast(intent);
        return;
_L2:
        if (a == 1)
        {
            intent.putExtra("ORDER", "MV_GAME_FINISH");
        } else
        if (a == 2)
        {
            intent.putExtra("ORDER", "MV_UTILITY_FINISH");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(Object obj)
    {
        Intent intent;
        obj = (List)obj;
        if (obj != null && ((List) (obj)).size() > 0)
        {
            Iterator iterator = ((List) (obj)).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                CampaignEx campaignex = (CampaignEx)iterator.next();
                if (campaignex.isPreClick())
                {
                    MobvistaAdWall.a(b).a(campaignex, false);
                }
            } while (true);
        }
        if (!MobvistaAdWall.b(b))
        {
            return;
        }
        intent = new Intent();
        intent.setAction((new StringBuilder("com.mobvista.sdk.m.ACTION_LOAD_DATA")).append(MobvistaAdWall.c(b)).toString());
        if (a != 0) goto _L2; else goto _L1
_L1:
        intent.putExtra("ORDER", "MV_TOP_FINISH");
_L4:
        intent.putExtra("RESULT", "LOADED");
        intent.putExtra("NUM", ((List) (obj)).size());
        MobvistaAdWall.d(b).sendBroadcast(intent);
        return;
_L2:
        if (a == 1)
        {
            intent.putExtra("ORDER", "MV_GAME_FINISH");
        } else
        if (a == 2)
        {
            intent.putExtra("ORDER", "MV_UTILITY_FINISH");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}

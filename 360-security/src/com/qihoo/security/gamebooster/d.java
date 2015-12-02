// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.Context;
import android.util.Pair;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.adv.a.a;
import com.qihoo.security.ui.result.AdvData;
import com.qihoo.security.ui.result.f;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.gamebooster:
//            b, LocalGamePkg

public class d
{

    public static Pair a()
    {
        int i = 0;
        ArrayList arraylist = new ArrayList();
        List list = com.qihoo.security.gamebooster.b.a().b();
        if (list != null && list.size() > 0)
        {
            int j = Math.min(list.size(), 3);
            for (i = 0; i < j; i++)
            {
                LocalGamePkg localgamepkg = (LocalGamePkg)list.get(i);
                if (localgamepkg != null)
                {
                    arraylist.add(localgamepkg.getPkgName());
                }
            }

            return new Pair(Integer.valueOf(0), arraylist);
        }
        list = com.qihoo.security.adv.a.a.a().d(com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderAllLikeData);
        list = f.a(com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterFolderAllLikeData, list, true);
        if (list != null && list.size() > 0)
        {
            for (int k = Math.min(list.size(), 3); i < k; i++)
            {
                AdvData advdata = (AdvData)list.get(i);
                if (advdata != null)
                {
                    arraylist.add(advdata.icon);
                }
            }

            return new Pair(Integer.valueOf(1), arraylist);
        } else
        {
            return new Pair(Integer.valueOf(2), arraylist);
        }
    }

    public static boolean a(Context context)
    {
        return SharedPref.b(SecurityApplication.a(), "Game_booster_last_open", 0L) + 0x240c8400L < System.currentTimeMillis();
    }

    public static void b()
    {
        if (SharedPref.b(SecurityApplication.a(), "sp_key_create_game_booster_time", -1L) + 0x240c8400L < System.currentTimeMillis())
        {
            com.qihoo.security.gamebooster.b.a().c();
        }
    }
}

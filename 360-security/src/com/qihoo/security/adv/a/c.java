// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv.a;

import android.content.Context;
import com.mobvista.sdk.m.core.MobvistaAd;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.result.AdvData;
import java.util.Iterator;
import java.util.List;

public class c
{

    private static final Context a = SecurityApplication.a();
    private static boolean b = false;

    public static void a(int i)
    {
        com.qihoo.security.support.b.a(25121, i);
    }

    public static void a(Context context)
    {
        while (b || context == null) 
        {
            return;
        }
        MobvistaAd.init(context.getApplicationContext(), "21600", "94c6a6e165f328c2faa40cc63974fe83");
        b = true;
    }

    public static void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype)
    {
        com.qihoo.security.support.b.a(25138, String.valueOf(advtype.getMid()), String.valueOf(com.qihoo.security.locale.language.b.d(a)));
        com.qihoo.security.support.b.a(25198, advtype.getMid(), 1);
    }

    public static void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, int i)
    {
        com.qihoo.security.support.b.a(25145, String.valueOf(advtype.getMid()), String.valueOf(i));
        d(advtype, i);
    }

    public static void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, int i, int j, long l)
    {
        com.qihoo.security.support.b.a(25139, String.valueOf(advtype.getMid()), String.valueOf(i), String.valueOf(j));
        if (i != 0) goto _L2; else goto _L1
_L1:
        com.qihoo.security.support.b.a(25199, 0, 1);
_L4:
        long l1;
label0:
        {
            if (l >= 0L)
            {
                l1 = l;
                if (l <= 0x493e0L)
                {
                    break label0;
                }
            }
            l1 = 0L;
        }
        com.qihoo.security.support.b.a(25140, String.valueOf(advtype.getMid()), String.valueOf(i), l1);
        return;
_L2:
        if (1 == i)
        {
            com.qihoo.security.support.b.a(25199, j, 1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, String s)
    {
        com.qihoo.security.support.b.a(25141, String.valueOf(advtype.getMid()), s, com.qihoo.security.locale.language.b.d(a));
        com.qihoo.security.support.b.a(25200, advtype.getMid(), 1);
    }

    public static void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, String s, int i, long l)
    {
        long l1;
label0:
        {
            com.qihoo.security.support.b.a(25142, String.valueOf(advtype.getMid()), s, i);
            com.qihoo.security.support.b.a(25201, i, 1);
            if (l >= 0L)
            {
                l1 = l;
                if (l <= 0x493e0L)
                {
                    break label0;
                }
            }
            l1 = 0L;
        }
        com.qihoo.security.support.b.a(25143, String.valueOf(advtype.getMid()), s, l1);
    }

    public static void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, List list)
    {
        if (list != null && !list.isEmpty())
        {
            Iterator iterator = list.iterator();
            int i;
            int j;
            for (i = 0; iterator.hasNext(); i = j)
            {
                AdvData advdata = (AdvData)iterator.next();
                j = i;
                if (advdata.type == 0)
                {
                    j = i + 1;
                }
                com.qihoo.security.support.b.a(25148, String.valueOf(advtype.getMid()), String.valueOf(advdata.pid), String.valueOf(advdata.type));
            }

            if (i > 0)
            {
                c(advtype, i);
            }
            b(advtype, list.size());
        }
    }

    public static boolean a(com.qihoo.security.appbox.core.c c1, boolean flag)
    {
        boolean flag1 = true;
        if (c1 != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (c1.p)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (c1.q)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (System.currentTimeMillis() - c1.r <= 0x2932e0L)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (c1.q)
        {
            return true;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private static void b(com.qihoo.security.adv.AdvDataManager.AdvType advtype, int i)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.qihoo.security.adv.AdvDataManager.AdvType.values().length];
                try
                {
                    a[com.qihoo.security.adv.AdvDataManager.AdvType.PrepareAdvData.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.qihoo.security.adv.AdvDataManager.AdvType.BoosterResultAdvData.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.qihoo.security.adv.AdvDataManager.AdvType.BatteryLifeAdvData.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.qihoo.security.adv.AdvDataManager.AdvType.CleanResultAdvData.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.qihoo.security.adv.AdvDataManager.AdvType.CleanDeepResultAdvData.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.qihoo.security.adv.AdvDataManager.AdvType.VirusResultAdvData.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.qihoo.security.adv.AdvDataManager.AdvType.VirusFullScanResultAdvData.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.qihoo.security.adv.AdvDataManager.AdvType.AppLockAdvData.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[advtype.ordinal()])
        {
        case 1: // '\001'
        case 8: // '\b'
        default:
            return;

        case 2: // '\002'
            com.qihoo.security.support.b.a(25180, i, 1);
            return;

        case 3: // '\003'
            com.qihoo.security.support.b.a(25183, i, 1);
            return;

        case 4: // '\004'
            com.qihoo.security.support.b.a(25186, i, 1);
            return;

        case 5: // '\005'
            com.qihoo.security.support.b.a(25189, i, 1);
            return;

        case 6: // '\006'
            com.qihoo.security.support.b.a(25192, i, 1);
            return;

        case 7: // '\007'
            com.qihoo.security.support.b.a(25195, i, 1);
            break;
        }
    }

    private static void c(com.qihoo.security.adv.AdvDataManager.AdvType advtype, int i)
    {
        switch (_cls1.a[advtype.ordinal()])
        {
        case 1: // '\001'
        case 8: // '\b'
        default:
            return;

        case 2: // '\002'
            com.qihoo.security.support.b.a(25181, i, 1);
            return;

        case 3: // '\003'
            com.qihoo.security.support.b.a(25184, i, 1);
            return;

        case 4: // '\004'
            com.qihoo.security.support.b.a(25187, i, 1);
            return;

        case 5: // '\005'
            com.qihoo.security.support.b.a(25190, i, 1);
            return;

        case 6: // '\006'
            com.qihoo.security.support.b.a(25193, i, 1);
            return;

        case 7: // '\007'
            com.qihoo.security.support.b.a(25196, i, 1);
            break;
        }
    }

    private static void d(com.qihoo.security.adv.AdvDataManager.AdvType advtype, int i)
    {
        switch (_cls1.a[advtype.ordinal()])
        {
        case 1: // '\001'
        case 8: // '\b'
        default:
            return;

        case 2: // '\002'
            com.qihoo.security.support.b.a(25182, i, 1);
            return;

        case 3: // '\003'
            com.qihoo.security.support.b.a(25185, i, 1);
            return;

        case 4: // '\004'
            com.qihoo.security.support.b.a(25188, i, 1);
            return;

        case 5: // '\005'
            com.qihoo.security.support.b.a(25191, i, 1);
            return;

        case 6: // '\006'
            com.qihoo.security.support.b.a(25194, i, 1);
            return;

        case 7: // '\007'
            com.qihoo.security.support.b.a(25197, i, 1);
            break;
        }
    }

}

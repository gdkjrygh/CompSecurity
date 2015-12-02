// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.mobilesafe.b.n;
import com.qihoo360.mobilesafe.b.p;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class d
{

    public static d a = null;
    final List b = new ArrayList();
    private Context c;
    private final List d = new ArrayList();

    public d()
    {
        c = SecurityApplication.a();
    }

    public static d a()
    {
        com/qihoo/security/ui/result/d;
        JVM INSTR monitorenter ;
        d d1;
        if (a == null)
        {
            a = new d();
        }
        d1 = a;
        com/qihoo/security/ui/result/d;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    static List a(d d1)
    {
        return d1.d;
    }

    static Context b(d d1)
    {
        return d1.c;
    }

    public boolean a(int i)
    {
        i;
        JVM INSTR lookupswitch 3: default 36
    //                   3: 38
    //                   6: 49
    //                   11: 60;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        return SharedPref.b(c, "sp_key_clear_show_prescan", true);
_L3:
        return SharedPref.b(c, "sp_key_clear_show_scan", true);
_L4:
        if (!SharedPref.b(c, "sp_key_game_booster_card_clicked", false) || com.qihoo.security.gamebooster.d.a(c))
        {
            return true;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public ArrayList b()
    {
        ArrayList arraylist = new ArrayList();
        com.qihoo.security.ui.result.card.c.a a1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); arraylist.add(a1))
        {
            String s = (String)iterator.next();
            a1 = new com.qihoo.security.ui.result.card.c.a();
            a1.g = s;
            a1.h = SharedPref.b(c, "sp_key_game_booster_card_type", -1);
        }

        return arraylist;
    }

    public void c()
    {
        d.clear();
        p.a().execute(new Runnable() {

            final d a;

            public void run()
            {
                Pair pair = com.qihoo.security.gamebooster.d.a();
                ((Integer)pair.first).intValue();
                JVM INSTR tableswitch 0 2: default 40
            //                           0 86
            //                           1 63
            //                           2 40;
                   goto _L1 _L2 _L3 _L1
_L1:
                SharedPref.a(d.b(a), "sp_key_game_booster_card_type", ((Integer)pair.first).intValue());
                return;
_L3:
                d.a(a).addAll((Collection)pair.second);
                continue; /* Loop/switch isn't completed */
_L2:
                d.a(a).addAll((Collection)pair.second);
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                a = d.this;
                super();
            }
        });
    }

    public String d()
    {
        long l = com.qihoo.security.opti.b.d.b(c);
        return com.qihoo.security.opti.b.d.a(c, l);
    }

    public Object e()
    {
        long l = SharedPref.b(c, "malware_scan_time", 0L);
        if (l == 0L)
        {
            return com.qihoo.security.locale.d.a().a(0x7f0c00d2);
        }
        l = System.currentTimeMillis() - l;
        if (l < 0xf731400L)
        {
            return com.qihoo.security.locale.d.a().a(0x7f0c00d3);
        } else
        {
            return n.a(0x7f0c00d1, (new StringBuilder()).append(l / 0x5265c00L).append("").toString(), c.getResources().getDimensionPixelSize(0x7f090071), 0xffff0000);
        }
    }

    public ArrayList f()
    {
        String s = SharedPref.b(c, "sp_key_clear_prescan_count", "");
        String as[];
        if (!TextUtils.isEmpty(s))
        {
            if ((as = s.split(";")) != null && as.length == 3)
            {
                ArrayList arraylist = new ArrayList();
                for (int i = 0; i < as.length; i++)
                {
                    com.qihoo.security.ui.result.card.c.a a1 = new com.qihoo.security.ui.result.card.c.a();
                    a1.a = (new int[] {
                        0x7f0c00d9, 0x7f0c003d, 0x7f0c003e
                    })[i];
                    a1.b = (new int[] {
                        0x7f02009c, 0x7f02009b, 0x7f020099
                    })[i];
                    a1.c = (new int[] {
                        0x7f080009, 0x7f080007, 0x7f080008
                    })[i];
                    a1.f = as[i];
                    arraylist.add(a1);
                }

                return arraylist;
            }
        }
        return null;
    }

    public ArrayList g()
    {
        String s = SharedPref.b(c, "sp_key_clear_scan_count", "");
        String as[];
        if (!TextUtils.isEmpty(s))
        {
            if ((as = s.split(";")) != null && as.length == 3)
            {
                ArrayList arraylist = new ArrayList();
                for (int i = 0; i < as.length; i++)
                {
                    com.qihoo.security.ui.result.card.c.a a1 = new com.qihoo.security.ui.result.card.c.a();
                    a1.a = (new int[] {
                        0x7f0c003e, 0x7f0c00de, 0x7f0c00df
                    })[i];
                    a1.b = (new int[] {
                        0x7f020099, 0x7f02009b, 0x7f020099
                    })[i];
                    a1.c = (new int[] {
                        0x7f080008, 0x7f080007, 0x7f08000a
                    })[i];
                    a1.f = as[i];
                    arraylist.add(a1);
                }

                return arraylist;
            }
        }
        return null;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.recommend;

import android.content.Context;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecommendHelper
{
    public static final class RecommendAction extends Enum
    {

        public static final RecommendAction Anivirus;
        public static final RecommendAction Boost;
        public static final RecommendAction Clean;
        private static final RecommendAction a[];
        public int cancel;
        public int click;
        public int show;

        public static RecommendAction valueOf(String s)
        {
            return (RecommendAction)Enum.valueOf(com/qihoo/security/recommend/RecommendHelper$RecommendAction, s);
        }

        public static RecommendAction[] values()
        {
            return (RecommendAction[])a.clone();
        }

        static 
        {
            Boost = new RecommendAction("Boost", 0, 28001, 28002, 28003);
            Clean = new RecommendAction("Clean", 1, 28004, 28005, 28006);
            Anivirus = new RecommendAction("Anivirus", 2, 28007, 28008, 28009);
            a = (new RecommendAction[] {
                Boost, Clean, Anivirus
            });
        }

        private RecommendAction(String s, int i, int j, int k, int l)
        {
            super(s, i);
            show = j;
            click = k;
            cancel = l;
        }
    }

    public static final class RecommendType extends Enum
    {

        public static final RecommendType Anitvirus;
        public static final RecommendType Boost;
        public static final RecommendType Clean;
        private static final RecommendType a[];
        public String countKey;
        public int iconRes;
        public int okRes;
        public RecommendAction recommendAction;
        public String timeKey;
        public int titleRes;

        public static RecommendType valueOf(String s)
        {
            return (RecommendType)Enum.valueOf(com/qihoo/security/recommend/RecommendHelper$RecommendType, s);
        }

        public static RecommendType[] values()
        {
            return (RecommendType[])a.clone();
        }

        static 
        {
            Boost = new RecommendType("Boost", 0, "last_recommend_boost_time", "boost_recommend_count", 0x7f0200f8, 0x7f0c017a, 0x7f0c017a, RecommendAction.Boost);
            Clean = new RecommendType("Clean", 1, "last_recommend_clean_time", "clean_recommend_count", 0x7f0200f9, 0x7f0c00cf, 0x7f0c00d5, RecommendAction.Clean);
            Anitvirus = new RecommendType("Anitvirus", 2, "last_recommend_anitvirus_time", "anitvirus_recommend_count", 0x7f0200f7, 0x7f0c00d0, 0x7f0c00d6, RecommendAction.Anivirus);
            a = (new RecommendType[] {
                Boost, Clean, Anitvirus
            });
        }

        private RecommendType(String s, int i, String s1, String s2, int j, int k, int l, 
                RecommendAction recommendaction)
        {
            super(s, i);
            timeKey = s1;
            countKey = s2;
            iconRes = j;
            titleRes = k;
            okRes = l;
            recommendAction = recommendaction;
        }
    }


    public static RecommendHelper a;
    private final Context b = SecurityApplication.a();
    private RecommendType c;
    private final Map d = new HashMap();

    private RecommendHelper()
    {
    }

    public static RecommendHelper a()
    {
        com/qihoo/security/recommend/RecommendHelper;
        JVM INSTR monitorenter ;
        RecommendHelper recommendhelper;
        if (a == null)
        {
            a = new RecommendHelper();
        }
        recommendhelper = a;
        com/qihoo/security/recommend/RecommendHelper;
        JVM INSTR monitorexit ;
        return recommendhelper;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(RecommendType recommendtype, int i)
    {
        SharedPref.a(b, recommendtype.countKey, i);
    }

    private int e(RecommendType recommendtype)
    {
        return SharedPref.b(b, recommendtype.countKey, 0);
    }

    private void f(RecommendType recommendtype)
    {
        SharedPref.a(b, recommendtype.timeKey, System.currentTimeMillis());
    }

    private long g(RecommendType recommendtype)
    {
        return SharedPref.b(b, recommendtype.timeKey, 0L);
    }

    private boolean h(RecommendType recommendtype)
    {
        long l = g(recommendtype);
        int i = e(recommendtype);
        return System.currentTimeMillis() - l > 0x5265c00L && i < 2;
    }

    public Object a(String s)
    {
        return d.get(s);
    }

    public void a(RecommendType recommendtype)
    {
        int i = e(recommendtype) + 1;
        if (i >= 2)
        {
            b(recommendtype);
            return;
        } else
        {
            a(recommendtype, i);
            return;
        }
    }

    public void a(String s, Object obj)
    {
        d.put(s, obj);
    }

    public RecommendType b()
    {
        return c;
    }

    public void b(RecommendType recommendtype)
    {
        if (recommendtype == null)
        {
            return;
        } else
        {
            a(recommendtype, 0);
            f(recommendtype);
            return;
        }
    }

    public RecommendType c(RecommendType recommendtype)
    {
        ArrayList arraylist = new ArrayList();
        RecommendType arecommendtype[] = RecommendType.values();
        int j = arecommendtype.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            RecommendType recommendtype1 = arecommendtype[i];
            if (recommendtype != recommendtype1 && h(recommendtype1))
            {
                arraylist.add(recommendtype1);
            }
            i++;
        } while (true);
        i = arraylist.size();
        if (i > 0)
        {
            return (RecommendType)arraylist.get((int)(Math.random() * (double)i));
        } else
        {
            return null;
        }
    }

    public void c()
    {
        d.clear();
    }

    public void d(RecommendType recommendtype)
    {
        c = recommendtype;
    }
}

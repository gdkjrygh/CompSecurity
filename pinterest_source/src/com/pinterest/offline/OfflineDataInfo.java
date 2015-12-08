// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.offline;

import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Device;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.kit.utils.NetworkUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OfflineDataInfo
{

    private static final long a;
    private static OfflineDataInfo c;
    private Set b;

    public OfflineDataInfo()
    {
    }

    private static String a(String s)
    {
        return (new StringBuilder()).append(MyUser.getUid()).append(s).toString();
    }

    public static void a(long l)
    {
        Preferences.user().set("PREF_OFFLINE_LAST_SYNC", l, true);
    }

    public static void a(boolean flag)
    {
        Preferences.persisted().set(a("PREF_OFFLINE_ENABLED"), flag, true);
    }

    public static boolean a()
    {
        if (!d())
        {
            PLog.log("OfflineDataRetriever", "Sync not enabled.", new Object[0]);
            return false;
        }
        if (!c())
        {
            PLog.log("OfflineDataRetriever", "Not enough free space on device.", new Object[0]);
            return false;
        }
        boolean flag;
        if (Device.isCharging() || Device.getBatteryLevel() >= 25F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            PLog.log("OfflineDataRetriever", "Not enough battery.", new Object[0]);
            return false;
        }
        if (!b())
        {
            PLog.log("OfflineDataRetriever", "Synced data is invalid, missing, or corrupt.", new Object[0]);
            return true;
        }
        long l = h();
        if (System.currentTimeMillis() - l > a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            PLog.log("OfflineDataRetriever", "Synced data is stale.", new Object[0]);
            return true;
        }
        if (ModelHelper.getNextSyncJob() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            PLog.log("OfflineDataRetriever", "Synced data is fresh and complete.", new Object[0]);
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean b()
    {
        return h() > Preferences.persisted().getLong("PREF_DB_CREATED_AT", 0L);
    }

    public static boolean c()
    {
        return DiskCache.getFreeSpace() >= 0x3200000L;
    }

    public static boolean d()
    {
        User user = MyUser.get();
        boolean flag;
        if (user != null && user.getPinCountDisplay() < 2000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Experiments.v() && Preferences.persisted().getBoolean(a("PREF_OFFLINE_ENABLED"), flag);
    }

    public static boolean f()
    {
        return Experiments.v() && !NetworkUtils.getInstance().hasInternet() && d();
    }

    public static OfflineDataInfo g()
    {
        if (c == null)
        {
            c = new OfflineDataInfo();
        }
        return c;
    }

    private static long h()
    {
        return Preferences.user().getLong("PREF_OFFLINE_LAST_SYNC", 0L);
    }

    public final Set a(List list)
    {
        Set set = Preferences.persisted().getStringSet(a("PREF_OFFLINE_BOARD_IDS"), null);
        Object obj = set;
        if (set == null)
        {
            obj = new HashSet(list.size());
            for (int i = 0; i < list.size(); i++)
            {
                ((Set) (obj)).add(((Board)list.get(i)).getUid());
            }

            a(((Set) (obj)));
        }
        return ((Set) (obj));
    }

    public final void a(Set set)
    {
        synchronized (c)
        {
            b = set;
        }
        Preferences.persisted().set(a("PREF_OFFLINE_BOARD_IDS"), set, true);
        return;
        set;
        offlinedatainfo;
        JVM INSTR monitorexit ;
        throw set;
    }

    public final Set e()
    {
        synchronized (c)
        {
            if (b == null)
            {
                b = new HashSet(Preferences.persisted().getStringSet(a("PREF_OFFLINE_BOARD_IDS"), new HashSet()));
            }
        }
        return b;
        exception;
        offlinedatainfo;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String toString()
    {
        return Resources.string(0x7f0703d1, new Object[] {
            Long.valueOf((ModelHelper.getInstance().getSizeOnDisk() + ImageCache.getPersistent().getSizeOnDisk()) / 0xf4240L)
        });
    }

    static 
    {
        long l;
        if (ApplicationInfo.isNonProduction())
        {
            l = 5000L;
        } else
        {
            l = 0x2932e00L;
        }
        a = l;
    }
}

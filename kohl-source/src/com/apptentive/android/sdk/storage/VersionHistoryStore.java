// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.util.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class VersionHistoryStore
{
    public static final class Selector extends Enum
    {

        private static final Selector $VALUES[];
        public static final Selector build;
        public static final Selector other;
        public static final Selector total;
        public static final Selector version;

        public static Selector parse(String s)
        {
            try
            {
                s = valueOf(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return other;
            }
            return s;
        }

        public static Selector valueOf(String s)
        {
            return (Selector)Enum.valueOf(com/apptentive/android/sdk/storage/VersionHistoryStore$Selector, s);
        }

        public static Selector[] values()
        {
            return (Selector[])$VALUES.clone();
        }

        static 
        {
            total = new Selector("total", 0);
            version = new Selector("version", 1);
            build = new Selector("build", 2);
            other = new Selector("other", 3);
            $VALUES = (new Selector[] {
                total, version, build, other
            });
        }

        private Selector(String s, int i)
        {
            super(s, i);
        }
    }

    public static class VersionHistoryEntry
    {

        public Double seconds;
        public Integer versionCode;
        public String versionName;

        public String toString()
        {
            return (new StringBuilder()).append(String.valueOf(seconds)).append("--").append(String.valueOf(versionCode)).append("--").append(versionName).toString();
        }

        public VersionHistoryEntry(Double double1, Integer integer, String s)
        {
            seconds = double1;
            versionCode = integer;
            versionName = s;
        }

        public VersionHistoryEntry(String s)
        {
            if (s != null)
            {
                s = s.replace("__", "").split("--");
                seconds = Double.valueOf(s[0]);
                versionCode = Integer.valueOf(Integer.parseInt(s[1]));
                versionName = s[2];
            }
        }
    }


    public static final String ENTRY_SEP = "__";
    public static final String FIELD_SEP = "--";

    public VersionHistoryStore()
    {
    }

    public static VersionHistoryEntry getLastVersionSeen(Context context)
    {
        context = getVersionHistory(context);
        if (context != null && !context.isEmpty())
        {
            return (VersionHistoryEntry)context.get(context.size() - 1);
        } else
        {
            return null;
        }
    }

    public static Double getTimeSinceVersionFirstSeen(Context context, Selector selector)
    {
        VersionHistoryEntry versionhistoryentry;
        Object obj;
        Object obj1;
        obj1 = getVersionHistory(context);
        obj = null;
        versionhistoryentry = obj;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj1 = ((List) (obj1)).iterator();
_L8:
        versionhistoryentry = obj;
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L3
_L3:
        versionhistoryentry = (VersionHistoryEntry)((Iterator) (obj1)).next();
        static class _cls1
        {

            static final int $SwitchMap$com$apptentive$android$sdk$storage$VersionHistoryStore$Selector[];

            static 
            {
                $SwitchMap$com$apptentive$android$sdk$storage$VersionHistoryStore$Selector = new int[Selector.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$storage$VersionHistoryStore$Selector[Selector.total.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$storage$VersionHistoryStore$Selector[Selector.version.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$storage$VersionHistoryStore$Selector[Selector.build.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.apptentive.android.sdk.storage.VersionHistoryStore.Selector[selector.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 82
    //                   2 101
    //                   3 118;
           goto _L4 _L2 _L5 _L6
_L4:
        return null;
_L2:
        if (versionhistoryentry != null)
        {
            return Double.valueOf(Util.currentTimeSeconds() - versionhistoryentry.seconds.doubleValue());
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (!versionhistoryentry.versionName.equals(Util.getAppVersionName(context))) goto _L7; else goto _L2
        if (true) goto _L4; else goto _L7
_L7:
        break; /* Loop/switch isn't completed */
_L6:
        if (!versionhistoryentry.versionCode.equals(Integer.valueOf(Util.getAppVersionCode(context)))) goto _L8; else goto _L2
    }

    public static List getVersionHistory(Context context)
    {
        ArrayList arraylist = new ArrayList();
        context = context.getSharedPreferences("APPTENTIVE", 0).getString("versionHistory", null);
        if (context != null)
        {
            context = context.split("__");
            for (int i = 0; i < context.length; i++)
            {
                arraylist.add(new VersionHistoryEntry(context[i]));
            }

        }
        return arraylist;
    }

    public static boolean isUpdate(Context context, Selector selector)
    {
        Object obj;
        obj = getVersionHistory(context);
        context = new HashSet();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L4:
        if (((Iterator) (obj)).hasNext())
        {
            VersionHistoryEntry versionhistoryentry = (VersionHistoryEntry)((Iterator) (obj)).next();
            switch (_cls1..SwitchMap.com.apptentive.android.sdk.storage.VersionHistoryStore.Selector[selector.ordinal()])
            {
            case 2: // '\002'
                context.add(versionhistoryentry.versionName);
                break;

            case 3: // '\003'
                context.add(String.valueOf(versionhistoryentry.versionCode));
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return context.size() > 1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void saveVersionHistory(Context context, List list)
    {
        context = context.getSharedPreferences("APPTENTIVE", 0);
        StringBuilder stringbuilder = new StringBuilder();
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(((VersionHistoryEntry)list.next()).toString()).append("__")) { }
        context.edit().putString("versionHistory", stringbuilder.toString()).commit();
    }

    public static void updateVersionHistory(Context context, Integer integer, String s)
    {
        updateVersionHistory(context, integer, s, Util.currentTimeSeconds());
    }

    public static void updateVersionHistory(Context context, Integer integer, String s, double d)
    {
        Log.d("Updating version info: %d, %s @%f", new Object[] {
            integer, s, Double.valueOf(d)
        });
        List list = getVersionHistory(context);
        boolean flag1 = false;
        boolean flag = false;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            VersionHistoryEntry versionhistoryentry = (VersionHistoryEntry)iterator.next();
            boolean flag2 = flag1;
            if (integer.equals(versionhistoryentry.versionCode))
            {
                flag2 = true;
            }
            flag1 = flag2;
            if (s.equals(versionhistoryentry.versionName))
            {
                flag = true;
                flag1 = flag2;
            }
        } while (true);
        if (!flag1 || !flag)
        {
            list.add(new VersionHistoryEntry(Double.valueOf(d), integer, s));
            saveVersionHistory(context, list);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import dmz;
import gev;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

public class ProcessIdentifier
{

    private final Context a;

    public ProcessIdentifier(Context context)
    {
        a = context.getApplicationContext();
    }

    private static String b()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        dmz.a(com/spotify/mobile/android/util/ProcessIdentifier, gev);
        obj = obj1;
        obj1 = gev.a();
        obj = obj1;
        Object obj2 = new StringBuilder(64);
_L2:
        obj = obj1;
        int i = ((Reader) (obj1)).read();
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((StringBuilder) (obj2)).append((char)i);
        if (true) goto _L2; else goto _L1
        obj1;
        if (obj != null)
        {
            ((Reader) (obj)).close();
        }
        throw obj1;
_L1:
        obj = obj1;
        obj2 = ((StringBuilder) (obj2)).toString();
        ((Reader) (obj1)).close();
        return ((String) (obj2));
    }

    public final ProcessType a()
    {
        Object obj = b();
_L2:
        if (((String) (obj)).contains("robolectric.ui"))
        {
            return ProcessType.b;
        }
        break; /* Loop/switch isn't completed */
        obj;
        int i = Process.myPid();
        obj = (ActivityManager)a.getSystemService("activity");
        for (Iterator iterator = ((ActivityManager) (obj)).getRunningAppProcesses().iterator(); iterator.hasNext();)
        {
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
            if (runningappprocessinfo.pid == i)
            {
                obj = runningappprocessinfo.processName;
                continue; /* Loop/switch isn't completed */
            }
        }

        for (obj = ((ActivityManager) (obj)).getRunningServices(10000).iterator(); ((Iterator) (obj)).hasNext();)
        {
            android.app.ActivityManager.RunningServiceInfo runningserviceinfo = (android.app.ActivityManager.RunningServiceInfo)((Iterator) (obj)).next();
            if (runningserviceinfo.pid == i)
            {
                obj = runningserviceinfo.process;
                continue; /* Loop/switch isn't completed */
            }
        }

        obj = "com.spotify.music";
        if (true) goto _L2; else goto _L1
_L1:
        if (((String) (obj)).contains(".gdbprocess"))
        {
            return ProcessType.c;
        } else
        {
            return ProcessType.a;
        }
    }

    static 
    {
        dmz.a(com/spotify/mobile/android/util/ProcessIdentifier, gev, new gev());
    }

    private class ProcessType extends Enum
    {

        public static final ProcessType a;
        public static final ProcessType b;
        public static final ProcessType c;
        public static final ProcessType d;
        private static final ProcessType e[];

        public static ProcessType valueOf(String s)
        {
            return (ProcessType)Enum.valueOf(com/spotify/mobile/android/util/ProcessIdentifier$ProcessType, s);
        }

        public static ProcessType[] values()
        {
            return (ProcessType[])e.clone();
        }

        static 
        {
            a = new ProcessType("MAIN", 0);
            b = new ProcessType("ROBOLECTRIC", 1);
            c = new ProcessType("GDBPROCESS", 2);
            d = new ProcessType("UNKNOWN", 3);
            e = (new ProcessType[] {
                a, b, c, d
            });
        }

        private ProcessType(String s, int i)
        {
            super(s, i);
        }
    }

}

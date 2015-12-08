// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class ServerSavedState extends com.fitbit.savedstate.a
{
    public static final class ApplicationBackoffType extends Enum
    {

        public static final ApplicationBackoffType a;
        public static final ApplicationBackoffType b;
        private static final ApplicationBackoffType c[];

        public static ApplicationBackoffType valueOf(String s)
        {
            return (ApplicationBackoffType)Enum.valueOf(com/fitbit/savedstate/ServerSavedState$ApplicationBackoffType, s);
        }

        public static ApplicationBackoffType[] values()
        {
            return (ApplicationBackoffType[])c.clone();
        }

        static 
        {
            a = new ApplicationBackoffType("AUTO", 0);
            b = new ApplicationBackoffType("MANUAL", 1);
            c = (new ApplicationBackoffType[] {
                a, b
            });
        }

        private ApplicationBackoffType(String s, int i1)
        {
            super(s, i1);
        }
    }


    public static long b = 0L;
    private static final ServerSavedState c = new ServerSavedState();
    private static final String d = "PROXY";
    private static final String e = "IDLE_TIME_KEY";
    private static final String f = "IDLE_KEY";
    private static final String g = "IDLE_TYPE";
    private static final String h = "SERVER_URL";
    private static final String i = "CLIENT_URL";
    private static final String j = "ServerSavedState";

    ServerSavedState()
    {
        super("ServerSavedState");
    }

    public static void a(long l1, ApplicationBackoffType applicationbackofftype)
    {
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("ServerSavedState", "APPLICATION BACKOFF: Back off is turned on for %s msec", new Object[] {
            Long.valueOf(l1)
        });
        c.c().putLong("IDLE_TIME_KEY", System.currentTimeMillis()).putLong("IDLE_KEY", l1).putInt("IDLE_TYPE", applicationbackofftype.ordinal()).apply();
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorexit ;
        return;
        applicationbackofftype;
        throw applicationbackofftype;
    }

    public static void a(String s)
    {
        c.c().putString("SERVER_URL", s).apply();
    }

    public static boolean a(ApplicationBackoffType applicationbackofftype)
    {
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorenter ;
        if (!k()) goto _L2; else goto _L1
_L1:
        boolean flag = l().equals(applicationbackofftype);
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        applicationbackofftype;
        throw applicationbackofftype;
    }

    public static void b(ApplicationBackoffType applicationbackofftype)
    {
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorenter ;
        if (a(applicationbackofftype))
        {
            com.fitbit.e.a.a("ServerSavedState", "resetIdle of type: %s", new Object[] {
                applicationbackofftype
            });
            m();
        }
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorexit ;
        return;
        applicationbackofftype;
        throw applicationbackofftype;
    }

    public static void b(String s)
    {
        c.c().putString("CLIENT_URL", s).apply();
    }

    public static void c(String s)
    {
        c.c().putString("PROXY", s).apply();
    }

    protected static com.fitbit.savedstate.a g()
    {
        return c;
    }

    public static String h()
    {
        return c.b().getString("SERVER_URL", "https://android-api.fitbit.com");
    }

    public static String i()
    {
        return c.b().getString("CLIENT_URL", "https://android-client.fitbit.com");
    }

    public static String j()
    {
        return c.b().getString("PROXY", "");
    }

    public static boolean k()
    {
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        long l3;
        SharedPreferences sharedpreferences = c.b();
        l1 = sharedpreferences.getLong("IDLE_TIME_KEY", 0L);
        l2 = sharedpreferences.getLong("IDLE_KEY", b);
        l3 = System.currentTimeMillis();
        boolean flag;
        if (l3 - l1 < l2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static ApplicationBackoffType l()
    {
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorenter ;
        ApplicationBackoffType aapplicationbackofftype[];
        int i1;
        SharedPreferences sharedpreferences = c.b();
        aapplicationbackofftype = ApplicationBackoffType.values();
        i1 = sharedpreferences.getInt("IDLE_TYPE", com.fitbit.savedstate.ApplicationBackoffType.a.ordinal());
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        if (i1 >= aapplicationbackofftype.length) goto _L2; else goto _L3
_L3:
        ApplicationBackoffType applicationbackofftype = ApplicationBackoffType.values()[i1];
_L5:
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorexit ;
        return applicationbackofftype;
_L2:
        applicationbackofftype = com.fitbit.savedstate.ApplicationBackoffType.a;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public static void m()
    {
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("ServerSavedState", "APPLICATION BACKOFF: Back off is turned off.", new Object[0]);
        c.c().putLong("IDLE_TIME_KEY", 0L).putInt("IDLE_TYPE", 0).apply();
        com/fitbit/savedstate/ServerSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, i1, j1, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("proxy"))
        {
            editor.putString("PROXY", context.getString("proxy", null));
            editor1.remove("proxy");
        }
        if (context.contains("ServerSettings.IDLE_TIME_KEY"))
        {
            editor.putLong("IDLE_TIME_KEY", context.getLong("ServerSettings.IDLE_TIME_KEY", 0L));
            editor1.remove("ServerSettings.IDLE_TIME_KEY");
        }
        if (context.contains("ServerSettings.IDLE_KEY"))
        {
            editor.putLong("IDLE_KEY", context.getLong("ServerSettings.IDLE_KEY", 0L));
            editor1.remove("ServerSettings.IDLE_KEY");
        }
        if (context.contains("ServerSettings.IDLE_TYPE"))
        {
            editor.putInt("IDLE_TYPE", context.getInt("ServerSettings.IDLE_TYPE", 0));
            editor1.remove("ServerSettings.IDLE_TYPE");
        }
        if (context.contains("server_url"))
        {
            editor.putInt("SERVER_URL", context.getInt("server_url", 0));
            editor1.remove("server_url");
        }
        if (context.contains("client_url"))
        {
            editor.putInt("CLIENT_URL", context.getInt("client_url", 0));
            editor1.remove("client_url");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile String f()
    {
        return super.f();
    }

    static 
    {
        b = 0x493e0L;
    }
}

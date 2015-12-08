// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.util;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

// Referenced classes of package roboguice.util:
//            Strings

public class Ln
{
    public static class BaseConfig
        implements Config
    {

        protected int minimumLogLevel;
        protected String packageName;
        protected String scope;

        public int getLoggingLevel()
        {
            return minimumLogLevel;
        }

        public void setLoggingLevel(int j)
        {
            minimumLogLevel = j;
        }

        protected BaseConfig()
        {
            minimumLogLevel = 2;
            packageName = "";
            scope = "";
        }

        public BaseConfig(Application application)
        {
            int j;
            j = 2;
            super();
            minimumLogLevel = 2;
            packageName = "";
            scope = "";
            packageName = application.getPackageName();
            if ((application.getPackageManager().getApplicationInfo(packageName, 0).flags & 2) == 0)
            {
                j = 4;
            }
            minimumLogLevel = j;
            scope = packageName.toUpperCase();
            Ln.d("Configuring Logging, minimum log level is %s", new Object[] {
                Ln.logLevelToString(minimumLogLevel)
            });
            return;
            application;
            Log.e(packageName, "Error configuring logger", application);
            return;
        }
    }

    public static interface Config
    {

        public abstract int getLoggingLevel();

        public abstract void setLoggingLevel(int j);
    }

    public static class Print
    {

        protected static String getScope(int j)
        {
            if (Ln.config.minimumLogLevel <= 3)
            {
                StackTraceElement stacktraceelement = Thread.currentThread().getStackTrace()[j];
                return (new StringBuilder()).append(Ln.config.scope).append("/").append(stacktraceelement.getFileName()).append(":").append(stacktraceelement.getLineNumber()).toString();
            } else
            {
                return Ln.config.scope;
            }
        }

        public int println(int j, String s)
        {
            return Log.println(j, getScope(5), processMessage(s));
        }

        protected String processMessage(String s)
        {
            String s1 = s;
            if (Ln.config.minimumLogLevel <= 3)
            {
                s1 = String.format("%s %s", new Object[] {
                    Thread.currentThread().getName(), s
                });
            }
            return s1;
        }

        public Print()
        {
        }
    }


    protected static BaseConfig config = new BaseConfig();
    protected static Print print = new Print();

    private Ln()
    {
    }

    public static transient int d(Object obj, Object aobj[])
    {
        if (config.minimumLogLevel > 3)
        {
            return 0;
        }
        obj = Strings.toString(obj);
        if (aobj.length > 0)
        {
            obj = String.format(((String) (obj)), aobj);
        }
        return print.println(3, ((String) (obj)));
    }

    public static int d(Throwable throwable)
    {
        if (config.minimumLogLevel <= 3)
        {
            return print.println(3, Log.getStackTraceString(throwable));
        } else
        {
            return 0;
        }
    }

    public static transient int d(Throwable throwable, Object obj, Object aobj[])
    {
        if (config.minimumLogLevel > 3)
        {
            return 0;
        }
        String s = Strings.toString(obj);
        StringBuilder stringbuilder = new StringBuilder();
        obj = s;
        if (aobj.length > 0)
        {
            obj = String.format(s, aobj);
        }
        throwable = stringbuilder.append(((String) (obj))).append('\n').append(Log.getStackTraceString(throwable)).toString();
        return print.println(3, throwable);
    }

    public static transient int e(Object obj, Object aobj[])
    {
        if (config.minimumLogLevel > 6)
        {
            return 0;
        }
        obj = Strings.toString(obj);
        if (aobj.length > 0)
        {
            obj = String.format(((String) (obj)), aobj);
        }
        return print.println(6, ((String) (obj)));
    }

    public static int e(Throwable throwable)
    {
        if (config.minimumLogLevel <= 6)
        {
            return print.println(6, Log.getStackTraceString(throwable));
        } else
        {
            return 0;
        }
    }

    public static transient int e(Throwable throwable, Object obj, Object aobj[])
    {
        if (config.minimumLogLevel > 6)
        {
            return 0;
        }
        String s = Strings.toString(obj);
        StringBuilder stringbuilder = new StringBuilder();
        obj = s;
        if (aobj.length > 0)
        {
            obj = String.format(s, aobj);
        }
        throwable = stringbuilder.append(((String) (obj))).append('\n').append(Log.getStackTraceString(throwable)).toString();
        return print.println(6, throwable);
    }

    public static Config getConfig()
    {
        return config;
    }

    public static transient int i(Object obj, Object aobj[])
    {
        if (config.minimumLogLevel > 4)
        {
            return 0;
        }
        obj = Strings.toString(obj);
        if (aobj.length > 0)
        {
            obj = String.format(((String) (obj)), aobj);
        }
        return print.println(4, ((String) (obj)));
    }

    public static int i(Throwable throwable)
    {
        if (config.minimumLogLevel <= 4)
        {
            return print.println(4, Log.getStackTraceString(throwable));
        } else
        {
            return 0;
        }
    }

    public static transient int i(Throwable throwable, Object obj, Object aobj[])
    {
        if (config.minimumLogLevel > 4)
        {
            return 0;
        }
        String s = Strings.toString(obj);
        StringBuilder stringbuilder = new StringBuilder();
        obj = s;
        if (aobj.length > 0)
        {
            obj = String.format(s, aobj);
        }
        throwable = stringbuilder.append(((String) (obj))).append('\n').append(Log.getStackTraceString(throwable)).toString();
        return print.println(4, throwable);
    }

    public static boolean isDebugEnabled()
    {
        return config.minimumLogLevel <= 3;
    }

    public static boolean isVerboseEnabled()
    {
        return config.minimumLogLevel <= 2;
    }

    public static String logLevelToString(int j)
    {
        switch (j)
        {
        default:
            return "UNKNOWN";

        case 2: // '\002'
            return "VERBOSE";

        case 3: // '\003'
            return "DEBUG";

        case 4: // '\004'
            return "INFO";

        case 5: // '\005'
            return "WARN";

        case 6: // '\006'
            return "ERROR";

        case 7: // '\007'
            return "ASSERT";
        }
    }

    public static transient int v(Object obj, Object aobj[])
    {
        if (config.minimumLogLevel > 2)
        {
            return 0;
        }
        obj = Strings.toString(obj);
        if (aobj.length > 0)
        {
            obj = String.format(((String) (obj)), aobj);
        }
        return print.println(2, ((String) (obj)));
    }

    public static int v(Throwable throwable)
    {
        if (config.minimumLogLevel <= 2)
        {
            return print.println(2, Log.getStackTraceString(throwable));
        } else
        {
            return 0;
        }
    }

    public static transient int v(Throwable throwable, Object obj, Object aobj[])
    {
        if (config.minimumLogLevel > 2)
        {
            return 0;
        }
        String s = Strings.toString(obj);
        StringBuilder stringbuilder = new StringBuilder();
        obj = s;
        if (aobj.length > 0)
        {
            obj = String.format(s, aobj);
        }
        throwable = stringbuilder.append(((String) (obj))).append('\n').append(Log.getStackTraceString(throwable)).toString();
        return print.println(2, throwable);
    }

    public static transient int w(Object obj, Object aobj[])
    {
        if (config.minimumLogLevel > 5)
        {
            return 0;
        }
        obj = Strings.toString(obj);
        if (aobj.length > 0)
        {
            obj = String.format(((String) (obj)), aobj);
        }
        return print.println(5, ((String) (obj)));
    }

    public static int w(Throwable throwable)
    {
        if (config.minimumLogLevel <= 5)
        {
            return print.println(5, Log.getStackTraceString(throwable));
        } else
        {
            return 0;
        }
    }

    public static transient int w(Throwable throwable, Object obj, Object aobj[])
    {
        if (config.minimumLogLevel > 5)
        {
            return 0;
        }
        String s = Strings.toString(obj);
        StringBuilder stringbuilder = new StringBuilder();
        obj = s;
        if (aobj.length > 0)
        {
            obj = String.format(s, aobj);
        }
        throwable = stringbuilder.append(((String) (obj))).append('\n').append(Log.getStackTraceString(throwable)).toString();
        return print.println(5, throwable);
    }

}

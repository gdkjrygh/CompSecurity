// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils;

import android.content.Context;
import android.util.Log;
import com.digby.mm.android.library.utils.impl.Settings;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.digby.mm.android.library.utils:
//            FileLogger

public class Logger
{

    public static final String DIGBY_LIBRARY = "DigbyLibrary";
    private static SimpleDateFormat TIME_STAMP_FORMAT;
    private static String brandCode = "";
    private static FileLogger fileLoggerApp = null;
    private static FileLogger fileLoggerExt = null;
    private static boolean initialized = false;

    private Logger()
    {
    }

    public static void Debug(String s)
    {
        s = String.format("%s :: %s", new Object[] {
            TIME_STAMP_FORMAT.format(new Date()), s
        });
        Log.d("DigbyLibrary", s);
        logToFile(s);
    }

    public static void Debug(String s, Context context)
    {
        init(context);
        s = String.format("%s :: [%s] :: %s", new Object[] {
            TIME_STAMP_FORMAT.format(new Date()), brandCode, s
        });
        Log.d("DigbyLibrary", s);
        logToFile(s);
    }

    public static void Error(String s, Exception exception)
    {
        s = String.format("%s :: %s: %s", new Object[] {
            TIME_STAMP_FORMAT.format(new Date()), s, exception.toString()
        });
        Log.e("DigbyLibrary", s, exception);
        logToFile(s);
    }

    public static void Warn(String s)
    {
        s = String.format("%s :: %s", new Object[] {
            TIME_STAMP_FORMAT.format(new Date()), s
        });
        Log.w("DigbyLibrary", s);
        logToFile(s);
    }

    public static void Warn(String s, Exception exception)
    {
        s = String.format("%s :: %s: %s", new Object[] {
            TIME_STAMP_FORMAT.format(new Date()), s, exception.toString()
        });
        Log.w("DigbyLibrary", s, exception);
        logToFile(s);
    }

    private static void init(Context context)
    {
        if (initialized)
        {
            return;
        }
        com/digby/mm/android/library/utils/Logger;
        JVM INSTR monitorenter ;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        com/digby/mm/android/library/utils/Logger;
        JVM INSTR monitorexit ;
        return;
        context;
        com/digby/mm/android/library/utils/Logger;
        JVM INSTR monitorexit ;
        throw context;
        brandCode = Settings.getInstance(context).getBrandCode();
        if (!"".equals(Settings.getInstance(context).getServer()))
        {
            break MISSING_BLOCK_LABEL_65;
        }
        Log.i("DigbyLibrary", "Production environment - logging disabled");
_L2:
        initialized = true;
        com/digby/mm/android/library/utils/Logger;
        JVM INSTR monitorexit ;
        return;
        fileLoggerApp = FileLogger.getLogger(context, false, brandCode);
        fileLoggerExt = FileLogger.getLogger(context, true, brandCode);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void logToFile(String s)
    {
        if (fileLoggerApp != null)
        {
            fileLoggerApp.appendToLog(s);
        }
        if (fileLoggerExt != null)
        {
            fileLoggerExt.appendToLog(s);
        }
    }

    static 
    {
        TIME_STAMP_FORMAT = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a z", Locale.US);
    }
}

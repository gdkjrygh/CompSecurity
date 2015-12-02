// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalviktelemetry;

import android.content.Context;
import android.os.Build;
import com.facebook.analytics.AnalyticsLoggerMethodAutoProvider;
import com.facebook.analytics.logger.AnalyticsLogger;
import com.facebook.analytics.logger.HoneyClientEvent;
import com.facebook.analytics.tagging.AnalyticsTag;
import com.facebook.common.errorreporting.FbErrorReporter;
import com.facebook.common.errorreporting.FbErrorReporterImpl;
import com.facebook.dalvik.DalvikLinearAllocType;
import com.facebook.dalvik.DalvikReplaceBuffer;
import com.facebook.debug.log.BLog;
import com.facebook.inject.FbInjector;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

public class DalvikTelemetry
{

    private static final Class a = com/facebook/dalviktelemetry/DalvikTelemetry;
    private static HoneyClientEvent b;
    private static String c;
    private static Throwable d;

    public DalvikTelemetry()
    {
    }

    private static HoneyClientEvent a(String s)
    {
        s = new HoneyClientEvent(s);
        s.a(AnalyticsTag.MODULE_APP);
        s.a("sdk_version", android.os.Build.VERSION.SDK_INT);
        s.b("fingerprint", Build.FINGERPRINT);
        s.b("model", Build.MODEL);
        s.b("device", Build.DEVICE);
        s.b("manufacturer", Build.MANUFACTURER);
        s.b("cpu_abi", Build.CPU_ABI);
        return s;
    }

    private static File a(Context context, String s, String s1)
    {
        context = new File(new File(context.getFilesDir(), "dalvik_hack_telemetry"), s);
        context.mkdirs();
        if (!context.exists())
        {
            throw new IOException((new StringBuilder("Failed to create dir: ")).append(context.getAbsoluteFile()).toString());
        } else
        {
            return new File(context, s1);
        }
    }

    public static void a(Context context, String s)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = false;
        obj = ReportType.NORMAL;
        if (!a()) goto _L2; else goto _L1
_L1:
        Object obj1;
        Random random;
        random = new Random();
        obj1 = obj;
        if (!b(context, s, "attempted")) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        Object obj2;
        try
        {
            a(context, s, "attempted", false);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            flag = false;
            s = ((String) (obj1));
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            s = ReportType.TEST;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            s = ((String) (obj));
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        context = null;
_L15:
        if (context == null) goto _L6; else goto _L5
_L5:
        c = "dalvik_hack_storage_failure";
        d = context;
        s = a("dalvik_hack_storage_failure");
        obj = new StringWriter();
        context.printStackTrace(new PrintWriter(((java.io.Writer) (obj))));
        s.b("io_stack_trace", ((StringWriter) (obj)).toString());
        s.b("io_exception", context.toString());
        b = s;
        BLog.b(a, "IOException", context);
_L8:
        return;
_L4:
        obj2 = obj;
        obj1 = obj;
        if (random.nextFloat() >= 0.01F)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        obj1 = obj;
        a(context, s, "attempted", true);
        obj1 = obj;
        DalvikReplaceBuffer.b(DalvikLinearAllocType.FBANDROID_RELEASE);
        obj1 = obj;
        obj2 = ReportType.TEST;
        obj1 = obj2;
        a(context, s, "attempted", false);
        s = ((String) (obj2));
        context = null;
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L6:
        if (!a(((ReportType) (s)))) goto _L8; else goto _L7
_L7:
        if (!flag)
        {
            obj = DalvikReplaceBuffer.a();
        } else
        {
            obj = com.facebook.dalvik.DalvikReplaceBuffer.Result.FAILURE;
        }
        if (s != ReportType.NORMAL) goto _L10; else goto _L9
_L9:
        if (obj != com.facebook.dalvik.DalvikReplaceBuffer.Result.FAILURE) goto _L12; else goto _L11
_L11:
        context = a("dalvik_hack_failure");
        c = "dalvik_hack_failure";
        d = new Throwable("Failed to apply dalvik hack.");
_L13:
        obj1 = context;
        if (context == null)
        {
            obj1 = a("dalvik_hack_error");
            ((HoneyClientEvent) (obj1)).b("report_type", s.toString());
            ((HoneyClientEvent) (obj1)).b("result", ((com.facebook.dalvik.DalvikReplaceBuffer.Result) (obj)).toString());
            c = "dalvik_hack_error";
            d = new Throwable("Unexpected telemetry state.");
        }
        ((HoneyClientEvent) (obj1)).a(AnalyticsTag.MODULE_APP);
        if (obj == com.facebook.dalvik.DalvikReplaceBuffer.Result.FAILURE)
        {
            if (!flag)
            {
                context = DalvikReplaceBuffer.b();
            } else
            {
                context = "Previous attempt crashed the process";
            }
            ((HoneyClientEvent) (obj1)).b("failure_string", context);
        }
        b = ((HoneyClientEvent) (obj1));
        return;
_L10:
        if (obj == com.facebook.dalvik.DalvikReplaceBuffer.Result.SUCCESS)
        {
            context = a("dalvik_hack_telemetry_success");
            continue; /* Loop/switch isn't completed */
        }
        if (obj == com.facebook.dalvik.DalvikReplaceBuffer.Result.FAILURE)
        {
            context = a("dalvik_hack_telemetry_failure");
            c = "dalvik_hack_telemetry_failure";
            d = new Throwable("Failed to apply dalvik hack.");
            continue; /* Loop/switch isn't completed */
        }
_L12:
        context = null;
        if (true) goto _L13; else goto _L2
_L2:
        s = ((String) (obj));
        context = null;
        flag = flag1;
        if (true) goto _L15; else goto _L14
_L14:
    }

    private static void a(Context context, String s, String s1, boolean flag)
    {
        context = a(context, s, s1);
        if (flag != context.exists()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        s = new FileOutputStream(context);
        s.write(0);
        s.close();
        if (!context.exists())
        {
            throw new IOException((new StringBuilder("Failed to create a file: ")).append(context.getAbsoluteFile()).toString());
        }
        if (true) goto _L1; else goto _L3
_L3:
        context.delete();
        if (context.exists())
        {
            throw new IOException((new StringBuilder("Failed to delete a file: ")).append(context.getAbsoluteFile()).toString());
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static void a(FbInjector fbinjector)
    {
        if (b != null)
        {
            ((AnalyticsLogger)AnalyticsLoggerMethodAutoProvider.a(fbinjector)).c(b);
        }
        if (c != null && d != null)
        {
            ((FbErrorReporter)FbErrorReporterImpl.a(fbinjector)).a(c, d);
        }
    }

    private static boolean a()
    {
        while (DalvikReplaceBuffer.a() != com.facebook.dalvik.DalvikReplaceBuffer.Result.NOT_ATTEMPTED || android.os.Build.VERSION.SDK_INT < 11 || android.os.Build.VERSION.SDK_INT >= 16) 
        {
            return false;
        }
        return true;
    }

    private static boolean a(ReportType reporttype)
    {
        if (reporttype != ReportType.TEST) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        reporttype = DalvikReplaceBuffer.a();
        switch (_cls1.a[reporttype.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown replace buffer result=")).append(reporttype).toString());

        case 2: // '\002'
        case 3: // '\003'
            return false;

        case 1: // '\001'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static boolean b(Context context, String s, String s1)
    {
        return a(context, s, s1).exists();
    }


    private class ReportType extends Enum
    {

        private static final ReportType $VALUES[];
        public static final ReportType NORMAL;
        public static final ReportType TEST;

        public static ReportType valueOf(String s)
        {
            return (ReportType)Enum.valueOf(com/facebook/dalviktelemetry/DalvikTelemetry$ReportType, s);
        }

        public static ReportType[] values()
        {
            return (ReportType[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new ReportType("NORMAL", 0);
            TEST = new ReportType("TEST", 1);
            $VALUES = (new ReportType[] {
                NORMAL, TEST
            });
        }

        private ReportType(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[com.facebook.dalvik.DalvikReplaceBuffer.Result.values().length];
            try
            {
                a[com.facebook.dalvik.DalvikReplaceBuffer.Result.FAILURE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.facebook.dalvik.DalvikReplaceBuffer.Result.NOT_ATTEMPTED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.facebook.dalvik.DalvikReplaceBuffer.Result.SUCCESS.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}

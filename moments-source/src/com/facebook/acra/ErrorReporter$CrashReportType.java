// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;


// Referenced classes of package com.facebook.acra:
//            ReportField

public final class fileExtensions extends Enum
{

    private static final ANR_REPORT $VALUES[];
    public static final ANR_REPORT ACRA_CRASH_REPORT;
    public static final ANR_REPORT ANR_REPORT;
    public static final ANR_REPORT NATIVE_CRASH_REPORT;
    private final ReportField attachmentField;
    private final long defaultMaxSize;
    private final String directory;
    private final String fileExtensions[];

    public static fileExtensions valueOf(String s)
    {
        return (fileExtensions)Enum.valueOf(com/facebook/acra/ErrorReporter$CrashReportType, s);
    }

    public static fileExtensions[] values()
    {
        return (fileExtensions[])$VALUES.clone();
    }

    static 
    {
        ACRA_CRASH_REPORT = new <init>("ACRA_CRASH_REPORT", 0, "acra-reports", 0x100000L, null, new String[] {
            ".stacktrace", ".temp_stacktrace"
        });
        NATIVE_CRASH_REPORT = new <init>("NATIVE_CRASH_REPORT", 1, "minidumps", 0x800000L, ReportField.MINIDUMP, new String[] {
            ".dmp"
        });
        ANR_REPORT = new <init>("ANR_REPORT", 2, "traces", 0x80000L, ReportField.SIGQUIT, new String[] {
            ".stacktrace", ".temp_stacktrace"
        });
        $VALUES = (new .VALUES[] {
            ACRA_CRASH_REPORT, NATIVE_CRASH_REPORT, ANR_REPORT
        });
    }





    private transient (String s, int i, String s1, long l, ReportField reportfield, String as[])
    {
        super(s, i);
        directory = s1;
        defaultMaxSize = l;
        attachmentField = reportfield;
        fileExtensions = as;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.snapchat.android.SnapchatActivity;
import com.snapchat.android.Timber;
import com.snapchat.android.util.debug.ReleaseManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.time.FastDateFormat;

public final class Lw
{
    public static interface a
    {

        public abstract File a();

        public abstract File a(Context context);
    }


    public static final String ADD_LIVE_LOGS_FILE_PREFIX = "snapchat_shake2report_addlive_";
    public static final String BITMAP_POOL_MONITOR_LOGS_FILE_PREFIX = "snapchat_shake2report_bitmap_pool_monitor_";
    public static final String CHAT_LOGS_FILE_PREFIX = "snapchat_shake2report_chat_";
    private static final String DEFAULT_LOG = "DEFAULT";
    public static final String DEFAULT_LOGS_FILE_PREFIX = "snapchat_shake2report_default_";
    public static final String DOWNLOAD_PROGRESS_LOGS_FILE_PREFIX = "snapchat_shake2report_download_progress_";
    public static final String LOCATION_MANAGER_LOGS_FILE_PREFIX = "snapchat_shake2report_location_manager_";
    public static final String LOG_FILE_PREFIXES[] = {
        "snapchat_shake2report_addlive_", "snapchat_shake2report_chat_", "snapchat_shake2report_location_manager_", "snapchat_shake2report_bitmap_pool_monitor_", "snapchat_shake2report_download_progress_", "snapchat_shake2report_looksery_", "snapchat_shake2report_default_", "snapchat_shake2report_trace_"
    };
    public static final String LOOKSERY_LOGS_FILE_PREFIX = "snapchat_shake2report_looksery_";
    public static final int MAX_NUMBER_OF_LOG_FILES_TO_KEEP = 10;
    private static final String TAG = "DebugCapturer";
    public static final String TRACE_FILE_PREFIX = "snapchat_shake2report_trace_";
    private static final String TRACE_LOG = "Trace";
    private static final FastDateFormat mFastDateFormat = FastDateFormat.getInstance("EEE MMM dd HH:mm:ss.SSS zzz yyyy");
    private static final Map mLogs = new ConcurrentHashMap() {

            
            {
                put(com.snapchat.android.Timber.LogType.CHAT.name(), new LE("snapchat_shake2report_chat_"));
                put(com.snapchat.android.Timber.LogType.LOCATION_MANAGER.name(), new LE("snapchat_shake2report_location_manager_"));
                put(com.snapchat.android.Timber.LogType.BITMAP_POOL_MONITOR.name(), new LE("snapchat_shake2report_bitmap_pool_monitor_"));
                put(com.snapchat.android.Timber.LogType.DOWNLOAD_PROGRESS.name(), new LE("snapchat_shake2report_download_progress_"));
                put(com.snapchat.android.Timber.LogType.LOOKSERY.name(), new LE("snapchat_shake2report_looksery_"));
                put("DEFAULT", new LE("snapchat_shake2report_default_"));
            }
    };
    private static a mProfilingReportHook = new a() {

        File file;

        public final File a()
        {
            return file;
        }

        public final File a(Context context)
        {
            new LF();
            file = context.getFileStreamPath(Lw.a("snapchat_shake2report_trace_", LF.a(context)));
            context = null;
            Object obj = new PrintWriter(new FileOutputStream(file, false));
            context = ((Context) (obj));
            ((PrintWriter) (obj)).println("No trace available.");
            Pf.a(((java.io.Closeable) (obj)));
_L1:
            return file;
            Object obj1;
            obj1;
            obj = null;
_L4:
            context = ((Context) (obj));
            Timber.a("DebugCapturer", ((Throwable) (obj1)));
            Pf.a(((java.io.Closeable) (obj)));
              goto _L1
            obj1;
            obj = context;
            context = ((Context) (obj1));
_L3:
            Pf.a(((java.io.Closeable) (obj)));
            throw context;
            obj1;
            obj = context;
            context = ((Context) (obj1));
            if (true) goto _L3; else goto _L2
_L2:
            obj1;
              goto _L4
        }

            
            {
                file = null;
            }
    };

    public static String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = mLogs.values().iterator(); iterator.hasNext(); stringbuilder.append(((LE)iterator.next()).a()).append("\n\n\n ------ >>>> New Entry <<<< -------")) { }
        return stringbuilder.toString();
    }

    public static String a(String s, int i)
    {
        return (new StringBuilder()).append(s).append(i).append(".txt").toString();
    }

    public static void a(String s)
    {
        long l = Thread.currentThread().getId();
        if (ReleaseManager.f())
        {
            a("DEFAULT", new String[] {
                (new StringBuilder("Tid:")).append(Long.toString(l)).toString(), " [", mFastDateFormat.format(new Date()), "] ", s
            });
        }
    }

    public static void a(String s, String s1, String s2, long l)
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(s, new String[] {
                (new StringBuilder("Tid:")).append(Long.toString(l)).toString(), " [", mFastDateFormat.format(new Date()), "] ", "(", s, ")", s1, ": ", s2
            });
            return;
        }
    }

    private static transient void a(String s, String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = as[i];
            if (s1 != null)
            {
                stringbuilder.append(s1);
            }
        }

        if (mLogs.containsKey(s))
        {
            s = (LE)mLogs.get(s);
        } else
        {
            s = (LE)mLogs.get("DEFAULT");
        }
        s.a(stringbuilder.toString());
        if (SnapchatActivity.s())
        {
            cB.a(stringbuilder.toString());
        }
    }

    public static File[] a(Context context, boolean flag)
    {
        LE le;
        Timber.b("DebugCapturer", "Capturing logs for shake2report.", new Object[0]);
        le = new LE("snapchat_shake2report_addlive_");
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[] {
            "logcat", "-d", "-v", "threadtime", "AddLive_SDK:V", "AddLive_SDK:V", "*:S"
        }).getInputStream()));
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        le.a(s);
          goto _L1
        IOException ioexception;
        ioexception;
        Timber.e("DebugCapturer", "Failed to collect AddLive logs:", new Object[0]);
        Timber.a("DebugCapturer", ioexception);
        mLogs.put("snapchat_shake2report_addlive_", le);
        File afile[] = new File[mLogs.size() + 1];
        Iterator iterator = mLogs.values().iterator();
        int i;
        for (i = 0; iterator.hasNext(); i++)
        {
            afile[i] = ((LE)iterator.next()).a(context, flag);
        }

        try
        {
            afile[i] = mProfilingReportHook.a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Timber.e("DebugCapturer", "Profiling report hook failed to execute:", new Object[0]);
            Timber.a("DebugCapturer", context);
            return afile;
        }
        return afile;
    }

    public static String[] b()
    {
        String as[] = new String[mLogs.size() + 1];
        Iterator iterator = mLogs.values().iterator();
        int i;
        for (i = 0; iterator.hasNext(); i++)
        {
            as[i] = ((LE)iterator.next()).mOutputFile.getName();
        }

        as[i] = mProfilingReportHook.a().getName();
        return as;
    }

}

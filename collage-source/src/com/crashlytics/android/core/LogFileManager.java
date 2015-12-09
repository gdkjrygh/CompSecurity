// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.l;
import io.fabric.sdk.android.services.common.h;
import java.io.File;

// Referenced classes of package com.crashlytics.android.core:
//            FileLogStore, QueueFileLogStore, ByteString

class LogFileManager
{
    private static final class NoopLogStore
        implements FileLogStore
    {

        public void closeLogFile()
        {
        }

        public void deleteLogFile()
        {
        }

        public ByteString getLogAsByteString()
        {
            return null;
        }

        public void writeToLog(long l1, String s)
        {
        }

        private NoopLogStore()
        {
        }

    }


    private static final String DIRECTORY_NAME = "log-files";
    private static final String LOGFILE_EXT = ".temp";
    private static final String LOGFILE_PREFIX = "crashlytics-userlog-";
    static final int MAX_LOG_SIZE = 0x10000;
    private static final NoopLogStore NOOP_LOG_STORE = new NoopLogStore();
    private final Context context;
    private FileLogStore currentLog;
    private final File logFileDir;

    public LogFileManager(Context context1, File file)
    {
        context = context1;
        logFileDir = new File(file, "log-files");
        currentLog = NOOP_LOG_STORE;
    }

    private void ensureTargetDirectoryExists()
    {
        if (!logFileDir.exists())
        {
            logFileDir.mkdirs();
        }
    }

    private File getWorkingFileForSession(String s)
    {
        ensureTargetDirectoryExists();
        s = (new StringBuilder()).append("crashlytics-userlog-").append(s).append(".temp").toString();
        return new File(logFileDir, s);
    }

    private boolean isLoggingEnabled()
    {
        return h.a(context, "com.crashlytics.CollectCustomLogs", true);
    }

    public void clearLog()
    {
        currentLog.deleteLogFile();
    }

    public ByteString getByteStringForLog()
    {
        return currentLog.getLogAsByteString();
    }

    public void onSessionChange(String s)
    {
        clearLog();
        if (!isLoggingEnabled())
        {
            c.h().a("Fabric", "Preferences requested no custom logs. Aborting log file creation.");
            currentLog = NOOP_LOG_STORE;
            return;
        } else
        {
            setLogFile(getWorkingFileForSession(s), 0x10000);
            return;
        }
    }

    void setLogFile(File file, int i)
    {
        currentLog.closeLogFile();
        currentLog = new QueueFileLogStore(file, i);
    }

    public void writeToLog(long l1, String s)
    {
        currentLog.writeToLog(l1, s);
    }

}

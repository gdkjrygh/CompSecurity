// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android:
//            ByteString

class LogFileManager
{

    static final int MAX_LOG_SIZE = 0x10000;
    private final Context context;
    private final File filesDir;
    private QueueFile logFile;

    public LogFileManager(Context context1, File file)
    {
        this(context1, file, null);
    }

    LogFileManager(Context context1, File file, QueueFile queuefile)
    {
        context = context1;
        filesDir = file;
        logFile = queuefile;
    }

    private boolean initLogFile()
    {
        Object obj1;
        if (!CommonUtils.getBooleanResourceValue(context, "com.crashlytics.CollectCustomLogs", true))
        {
            Fabric.getLogger().d("Fabric", "Preferences requested no custom logs. Aborting log file creation.");
            return false;
        }
        CommonUtils.closeOrLog(logFile, (new StringBuilder()).append("Could not close log file: ").append(logFile).toString());
        obj1 = null;
        Object obj;
        obj = (new StringBuilder()).append("crashlytics-userlog-").append(UUID.randomUUID().toString()).append(".temp").toString();
        obj = new File(filesDir, ((String) (obj)));
        logFile = new QueueFile(((File) (obj)));
        ((File) (obj)).delete();
        return true;
        obj;
_L2:
        Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Could not create log file: ").append(obj1).toString(), ((Throwable) (obj)));
        return false;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    void closeLogFile()
    {
        CommonUtils.closeOrLog(logFile, "There was a problem closing the Crashlytics log file.");
        logFile = null;
    }

    void doWriteToLog(int i, long l, String s)
    {
        if (logFile != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1 = s;
        if (s == null)
        {
            s1 = "null";
        }
        int j;
        try
        {
            j = i / 4;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Fabric.getLogger().e("Fabric", "There was a problem writing to the Crashlytics log.", s);
            return;
        }
        s = s1;
        if (s1.length() > j)
        {
            s = (new StringBuilder()).append("...").append(s1.substring(s1.length() - j)).toString();
        }
        s = s.replaceAll("\r", " ").replaceAll("\n", " ");
        s = String.format(Locale.US, "%d %s%n", new Object[] {
            Long.valueOf(l), s
        }).getBytes("UTF-8");
        logFile.add(s);
        while (!logFile.isEmpty() && logFile.usedBytes() > i) 
        {
            logFile.remove();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    ByteString getByteStringForLog()
    {
        if (logFile == null)
        {
            return null;
        }
        final int offsetHolder[] = new int[1];
        offsetHolder[0] = 0;
        final byte logBytes[] = new byte[logFile.usedBytes()];
        try
        {
            logFile.forEach(new io.fabric.sdk.android.services.common.QueueFile.ElementReader() {

                final LogFileManager this$0;
                final byte val$logBytes[];
                final int val$offsetHolder[];

                public void read(InputStream inputstream, int i)
                    throws IOException
                {
                    int ai[];
                    inputstream.read(logBytes, offsetHolder[0], i);
                    ai = offsetHolder;
                    ai[0] = ai[0] + i;
                    inputstream.close();
                    return;
                    Exception exception;
                    exception;
                    inputstream.close();
                    throw exception;
                }

            
            {
                this$0 = LogFileManager.this;
                logBytes = abyte0;
                offsetHolder = ai;
                super();
            }
            });
        }
        catch (IOException ioexception)
        {
            Fabric.getLogger().e("Fabric", "A problem occurred while reading the Crashlytics log file.", ioexception);
        }
        return ByteString.copyFrom(logBytes, 0, offsetHolder[0]);
    }

    public void writeToLog(long l, String s)
    {
        if (logFile == null)
        {
            initLogFile();
        }
        doWriteToLog(0x10000, l, s);
    }
}

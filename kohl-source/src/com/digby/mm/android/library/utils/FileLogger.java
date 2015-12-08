// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileLogger
{

    public static final int FILE_SIZE_MAX = 0x1f4000;
    public static final String LOCALPOINT_FOLDER_NAME = "Localpoint";
    public static final String LOG_FILE_NAME = "localpoint_%s.log";
    public static final int MAX_NUM_FILES = 5;
    public static final SimpleDateFormat TIME_STAMP_FORMAT;
    private boolean canLogSDCard;
    private File logDir;
    private String mBrandCode;
    private File sdkLogFile;

    private FileLogger(Context context, String s, File file)
    {
        canLogSDCard = false;
        mBrandCode = s;
        logDir = file;
        canLogSDCard = "mounted".equals(Environment.getExternalStorageState());
        if (canLogSDCard)
        {
            sdkLogFile = new File(getLogFileDirectory(), String.format("localpoint_%s.log", new Object[] {
                mBrandCode
            }));
            initLogFile();
            if (logDir != null)
            {
                appendToLog((new StringBuilder()).append("Log directory: ").append(logDir.getAbsolutePath()).toString());
                return;
            }
        }
    }

    private void cleanUpExternalFiles()
    {
        File file = new File(Environment.getExternalStorageDirectory(), "Localpoint");
        String as[];
        if (file.exists() || file.isDirectory())
        {
            if ((as = file.list(new FilenameFilter() {

        final FileLogger this$0;
        final String val$prefix;

        public boolean accept(File file2, String s1)
        {
            return s1.toLowerCase(Locale.getDefault()).startsWith(prefix);
        }

            
            {
                this$0 = FileLogger.this;
                prefix = s;
                super();
            }
    })) != null)
            {
                int j = as.length;
                for (int i = 0; i < j; i++)
                {
                    String s = as[i];
                    File file1 = new File(file, s);
                    if (file1.exists() && file1.delete())
                    {
                        appendToLog((new StringBuilder()).append("Deleted external file: ").append(s).toString());
                    }
                }

                if (file.list().length == 0)
                {
                    file.delete();
                    return;
                }
            }
        }
    }

    private File getLogFileDirectory()
    {
        return logDir;
    }

    public static FileLogger getLogger(Context context, boolean flag, String s)
    {
        Object obj = null;
        FileLogger filelogger;
        if (!flag)
        {
            filelogger = new FileLogger(context, s, context.getFilesDir());
        } else
        {
            if (context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)
            {
                Log.i("DigbyLibrary", (new StringBuilder()).append("android.permission.WRITE_EXTERNAL_STORAGE").append(" is not granted.").toString());
                return null;
            }
            Log.i("DigbyLibrary", (new StringBuilder()).append("android.permission.WRITE_EXTERNAL_STORAGE").append(" is granted.").toString());
            File file = new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append("Localpoint/").append(s).toString());
            filelogger = obj;
            if (file.exists())
            {
                filelogger = obj;
                if (file.isDirectory())
                {
                    return new FileLogger(context, s, file);
                }
            }
        }
        return filelogger;
    }

    private void initLogFile()
    {
        if (sdkLogFile.exists())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        sdkLogFile.getParentFile().mkdirs();
        sdkLogFile.createNewFile();
        appendToLog(String.format("%s :: [%s] :: Log file initialized.", new Object[] {
            TIME_STAMP_FORMAT.format(new Date()), mBrandCode
        }));
        return;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        canLogSDCard = false;
        return;
    }

    private void rollLogFile()
    {
        int i = 4;
        while (i >= 0) 
        {
            File file = new File(getLogFileDirectory(), String.format("localpoint_%s.log", new Object[] {
                (new StringBuilder()).append(mBrandCode).append(i).toString()
            }));
            file.delete();
            if (i != 4)
            {
                File file1 = getLogFileDirectory();
                StringBuilder stringbuilder = (new StringBuilder()).append(mBrandCode);
                Object obj;
                if (i > 0)
                {
                    obj = Integer.valueOf(i - 1);
                } else
                {
                    obj = "";
                }
                (new File(file1, String.format("localpoint_%s.log", new Object[] {
                    stringbuilder.append(obj).toString()
                }))).renameTo(file);
            }
            i--;
        }
        try
        {
            sdkLogFile = new File(getLogFileDirectory(), String.format("localpoint_%s.log", new Object[] {
                mBrandCode
            }));
            sdkLogFile.createNewFile();
            appendToLog(String.format("%s :: [%s] :: Log file rolled.", new Object[] {
                TIME_STAMP_FORMAT.format(new Date()), mBrandCode
            }));
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void appendToLog(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = canLogSDCard;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!sdkLogFile.exists())
        {
            initLogFile();
        }
        if (sdkLogFile.length() >= 0x1f4000L)
        {
            rollLogFile();
        }
        try
        {
            BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(sdkLogFile, true));
            bufferedwriter.append(s);
            bufferedwriter.newLine();
            bufferedwriter.close();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        s.printStackTrace();
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public boolean canLogToSDCard()
    {
        return canLogSDCard;
    }

    static 
    {
        TIME_STAMP_FORMAT = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a z", Locale.US);
    }
}

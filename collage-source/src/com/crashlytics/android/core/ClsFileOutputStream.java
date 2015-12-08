// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

class ClsFileOutputStream extends FileOutputStream
{

    public static final String IN_PROGRESS_SESSION_FILE_EXTENSION = ".cls_temp";
    public static final String SESSION_FILE_EXTENSION = ".cls";
    public static final FilenameFilter TEMP_FILENAME_FILTER = new FilenameFilter() {

        public boolean accept(File file, String s)
        {
            return s.endsWith(".cls_temp");
        }

    };
    private boolean closed;
    private File complete;
    private File inProgress;
    private final String root;

    public ClsFileOutputStream(File file, String s)
        throws FileNotFoundException
    {
        super(new File(file, (new StringBuilder()).append(s).append(".cls_temp").toString()));
        closed = false;
        root = (new StringBuilder()).append(file).append(File.separator).append(s).toString();
        inProgress = new File((new StringBuilder()).append(root).append(".cls_temp").toString());
    }

    public ClsFileOutputStream(String s, String s1)
        throws FileNotFoundException
    {
        this(new File(s), s1);
    }

    public void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = closed;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        File file;
        closed = true;
        super.flush();
        super.close();
        file = new File((new StringBuilder()).append(root).append(".cls").toString());
        if (!inProgress.renameTo(file))
        {
            break; /* Loop/switch isn't completed */
        }
        inProgress = null;
        complete = file;
        if (true) goto _L1; else goto _L3
        Exception exception;
        exception;
        throw exception;
_L3:
        String s = "";
        if (!file.exists()) goto _L5; else goto _L4
_L4:
        s = " (target already exists)";
_L7:
        throw new IOException((new StringBuilder()).append("Could not rename temp file: ").append(inProgress).append(" -> ").append(file).append(s).toString());
_L5:
        if (!inProgress.exists())
        {
            s = " (source does not exist)";
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void closeInProgressStream()
        throws IOException
    {
        if (closed)
        {
            return;
        } else
        {
            closed = true;
            super.flush();
            super.close();
            return;
        }
    }

    public File getCompleteFile()
    {
        return complete;
    }

    public File getInProgressFile()
    {
        return inProgress;
    }

}

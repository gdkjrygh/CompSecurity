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

    public static final FilenameFilter a = new FilenameFilter() {

        public final boolean accept(File file, String s)
        {
            return s.endsWith(".cls_temp");
        }

    };
    private final String b;
    private File c;
    private File d;
    private boolean e;

    public ClsFileOutputStream(File file, String s)
        throws FileNotFoundException
    {
        super(new File(file, (new StringBuilder()).append(s).append(".cls_temp").toString()));
        e = false;
        b = (new StringBuilder()).append(file).append(File.separator).append(s).toString();
        c = new File((new StringBuilder()).append(b).append(".cls_temp").toString());
    }

    public final void a()
        throws IOException
    {
        if (e)
        {
            return;
        } else
        {
            e = true;
            super.flush();
            super.close();
            return;
        }
    }

    public void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        File file;
        e = true;
        super.flush();
        super.close();
        file = new File((new StringBuilder()).append(b).append(".cls").toString());
        if (!c.renameTo(file))
        {
            break; /* Loop/switch isn't completed */
        }
        c = null;
        d = file;
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
        throw new IOException((new StringBuilder("Could not rename temp file: ")).append(c).append(" -> ").append(file).append(s).toString());
_L5:
        if (!c.exists())
        {
            s = " (source does not exist)";
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

}

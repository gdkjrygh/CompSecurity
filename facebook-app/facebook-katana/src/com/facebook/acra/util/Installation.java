// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.util;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.UUID;

public class Installation
{

    private static final String INSTALLATION = "ACRA-INSTALLATION";
    private static String sID = null;

    public Installation()
    {
    }

    public static String id(Context context)
    {
        com/facebook/acra/util/Installation;
        JVM INSTR monitorenter ;
        if (sID != null) goto _L2; else goto _L1
_L1:
        context = context.getFilesDir();
        if (context != null) goto _L4; else goto _L3
_L3:
        context = "n/a";
_L6:
        com/facebook/acra/util/Installation;
        JVM INSTR monitorexit ;
        return context;
_L4:
        context = new File(context.getParent(), "ACRA-INSTALLATION");
        if (!context.exists())
        {
            writeInstallationFile(context);
        }
        sID = readInstallationFile(context);
_L2:
        context = sID;
        continue; /* Loop/switch isn't completed */
        context;
        context = "n/a";
        if (true) goto _L6; else goto _L5
_L5:
        context;
        throw context;
    }

    private static String readInstallationFile(File file)
    {
        file = new RandomAccessFile(file, "r");
        String s;
        byte abyte0[] = new byte[(int)file.length()];
        file.readFully(abyte0);
        s = new String(abyte0);
        file.close();
        return s;
        Exception exception;
        exception;
        file.close();
        throw exception;
    }

    private static void writeInstallationFile(File file)
    {
        file = new FileOutputStream(file);
        file.write(UUID.randomUUID().toString().getBytes());
        file.close();
        return;
        Exception exception;
        exception;
        file.close();
        throw exception;
    }

}

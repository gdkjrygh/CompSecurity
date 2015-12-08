// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.UUID;

// Referenced classes of package com.jirbo.adcolony:
//            AdColonyException

class aj
{

    private static String a = null;
    private static final String b = "INSTALLATION";

    aj()
    {
    }

    public static String a(Context context)
    {
        com/jirbo/adcolony/aj;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        context = new File(context.getFilesDir(), "INSTALLATION");
        if (!context.exists())
        {
            b(context);
        }
        a = a(((File) (context)));
        context = a;
        com/jirbo/adcolony/aj;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw new AdColonyException(context.toString());
        context;
        com/jirbo/adcolony/aj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static String a(File file)
    {
        file = new RandomAccessFile(file, "r");
        byte abyte0[] = new byte[(int)file.length()];
        file.readFully(abyte0);
        file.close();
        return new String(abyte0);
    }

    private static void b(File file)
    {
        file = new FileOutputStream(file);
        file.write(UUID.randomUUID().toString().getBytes());
        file.close();
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class fkt
{

    private static final long a;

    public fkt()
    {
    }

    public static boolean a(File file, File file1)
    {
        Object obj;
        obj = null;
        if (!file1.exists() && !file1.createNewFile())
        {
            return false;
        }
        FileChannel filechannel = (new FileInputStream(file)).getChannel();
        file1 = (new FileOutputStream(file1)).getChannel();
        long l = Math.min(a, filechannel.size());
        int i = 0;
_L2:
        long l1 = file1.transferFrom(filechannel, i, l);
        if (l1 <= 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        i = (int)((long)i + l);
        if (true) goto _L2; else goto _L1
_L1:
        if (filechannel != null)
        {
            filechannel.close();
        }
        if (file1 != null)
        {
            file1.close();
        }
        return true;
        file;
        file1 = null;
        filechannel = obj;
_L4:
        if (filechannel != null)
        {
            filechannel.close();
        }
        if (file1 != null)
        {
            file1.close();
        }
        throw file;
        file;
        file1 = null;
        continue; /* Loop/switch isn't completed */
        file;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        a = oqm.c.f * 256L;
    }
}

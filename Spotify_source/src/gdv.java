// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public final class gdv
{

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static boolean a(File file)
    {
        boolean flag1 = false;
        boolean flag;
        if (file.mkdirs() || file.isDirectory())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return false;
        }
        file = new File(file, UUID.randomUUID().toString());
        boolean flag2;
        try
        {
            flag2 = file.createNewFile();
            if (file.exists())
            {
                flag1 = file.delete();
            }
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        return flag1 | flag2;
    }
}

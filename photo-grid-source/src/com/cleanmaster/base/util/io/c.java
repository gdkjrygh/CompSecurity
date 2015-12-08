// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.base.util.io;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;

// Referenced classes of package com.cleanmaster.base.util.io:
//            a, b

public class c
{

    public static b a()
    {
        return a(Environment.getDataDirectory());
    }

    public static b a(File file)
    {
        Object obj = null;
        if (file == null)
        {
            file = obj;
        } else
        {
            b b1;
            long l;
            long l1;
            long l2;
            try
            {
                file = new StatFs(file.getPath());
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return null;
            }
            l = com.cleanmaster.base.util.io.a.a(file);
            l1 = com.cleanmaster.base.util.io.a.b(file);
            l2 = com.cleanmaster.base.util.io.a.c(file);
            b1 = new b();
            b1.a = l1 * l2;
            b1.b = l * l2;
            file = b1;
            if (b1.a < b1.b)
            {
                b1.b = b1.a;
                return b1;
            }
        }
        return file;
    }
}

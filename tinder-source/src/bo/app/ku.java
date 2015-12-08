// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

// Referenced classes of package bo.app:
//            kt

public final class ku
{

    public static File a(Context context)
    {
        context = a(context, true);
        File file = new File(context, "uil-images");
        if (!file.exists() && !file.mkdir())
        {
            return context;
        } else
        {
            return file;
        }
    }

    public static File a(Context context, boolean flag)
    {
        File file1 = null;
        File file = file1;
        if (flag)
        {
            file = file1;
            if ("mounted".equals(Environment.getExternalStorageState()))
            {
                boolean flag1;
                if (context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                file = file1;
                if (flag1)
                {
                    file = b(context);
                }
            }
        }
        file1 = file;
        if (file == null)
        {
            file1 = context.getCacheDir();
        }
        file = file1;
        if (file1 == null)
        {
            context = (new StringBuilder("/data/data/")).append(context.getPackageName()).append("/cache/").toString();
            kt.c("Can't define system cache directory! '%s' will be used.", new Object[] {
                context
            });
            file = new File(context);
        }
        return file;
    }

    private static File b(Context context)
    {
        File file;
label0:
        {
            file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
            context = file;
            if (!file.exists())
            {
                if (file.mkdirs())
                {
                    break label0;
                }
                kt.c("Unable to create external cache directory", new Object[0]);
                context = null;
            }
            return context;
        }
        try
        {
            (new File(file, ".nomedia")).createNewFile();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            kt.b("Can't create \".nomedia\" file in application external cache directory", new Object[0]);
            return file;
        }
        return file;
    }
}

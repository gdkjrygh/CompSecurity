// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.io.File;

// Referenced classes of package android.support.v4.a:
//            b

public class a
{

    public a()
    {
    }

    public static final Drawable a(Context context, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return b.a(context, i);
        } else
        {
            return context.getResources().getDrawable(i);
        }
    }

    private static File a(File file)
    {
        android/support/v4/a/a;
        JVM INSTR monitorenter ;
        File file1 = file;
        if (file.exists()) goto _L2; else goto _L1
_L1:
        file1 = file;
        if (file.mkdirs()) goto _L2; else goto _L3
_L3:
        boolean flag = file.exists();
        if (!flag) goto _L5; else goto _L4
_L4:
        file1 = file;
_L2:
        android/support/v4/a/a;
        JVM INSTR monitorexit ;
        return file1;
_L5:
        Log.w("ContextCompat", (new StringBuilder()).append("Unable to create files subdir ").append(file.getPath()).toString());
        file1 = null;
        if (true) goto _L2; else goto _L6
_L6:
        file;
        throw file;
    }

    public final File a(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return b.a(context);
        } else
        {
            return a(new File(context.getApplicationInfo().dataDir, "no_backup"));
        }
    }
}

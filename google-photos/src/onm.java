// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.util.Log;
import com.google.android.libraries.stitch.incompat.PlatformBugActivity;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class onm
    implements Thread.UncaughtExceptionHandler
{

    private final Thread.UncaughtExceptionHandler a;
    private final Context b;
    private final k c;

    public onm(Context context, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        this(context, uncaughtexceptionhandler, null);
    }

    private onm(Context context, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, k k)
    {
        a = uncaughtexceptionhandler;
        b = (Context)p.b(context, "context");
        c = null;
    }

    public static boolean a(Context context)
    {
        Object obj = olm.c(context, onl).iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        onl onl1 = (onl)((Iterator) (obj)).next();
        if (!onl1.a(context).exists()) goto _L4; else goto _L3
_L3:
        ActivityInfo activityinfo;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        int i;
        try
        {
            activityinfo = context.getPackageManager().getActivityInfo(new ComponentName(context, com/google/android/libraries/stitch/incompat/PlatformBugActivity), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf("PlatformBugHandler", "Cannot find PlatformBugActivity", context);
            return true;
        }
        i = Process.myPid();
        obj = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses().iterator();
        if (!((Iterator) (obj)).hasNext()) goto _L6; else goto _L5
_L5:
        runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        if (runningappprocessinfo.pid != i)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = runningappprocessinfo.processName;
_L8:
        if (obj == null || ((String) (obj)).equals(activityinfo.processName))
        {
            return true;
        } else
        {
            obj = new Intent(context, com/google/android/libraries/stitch/incompat/PlatformBugActivity);
            ((Intent) (obj)).addFlags(0x34c00000);
            ((Intent) (obj)).putExtra("extra_error_type", (String)onl1.a());
            context.startActivity(((Intent) (obj)));
            System.exit(0);
            return true;
        }
_L2:
        return false;
_L6:
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
label0:
        for (Throwable throwable1 = throwable; throwable1 != null; throwable1 = throwable1.getCause())
        {
            Iterator iterator = olm.c(b, onl).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                onl onl1 = (onl)iterator.next();
                if (onl1.a(throwable1))
                {
                    try
                    {
                        onl1.a(b).createNewFile();
                    }
                    catch (IOException ioexception)
                    {
                        Log.wtf("PlatformBugHandler", "Cannot create marker for platform bug file", ioexception);
                    }
                    if (c != null)
                    {
                        onl1.a();
                    }
                    System.exit(0);
                }
            } while (true);
        }

        if (a != null)
        {
            a.uncaughtException(thread, throwable);
            return;
        } else
        {
            throwable.printStackTrace();
            return;
        }
    }
}

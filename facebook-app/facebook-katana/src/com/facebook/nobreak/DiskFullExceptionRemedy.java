// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.app.Application;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.StatFs;
import android.util.Log;
import com.facebook.nodex.startup.splashscreen.NodexError;
import com.facebook.nodex.startup.splashscreen.NodexExceptionUtil;
import java.io.File;

public class DiskFullExceptionRemedy
    implements ExceptionHandlerToDispatchKnownExceptionRemedies.KnownExceptionRemedy
{

    private static final String a = com/facebook/nobreak/DiskFullExceptionRemedy.getSimpleName();

    public DiskFullExceptionRemedy()
    {
    }

    public final void a(Application application, Throwable throwable)
    {
        if (NodexExceptionUtil.a(throwable, android/database/sqlite/SQLiteException, null) == null) goto _L2; else goto _L1
_L1:
        long l = 0x7fffffffffffffffL;
        int i;
        long l1;
        StatFs statfs = new StatFs(application.getFilesDir().getAbsolutePath());
        l1 = statfs.getAvailableBlocks();
        i = statfs.getBlockSize();
        l = (long)i * l1;
_L4:
        if (l < 0x100000L)
        {
            throwable = NodexError.b(application).a("nodex_cannot_run_fb_app_string").c("nodex_not_enough_space_runtime_string").a(throwable).a(com.facebook.nodex.startup.splashscreen.NodexErrorActivity.Action.APP_SETTINGS).a().a(application);
            throwable.addFlags(0x4000000).addFlags(0x10000000);
            application.startActivity(throwable);
        }
_L2:
        return;
        Throwable throwable1;
        throwable1;
        Log.e(a, "Error in calculating free space");
        if (true) goto _L4; else goto _L3
_L3:
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.content.Context;
import android.os.StatFs;
import com.facebook.common.sdinstall.SDInstallChecker;
import com.facebook.common.sdinstall.SDInstallCheckerDeps;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            NodexInitializer, NodexExceptionUtil, NodexError

class a
    implements a
{

    final NodexInitializer a;

    public final NodexError a(Throwable throwable)
    {
        long l;
        long l1;
        l1 = 0x7fffffffffffffffL;
        l = l1;
        StatFs statfs = new StatFs(NodexInitializer.a(a).getFilesDir().getAbsolutePath());
        l = l1;
        long l2 = statfs.getAvailableBlocks();
        l = l1;
        l1 = (long)statfs.getBlockSize() * l2;
        l = l1;
        NodexInitializer.c();
        l = l1;
        (new StringBuilder("Free space: ")).append(l1);
        l = l1;
_L2:
        if (NodexExceptionUtil.a(throwable, java/io/IOException, "No space left on device") != null || l < 0x600000L)
        {
            String s = "nodex_not_enough_space_string";
            if ((new SDInstallChecker(NodexInitializer.a(a), new SDInstallCheckerDeps())).a(0x1e00000L, 0x6400000L))
            {
                s = "nodex_not_enough_space_promote_sd_move_string";
            }
            return NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").a(s).a(throwable).a(a).a();
        } else
        {
            return null;
        }
        Throwable throwable1;
        throwable1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    (NodexInitializer nodexinitializer)
    {
        a = nodexinitializer;
        super();
    }
}

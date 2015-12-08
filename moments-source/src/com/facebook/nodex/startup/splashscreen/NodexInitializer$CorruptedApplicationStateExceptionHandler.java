// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.content.Context;
import com.facebook.common.dextricks.CorruptedApplicationStateException;
import com.facebook.nodex.resources.NodexResources;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            NodexExceptionUtil, NodexInitializer, NodexError

class a
    implements a
{

    final NodexInitializer a;

    public final NodexError a(Throwable throwable)
    {
        Throwable throwable1;
        Object obj = null;
        throwable1 = NodexExceptionUtil.a(throwable, com/facebook/common/dextricks/CorruptedApplicationStateException, null);
        throwable = obj;
        if (throwable1 == null) goto _L2; else goto _L1
_L1:
        a a1;
        throwable = (CorruptedApplicationStateException)throwable1;
        a1 = a;
        a[throwable.a().onHandler()];
        JVM INSTR tableswitch 1 2: default 60
    //                   1 98
    //                   2 113;
           goto _L3 _L4 _L5
_L3:
        throwable = null;
_L7:
        throwable = NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").a(throwable).a(throwable1.getCause()).a(a1).a();
_L2:
        return throwable;
_L4:
        a1 = a;
        throwable = NodexInitializer.b(a);
        continue; /* Loop/switch isn't completed */
_L5:
        a1 = a;
        int i = NodexInitializer.c(a).c("nodex_reboot_string");
        throwable = NodexInitializer.a(a).getString(i);
        if (true) goto _L7; else goto _L6
_L6:
    }

    (NodexInitializer nodexinitializer)
    {
        a = nodexinitializer;
        super();
    }
}

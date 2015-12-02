// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import java.io.FileNotFoundException;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            NodexExceptionUtil, NodexInitializer, NodexError

class a
    implements a
{

    final NodexInitializer a;

    public final NodexError a(Throwable throwable)
    {
        if (NodexExceptionUtil.a(throwable, java/io/FileNotFoundException, "Permission denied") != null)
        {
            return NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").a(NodexInitializer.b(a)).a(throwable).a(a).a();
        } else
        {
            return null;
        }
    }

    (NodexInitializer nodexinitializer)
    {
        a = nodexinitializer;
        super();
    }
}

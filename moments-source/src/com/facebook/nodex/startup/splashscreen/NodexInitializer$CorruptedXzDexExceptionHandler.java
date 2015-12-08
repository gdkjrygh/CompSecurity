// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import org.tukaani.xz.XZIOException;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            NodexExceptionUtil, NodexInitializer, NodexError

class a
    implements a
{

    final NodexInitializer a;

    public final NodexError a(Throwable throwable)
    {
        NodexError nodexerror = null;
        if (NodexExceptionUtil.a(throwable, org/tukaani/xz/XZIOException, null) != null)
        {
            nodexerror = NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").a(NodexInitializer.b(a)).a(throwable).a(a).a();
        }
        return nodexerror;
    }

    (NodexInitializer nodexinitializer)
    {
        a = nodexinitializer;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import android.webkit.WebView;
import org.c.b;

// Referenced classes of package com.kik.cards.web.plugin:
//            JavascriptGlue

private final class <init>
    implements Runnable
{

    final long a;
    final String b;
    final String c[];
    final JavascriptGlue d;

    public final void run()
    {
        if (JavascriptGlue.h(d) != null && !JavascriptGlue.a(d)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = JavascriptGlue.f(d);
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (a == JavascriptGlue.i(d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        if (!flag) goto _L1; else goto _L3
_L3:
        JavascriptGlue.c().a("BAD: timed out waiting for poll, forcing javascript poll.");
        try
        {
            JavascriptGlue.h(d).loadUrl("javascript:cards._.bridge.forceAndroidPoll();");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            JavascriptGlue.c().a("Exception while trying to force poll", ((Throwable) (obj)));
        }
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private (JavascriptGlue javascriptglue, long l, String s, String as[])
    {
        d = javascriptglue;
        super();
        a = l;
        b = s;
        c = as;
    }

    c(JavascriptGlue javascriptglue, long l, String s, String as[], byte byte0)
    {
        this(javascriptglue, l, s, as);
    }
}

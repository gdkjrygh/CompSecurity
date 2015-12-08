// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.webkit.WebView;

// Referenced classes of package com.kik.cards.web.plugin:
//            JavascriptGlue

final class e
    implements Runnable
{

    final JavascriptGlue a;

    e(JavascriptGlue javascriptglue)
    {
        a = javascriptglue;
        super();
    }

    public final void run()
    {
        if (JavascriptGlue.a(a))
        {
            return;
        } else
        {
            long l = SystemClock.uptimeMillis();
            JavascriptGlue.h(a).onKeyUp(0, new KeyEvent(l, "", -1, 32));
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.widget.TextView;
import com.facebook.nodex.resources.NodexResources;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            AbstractNodexSplashActivity

class a
    implements Runnable
{

    final String a;
    final AbstractNodexSplashActivity b;

    public void run()
    {
        int i = b.c.c(a);
        if (AbstractNodexSplashActivity.b(b) != null)
        {
            AbstractNodexSplashActivity.b(b).setText(i);
        }
    }

    (AbstractNodexSplashActivity abstractnodexsplashactivity, String s)
    {
        b = abstractnodexsplashactivity;
        a = s;
        super();
    }
}

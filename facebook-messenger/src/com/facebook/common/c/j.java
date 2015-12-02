// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.c;

import android.net.Uri;
import com.facebook.debug.log.b;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;

public class j
{

    public static final ae a;
    private final d b;

    public j(d d1)
    {
        b = d1;
    }

    public void a(String s)
    {
        if (a())
        {
            String s1 = Uri.parse(s).getScheme();
            if ("http".equals(s1) || "https".equals(s1))
            {
                com.facebook.debug.log.b.c("fb_net", s);
            }
        }
    }

    public boolean a()
    {
        boolean flag = false;
        if (b.a())
        {
            flag = b.a(a, false);
        }
        return flag;
    }

    static 
    {
        a = (ae)aj.b.c("fb_log_net_access");
    }
}

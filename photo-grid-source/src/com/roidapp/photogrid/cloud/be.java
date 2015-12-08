// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            PGShareActivity

final class be extends Handler
{

    final PGShareActivity a;

    private be(PGShareActivity pgshareactivity)
    {
        a = pgshareactivity;
        super();
    }

    be(PGShareActivity pgshareactivity, byte byte0)
    {
        this(pgshareactivity);
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        int ai[];
        switch (message.what)
        {
        default:
            return;

        case 1001: 
            ai = new int[2];
            break;
        }
        PGShareActivity.a(a).getLocationOnScreen(ai);
        int i = PGShareActivity.b(a).getHeight();
        if (PGShareActivity.c(a) == -1)
        {
            PGShareActivity.a(a, (a.getResources().getDisplayMetrics().heightPixels - ai[1]) + i);
            a.e();
            a.p_();
        }
        a.a((String)message.obj, PGShareActivity.c(a));
    }
}

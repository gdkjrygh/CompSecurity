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
//            br, BaseShareActivity

final class cg extends Handler
{

    final br a;

    private cg(br br1)
    {
        a = br1;
        super();
    }

    cg(br br1, byte byte0)
    {
        this(br1);
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
        a.b.getLocationOnScreen(ai);
        int i = a.a.getHeight();
        if (br.b(a) == -1)
        {
            i -= br.c(a).i();
            br.a(a, (br.c(a).getResources().getDisplayMetrics().heightPixels - ai[1]) + i);
            br.c(a).a(i);
        }
        br.c(a).a((String)message.obj, br.b(a));
    }
}

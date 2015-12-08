// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import com.roidapp.baselib.c.x;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            PGShareActivity

final class bd extends Handler
{

    final PGShareActivity a;

    private bd(PGShareActivity pgshareactivity)
    {
        a = pgshareactivity;
        super();
    }

    bd(PGShareActivity pgshareactivity, byte byte0)
    {
        this(pgshareactivity);
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 52226 52226: default 24
    //                   52226 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if ((message = (x)message.obj) != null && ((message = (Bitmap)((x) (message)).a) != null && PGShareActivity.s(a) != null))
        {
            PGShareActivity.s(a).setImageBitmap(message);
            PGShareActivity.s(a).setVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}

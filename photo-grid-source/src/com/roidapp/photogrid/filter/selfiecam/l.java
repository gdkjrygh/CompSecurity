// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.roidapp.imagelib.filter.aq;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            SelfieCamImageShowActivity, n

final class l extends Handler
{

    final SelfieCamImageShowActivity a;

    private l(SelfieCamImageShowActivity selfiecamimageshowactivity)
    {
        a = selfiecamimageshowactivity;
        super();
    }

    l(SelfieCamImageShowActivity selfiecamimageshowactivity, byte byte0)
    {
        this(selfiecamimageshowactivity);
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1020 1023: default 36
    //                   1020 37
    //                   1021 67
    //                   1022 80
    //                   1023 122;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        SelfieCamImageShowActivity.a(a).setImageBitmap((Bitmap)message.obj);
        a.a.setVisibility(8);
        return;
_L3:
        a.a.setVisibility(8);
        return;
_L4:
        Object obj = message.obj;
        if (obj instanceof aq)
        {
            (new Thread(new n(a, message.arg2, (aq)obj))).start();
            return;
        }
          goto _L1
_L5:
        message = (Uri)message.obj;
        a.a(message.getPath());
        return;
    }
}

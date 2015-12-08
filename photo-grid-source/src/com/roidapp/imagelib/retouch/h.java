// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            BlemishImageView

final class h extends Handler
{

    final BlemishImageView a;

    h(BlemishImageView blemishimageview)
    {
        a = blemishimageview;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            a.invalidate();
            break;
        }
    }
}

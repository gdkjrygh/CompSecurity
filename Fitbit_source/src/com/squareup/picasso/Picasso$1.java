// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

// Referenced classes of package com.squareup.picasso:
//            Picasso, BitmapHunter, Action

static final class er extends Handler
{

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            throw new AssertionError((new StringBuilder()).append("Unknown handler message received: ").append(message.what).toString());

        case 8: // '\b'
            message = (List)message.obj;
            int j = message.size();
            for (int i = 0; i < j; i++)
            {
                BitmapHunter bitmaphunter = (BitmapHunter)message.get(i);
                bitmaphunter.picasso.complete(bitmaphunter);
            }

            break;

        case 3: // '\003'
            message = (Action)message.obj;
            Picasso.access$000(((Action) (message)).picasso, message.getTarget());
            break;
        }
    }

    er(Looper looper)
    {
        super(looper);
    }
}

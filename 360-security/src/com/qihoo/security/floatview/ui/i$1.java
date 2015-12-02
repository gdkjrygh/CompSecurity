// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo.security.floatview.ui:
//            i

class a extends Handler
{

    final i a;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            a.setMemoryAlpha(0.5F);
            break;
        }
    }

    (i j)
    {
        a = j;
        super();
    }
}

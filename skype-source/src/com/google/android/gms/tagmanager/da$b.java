// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            da, ak

private final class  extends Handler
{

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            ak.a("Don't know how to handle this message.");
            return;

        case 1: // '\001'
            message = ((Message) (message.obj));
            break;
        }
    }
}

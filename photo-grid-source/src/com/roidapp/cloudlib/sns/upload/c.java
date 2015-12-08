// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.upload;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.roidapp.cloudlib.sns.upload:
//            e, UploadPGService, i

final class c extends Handler
{

    final UploadPGService a;

    public c(UploadPGService uploadpgservice, Looper looper)
    {
        a = uploadpgservice;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            e.a().g();
        } else
        {
            a.a((i)message.obj);
        }
        a.stopSelf(message.arg1);
    }
}

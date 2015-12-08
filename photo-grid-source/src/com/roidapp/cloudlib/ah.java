// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.cloudlib:
//            ai, al

public class ah extends Handler
{

    protected WeakReference a;
    protected ai b;

    public ah(Context context)
    {
        b = null;
        a = new WeakReference(context);
    }

    protected void a(Message message)
    {
    }

    public final void a(ai ai1)
    {
        b = ai1;
    }

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR tableswitch 4352 4354: default 36
    //                   4352 69
    //                   4353 69
    //                   4354 69;
           goto _L1 _L2 _L2 _L2
_L1:
        if (a.get() != null)
        {
            a(message);
        }
_L4:
        if (b != null)
        {
            b.a(message);
        }
        return;
_L2:
        if (a.get() != null)
        {
            al.g().a((Context)a.get(), message.what, (String)message.obj);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            d

private static class a extends Handler
{

    private final WeakReference a;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        d d1;
        return;
_L2:
        if ((d1 = (d)a.get()) != null)
        {
            d.a(d1, message.obj.toString());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public (d d1)
    {
        a = new WeakReference(d1);
    }
}

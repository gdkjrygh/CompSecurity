// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bg, ContainerHolder

final class ainerHolder extends Handler
{

    private final ainerHolder.ContainerAvailableListener aMN;
    final ContainerHolder aMO$3419c2b6;

    private void dw(String s)
    {
        s = aMN;
        s = aMO$3419c2b6;
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            bg.e("Don't know how to handle this message.");
            return;

        case 1: // '\001'
            dw((String)message.obj);
            break;
        }
    }
}

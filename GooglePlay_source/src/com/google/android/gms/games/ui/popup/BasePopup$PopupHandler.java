// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.popup;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.games.ui.popup:
//            BasePopup

protected static final class <init> extends Handler
{

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            throw new IllegalArgumentException("Unknown message code");

        case 0: // '\0'
            BasePopup.access$100((BasePopup)message.obj);
            return;

        case 1: // '\001'
            ((BasePopup)message.obj).removeCurtain();
            return;

        case 2: // '\002'
            ((BasePopup)message.obj).hidePopup();
            break;
        }
    }

    private (Looper looper)
    {
        super(looper);
    }

    (Looper looper, byte byte0)
    {
        this(looper);
    }
}

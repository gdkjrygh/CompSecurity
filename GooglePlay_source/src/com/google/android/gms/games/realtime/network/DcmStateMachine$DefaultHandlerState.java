// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.os.Message;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmStateMachine

static final class  extends 
{

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 6004: 
            (()message.obj).tResult(null);
            return HANDLED;

        case 6007: 
            ((HANDLED)message.obj).lt(Integer.valueOf(-1));
            return HANDLED;

        case 6006: 
            (()message.obj).setResult(null);
            return HANDLED;

        case 6005: 
            ((HANDLED)message.obj).etResult(Integer.valueOf(-1));
            return HANDLED;
        }
    }

    public (DcmStateMachine dcmstatemachine)
    {
        super(dcmstatemachine);
    }
}

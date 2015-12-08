// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;

final class nxa
    implements android.os.Handler.Callback
{

    nxa()
    {
    }

    public final boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            ((nxe)message.obj).b();
            return true;

        case 1: // '\001'
            ((nxe)message.obj).c();
            break;
        }
        return true;
    }
}

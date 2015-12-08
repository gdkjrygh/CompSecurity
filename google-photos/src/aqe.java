// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;

final class aqe
    implements android.os.Handler.Callback
{

    aqe()
    {
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            ((aqa)message.obj).d();
            return true;
        } else
        {
            return false;
        }
    }
}

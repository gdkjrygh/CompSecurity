// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.os.Message;

final class fer
    implements android.os.Handler.Callback
{

    private fep a;

    fer(fep fep1)
    {
        a = fep1;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what != 3)
        {
            return false;
        }
        message = a;
        if (!Looper.myLooper().equals(((fep) (message)).c))
        {
            throw new IllegalStateException("Cannot run recovery on a thread other than the work thread!");
        } else
        {
            message.a();
            java.util.List list = ((fep) (message)).b.a();
            ((fep) (message)).a.a(list);
            return true;
        }
    }
}

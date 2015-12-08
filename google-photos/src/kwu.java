// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class kwu extends Handler
{

    public kwu(Looper looper)
    {
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        try
        {
            super.handleMessage(message);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            jqc.f().a(message, false);
        }
        throw message;
    }
}

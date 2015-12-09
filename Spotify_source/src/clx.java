// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

public final class clx extends Handler
{

    public clx()
    {
        this(Looper.getMainLooper());
    }

    public clx(Looper looper)
    {
        super(looper);
    }

    public final void a(brd brd1, brc brc1)
    {
        sendMessage(obtainMessage(1, new Pair(brd1, brc1)));
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.wtf("BasePendingResult", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
            return;

        case 1: // '\001'
            Object obj = (Pair)message.obj;
            message = (brd)((Pair) (obj)).first;
            obj = (brc)((Pair) (obj)).second;
            try
            {
                message.a(((brc) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                clw.b(((brc) (obj)));
            }
            throw message;

        case 2: // '\002'
            ((clw)message.obj).d(Status.c);
            return;
        }
    }
}

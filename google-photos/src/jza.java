// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

public final class jza extends Handler
{

    public jza()
    {
        this(Looper.getMainLooper());
    }

    public jza(Looper looper)
    {
        super(looper);
    }

    public final void a(jyx jyx1, jyw jyw1)
    {
        sendMessage(obtainMessage(1, new Pair(jyx1, jyw1)));
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
            return;

        case 1: // '\001'
            Object obj = (Pair)message.obj;
            message = (jyx)((Pair) (obj)).first;
            obj = (jyw)((Pair) (obj)).second;
            try
            {
                message.a(((jyw) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                jyz.b(((jyw) (obj)));
            }
            throw message;

        case 2: // '\002'
            ((jyz)message.obj).b(Status.d);
            return;
        }
    }
}

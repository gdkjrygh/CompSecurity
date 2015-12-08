// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.spotify.mobile.android.util.Assertion;

public class edz
    implements android.os.Handler.Callback, dmx
{

    public Handler a;
    public boolean b;
    private final Context c;
    private boolean d;

    public edz(Context context)
    {
        c = context;
        d = false;
        b = false;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            HandlerThread handlerthread = new HandlerThread("ComScoreBackgroundThread");
            handlerthread.start();
            a = new Handler(handlerthread.getLooper(), this);
        }
        if (!d)
        {
            a.sendEmptyMessage(0);
            d = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Assertion.a((new StringBuilder("Unexpected message ")).append(message.what).toString());
            return true;

        case 0: // '\0'
            aim.a(c);
            aim.a("15654041");
            aim.b("f07164b6b5502e2c4e0ae7ba636c8387");
            aim.e();
            return true;

        case 1: // '\001'
            aim.a();
            b = true;
            return true;

        case 2: // '\002'
            aim.b();
            b = false;
            return true;

        case 3: // '\003'
            aim.c();
            return true;

        case 4: // '\004'
            aim.d();
            break;
        }
        return true;
    }
}
